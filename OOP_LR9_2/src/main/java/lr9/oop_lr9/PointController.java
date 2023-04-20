package lr9.oop_lr9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Comparator;
import java.util.List;

public class PointController {
    public TextField x1Field;
    public TextField x2Field;
    public TextField stepField;
    public Label theSmallestY;
    public Label theBiggestY;
    public Label showSteps;
    public Label showArithm;
    public Label showSum;
    @FXML
    private Label welcomeText;

    @FXML
    public void showResults(ActionEvent actionEvent) {
        PointArrayProcessor pointArrayProcessor = new PointArrayProcessor();
        double x1 = Double.parseDouble(x1Field.getText());
        double x2 = Double.parseDouble(x2Field.getText());
        double step = Double.parseDouble(stepField.getText());
        List<Point> points  = pointArrayProcessor.createPointsArray(x1, x2, step);
        points.sort(Comparator.comparingDouble(Point::getY));
        theSmallestY.setText("Найменше значення функції : " + points.get(0).getY() + " при значенні аргумента : " +  points.get(0).getX());
        theBiggestY.setText("Найбільше значення функції : " + points.get(points.size()-1).getY() + " при значенні аргумента : " +  points.get(points.size()-1).getX());
        showSteps.setText("Кількість кроків : " + pointArrayProcessor.steps(x1, x2, step));
        showArithm.setText("Середнє арифметичне значень функції : " + pointArrayProcessor.findArithmeticMean(pointArrayProcessor.arrayYs(pointArrayProcessor.arrayXs(x1, x2, step))));
        showSum.setText("Сума значень функції : " + pointArrayProcessor.findSum(pointArrayProcessor.arrayYs(pointArrayProcessor.arrayXs(x1, x2, step))));
    }
}