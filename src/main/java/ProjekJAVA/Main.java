package ProjekJAVA;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by MEDM on 2017-05-31.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainScreen.fxml"));

        //OBSŁUGA WIELOJĘZYCZNOŚCI APLIKACJI
        ResourceBundle bundle = ResourceBundle.getBundle("Bundles.Message");
        loader.setResources(bundle);
        //----------------------------------------------------------------------------------------------------

        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(bundle.getString("tittle.application"));
        primaryStage.show();
    }
}
