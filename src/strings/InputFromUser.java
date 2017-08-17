package strings;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        System.out.println("program starts...");
        Scanner s1 = new Scanner(System.in);

        System.out.println("whats your name ?");
        String name = s1.nextLine();

        System.out.println("how old are you ?");
        int age = s1.nextInt();

        System.out.println("enter your phn. no.");
        long mob = s1.nextLong();

        System.out.println("how much do you earn ?");
        double sal = s1.nextDouble();

        System.out.println("------------------------------------");
        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("contact no. = "+mob);
        System.out.println("salary = "+sal);
        System.out.println("------------------------------------");

        System.out.println("program starts...");

    }
}
