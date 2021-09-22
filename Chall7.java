import  java.util.Scanner;

class Chall7 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("U lived: ");

        if(myObj.hasNextInt())
        {
            System.out.println("Yay its an int");
        }
        else 
        {
            System.out.println(">:( why");
        }

        myObj.close();
    


    }
}
