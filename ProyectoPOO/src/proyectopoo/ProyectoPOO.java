/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author richa
 */
public class ProyectoPOO extends Application {
    @Override
    public void start(Stage stage)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/proyectopoo/GUIvista.fxml"));
        Scene sc = new Scene(root);
        stage.setTitle("Gestor de datos de alumnos");
        stage.setScene(sc);
        stage.show();
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
