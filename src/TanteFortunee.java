import java.util.Scanner;

public class TanteFortunee {

    public static void main(String[] args) {


        //demander à l'utilisateur d'entrer la somme d'argent
        Scanner monthMoney = new Scanner(System.in);
        int Money;
        System.out.println("Combien vous avez recu de l'argent");
        Money = monthMoney.nextInt();


        //déclarer et initialiser les variables
        double TroisQuarts = 0.75 * Money;
        double leRest1 = Money - TroisQuarts;
        double leRestDiv = leRest1 / 3;

        int Cafe = (int) (leRestDiv / 10);
        int CCP = (int) (leRestDiv / 10);
        int Trame = (int) (leRestDiv / 8);

        int leRest2 = (int) ((leRestDiv % 10) + (leRestDiv % 10) +(leRestDiv % 8));


                //affichage

        System.out.println("Vous-avez recu " + Money + " MAD");
        System.out.println("");
        System.out.println("Alors l'achat de livres et fournitures va demade :");
        System.out.println("");
        System.out.println(TroisQuarts + " MAD");
        System.out.println("");
        System.out.println("Donc il va rester :");
        System.out.println(leRest1 + " MAD");
        System.out.println("");
        System.out.println("Avec " + leRest1 + " MAD tu peux avoir :");
        System.out.println(Cafe + " Cafés");
        System.out.println(CCP + " Carte de recharge prépayer");
        System.out.println(Trame + " Billets de TRAME");
        System.out.println("");
        System.out.println("Il rest " + leRest2 + " MAD sera destiné à acheter un bouquet de fleur à ma maman pour la prochaine fête des mères.");


    }

}
