package adp.aufgabe1.teilB;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;
import java.util.Scanner;

public class VisualAccumulator extends SimpleAccumulator {
    public VisualAccumulator(int trials, double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(0.005);
        }

        @Override
        public void addDataValue(double d) {
            n++;
            double delta = d - mean;
            mean  += delta / n;
            sum += (double) (n - 1) / n * delta * delta;
            StdDraw.setPenColor(Color.DARK_GRAY);
            StdDraw.point(n, d);
            StdDraw.setPenColor(Color.RED);
            StdDraw.point(n, sum/n);
        }

        public static void main(String[] args) {
            VisualAccumulator accumulator = new VisualAccumulator(5, 5);
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            while (i++ < 5 && scanner.hasNext()) {
                double value = scanner.nextDouble();
                accumulator.addDataValue(value);
            }
            System.out.println("mean: " + accumulator.mean());
            scanner.close();
        }
    }

