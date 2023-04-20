package lr9.oop_lr9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PointApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PointApplication.class.getResource("PointProjectView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 605, 330);
        stage.setTitle("LR9");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}