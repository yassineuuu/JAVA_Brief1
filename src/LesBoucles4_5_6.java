public class LesBoucles4_5_6 {
    public static void main(String[] args) {

        //Exercice 4
        int i = 0;

        while (i<=15){
            System.out.println("On y arrive presque " + i +" pas");

            i+=1;
        }
        System.out.println();
        System.out.println("########################");
        System.out.println();



        //Exercice 5
        for(int y = 20; y > 0; y--){
            System.out.println("C'est presque bon " + y +"pas");
        }

        System.out.println();
        System.out.println("########################");
        System.out.println();



        // Exercice 6
        for(int x = 0; x < 100; x+=15){
            System.out.println("On tient le bon bout " + x +"pas");
        }

        System.out.println();
        System.out.println("########################");
        System.out.println();

        //Exercice 7
        for(int z = 200; z >= -4 ; z-=12){
            System.out.println("C'est presque bon " + z +"pas");
            if (z<0){
                System.out.println("Enfin!!!");
            }

        }

        System.out.println();
        System.out.println("########################");
        System.out.println();



    }
}
