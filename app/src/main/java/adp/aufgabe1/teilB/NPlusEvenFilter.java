package adp.aufgabe1.teilB;

import java.io.InputStream;
import java.util.Scanner;

public class NPlusEvenFilter {
    
    public static void filter(InputStream inputstream) {
        Scanner scanner = new Scanner(inputstream);
        while (scanner.hasNext()) {
            try {
                String input = scanner.next();
                if (Integer.parseInt(input) > 0 && Integer.parseInt(input)%2 == 0) {
                    System.out.println(input + " ");
                }
            } catch (NumberFormatException e) {}
        }
        scanner.close();
    }

    public static void main(String[] args) {
        filter(System.in);
    }



}
