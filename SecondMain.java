import java.util.Scanner;

public class SecondMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("Type something in: ");
            String input = sc.nextLine();
            
            try {
                if (input.length() == 7) {
                    throw new SevenException("Use seven letter words and stainless steel to protect yourself.");
                } else {
                    System.out.println("That string has length " + input.length() + ".");
                }
            } catch (SevenException e) {
                System.out.println("Bad length: " + e.getMessage());
                sc.close();
                run = false;
            }
        }
    }
}
