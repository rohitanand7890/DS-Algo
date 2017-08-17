package patterns;

public class PatternDIfficult2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-(i+1); j++) {
                System.out.print(" ");

            }
            int c = i;
            c++;
            for (int l = 0; l < i+1 ; l++) {
                System.out.print(c);
                c++;
            }
            c--;
            for (int m = 0; m <i ; m++) {
                c--;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
