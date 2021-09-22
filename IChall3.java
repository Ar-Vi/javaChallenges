import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class IChall3 {

    static class Book{
        
        public String title;
        public String auth;
        public String gen;
        public String pub;
        public int pg;
    
        public Book(String title, String auth, String gen, String pub, int pg){
            this.title = title;
            this.auth = auth;
            this.gen = gen;
            this.pub = pub;
            this.pg = pg;
        }
    }


    public static void main(String[] args){


        Scanner myObj = new Scanner(System.in);
       
        
        boolean i = true;
        String[] og1 = new String[5];
        String[] og11 = new String[]{"Never","Gonna","Give","You", "Up"};
        String[] og2 = new String[5];
        String[] og22 = new String[]{"Mr.Never","Ms.Gonna", "Mme. Give", "Mr.You", "Mr.Up"};
        String[] og3 = new String[5];
        String[] og33 = new String[]{"Newer", "Goey", "Gin", "Yos", "Upper"};
        String[] og4 = new String[5];
        String[] og44 = new String[]{"Newman", "GoergeHouse", "GinnyBooks", "Yos Pro", "UpL"};
        int[] og5 = new int[5];
        int[] og55 = new int[]{1, 2, 3, 4, 5};


        ArrayList<Book> marr = new ArrayList<>(); 
        ArrayList<Book> arr = new ArrayList<>(); 
       

        for (int j = 0; j <5; j++) {
            Book temp = new Book(og11[j],og22[j],og33[j],og44[j],og55[j]);
            arr.add(temp);

        }


        //System.out.println;
        while (i == true)
        {
            boolean var = false;
            boolean nar = false;
            System.out.println("\nWelcome to the Zebra Library, please enter a value from 1-3 to choose one of the options below:\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n1) Get a list of books\n2) Take out a book from the library\n3) Return a book to the library\n4) Donate\n5) Quit\nYour Choice: ");
            String choice = myObj.nextLine();
            System.out.println("\n HERE \n");
            switch(choice)
            {
                case "1":
                    System.out.print("Here is the list of books held:");
                    for (Book x : arr)
                    {
                        System.out.print("[" + x.title + ", " + x.auth + ", " + x.gen + ", " + x.pub + ", " + x.pg + "]");
                    }
                    break;

                case "2":

                    System.out.print("What is the NAME of the book you want to withdraw: ");
                    String take = myObj.nextLine();
                    for (Book x : arr)
                    {
                        
                        
                        if (x.title.equals(take))
                        {
                            var = true;
                        }      
                        
                       
                        if (var == true)
                         {
                          
                            arr.remove(x); //remove book here?
                            marr.add(x);
                            System.out.print("You have taken out: " + "[" + x.title + ", " + x.auth + ", " + x.gen + ", " + x.pub + ", " + x.pg + "]"); 
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
                   
                    for ( Book x : marr)
                    {
                        
                        if(x.title.equals(ret))
                        {
                            nar = true;
                        }

                        if (nar == true)
                         {
                            arr.add(x); 
                            marr.remove(x);
                            System.out.print("You have returned: " + "[" + x.title + ", " + x.auth + ", " + x.gen + ", " + x.pub + ", " + x.pg + "]"); 
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
                   System.out.println("Publisher");
                   String d = myObj.nextLine();
                   System.out.println("No.Pgs");
                   int e = myObj.nextInt();

                   for (int k = 0; k < 1; k++)
                   {
                    Book temp = new Book(a, b, c, d, e);
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

