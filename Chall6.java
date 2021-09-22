import java.util.Scanner;


class Chall6 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Pay/hr: ");

        int pay = myObj.nextInt();

        System.out.print("hr/week: ");

        int time = myObj.nextInt();

      
        System.out.println("---------------------\n"+ "pay per week: " + time*pay);
        System.out.println("pay per month: " + time*pay*3.5);
        System.out.println("pay per year: " + time*pay*52);

        myObj.close();
    


    }
}
