/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Modelo;

/**
 *
 * @author richa
 */
public class Edad {
    Integer edad;

    public Edad() {
    }

    public Integer generarEdad(int semestre) {
        if(semestre+1==1){
             edad=(int)(Math.random()*(19-18+1)+18);
        }
        else if(semestre+1<5){
            edad=(int)(Math.random()*(20-19+1)+19);
        }
        else if(semestre+1>=5&&semestre<8){
            edad=(int)(Math.random()*(24-20+1)+20);
        }
        else{
            edad=(int)(Math.random()*(27-24+1)+24);
        }
        return edad;
    }
    
    public Integer getEdad() {
        return edad;
    }
    
}
