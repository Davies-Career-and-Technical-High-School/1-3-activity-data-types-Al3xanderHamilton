

import java.util.Scanner;


class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String Name, Age;

        System.out.println("What is your name?");
        Name = scan.nextLine();
        
        System.out.println("How old are you?");
        Age = scan.nextLine();
        System.out.println(Name + ", is " + Age + " years old.");
    }
}