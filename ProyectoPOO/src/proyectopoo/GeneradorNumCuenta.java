/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

/**
 *
 * @author richa
 */
public class GeneradorNumCuenta {
    int NumCuenta;
    int a,b,c,d,e,f;
    String num;

    public GeneradorNumCuenta() {
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(){
         a = (int)(Math.random()*(99-11+1)+11);
         b = (int)(Math.random()*(99-0+1)+0);
         c = (int)(Math.random()*(99-0+1)+0);
         d = (int)(Math.random()*(99-0+1)+0);
         e = (int)(Math.random()*(9-0+1)+0);
         num=""+a+b+c+d+e;
         if(num.length()<9){
             f = (int)(Math.random()*(8-0+1)+0);
             num=num+e;
         }
         NumCuenta=Integer.parseInt(num);
        this.NumCuenta = NumCuenta;
    }
    
}
