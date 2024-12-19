import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    public String nom;
   public Formateur formateur;
    ArrayList<Apprenant> apprenants = new ArrayList<Apprenant>();

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


    public String ReadString(){
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;

    }
    Apprenant ap = new Apprenant();
    Formateur form = new Formateur();
    //methods
    public void CreerClasse(){
        System.out.println("entrer le nom de la classe: ");
        setNom(ReadString());
        System.out.println("entrer le nom du formateur: ");
        setFormateur(form.setNom(ReadString()));
            ap.Ajouter();
    }
    public void AfficherClasse(){
        System.out.println("le non de la classe est : "+getNom());
        System.out.println("le nom du formateur est : "+getFormateur());
        ap.Afficher();

    }

}
