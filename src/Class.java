import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private String nom;
   private Formateur formateur;
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
    //methods
    public java.lang.Class<? extends Class> CreerClasse(){

        setNom(ReadString());
        return getClass();
    }

}
