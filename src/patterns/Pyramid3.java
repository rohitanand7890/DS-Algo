package patterns;

public class Pyramid3 {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 0; 2*i >= k ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; 2*(n-1-i)>=k ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
