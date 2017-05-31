package ProjekJAVA;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by MEDM on 2017-05-31.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainScreen.fxml"));
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ProjektJAVA | Mateusz Misiak [137460]");
        primaryStage.show();
    }
}