import java.util.Scanner;

public class MenuDrivenProgram{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int choice;
        do{
        System.out.println("Menu");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
        

        choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Hello! Welcome!");
            break;
            case 2:
                System.out.print("Enter an integer: ");
                int userNumber=input.nextInt();
                System.out.println(EvenOddChecker(userNumber));
            break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
            break;
            default:
                System.out.println("Invalid Input!");
            break;
        }
    }while(choice!=3);

        
    }

    public static String EvenOddChecker(int userNumber){
        if (userNumber<0){
            return("Invalid Input");
        }else{
                if(userNumber%2==0){
                    return (userNumber + " is an Even number.");
                }else{
                    return (userNumber + " is an Odd number.");
                }
        }
    }
}                                                                                                               