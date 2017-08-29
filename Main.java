package development;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
        root.setStyle("-fx-background-color: transparent;"); //Important
        root.getStyleClass().add(getClass().getResource("MainFrameStyle.css").toExternalForm());
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT); 
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
