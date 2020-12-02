import java.util.HashSet;

public class LesCollectionsHashSet {

    public static void main(String[] args) {

        //exercice 13
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
        lesMois.add("newElement");
        System.out.println(lesMois);

        //exercice 15
        for (String list: lesMois){
            System.out.println(list);
        }

        //exercice 16
        System.out.println(lesMois.size());

        //exercice 17-18
        lesMois.clear();
        System.out.println(lesMois);


        //exercice 19
        System.out.println(lesMois.size());

    }
}
