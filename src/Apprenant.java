import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {
    static  int id;

    // declaration des variables
    ArrayList<Apprenant> apprenants= new ArrayList<Apprenant>();
    ArrayList<Double> notes = new ArrayList<Double>();//stocker les notes des apprenants
   //Class<Class> classe;
   //Class<Classe> classe = Classe.class;// refference de la class Classe directement via .class
   Class classe;

    //constructeur

    Apprenant(String nom,String prenom,String email,String phoneNum,int id ) {
        super(nom,prenom,email,phoneNum,id);


    }
    public Apprenant(){
    }

    //declaration methode Ajouter
    @Override
    public void Ajouter(){
        System.out.println("entrer le nombre d'apprenant à ajouter: ");
        Scanner sc = new Scanner(System.in);
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
       // int id= Personne.getId();
            //int id=apprenants.getLast().getId()+1;
            id=id+1;
        Apprenant apprenant = new Apprenant(nom,prenom,email,phoneNum,id);
        apprenants.add(apprenant);


    }}

    @Override
    public void Modifier() {

    }

    //declaration methode AFFICHER
    @Override
    public void Afficher(){
        for (Apprenant apprenant : apprenants){
        System.out.println("Id: "+apprenant.getId()+"  le nom: "+apprenant.getNom()+ "  le prenom: "+apprenant.getNom()+
                "  l/'email: "+apprenant.getEmail()+"  telephone: "+apprenant.getNumPhone());

    }}

    @Override
    public void Supprimer() {

    }

    @Override
    public void Associer() {

    }

}
