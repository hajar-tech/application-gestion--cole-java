import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {

    Scanner sc = new Scanner(System.in);

    // declaration des variables
    static  int id;
   static ArrayList<Apprenant> apprenants= new ArrayList<Apprenant>();
    ArrayList<Classe>classes=new ArrayList<>();
    ArrayList<Double> notes = new ArrayList<Double>();//stocker les notes des apprenants
    Class classe;

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
        sc.nextLine();
        ArrayList<Double> listNotes = new ArrayList<Double>();
        listNotes.add(notes);
            id=id+1;
        Apprenant apprenant = new Apprenant(nom,prenom,email,phoneNum,id,notes);
        apprenants.add(apprenant);
    }}

    @Override
    public void Modifier() {
        System.out.println("entrer id de l'apprenant à modifier: ");
        int idd = sc.nextInt();
        sc.nextLine();
        for (Apprenant apprenant : apprenants){
            if (apprenant.getId()==idd){
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
                System.out.println("------apprenant modifier avec succés------");
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
        System.out.println("entrer id de l'apprenant à supprimer: ");
        int id = sc.nextInt();
        sc.nextLine();
        Apprenant app = null;
        for (Apprenant apprenant: apprenants){
           if (apprenant.getId()==id){
               app=apprenant;
           }
        }
        if(app!=null){
            apprenants.remove(app);
            System.out.println("------apprenant supprimer avec succée------");
        }else {
            System.out.println("-----apprenent introuvable!!------");
        }
    }
    public Apprenant IsAprenantExist (int apprenantId){
        for(Apprenant apprenant : apprenants){
            if(apprenant.getId() == apprenantId){
                return apprenant;
            }
        }
        return null;

    }
    public Classe IsClassExist (String className){
        for(Classe classe : classes){
            if(classe.getClass().getName().equals(className)){
                return classe;
            }
        }
        return null;

    }

    public void Associer(ArrayList<Classe>classes){

        System.out.println("entrer le nom de la classe: ");
        String nomClasse = sc.nextLine();
        Classe classeExiste = IsClassExist(nomClasse);
        System.out.println("entrer id de l'apprenant : ");
        int id = sc.nextInt();
        Apprenant apprenantExiste = IsAprenantExist(id);
        if(classeExiste != null){
            if(apprenantExiste !=null ){
                classeExiste.getApprenants().add(apprenantExiste);
            }else {
                System.out.println("apprenant n'exsiste pas");
            }

        }else {
            System.out.println("Classe n'exsiste pas");
        }}




//    public void Associer(ArrayList<Classe>classes ) {
//        System.out.println("entrer le nom de la classe: ");
//        String nom = sc.nextLine();
//        for (Classe classe : classes){
//            if(classe.getNom().equals(nom)){
//                System.out.println("entre id de l/'apprenant: ");
//                int id = sc.nextInt();
//                sc.nextLine();
//                Apprenant apprenant = null;
//                for (Apprenant ap : apprenants) {
//                    if (ap.getId() == id) {
//                        apprenant = ap;
//                    }
//                }
//                if (apprenant!=null){
//                    classe.getApprenants().add(apprenant);
//                    System.out.println("apprenant ajouter avec succes");
//                }else System.out.println("apprenant n'existe pas!!");
//                break;
//            }
//            else System.out.println("classe n'existe pas!!");
//        }
//    }


}
