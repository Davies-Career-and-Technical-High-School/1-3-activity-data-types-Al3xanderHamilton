import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String Q1, Q2, Q3;

        System.out.println("Is java a programming langauge?");
        
        Q1 = scan.nextLine();
        
        System.out.println("Only numbers can be stored by variable in java, true or false?");
    
        Q2 = scan.nextLine();
        System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
        
        Q3 = scan.nextLine();

        System.out.println("The Answers: Q1- True  Q2-False  Q3-True " + 
        "Your answers " + Q1 + " " + Q2 + " " + Q3
        );
       

       


    }
}