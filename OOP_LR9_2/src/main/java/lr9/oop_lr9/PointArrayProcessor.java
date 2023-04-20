package lr9.oop_lr9;

import java.util.ArrayList;
import java.util.List;

public class PointArrayProcessor {

    public double function(double x) {
        double a = 1.65;
        if (x < 1.3 - 1e-4) {
            return Math.PI * x * x - 7 / (x * x);
        }
        if (x > 1.3 + 1e-4) {
            return Math.log(x + 7 * Math.sqrt(Math.abs(x + a)));
        }
        return a * x * x * x + 7 * Math.sqrt(x);
    }

    public int steps(double x1, double x2, double step) {
        double count = ((x2 - x1) / step) + 1;
        return (int) count;
    }

    public List<Point> createPointsArray(double x1, double x2, double step) {
        List<Point> points = new ArrayList<>();
        double[] arrayX = arrayXs(x1, x2, step);
        double[] arrayY = arrayYs(arrayX);
        for (int i = 0; i < arrayY.length; i++) {
            points.add(new Point(arrayX[i], arrayY[i]));
        }
        return points;
    }

    public double[] arrayXs(double x1, double x2, double step) {
        double[] array = new double[steps(x1, x2, step)];
        for (int i = 0; i < array.length; i++) {
            array[i] = x1 + i * step;
        }
        return array;
    }

    public double[] arrayYs(double[] arrX) {
        double[] array = new double[arrX.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = function(arrX[i]);
        }
        return array;
    }

    public double findSum(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

    public double findArithmeticMean(double[] array) {
        return findSum(array) / array.length;
    }
}