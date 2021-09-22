import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Chall9 {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
       
        
        boolean i = true;
        
        ArrayList<String> marr = new ArrayList<>(); 
        ArrayList<String> arr = new ArrayList<>(); 
        arr.add("yes-dr.no");
        arr.add("hee-mr haw");
        arr.add("no-ms.yes");
        arr.add("aye-bah");
        arr.add("oi-ee");




        //System.out.println;
        while (i == true)
        {
            boolean var = false;
            boolean nar = false;
            System.out.println("\nWelcome to the Zebra Library, please enter a value from 1-3 to choose one of the options below:\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n1) Get a list of books\n2) Take out a book from the library\n3) Return a book to the library\n4) Quit\nYour Choice: ");
            String choice = myObj.nextLine();

            switch(choice)
            {
                case "1":
                    System.out.print("Here is the list of books we hold:" + arr );

                    break;

                case "2":
                    System.out.print("What is the NAME of the book you want to withdraw: ");
                    String take = myObj.nextLine();
                   

                    for ( String x : arr)
                    {
                        String a = x.split("-")[0];
                        
                        if (a.equalsIgnoreCase(take)) //split it in here?
                         {
                            var = true;
                            
                         }

                       
                        if (var == true)
                         {
                          
                            arr.remove(x); //remove book here?
                            marr.add(x);
                            System.out.print("You have taken out: " + x);
                            break;
                         }
                         
                    }
                    if (var == false)
                    {
                        System.out.println("1 We don't have that. Try checking if you spelt it wrong");
                    }
                    break;
                    
                case "3":
                    System.out.println("What is the NAME of the book you want to return");
                    String ret = myObj.nextLine();
                   // ret =  myObj.nextLine();
                   
                    for ( String x : marr)
                    {
                        String a = x.split("-")[0];
                        
                        if (a.equalsIgnoreCase(ret)) 
                         {
                            nar = true;
                            
                         }

                       
                        if (nar == true)
                         {
                          
                            arr.add(x); 
                            marr.remove(x);
                            System.out.print("You have returned: " + x);
                            break;
                         }
                    }
                    if (nar == false)
                    {
                        System.out.println("2 We don't have that. Try checking if you spelt it wrong");
                    }
                         
                    
                    break;

                case "4": 
                    System.out.print("lol bye");
                    i = false;

                    break;

                default:
                    System.out.print("Invalid Choice, try again");

                    break;
            }

        

        }
        myObj.close();

    }
}
