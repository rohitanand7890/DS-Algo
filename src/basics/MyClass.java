package basics;

public class MyClass {
    public static void main(String[] args) {
        Student ram= new Student();
        ram.setId(1);
        ram.setName("ram");
        ram.setRollno(11);
        System.out.println("my name is "+ram.getName()+" and my roll no. is "+ram.getRollno());
        Student john= new Student();
        john.setId(2);
        john.setName("john");
        john.setRollno(78);
        System.out.println("my name is "+john.getName()+" and my roll no. is "+john.getRollno());

    }
}
