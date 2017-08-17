package strings;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("program starts...");
        String s1 = "java";
        String s2 = "java";

        char c1 = s1.charAt(3);
        System.out.println("c1 = "+c1);

        int len = s1.length();
        System.out.println("length of string = "+len);

        boolean b1= s1.equals(s2);
        System.out.println("b1 = "+b1);

        char[] a1 = s1.toCharArray();
        for (int i = 0; i < a1.length ; i++) {
            System.out.println(a1[i]);

        }

        System.out.println("program ends...");

    }
}
