import java.util.ArrayList;
import java.util.Scanner;

public class Classe {

    //declaration des variables
    private String nom;
    private Formateur formateur;
    ArrayList<Apprenant> apprenants = new ArrayList<Apprenant>();
    ArrayList<Formateur>formateurs = new ArrayList<>();
    ArrayList<Classe>classes = new ArrayList<Classe>();
//constructeur
   public  Classe (){}
    public  Classe(String nom, Formateur formateur, Apprenant apprenant){
        this.nom=nom;
        this.formateurs.add(formateur);
        this.apprenants.add(apprenant);
    }

    //getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }


//    public String ReadString(){
//        String string;
//        Scanner scanner = new Scanner(System.in);
//        string = scanner.nextLine();
//        return string;
//    }
    //objects
    Apprenant ap = new Apprenant();
    Formateur form = new Formateur();
    Scanner scanner = new Scanner(System.in);

    //methode creer classe
    public void CreerClasse(){
        System.out.println("entrer le nom de la classe: ");
        String nom = scanner.nextLine();
        setNom(nom);
        System.out.println("ajouter un formateur formateur: ");
        form.Ajouter();
        System.out.println("ajouter des apprennants: ");
        ap.Ajouter();
        classes.add(new Classe(nom,form,ap));

    }

    //methode afficher classe
    public void AfficherClasse() {
        if (classes == null || classes.isEmpty()) {
            System.out.println("Pas de classe créée");
        } else {
            for (Classe classe : classes) {
                System.out.println("Nom de la classe : " + classe.getNom());

                if (classe.getFormateur() != null) {
                    classe.getFormateur().Afficher();
                } else {
                    System.out.println("Aucun formateur associé à cette classe.");
                }

                if (classe.getApprenants() != null && !classe.getApprenants().isEmpty()) {
                    System.out.println("Liste des apprenants : ");
                    for (Apprenant apprenant : classe.getApprenants()) {
                        apprenant.Afficher();
                    }
                } else {
                    System.out.println("Aucun apprenant dans cette classe.");
                }
            }
        }
    }



    public void ModifierClass(){
        System.out.println("enter le nom de la class: ");
        String nom=scanner.nextLine();
        for (Classe classe : classes){
            if(nom.equals(classe.getNom())){
                System.out.println("entrer le nouveau nom de la classe: ");
                String nomClasse = scanner.nextLine();
                setNom(nomClasse);
                System.out.println("enter le nouveau un formateur formateur: ");
                form.Modifier();
                classe.setFormateur(form);
                System.out.println("voullez vous ajouter ou modifier un apprenat déja existe : ");
                System.out.println("ajouter des apprennants: ");
                ap.Ajouter();
                classes.add(new Classe(nom,form,ap));
            }
        }

    }

}
