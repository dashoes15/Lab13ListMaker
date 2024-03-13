import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

        //Lab11+ (essentially)
        //test code against flow chart logic
        public static ArrayList<String> a = new ArrayList<String>();
        public static Scanner scan = new Scanner(System.in);

            public static void main(String[] args) {
                boolean done = true;

                System.out.println("Menu: " + "\n" + a);
                System.out.println();

                do {


                    String input = getRegExString(scan, "Enter 'a' to add," +
                            " 'd' to delete, 'v' to view, or 'q' to quit, 's' to save, 'o' to open, 'c', to clear", "[AaDdVvQqOoSsCc]");
                    if (input.equalsIgnoreCase("a")) {
                        add("Enter the string to add to list: " );
                    }else if(input.equalsIgnoreCase("c")){
                        a.clear();
                    }else if(input.equalsIgnoreCase("d")){
                        delete();
                    }else if(input.equalsIgnoreCase("o")){

                    }else if(input.equalsIgnoreCase("q")){
                        quit();
                    }else if (input.equalsIgnoreCase("s")){

                    }else if(input.equalsIgnoreCase("v")){
                        print();

                    }

                } while (done);


            }


            //add
            public static void add(String prompt){
                System.out.println(prompt);
                String x = scan.nextLine();
                int z = InputHelper.getPositiveNonZeroInt(scan,
                        "Enter the index you would like to add it at: ");
                a.add(z, x);
                scan.nextLine();

            }
            //delete
            public static void delete(){
                int x = InputHelper.getPositiveNonZeroInt(scan,
                        "Enter the index of the item you would like to delete: ");
                a.remove(x);
                scan.nextLine();
            }
            //print
            public static void print(){
                for (int i = 0; i < a.size(); i++) {
                    System.out.println(i + " - " + a.get(i));
                }
            }
            //quit
            public static void quit(){
                String x = getRegExString(scan, "Would you like to quit [Y/N]", "[YyNn]");
                if (x.equalsIgnoreCase("Y")) {
                    System.exit(0);
                }
            }

            //getRegExString
            public static String getRegExString(Scanner scan, String prompt, String regEx){
                boolean done = false;
                String x = "";
                do {
                    System.out.println(prompt);
                    x = scan.nextLine();
                    if (x.matches(regEx)) {
                        done = true;
                    }else{
                        System.out.println("Input does not match regEx pattern.");
                    }
                } while (!done);
                return x;
            }
}