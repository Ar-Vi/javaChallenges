import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class IChall7 {

    static class Book {

        public String title;
        public String auth;
        public String gen;
        public String pub;
        public int pg;
        private int rat;

        public Book(String title, String auth, String gen, String pub, int pg, int rat) {
            this.title = title;
            this.auth = auth;
            this.gen = gen;
            this.pub = pub;
            this.pg = pg;
            this.rat = rat;

        }

        public int getRat() {

            return this.rat;
        }

        public void setRat(int rat) {
            System.out.println(rat);
            this.rat = rat;
            System.out.println(rat + "hi");
        }

        @Override
        public String toString() {
            return "[" + this.title + ", " + this.auth + ", " + this.gen + ", " + this.pub + ", " + this.pg + ", "
                    + this.rat + "]";

        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            Book book = (Book) obj;

            return (book.title.equals(this.title) && book.auth.equals(this.auth) && book.gen.equals(this.gen)
                    && book.pub.equals(this.pub) && book.pg == this.pg);
        }

        public void LibSav() {
            FileWriter myFile = null;
            BufferedWriter br = null;
            // Cat you are a big fat cow - Mean Coach

            try {
                myFile = new FileWriter("textfile.txt", true);
                br = new BufferedWriter(myFile);

                br.append(this.title + ", " + this.auth + ", " + this.gen + ", " + this.pub + ", " + this.pg + ", "
                        + this.rat + "\n");
            } catch (IOException ex) {
                System.out.println("Sad file noises");
            }

            finally {
                try {
                    if (br != null || myFile != null) {
                        br.close();
                        myFile.close();

                    }
                } catch (IOException ex) {
                    System.out.println("Sad file CLOSING noises");
                }
            }

        }

    }

    static class Child extends Book {

        String illus;

        public Child(String title, String auth, String gen, String pub, int pg, int rat, String illus) {
            super(title, auth, gen, pub, pg, rat);
            this.illus = illus;
        }

        public void LibSavC() {
            FileWriter myFile = null;
            BufferedWriter br = null;

            try {
                myFile = new FileWriter("textfileC.txt", true);
                br = new BufferedWriter(myFile);

                br.append(this.title + ", " + this.auth + ", " + this.illus + ", " + this.gen + ", " + this.pub + ", "
                        + this.pg + ", " + this.getRat() + "\n");
            } catch (IOException ex) {
                System.out.println("Sad file noises - child");
            }

            finally {
                try {
                    if (br != null || myFile != null) {
                        br.close();
                        myFile.close();

                    }
                } catch (IOException ex) {
                    System.out.println("Sad file CLOSING noises - child");
                }
            }

        }

        @Override
        public String toString() {
            return "[" + this.title + ", " + this.auth + ", " + this.illus + ", " + this.gen + ", " + this.pub + ", "
                    + this.pg + "]";

        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            Child child = (Child) obj;

            return (child.illus.equals(this.illus));
        }

    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        boolean i = true;
        String[] og1 = new String[7];
        String[] og11 = new String[] { "Never", "Gonna", "Give", "You", "Up", "Childa", "Childb" };
        String[] og2 = new String[7];
        String[] og22 = new String[] { "Mr.Never", "Ms.Gonna", "Mme.Give", "Mr.You", "Mr.Up", "aChild", "bChild" };
        String[] og3 = new String[7];
        String[] og33 = new String[] { "Newer", "Goey", "Gin", "Yos", "Upper", "AChild", "BChild" };
        String[] og4 = new String[7];
        String[] og44 = new String[] { "Newman", "GoergeHouse", "GinnyBooks", "Yos Pro", "UpL", "achild", "bchild" };
        int[] og5 = new int[7];
        int[] og55 = new int[] { 1, 2, 3, 4, 5, 3, 3 };
        int[] og6 = new int[7];
        int[] og66 = new int[] { 5, 4, 3, 2, 1, 3, 3 };
        String[] og7 = new String[2];
        String[] og77 = new String[] { "Draw1", "Draw2" };

        ArrayList<Book> marr = new ArrayList<>();
        ArrayList<Book> arr = new ArrayList<>();
        ArrayList<Child> cmarr = new ArrayList<>();
        ArrayList<Child> carr = new ArrayList<>();

       
            BufferedReader br = null;

            try {
                FileReader fr = new FileReader("textfile.txt");

                br = new BufferedReader(fr);
                String line;

                //if (br.readLine() == null || fr == null) {
                  //  for (int j = 0; j < 5; j++) {
                    //Book temp = new Book(og11[j], og22[j], og33[j], og44[j], og55[j], og66[j]);

                    //arr.add(temp);
                    //}
                //}

                //else {
                    while ((line = br.readLine()) != null) {
                        

                        String[] arrOfStr = line.split(", ");
                        System.out.println(arrOfStr.length);
                        Book temp = new Book(arrOfStr[0], arrOfStr[1], arrOfStr[2], arrOfStr[3],
                                Integer.parseInt(arrOfStr[4]), Integer.parseInt(arrOfStr[5]));
                               
                        arr.add(temp);
                        
                    }

              //  }

            }

            catch (Exception e) {
                // TODO: handle exception
            }

        

        

            BufferedReader cbr = null;

            try {
                FileReader fr = new FileReader("textfileC.txt");

                cbr = new BufferedReader(fr);
                String line;

                //if (cbr.readLine() == null || fr == null) {
                  //  for (int j = 5; j < 7; j++) {
                    //Child temp = new Child(og11[j], og22[j], og33[j], og44[j], og55[j], og66[j], og77[j - 5]);
                    //carr.add(temp);
                    
                    //}

                //}

               // else {
                    while ((line = cbr.readLine()) != null) {

                        String[] arrOfStr = line.split(", ");
                        System.out.println(arrOfStr.length);
                        Child temp = new Child(arrOfStr[0], arrOfStr[1], arrOfStr[2], arrOfStr[3],
                                Integer.parseInt(arrOfStr[4]), Integer.parseInt(arrOfStr[5]), arrOfStr[6] );

                        carr.add(temp);

                    }

                //}

            }

            catch (Exception e) {
                // TODO: handle exception
            }
            

        

        while (i == true) {
            boolean var = false;
            boolean nar = false;
            System.out.println(
                    "\nWelcome to the Zebra Library, please enter a value from 1-3 to choose one of the options below:\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n1) Get a list of books OR Child\n2) Take out a book OR Child from the library\n3) Return a book OR Child to the library\n4) Donate\n5) Change rating\n6) Quit\nYour Choice: ");
            String choice = myObj.nextLine();

            switch (choice) {

                case "6":
                    System.out.print("lol bye");
                    i = false;

                    for (Book x : arr) {
                        x.LibSav();
                    }

                    for (Child x : carr) {
                        x.LibSavC();
                    }

                    break;

                case "1":
                    System.out.print("Do you want\n1. Book List\n2.CHILD\nYour Choice (No.): ");
                    String list = myObj.nextLine();

                    if (list.equals("1")) {
                        System.out.print("Here is the list of books held:");
                        for (Book x : arr) {
                            System.out.print(x);
                            x.LibSav();
                        }
                    } else if (list.equals("2")) {
                        System.out.print("Here is the list of Child held:");
                        for (Child x : carr) {
                            System.out.print(x);
                        }
                    }

                    else {
                        System.out.println("Invalid Choice, tRY AGAIN SMH");
                    }
                    break;

                case "2": // borrowing

                    System.out.print("What is the NAME of the book you want to withdraw: ");
                    String take = myObj.nextLine();

                    for (Book x : arr) {

                        if (x.title.equals(take)) {
                            var = true;
                        }

                        if (var == true) {
                            arr.remove(x);
                            marr.add(x);
                            System.out.print("You have taken out: " + x);
                            var = false;
                            break;
                        }

                    }

                    for (Child x : carr) {

                        if (x.title.equals(take)) {
                            var = true;
                        }

                        if (var == true) {
                            carr.remove(x);
                            cmarr.add(x);
                            System.out.print("You have taken out: " + x);
                            break;
                        }

                    }

                    if (var == false) {
                        System.out.println("We don't have ANY. Try checking if you spelt it wrong");
                    }
                    System.out.println(var);
                    break;

                case "3":

                    System.out.println("What is the NAME of the book you want to return");
                    String ret = myObj.nextLine();

                    for (Book x : marr) {

                        if (x.title.equals(ret)) {
                            nar = true;
                        }

                        if (nar == true) {
                            arr.add(x);
                            marr.remove(x);
                            System.out.print("You have returned: " + x);
                            nar = false;
                            break;
                        }
                    }

                    for (Child x : cmarr) {

                        if (x.title.equals(ret)) {
                            nar = true;
                        }

                        if (nar == true) {
                            carr.add(x);
                            cmarr.remove(x);
                            System.out.print("You have returned: " + x);
                            break;
                        }

                    }

                    if (nar == false) {
                        System.out.println("2 We don't have that. Try checking if you spelt it wrong");
                    }

                    break;

                case "4":

                    try {
                        System.out.println("Illust (Type N/A if not donating Child): ");
                        String g = myObj.nextLine();
                        System.out.println("Name:");
                        String a = myObj.nextLine();
                        System.out.println("Author: ");
                        String b = myObj.nextLine();
                        System.out.println("Genre: ");
                        String c = myObj.nextLine();
                        System.out.println("Publisher: ");
                        String d = myObj.nextLine();
                        System.out.println("No.Pgs: ");
                        int e = myObj.nextInt();
                        System.out.println("Rating (0-5): ");
                        int f = myObj.nextInt();

                        if ((f >= 0 && f <= 5) && (g.compareTo("N/A") == 0)) {
                            for (int k = 0; k < 1; k++) {
                                Book temp = new Book(a, b, c, d, e, f);
                                arr.add(temp);

                                System.out.println("Thank you for donating " + a + " :)");
                            }
                        } else if ((f >= 0 && f <= 5) && (g.compareTo("N/A") != 0)) {
                            for (int k = 0; k < 1; k++) {
                                Child temp = new Child(a, b, c, d, e, f, g);
                                carr.add(temp);

                                System.out.println("Thank you for donating CHILD " + a + " >:)");
                            }

                        } else {
                            System.out.println("I said between 0-5 dumdum");

                        }
                    } catch (Exception e) {
                        System.out.println("uh oh u wronGED");
                    }

                    break;

                case "5": // change rate
                    System.out.print("NAME of the Book: ");
                    String userR = myObj.nextLine();

                    for (Book x : arr) {
                        if (x.title.equals(userR)) {
                            String userS = "ba";
                            int userSInt = 6;

                            while (!(userSInt <= 5 && userSInt >= 0)) {
                                try {

                                    System.out.println("What do you want to rate " + x.title + " (0 - 5): ");
                                    userS = myObj.nextLine();
                                    userSInt = Integer.parseInt(userS);
                                    if (!(userSInt <= 5 && userSInt >= 0)) {
                                        System.out.println("I said 0-5 dumdum");
                                    } else {
                                        x.setRat(userSInt);
                                        System.out.println("Changed " + userR + "'s rating to " + userSInt + x);
                                    }
                                } catch (Exception InputMismatchException) {
                                    System.out.println("U didnt input a number SKSKSKSK");
                                }
                            }

                        }
                    }

                    for (Child x : carr) {
                        if (x.title.equals(userR)) {
                            String userS = "ba";
                            int userSInt = 6;

                            while (!(userSInt <= 5 && userSInt >= 0)) {
                                System.out.println("What do you want to rate " + x.title + " (0 - 5): ");
                                userS = myObj.nextLine();
                                userSInt = Integer.parseInt(userS);
                                if (!(userSInt <= 5 && userSInt >= 0)) {
                                    System.out.println("I said 0-5 dumdum");
                                } else {
                                    x.setRat(userSInt);
                                    System.out.println("Changed " + userR + "'s rating to " + userSInt);
                                }
                            }

                        }
                    }

                    break;

                default:
                    System.out.print("Invalid Choice, try again");

                    break;
            }

        }
        myObj.close();

    }
}
