import java.util.Scanner;

// wow what a change
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input last number.");
        int max = sc.nextInt();


        for (int c = 1; c <= max; c++) {
            String output = "";

            if (c % 5 == 0) {
                output = output + "Boom";
            }
            if (c % 3 == 0) {
                output = output + "Pow";
            }
            if (output.equals("")) {
            	output = Integer.toString(c);
            }
            
            System.out.println(output);
        }
    }
}
