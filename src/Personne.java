import java.util.Scanner;

abstract class Personne {

    // declaration des variabes
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String numPhone;

   //constructeur
    public Personne(String nom,String prenom,String email,String numPhone,int id){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.numPhone=numPhone;
        this.id=id;
    }
    public Personne(){}

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

    public Formateur setNom(String nom) {
        this.nom = nom;
        return null;
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

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    // declaration des methodes
    abstract public  void Ajouter();
    abstract public  void Modifier();
    abstract public  void Afficher();
    abstract public  void Supprimer();
    abstract public  void Associer();


    public String ReadString(){
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;

    }


}
