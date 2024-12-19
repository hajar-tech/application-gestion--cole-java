import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {


    static int id;
    public String specialite;
    public double salaire;
    public  ArrayList<Formateur>formateurs=new ArrayList<>();

    //constructeur
    public Formateur(String nom,String prenom,String email,String phoneNum,int id,String specialite,double salaire){
        super(nom,prenom,email,phoneNum,id);
        this.specialite=specialite;
        this.salaire=salaire;
    }
   public Formateur(){}
    @Override
    public void Ajouter() {
        System.out.println("entrer le nombre des formateurs  à ajouter: ");
        Scanner sc = new Scanner(System.in);
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

    }

    @Override
    public void Afficher() {
        for (Formateur formateur : formateurs){
            System.out.println("Id: "+formateur.getId()+"  le nom: "+formateur.getNom()+ "  le prenom: "+formateur.getNom()+
                    "  l/'email: "+formateur.getEmail()+"  telephone: "+formateur.getNumPhone());

        }
    }

    @Override
    public void Supprimer() {

    }

    @Override
    public void Associer() {

    }

}


//
//    //declatration des variable
//    String specialite;
//    double salaire;
//    Class<Classe> classe;


