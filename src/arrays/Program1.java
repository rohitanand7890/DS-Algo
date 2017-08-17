package arrays;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("program starts...");
        int sum= 0 ;
        int[] marks = {75,80,30,90,40};
        for (int i = 0; i < marks.length ; i++) {
            sum= sum + marks[i];

        }
        double avg= sum/marks.length;
        System.out.println("the average is "+avg);
        System.out.println("program ends...");
    }
}
