/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Modelo;

/**
 *
 * @author richa
 */
public class GeneradorNumCuenta {
    int NumCuenta;
    int a,b,c,d,e;
    String num;

    public GeneradorNumCuenta() {
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(){
         a = (int)(Math.random()*(99-10+1)+10);
         b = (int)(Math.random()*(99-10+1)+10);
         c = (int)(Math.random()*(99-10+1)+10);
         d = (int)(Math.random()*(99-10+1)+10);
         e = (int)(Math.random()*(9-0+1)+0);
         num=""+a+b+c+d+e;
         NumCuenta=Integer.parseInt(num);
        this.NumCuenta = NumCuenta;
    }
    
}
