import java.util.HashSet;

public class LesCollectionsHashSet {

    public static void main(String[] args) {

        HashSet<String> lesMois = new HashSet<String>();
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

        //exercice 14

        System.out.println(lesMois);

        //exercice 15
        lesMois.add("newElement");
        System.out.println(lesMois);

        //exercice 16
        for (String list: lesMois){
            System.out.println(list);
        }

        //exercice 19
        System.out.println(lesMois);

    }
}
