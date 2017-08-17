package patterns;

public class PatternDifficult {
    public static void main(String[] args) {
        int count=1, count2=1,n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                if(i%2==0){
                    System.out.print(count2++);
                    count--;
                }
                else{
                    System.out.print(count--);
                    count2++;
                }
                if(i>j){
                    System.out.print("*");
                }

            }
            count = count + (2*i) + (n-2);
            System.out.println();

        }
    }
}
