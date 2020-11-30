import java.util.Scanner;

public class CalculTVA {
    public static void main (String[] args) {

//        insere le prix HT
        Scanner prix1 = new Scanner(System.in);
        int PrixHt;

        System.out.println("Prix HT");
        PrixHt = prix1.nextInt();


//      demmander la remise
        Scanner accordRemise = new Scanner(System.in);
        String AccordRemise;

        System.out.println("Voulez-vous Ajoute une remise");
        AccordRemise = accordRemise.nextLine();
        //insere la remise
        if (AccordRemise.equalsIgnoreCase("Oui") || AccordRemise.equalsIgnoreCase("Yes")){
            Scanner remise = new Scanner(System.in);
            double Remise;

            System.out.println("Combien de remise");
            Remise = remise.nextFloat();

            double Prix = PrixHt + Remise;
            double TVA = (Prix * 0.2);

            double TTC = Prix + TVA;
            System.out.println("TTC = " + TTC + "DH");
        }
        if (AccordRemise.equalsIgnoreCase("Non") || AccordRemise.equalsIgnoreCase("No")){
            double Prix = PrixHt;
            double TVA = (Prix * 0.2);

            double TTC = Prix + TVA;
            System.out.println("TTC = " + TTC + "DH");
        } else{
            System.out.println("Votre reponse est invalid reexecuter le console");
        }





        System.out.println();

    }

}
