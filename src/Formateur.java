import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {

    //declaration des variables
    static int id;
    public String specialite;
    public double salaire;
    public  ArrayList<Formateur>formateurs=new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // getter and setter
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    //constructeur
    public Formateur(String nom,String prenom,String email,String phoneNum,int id,String specialite,double salaire){
        super(nom,prenom,email,phoneNum,id);
        this.specialite=specialite;
        this.salaire=salaire;
    }
    public Formateur(){}

   //declaration de la methode ajouter
    @Override
    public void Ajouter() {
        System.out.println("entrer le nombre des formateurs  à ajouter: ");

        int num = sc.nextInt();
        sc.nextLine();

        for (int i =0 ; i<num;i++){
            System.out.println("entrer le nom du formateur ");
            String nom = sc.nextLine();
            System.out.println("entrer le prenom du formateur"+(i+1)+" : ");
            String prenom = sc.nextLine();
            System.out.println("entrer l/'email du formateur"+(i+1)+" : ");
            String email = sc.nextLine();
            System.out.println("entrer le numero de telephone du formateur "+(i+1)+" : ");
            String phoneNum = sc.nextLine();
            System.out.println("entrer le spécialité du formateur "+(i+1)+" : ");
            String specialite = sc.nextLine();
            System.out.println("entrer le salaire du formateur "+(i+1)+" : ");
            Double salaire = sc.nextDouble();
            //int id=formateurs.getLast().getId()+1;
            id = id+1;
            Formateur formateur = new Formateur(nom,prenom,email,phoneNum,id,specialite,salaire);
            formateurs.add(formateur);
        }}

    @Override
    public void Modifier() {
        System.out.println("entrer id du formateutr  à modifier: ");
        int id = sc.nextInt();
        for (Formateur formateur : formateurs){
            if (formateur.getId()==id){
                System.out.println("entrer le nouveau nom du formateutr  : ");
                String nom = sc.nextLine();
                formateur.setNom(nom);
                System.out.println("entrer le nouveau prenom du formateutr  : ");
                String prenom = sc.nextLine();
                formateur.setPrenom(prenom);
                System.out.println("entrer le nouveau email du formateutr : ");
                String email = sc.nextLine();
                formateur.setEmail(email);
                System.out.println("entrer la nouvelle numero de telephone du formateutr : ");
                String phoneNum = sc.nextLine();
                formateur.setNumPhone(phoneNum);
                System.out.println("entrer la nouvelle specialité du formateutr : ");
                String specialite = sc.nextLine();
                formateur.setNumPhone(specialite);
                System.out.println("entrer le nouveau  salaire du formateutr : ");
                double salaire = sc.nextDouble();
                formateur.setSalaire(salaire);

            }
            else{
                System.out.println("formateur introuvable!!!");
            }
        }

    }

    //declaration de la methode afficher
    @Override
    public void Afficher() {
        for (Formateur formateur : formateurs){
            System.out.println("Id: "+formateur.getId()+"  le nom: "+formateur.getNom()+ "  le prenom: "+formateur.getNom()
             +"  l/'email: "+formateur.getEmail()+"  telephone: "+formateur.getNumPhone()+" la spécialité: "+formateur.getSpecialite()
            +" le salaire: "+formateur.getSalaire());
        }
    }

    @Override
    public void Supprimer() {

    }

    @Override
    public void Associer() {

    }

}





