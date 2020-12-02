import java.util.ArrayList;
import java.util.Collections;

public class LesCollections {

    public static void main(String[] args) {
        //exercice 1: La liste des mois
//        String lesMois [] = {"Janvier","Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "November", "December"};

        ArrayList<String> lesMois = new ArrayList<String>();
        lesMois.add("Janvier");
        lesMois.add("Fevrier");
        lesMois.add("Mars");
        lesMois.add("Avril");
        lesMois.add("Mai");
        lesMois.add("Juin");
        lesMois.add("Juillet");
        lesMois.add("Aout");
        lesMois.add("Septembre");
        lesMois.add("Octobre");
        lesMois.add("November");
        lesMois.add("December");

        //exercice 2:
//        System.out.println(lesMois[2]);
        System.out.println(lesMois.get(2));

        //exercice 3:
//        System.out.println(lesMois[5]);
        System.out.println(lesMois.get(5));

        //exercice 4: Looper entre les mois
//        for (int i = 0; i<lesMois.size(); i++){
//            System.out.print(lesMois.get(i)+ " ");
//        }
        //advanced way
        for (String str: lesMois){
            System.out.print(str+ " ");
        }

        //exercice 5:
        lesMois.set(7,"Août");
        System.out.println(lesMois);

        //exercice 6:
        lesMois.add(0,"Addition");
        System.out.println(lesMois);

        //exercice 7:
        lesMois.remove(2);
        System.out.println(lesMois);

        //exercice 8:
        System.out.println(lesMois.contains("Addition"));

        //exercice 9:
        Collections.sort(lesMois);
        System.out.println(lesMois);

        //exercice 10:
        ArrayList<String> copiedList = new ArrayList<String>();
        copiedList.addAll(lesMois);
        System.out.println(copiedList + " This is a copied list");

        //exercice 11:
        ArrayList <String> clonedList = (ArrayList<String>)lesMois.clone();
        System.out.println(clonedList + " This is a clonned liste");

        //exercice 11:
        System.out.println("Is clonedList empty: " + clonedList.isEmpty());



    }
}
