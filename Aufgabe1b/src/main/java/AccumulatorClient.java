import java.util.Scanner;

public class AccumulatorClient {
    
    public static void main(String[] args) {
        SimpleAccumulator accumulator;
        try {
            int firstArg = Integer.parseInt(args[0]);
            int trials = Integer.parseInt(args[1]);
            double maxValue = Double.parseDouble(args[2]);
            if (trials <= 0) {
                System.out.println("Please provide a positive integer as argument.");
                return;
            }
            if (maxValue <= 0) {
                System.out.println("Please provide a positive number as argument.");
                return;
            }

            if (firstArg == 0) {
                accumulator = new SimpleAccumulator();
            }
            else if (firstArg > 0) {
                accumulator = new VisualAccumulator(trials, maxValue);
            } else {
                System.out.println("Please provide a positive number as argument.");
                return;
                
            }
            
            readNumbers(accumulator, trials);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid number as argument.");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a number as argument.");
            return;
        }
        
    }

    private static void readNumbers(SimpleAccumulator accumulator, int trials) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i++ < trials && scanner.hasNext()) {
            double value = scanner.nextDouble();
            accumulator.addDataValue(value);
        }
        
        System.out.println("mean: " + accumulator.mean());
        scanner.close();
    }

    public static void main1(String[] args) {
        String[] arg = {"1", "5", "10"};
        main1(arg);
    }

}
