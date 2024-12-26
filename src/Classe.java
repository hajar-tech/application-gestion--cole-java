import java.util.ArrayList;
import java.util.Scanner;

public class Classe {

    //declaration des variables
    private String nom;
    private Formateur formateur;
    ArrayList<Apprenant> apprenants = new ArrayList<Apprenant>();
    ArrayList<Formateur>formateurs = new ArrayList<>();
   static ArrayList<Classe>classes = new ArrayList<Classe>();

    //constructeur
   public  Classe (){}
    public  Classe(String nom, Formateur formateur, Apprenant apprenant){
        this.nom=nom;
        this.formateurs.add(formateur);
        apprenants.add(apprenant);

    }
    public Classe(String nom){
       this.nom=nom;
       this.apprenants=new ArrayList<>();
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

    //objects
    Apprenant ap = new Apprenant();
    Formateur form = new Formateur();
    Scanner scanner = new Scanner(System.in);


    public void ajouterApprenant(Apprenant apprenant) {
        this.apprenants.add(apprenant);
    }

    public void CreerClasse() {
        System.out.println("Entrer le nom de la classe:");
        String nom = scanner.nextLine();
        Classe nouvelleClasse = new Classe(nom);
        // Gestion du formateur
        System.out.println("Ajouter un formateur à la classe:");
        form.Ajouter();
        nouvelleClasse.setFormateur(form); // Assigner le formateur à la classe

        // Gestion des apprenants
        System.out.println("Combien d'apprenants souhaitez-vous ajouter ?");
        int nombreApprenants = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nombreApprenants; i++) {
            System.out.println("Ajouter l'apprenant " + (i + 1) + ":");
            //Apprenant apprenant = new Apprenant();
            ap.Ajouter();
            nouvelleClasse.ajouterApprenant(ap); // Ajouter l'apprenant à la classe
        }

        // Ajouter la classe à la liste des classes
        classes.add(nouvelleClasse);

        System.out.println("Classe créée avec succès !");
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
        int i;
        for(Classe classe : classes){ //(Classe classe : classes){
            if(nom.equals(classe.getNom())){
                System.out.println("entrer le nouveau nom de la classe: ");
                String nomClasse = scanner.nextLine();
                setNom(nomClasse);
            //modification du formateur
                System.out.println("enter ID du formateur: ");
                   int idf=scanner.nextInt();
                   scanner.nextLine();
                   Formateur formateur1 = null;
                   for (Formateur f :formateurs){
                       if(f.getId()==idf){
                           formateur1=f;
                       }
                   }if (formateur1 != null){
                       classe.setFormateur(formateur1);
                    System.out.println("formateur modifier avec succés!!");
                   }else {
                    System.out.println("formateur n'existe pas!! ");
                    }
            //modification d'apprenant

                System.out.println(" ajouter des nouveaux apprenants  : ");
                System.out.println("combien d'apprenant voullez vous ajouter : ");
                int nombre = scanner.nextInt();
                scanner.nextLine();
                ArrayList<Apprenant>nouvelleListApp = new ArrayList<>();
                for(i=0;i<nombre;i++){
                    System.out.println("entrer id de l'apprenent à ajouter : ");
                    int ida = scanner.nextInt();
                    scanner.nextLine();
                    Apprenant apprenant1=null;
                    for (Apprenant a : apprenants){
                        if(a.getId()==ida){
                            apprenant1=a;
                        }
                    }if (apprenant1 != null){
                        nouvelleListApp.add(apprenant1);
                    }else {
                        System.out.println("apprenant introvable!!");
                    }
                }
                classe.setApprenants(nouvelleListApp);
                System.out.println("apprenant  ajouté avec succée");
                //classes.set(i,new Classe(nom,form,ap));
                System.out.println("classe modifié avec succée ");
            }else {
                System.out.println("classe introvable!!");
            }

        }

    }

    // fonction supprimer
    public void SupprimerClasse(){
        System.out.println("entrer le nom de classe a supprimer:");
        String nom = scanner.nextLine();
        Classe c = null;
        for (Classe classe : classes) {
            if (classe.getNom().equals(nom)) {
                c=classe;

            }}
        if (c!=null) {
            classes.remove(c);
            System.out.println("classe supprimer avec succes");
        }else
            System.out.println("erreur");
    }

}
