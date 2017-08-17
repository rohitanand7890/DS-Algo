package patterns;

public class PatternTriInv {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; i+j <= n-1; j++) {
                System.out.print("*");


            }
            System.out.println();


        }
    }
}
