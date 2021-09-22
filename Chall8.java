import java.util.Scanner;

public class Chall8 {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
       
        
        boolean i = true;
        
        int money = 0;
        while (i == true)
        {
            System.out.print("Welcome to Z-Bank, please enter a value from 1-3 to choose one of the options below:\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n1) Deposit money\n2) Withdraw money\n3) Quit and see the amount of money in your account\n4) Quit\nYour Choice: ");
            int choice = myObj.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("What is the amount you want to deposit: ");
                    int dep = myObj.nextInt();
                    money += dep;
                    System.out.println("Deposited " + dep);
                    System.out.println("Current Amnt: " + money);
                    

                    break;

                case 2:
                    System.out.print("What is the amount you want to withdraw:");
                    int with = myObj.nextInt();

                    if (with > money)
                    {
                        System.out.println("Ur broke");
                    }
                    else
                    {
                    money -= with;
                    System.out.println("Withdrew " + with);
                    System.out.println("Current Amnt: " + money);
                    }
                    break;
                    
                case 3:
                    System.out.println("Amnt of money: " + money);
                    System.out.print("bye");
                     i = false;

                    break;

                case 4: 
                    System.out.print("lol bye");
                    i = false;

                    break;

                default:
                    System.out.print("Invalid Choice");

                    break;
            }

        

        }
        myObj.close();

    }
}
