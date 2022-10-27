import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.text.Text.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MenuButton_1 extends Application {
    
    public void start(Stage s)
    {
        s.setTitle("Gestor de Datos del Alumno");
        TableView table = new TableView();
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);
        TableColumn Nombre = new TableColumn("Nombre");
        TableColumn Apellido1 = new TableColumn("Apellido 1");
        TableColumn Apellido2 = new TableColumn("Apellido 2");
        TableColumn Edad = new TableColumn("Edad");
        TableColumn Ninscripcion = new TableColumn("No. de inscripción");
        TableColumn Direccion = new TableColumn("Dirección");
        table.getColumns().addAll(Nombre,Apellido1,Apellido2,Edad,Ninscripcion,Direccion);
        Label l1 = new Label("Seleccione alguna de las opciones en el menú");
        MenuButton m = new MenuButton();
        Button btn = new Button("Iniciar");
        btn.setDisable(true);
        m.setText("Opciones");
        MenuItem m1 = new MenuItem("Generar datos del Alumno");
        MenuItem m2 = new MenuItem("Calcular números de inscripción");
        MenuItem m3 = new MenuItem("Modificar datos del Alumno");
        MenuItem m4 = new MenuItem("Exportar datos a csv");
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);
        m.getItems().add(m4);
        m2.setDisable(true);
        m3.setDisable(true);
        m4.setDisable(true);
        Label l2 = new Label("No se ha seleccionado ninguna opción");
        EventHandler<ActionEvent> inicio = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l2.setText("Iniciando");
                m2.setDisable(false);
                m3.setDisable(false);
                m4.setDisable(false);
                m1.setDisable(true);
                btn.setDisable(true);
                
            }
        };
        EventHandler<ActionEvent> evento1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l2.setText(((MenuItem)e.getSource()).getText() + " seleccionado");
                m.setText(((MenuItem)e.getSource()).getText());
                btn.setDisable(false);
                btn.setOnAction(inicio);
            }
        };
        EventHandler<ActionEvent> evento2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                btn.setDisable(false);
                l2.setText(((MenuItem)e.getSource()).getText() + " seleccionado");
                m.setText(((MenuItem)e.getSource()).getText());
            }
        };
        EventHandler<ActionEvent> evento3= new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                btn.setDisable(false);
                l2.setText(((MenuItem)e.getSource()).getText() + " seleccionado");
                m.setText(((MenuItem)e.getSource()).getText());

            }
        };
        EventHandler<ActionEvent> evento4 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                btn.setDisable(false);
                l2.setText(((MenuItem)e.getSource()).getText() + " seleccionado");
                m.setText(((MenuItem)e.getSource()).getText());
            }
        };
        m1.setOnAction(evento1);
        m3.setOnAction(evento2);
        m2.setOnAction(evento3);
        m4.setOnAction(evento4);
        HBox row = new HBox();
        row.getChildren().add(m);
        row.getChildren().add(l2);
        row.getChildren().add(btn);
        row.getChildren().add(table);
        
        Scene sc = new Scene(row, 1000, 800);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}