import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class IChall1 {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
       
        
        boolean i = true;
        String[] og1 = new String[4];
        String[] og11 = new String[]{"Never","Gonna","Give","You"};
        String[] og2 = new String[4];
        String[] og22 = new String[]{"Mr.Never","Ms.Gonna", "Mme. Give", "Mr.You"};
        String[] og3 = new String[4];
        String[] og33 = new String[]{"Newer", "Goey", "Gin", "Yos"};

        ArrayList<ArrayList<String>> marr = new ArrayList<>(); 
        ArrayList<ArrayList<String>> arr = new ArrayList<>(); 
       

        for (int j = 0; j <4; j++) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(og11[j]);
            temp.add(og22[j]);
            temp.add(og33[j]);
            arr.add(temp);

        }


        //System.out.println;
        while (i == true)
        {
            boolean var = false;
            boolean nar = false;
            System.out.println("\nWelcome to the Zebra Library, please enter a value from 1-3 to choose one of the options below:\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n1) Get a list of books\n2) Take out a book from the library\n3) Return a book to the library\n4) Donate\n5) Quit\nYour Choice: ");
            String choice = myObj.nextLine();

            switch(choice)
            {
                case "1":
                    System.out.print("Here is the list of books we hold:" + arr );

                    break;

                case "2":

                    System.out.print("What is the NAME of the book you want to withdraw: ");
                    String take = myObj.nextLine();
                    for ( ArrayList<String> x : arr)
                    {
                        for (int j = 0; j <3; j++)
                        {
                        
                            if (x.get(j).equals(take))
                            {
                                 var = true;
                            }      
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
                   
                    for ( ArrayList<String> x : marr)
                    {
                        for (int l = 0; l <3; l++){
                            if(x.get(l).equals(ret))
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
                   System.out.println("Name:");
                   String a = myObj.nextLine();
                   System.out.println("Author");
                   String b = myObj.nextLine();
                   System.out.println("Genre");
                   String c = myObj.nextLine();

                   for (int k = 0; k < 1; k++){
                    ArrayList<String> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);
                    arr.add(temp);

                    System.out.println("You have donated: " + a);
                   }
                   break;

                case "5":
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
