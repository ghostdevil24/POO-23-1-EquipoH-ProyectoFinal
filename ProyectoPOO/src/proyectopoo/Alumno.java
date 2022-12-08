/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author richa
 */
public class Alumno {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Integer numcuenta;
    private Integer edad;
    private Integer promedio;
    private Integer escolaridad;
    private Integer semestre;
    private String direccion;
    private Integer numinscripcion;

    public Alumno() {
    }

    public Alumno(String nombre, String apPaterno, String apMaterno, Integer numcuenta, Integer edad, Integer promedio, Integer escolaridad, Integer semestre, String direccion, Integer numinscripcion) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.promedio = promedio;
        this.escolaridad = escolaridad;
        this.semestre = semestre;
        this.direccion = direccion;
        this.numinscripcion = numinscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPromedio() {
        return promedio;
    }

    public void setPromedio(Integer promedio) {
        this.promedio = promedio;
    }

    public Integer getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(Integer escolaridad) {
        this.escolaridad = escolaridad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNuminscripcion() {
        return numinscripcion;
    }

    public void setNuminscripcion(Integer numinscripcion) {
        this.numinscripcion = numinscripcion;
    }

    
}
