/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package proyectofinal2;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Miguel Angel
 */
public class ProyectoFinal2 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
       Parent root = FXMLLoader.load(getClass().getResource("/ViewInicio/ViweINICO.fxml"));

       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
