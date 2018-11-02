import java.util.Scanner;

public class Medlemsmenu {

    private Scanner input;

    public void Medlemsmenu(MedlemListe ml) {
        input = new Scanner(System.in);
        int valg;
        do {

            System.out.println("\nTast 1 for at vise oplysninger");
            System.out.println("Tast 2 for at slette dig som medlem");
            System.out.println("Tast 3 for at ændre dine oplysinger");
            System.out.println("Tast 4 for at logge ud");
            valg = input.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("\nOplyninsger");
                    //print medleminfo
                    break;
                case 2:
                    //slet medlem
                    break;
                case 3:
                    //ændre medleminfo
                    break;
                default:
                    System.out.println("\nIkke gyldigt. Prøv igen");
                    break;
            }
        }
        while //(ml.getmedlem() Vise oplysninger af medlemmer der er logget ind
    }

    //Ændring af oplysninger

    public void ændroplysninger; {
        System.out.println("\n Nuværende oplysninger");
        //hent oplysinger
