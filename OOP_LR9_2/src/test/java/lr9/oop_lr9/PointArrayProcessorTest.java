package lr9.oop_lr9;

import org.junit.jupiter.api.Test;

import java.util.List;


class PointArrayProcessorTest {
    @Test
    void createPointsArrayTest() {
        PointArrayProcessor pointArrayProcessor = new PointArrayProcessor();
        List<Point> points = pointArrayProcessor.createPointsArray(0.7, 2.0, 0.05);
        for (Point point : points) {
            System.out.printf("X = %8.6f", point.getX());
            System.out.printf(" Y = %8.6f", point.getY());
            System.out.println();
        }
    }
  
}