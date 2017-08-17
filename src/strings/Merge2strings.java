package strings;

public class Merge2strings {
    public static String mergeStrings(String str1, String str2) {
        String str3 = str1 + str2;
        return str3;

    }

    public static void main(String[] args) {
        System.out.println("program starts...");
        String res = mergeStrings("Hi","Everyone");
        System.out.println(res);

        System.out.println("program ends...");

    }
}
