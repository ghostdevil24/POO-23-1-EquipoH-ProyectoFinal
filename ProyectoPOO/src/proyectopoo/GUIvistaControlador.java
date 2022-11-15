/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectopoo;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author richa
 */

public class GUIvistaControlador extends Alumno implements Initializable{
    @FXML private TableView<Object> Tabla;
    @FXML private TableColumn<Alumno, String> nombre;
    @FXML private TableColumn<Alumno, String> ApPaterno;
    @FXML private TableColumn<Alumno, String> ApMaterno;
    @FXML private TableColumn<Alumno, Integer> edad;
    @FXML private TableColumn<Alumno, Integer> semestre;
    @FXML private TableColumn<Alumno, Integer> escolaridad;
    @FXML private TableColumn<Alumno, String> direccion;
    @FXML private TableColumn<Alumno, Integer> promedio;
    @FXML private TableColumn<Alumno, Integer> numcuenta;
    @FXML private TableColumn<Alumno, Integer> numinscripcion;
    @FXML public Label etiqueta;
    @FXML public Label etiqueta1;
    @FXML public Button inicio;
    @FXML private ChoiceBox<String> selector;
    private String[] eleccion = {"Generar datos del Alumno","Calcular números de inscripción","Modificar datos del alumno","Exportar datos a .csv"};
    public void Opcion1(){
        GeneradorNombre Nomcomp =new GeneradorNombre();
        Nomcomp.setNombre("Ricardo");
        Nomcomp.setApPat("Aranda");
        Nomcomp.setApMat("Solis");
        List<Object> lista = new ArrayList<Object>();
        for (int i = 0; i < 50; i++) {
            Alumno  alu1 = new Alumno("Manuel","Aranda","Soto",3176373,45,9,8,3,"Primera cerrada",876);
            lista.add(alu1);
        }
        
        //Nombre, Apellidopat,ApellidoMat,numero de cuenta, edad, promedio,direccion, numinscripcion
        ObservableList<Object> listado = FXCollections.observableArrayList(lista);
        Tabla.setItems(listado);
        
    }
    public void Opcion2(){
      
        
    }
    public void Opcion3(){
      
        
    }
    public void Opcion4(){
     
    }
    public void Opciones(ActionEvent event){
        String opcion = selector.getValue();
        switch(opcion){
            case "Generar datos del Alumno":
                Opcion1();
                break;
            case "Calcular números de inscripción":
                Opcion2();
                break;
            case "Modificar datos del alumno":
                Opcion3();
                break;
            case "Exportar datos a .csv":
                Opcion4();
                break;
        }
    }
    public void Preparacion (ActionEvent event){
        etiqueta.setText("Usted ha seleccionado "+selector.getValue());
        inicio.setDisable(false);
        etiqueta1.setVisible(true);
        inicio.setOnAction(this::Opciones);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nombre.setCellValueFactory(new PropertyValueFactory<Alumno, String>("Nombre"));
        ApPaterno.setCellValueFactory(new PropertyValueFactory<Alumno, String>("ApPaterno"));
        ApMaterno.setCellValueFactory(new PropertyValueFactory<Alumno, String>("ApMaterno"));
        edad.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("Edad"));
        numcuenta.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("numcuenta"));
        promedio.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("promedio"));
        semestre.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("semestre"));
        escolaridad.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("escolaridad"));
        direccion.setCellValueFactory(new PropertyValueFactory<Alumno, String>("direccion"));
        numinscripcion.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("numinscripcion"));
        selector.getItems().addAll(eleccion);
        selector.setOnAction(this::Preparacion);
    }    
    
}
