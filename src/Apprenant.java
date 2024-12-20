import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {

    Scanner sc = new Scanner(System.in);
    // declaration des variables
    static  int id;
    ArrayList<Apprenant> apprenants= new ArrayList<Apprenant>();
    ArrayList<Double> notes = new ArrayList<Double>();//stocker les notes des apprenants
    Class classe;
    //Class<Class> classe;
    //getter ant setter


    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    //constructeur
   public Apprenant(String nom,String prenom,String email,String phoneNum,int id,double note ) {
        super(nom,prenom,email,phoneNum,id);
        this.notes= new ArrayList<>();//initialisation d'une liste vide
        this.notes.add(note);//ajouter la note passer par le constructeur
    }
    public Apprenant(){}

    //declaration methode Ajouter
    @Override
    public void Ajouter(){
        System.out.println("entrer le nombre d'apprenant à ajouter: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i =0 ; i<num;i++){
          //  int id =i+1;
        System.out.println("entrer le nom de l/'apprenant "+(i+1)+" : ");
        String nom = sc.nextLine();
        System.out.println("entrer le prenom de l/'apprenant "+(i+1)+" : ");
        String prenom = sc.nextLine();
        System.out.println("entrer l/'email de l/'apprenant "+(i+1)+" : ");
        String email = sc.nextLine();
        System.out.println("entrer le numero de telephone de l/'apprenant "+(i+1)+" : ");
        String phoneNum = sc.nextLine();
        System.out.println("entrer la note: ");
        double notes = sc.nextDouble();
        ArrayList<Double> listNotes = new ArrayList<Double>();
        listNotes.add(notes);
            id=id+1;
        Apprenant apprenant = new Apprenant(nom,prenom,email,phoneNum,id,notes);
        apprenants.add(apprenant);
    }}

    @Override
    public void Modifier() {
        System.out.println("entrer id de l'apprenant à modifier: ");
        int id = sc.nextInt();
        for (Apprenant apprenant : apprenants){
            if (apprenant.getId()==id){
                System.out.println("entrer le nouveau nom de l/'apprenant : ");
                String nom = sc.nextLine();
                apprenant.setNom(nom);
                System.out.println("entrer le nouveau prenom de l/'apprenant : ");
                String prenom = sc.nextLine();
                apprenant.setPrenom(prenom);
                System.out.println("entrer le nouveau email de l/'apprenant : ");
                String email = sc.nextLine();
                apprenant.setEmail(email);
                System.out.println("entrer la nouvelle numero de telephone de l/'apprenant : ");
                String phoneNum = sc.nextLine();
                apprenant.setNumPhone(phoneNum);
                System.out.println("entrer la nouvelle note: ");
                double notes = sc.nextDouble();
                ArrayList<Double> listNotes = new ArrayList<Double>();
                apprenant.setNotes(listNotes);
                listNotes.add(notes);
            }
        else{
            System.out.println("apprenant introuvable!!!");
        }
        }

    }

    //declaration methode AFFICHER
    @Override
    public void Afficher(){
        for (Apprenant apprenant : apprenants){
        System.out.println("Id: "+apprenant.getId()+"  le nom: "+apprenant.getNom()+ "  le prenom: "+apprenant.getNom()+
                "  l/'email: "+apprenant.getEmail()+"  telephone: "+apprenant.getNumPhone()+" |la note: "+apprenant.getNotes());

    }}

    @Override
    public void Supprimer() {

    }

    @Override
    public void Associer() {

    }

    public Apprenant Recherche(){
        System.out.println("entrer id de l'apprenant à modifier: ");
        int var = sc.nextInt();
        for (Apprenant apprenant : apprenants){
            if(var==apprenant.getId()) {return apprenant; }
            return null;
        }
        return null;
    }

}
