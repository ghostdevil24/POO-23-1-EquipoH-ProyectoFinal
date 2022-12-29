/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectopoo;


import java.io.BufferedWriter;
import java.io.FileWriter;
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
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * FXML Controller class
 *
 * @author richa
 */

public class GUIvistaControlador extends GeneradorNombre implements Initializable{
    @FXML private TableView<Alumno> Tabla;
    @FXML private TableColumn<Alumno, String> nombre;
    @FXML private TableColumn<Alumno, String> ApPaterno;
    @FXML private TableColumn<Alumno, String> ApMaterno;
    @FXML private TableColumn<Alumno, Integer> edad;
    @FXML private TableColumn<Alumno, Integer> semestre;
    @FXML private TableColumn<Alumno, Double> escolaridad;
    @FXML private TableColumn<Alumno, String> direccion;
    @FXML private TableColumn<Alumno, Double> promedio;
    @FXML private TableColumn<Alumno, Integer> numcuenta;
    @FXML private TableColumn<Alumno, Integer> numinscripcion;
    @FXML private TableColumn<Alumno, Integer> materiasReprobadas;
    @FXML private TableColumn<Alumno, Double> velocidad;
    @FXML public Label etiqueta;
    @FXML public Label etiqueta1;
    @FXML public Button inicio;
    @FXML private ChoiceBox<String> selector;
    List<Alumno> lista = new ArrayList<>();
    
    private String[] eleccion = {"Generar datos del alumno","Calcular números de inscripción","Modificar datos del alumno","Exportar datos a .csv"};
    public void Opcion1(){
        int a,b,c,semestre;
        GeneradorNombre Nomcomp =new GeneradorNombre();
        GeneradorNumCuenta Cuenta= new GeneradorNumCuenta();
        Promedio prom= new Promedio();
        for (int i = 0; i < 500; i++) {
            semestre =(int)(Math.random()*(9-0+1)+0);
            prom.CalcularCalificacion(semestre);
            a= (int)(Math.random()*((super.NombredePila.length)));
            b= (int)(Math.random()*((super.ApellidoPaterno.length)));
            c= (int)(Math.random()*((super.ApellidoMaterno.length)));
            Nomcomp.setNombre(a);
            Nomcomp.setApPat(b);
            Nomcomp.setApMat(c);
            Cuenta.setNumCuenta();
            Alumno  alu1 = new Alumno(Nomcomp.getNombre(),Nomcomp.getApPat(),Nomcomp.getApMat(),
                    Cuenta.getNumCuenta(),45,prom.getPromedio(),prom.getEscolaridad(),semestre+1,"Primera cerrada",i
                    ,prom.getMateriasReprobadas(),prom.getVelocidad());
            lista.add(alu1);
        }
        //Nombre, Apellidopat,ApellidoMat,numero de cuenta, edad, promedio,direccion, numinscripcion
        ObservableList<Alumno> listado = FXCollections.observableArrayList(lista);
        Tabla.setItems(listado);

        
    }
    public void Opcion2(){
        
    }
    public void Opcion3(){
        Tabla.setEditable(true);
        nombre.setCellFactory(TextFieldTableCell.forTableColumn());
        nombre.setOnEditCommit(e->e.getTableView().getItems().get(e.getTablePosition().getRow()).setNombre(e.getNewValue()));
        ApMaterno.setCellFactory(TextFieldTableCell.forTableColumn());
        ApMaterno.setOnEditCommit(e->e.getTableView().getItems().get(e.getTablePosition().getRow()).setApMaterno(e.getNewValue()));
        ApPaterno.setCellFactory(TextFieldTableCell.forTableColumn());
        ApPaterno.setOnEditCommit(e->e.getTableView().getItems().get(e.getTablePosition().getRow()).setApPaterno(e.getNewValue()));
        direccion.setCellFactory(TextFieldTableCell.forTableColumn());
        direccion.setOnEditCommit(e->e.getTableView().getItems().get(e.getTablePosition().getRow()).setDireccion(e.getNewValue()));
        edad.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        edad.setOnEditCommit(e->e.getTableView().getItems().get(e.getTablePosition().getRow()).setEdad(e.getNewValue()));
           
        
    }
    public void Opcion4(List<Alumno> lista){
        try (FileWriter archivo = new FileWriter("Informacion_de_Alumnos_FI_2023-1.csv",Charset.forName("UTF8"))){
            BufferedWriter bw = new BufferedWriter(archivo);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Nombre,Apellido Paterno,Apellido Materno,Edad,Numero de cuenta,Semestre,Promedio,Escolaridad,Velocidad,Numero de inscripcion,Materias Reprobadas,Direccion");
            for (Alumno alumno : lista) {
                salida.println(String.format("%s,%s,%s,%d,%d,%d,%f,%f,%s,%d",alumno.getNombre(),
                        alumno.getApPaterno(),alumno.getApMaterno(),alumno.getEdad(),alumno.getNumcuenta(),
                        alumno.getSemestre(),alumno.getPromedio(),alumno.getEscolaridad(),alumno.getDireccion(),
                        alumno.getNuminscripcion()));
            }
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "El archivo ha sido creado");
        }catch(IOException e){
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "No fue posible crear o acceder al archivo", "Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void Opciones(ActionEvent event){
        String opcion = selector.getValue();
        
        switch(opcion){
            case "Generar datos del alumno":
                Tabla.setEditable(false);
                Opcion1();
                break;
            case "Calcular números de inscripción":
                Tabla.setEditable(false);
                Opcion2();
                break;
            case "Modificar datos del alumno":
                Opcion3();
                break;
            case "Exportar datos a .csv":
                Tabla.setEditable(false);
                Opcion4(lista);
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
        promedio.setCellValueFactory(new PropertyValueFactory<Alumno, Double>("promedio"));
        semestre.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("semestre"));
        escolaridad.setCellValueFactory(new PropertyValueFactory<Alumno, Double>("escolaridad"));
        direccion.setCellValueFactory(new PropertyValueFactory<Alumno, String>("direccion"));
        numinscripcion.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("numinscripcion"));
        materiasReprobadas.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("materiasReprobadas"));
        velocidad.setCellValueFactory(new PropertyValueFactory<Alumno, Double>("velocidad"));
        selector.getItems().addAll(eleccion);
        selector.setOnAction(this::Preparacion);
    }    
    
}
