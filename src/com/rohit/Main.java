package com.rohit;

public class Main {



    public static void main(String[] args) {
	// write your code here
        /**
         * this
         * project
         * beloin
         *
          */
       //todo

        //psvm
        //sout
        int i =0 ;
        i++;
        i++;
        System.out.println(i);
        int j = i+100;
        // Ctrl + Z  - undo
        // Ctrl +Shift + Z - redo
        System.out.println(j);
        System.out.print(" -------- "); // new line
        System.out.println("sum of i and j "+ (i+j));
        run(); //Ctrl + click.

        System.out.println("hello world");
        new Main().runIt();


//hi
    }
    //private
    //void ??? String, int, ArrayList<String>
    //  static method
    private static void run(){
        System.out.println("running...");
    }

    // non static method
    private  void runIt(){
        System.out.println("running runit...");
    }

    private  String It(){
        System.out.println("running runit...");
        return "str";
    }

}
