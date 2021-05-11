package stopwatch;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StopwatchApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(StopwatchApplication.class.getResource("/stopwatch.fxml"));
        stage.setTitle("JavaFX Stopwatch");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

}
