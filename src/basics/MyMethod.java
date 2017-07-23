package basics;

public class MyMethod {
    public static void main(String[] args) {
        sayHello("rohit");
        sayHello("rahul");
        sayHello("john");
    }
    public static void sayHello(String name){
        System.out.println("hello "+ name);
    }
}
