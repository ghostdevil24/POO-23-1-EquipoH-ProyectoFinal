/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

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
    private Double promedio;
    private Double escolaridad;
    private Integer semestre;
    private String direccion;
    private Integer numinscripcion;
    private Integer materiasReprobadas;
    private Double velocidad;
    private Double indicadorEscolar;
    

    public Alumno() {
    }

    public Alumno(String nombre, String apPaterno, String apMaterno, Integer numcuenta, Integer edad, Double promedio, Double escolaridad, Integer semestre, String direccion, Integer numinscripcion, Integer materiasReprobadas, Double velocidad, Double indicadorEscolar) {
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
        this.materiasReprobadas = materiasReprobadas;
        this.velocidad = velocidad;
        this.indicadorEscolar = indicadorEscolar;
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

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(Double escolaridad) {
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

    public Integer getMateriasReprobadas() {
        return materiasReprobadas;
    }

    public void setMateriasReprobadas(Integer materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getIndicadorEscolar() {
        return indicadorEscolar;
    }

    public void setIndicadorEscolar(Double indicadorEscolar) {
        this.indicadorEscolar = indicadorEscolar;
    }
    
}
