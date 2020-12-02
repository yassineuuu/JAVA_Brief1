public class LesBoucles2 {
    public static void main(String[] args) {
        int y;
        for (int i = 1; i < 30; i++){
            for (y=2; y<100;y++){
                int x = i * y;
                System.out.println(i + " * " + y + " = " + x);
            }

            System.out.println("#####################################");
            System.out.println();

        }
    }
}
