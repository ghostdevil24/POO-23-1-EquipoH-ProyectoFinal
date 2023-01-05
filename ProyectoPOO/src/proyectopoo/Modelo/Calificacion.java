/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Modelo;

/**
 *
 * @author richa
 */
public class Calificacion {
    private Double calificacionTotal;
    private String[] materias;
    private Integer[] calificaciones;

    public Calificacion() {
    }

    public Calificacion(Double calificacionTotal, String[] materias, Integer[] calificaciones) {
        this.calificacionTotal = calificacionTotal;
        this.materias = materias;
        this.calificaciones = calificaciones;
    }

    public Double getCalificacionTotal() {
        return calificacionTotal;
    }

    public void setCalificacionTotal(Double calificacionTotal) {
        this.calificacionTotal = calificacionTotal;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public Integer[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Integer[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    
}
