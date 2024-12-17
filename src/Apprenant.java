import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {

    // declaration des variables
    ArrayList<Double> notes = new ArrayList<Double>();//stocker les notes des apprenants
   Class<Class> classe;//refference de la class Class
    //instanciation d'un objet Personne


    //declaration methode Ajouter
    public void AjouterApprenants(){
        System.out.println("entrer le nom de l/'apprenant: ");
        //String nom=ReadString() ;
        setNom(ReadString());
        System.out.println("entrer le prenom de l/'apprenant: ");
        //String prenom=ReadString();
        setPrenom(ReadString());
        System.out.println("entrer l/'email de l/'apprenant: ");
        //String email=ReadString();
        setEmail(ReadString());
        System.out.println("entrer le numero de telephone de l/'apprenant: ");
       // String numPhone=ReadString();
        setMunPhone(ReadString());
        System.out.println("entrer le nom de la classe de l/'apprenant: ");



    }
    //declaration methode Ajouter
    public void AfficherApprenants(){
        System.out.println("le nom : "+getNom());
        System.out.println("le prenom : "+getNom());
        System.out.println("l/'email : "+getEmail());
        System.out.println("telephone : "+getMunPhone());
    }

}
