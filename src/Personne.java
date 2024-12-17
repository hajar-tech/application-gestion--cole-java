import java.util.Scanner;

abstract class Personne {
    // declaration des variabes
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String munPhone;


    Personne(){}
// getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMunPhone() {
        return munPhone;
    }

    public void setMunPhone(String munPhone) {
        this.munPhone = munPhone;
    }


    // declaration des methodes

    public String ReadString(){
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;

    }


}
