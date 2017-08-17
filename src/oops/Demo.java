package oops;

public class Demo {
    static int x1 = 50;
    /**
     * static members can be accessed anywhere within the class just by the name
     */
    static double y1 = 5.644;
    public static void test(){
        System.out.println("this is test()");
    }
    public static void main(String[] args) {
        System.out.println("program starts...");

        System.out.println("x1 = "+x1);
        System.out.println("y1 = "+y1);
        System.out.println("sum = "+(x1+y1));

        System.out.println("program ends...");

    }

}
