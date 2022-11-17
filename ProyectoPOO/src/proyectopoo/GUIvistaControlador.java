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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author richa
 */

public class GUIvistaControlador extends GeneradorNombre implements Initializable{
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
    private String[] eleccion = {"Generar datos del alumno","Calcular números de inscripción","Modificar datos del alumno","Exportar datos a .csv"};
    public void Opcion1(){
        int a,b,c;
        GeneradorNombre Nomcomp =new GeneradorNombre();
        GeneradorNumCuenta Cuenta= new GeneradorNumCuenta();
        List<Object> lista = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            a= (int)(Math.random()*((super.NombredePila.length)));
            b= (int)(Math.random()*((super.ApellidoPaterno.length)));
            c= (int)(Math.random()*((super.ApellidoMaterno.length)));
            Nomcomp.setNombre(a);
            Nomcomp.setApPat(b);
            Nomcomp.setApMat(c);
            Cuenta.setNumCuenta();
            Alumno  alu1 = new Alumno(Nomcomp.getNombre(),Nomcomp.getApPat(),Nomcomp.getApMat(),Cuenta.getNumCuenta(),45,9,i,3,"Primera cerrada",null);
            lista.add(alu1);
        }
        //Nombre, Apellidopat,ApellidoMat,numero de cuenta, edad, promedio,direccion, numinscripcion
        ObservableList<Object> listado = FXCollections.observableArrayList(lista);
        Tabla.setItems(listado);
        System.out.println(listado.toString());
        
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
            case "Generar datos del alumno":
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
        etiqueta.setText("Usted ha seleccionado "+selector.getValue().toLowerCase());
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
