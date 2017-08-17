package patterns;

public class Pattern01 {
    public static void main(String[] args) {
        int count=1,n=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++,count++) {
                if(count%2 == 0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }


            }
            System.out.println();

        }
    }
}
