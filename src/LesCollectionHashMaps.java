import java.util.HashMap;

public class LesCollectionHashMaps {

    public static void main(String[] args) {

        //exercice 19
        HashMap<String, String> Caracter = new HashMap<String, String>();

        Caracter.put("Name", "Zoro");
        Caracter.put("Anime", "One Piece");
        Caracter.put("Fruit", "NONE");
        Caracter.put("Crew", "StrawHats");

        System.out.println(Caracter);

        //exercice 20
        System.out.println(Caracter.size());

        //exercice 21
        HashMap<String, String> copieCara = new HashMap<String, String>();
        copieCara.putAll(Caracter);
        System.out.println(copieCara);

        //exercice 22
        copieCara.clear();
        System.out.println(copieCara);

    }
}
