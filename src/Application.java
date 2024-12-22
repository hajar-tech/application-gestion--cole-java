import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Classe classe=new Classe();
        Apprenant apprenant=new Apprenant();
        Formateur formateur = new Formateur();
        Scanner scanner = new Scanner(System.in);
    //menu principale
        int choix;
    do {
        System.out.println("*********** Menu Principale ************");
        System.out.println("1: Gestion des Classes ");
        System.out.println("2: Gestion des Formateurs");
        System.out.println("3: Gestion des Apprenants");
        System.out.println("4: Quitter le programme");
        System.out.println("entrer votre choix : ");
        choix = scanner.nextInt();
        switch (choix){
            case 1:
                int choix1;
                do {
                System.out.println("------- menu gestion des classes ---------");
                System.out.println("1:Créer un classe ");
                System.out.println("2:Afficher un class ");
                System.out.println("3:Modifier un class ");
                System.out.println("4:Supprimer un class ");
                System.out.println("5:Quitter");

                    System.out.println("entrer votre choix : ");
                    choix1 = scanner.nextInt();
                switch (choix1){
                    case 1:
                        classe.CreerClasse();
                        break;
                    case 2:
                        classe.AfficherClasse();
                        break;
                    case 3:
                        classe.ModifierClass();
                        break;
                    case 4:
                        classe.SupprimerClasse();
                        break;
                    case 5:
                        break;
                }}while (choix1!=5);

                break;
            case 2:
                int choix2;
                do {
                    System.out.println("------- menu gestion des Formateurs ---------");
                    System.out.println("1:Ajouter un formateur ");
                    System.out.println("2:Afficher un formateur ");
                    System.out.println("3:Modifier un formateur ");
                    System.out.println("4:Supprimer un formateur");
                    System.out.println("5:Associer un formateur ");
                    System.out.println("6:Quitter");

                    System.out.println("entrer votre choix : ");
                    choix2 = scanner.nextInt();
                    switch (choix2){
                        case 1:
                            formateur.Ajouter();
                            break;
                        case 2:
                            formateur.Afficher();
                            break;
                        case 3:
                            formateur.Modifier();
                            break;
                        case 4:
                            formateur.Supprimer();
                            break;
                        case 5:
                            formateur.Associer();
                            break;
                        case 6:
                            break;
                    }}while (choix2!=6);
                break;
            case 3:
                int choix3;
                do {
                    System.out.println("------- menu gestion des Apprenants ---------");
                    System.out.println("1:Ajouter un Appranant ");
                    System.out.println("2:Afficher un Appranant");
                    System.out.println("3:Modifier un Appranant ");
                    System.out.println("4:Supprimer un Appranant  ");
                    System.out.println("5:Associer un Appranant ");
                    System.out.println("6:Quitter");

                    System.out.println("entrer votre choix : ");
                    choix3 = scanner.nextInt();
                    switch (choix3){
                        case 1:
                            apprenant.Ajouter();
                            break;
                        case 2:
                            apprenant.Afficher();
                            break;
                        case 3:
                            apprenant.Modifier();
                            break;
                        case 4:
                            apprenant.Supprimer();
                            break;
                        case 5:
                            apprenant.Associer();
                            break;
                        case 6:
                            break;
                    }}while (choix3!=6);
                break;
            case 4:
                break;
            default:
                System.out.println("choisir un nombre de menu!!");
        }
    }while (choix != 4);


    }
}