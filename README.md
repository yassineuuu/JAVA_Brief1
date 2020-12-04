# JAVA_Brief1

Pour le Tuto voici un lien google docs : https://docs.google.com/document/d/1CWIETakFGfr-GuoBYS_f1ANfTGD_m2VsLxKyTsgl5Yk/edit?ts=5fc74d88#


import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number1;

        System.out.println("Enter your nymber pls");
        number1 = number.nextInt();

        if (number1<0){
            System.out.println(number1 + " is Negative");
        }
        else if (number1>0){
            System.out.println(number1 + " is Positive");
        }
        else {
            System.out.println("number1 = 0");
        }
         int number2 = number1 % 2;
        if (number2==0){
            System.out.println("Your number is pair");
        }
        else {
            System.out.println("Your number is impair");

        }

    }
}
