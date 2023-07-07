package Test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = myscanner.nextLine();
        System.out.print("enter your age: ");
        int age = myscanner.nextInt();
        System.out.println("hello " + name + " how are you?\n" + "are you " + age + " years old?");

        // add method here
        int a = myscanner.nextInt();
        System.out.print("enter int number: ");
        int b = myscanner.nextInt();
        System.out.print("enter int number: ");
        int sum = add(a,b);
        System.out.println("sum = " + sum);
    }

    public static int add(int a, int b){
        return a+b;

    }
}
