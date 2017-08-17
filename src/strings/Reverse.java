package strings;

public class Reverse {
    public static void reverseString(String str) {
        for (int i = str.length()-1; i >= 0 ; i--) {
            char c1= str.charAt(i);
            System.out.print(c1);

        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("program starts...");
        reverseString("rohit");


        System.out.println("program starts...");

    }
}
