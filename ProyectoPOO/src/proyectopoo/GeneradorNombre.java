/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

/**
 *
 * @author richa
 */
public class GeneradorNombre {
    private String Nombre;
    private String ApPat;
    private String ApMat;

    public GeneradorNombre() {
    }

    public GeneradorNombre(String Nombre, String ApPat, String ApMat) {
        this.Nombre = Nombre;
        this.ApPat = ApPat;
        this.ApMat = ApMat;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(String ApMat) {
        this.ApMat = ApMat;
    }

    public String[] getNombreCom() {
        String[] arr ={Nombre,ApPat,ApMat};
        return   arr;
    }

    
}
