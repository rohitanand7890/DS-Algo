package methods;

public class Average {
    public static double calcAvg(int a,int b,int c) {
        double avg = (a+b+c)/3;
        return avg;

    }

    public static void main(String[] args) {
        double res = calcAvg(30,60,90);
        System.out.println(res*10);
    }
}
