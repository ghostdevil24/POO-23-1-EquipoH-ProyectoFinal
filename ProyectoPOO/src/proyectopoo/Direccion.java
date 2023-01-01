/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author richa
 */
public class Direccion {
    String direccion;
    List<String> directorio = new ArrayList<>();
    List<Integer> indicesUsados = new ArrayList<>();
    public void ConstruirDirectorio(){
        try {
                int i=0;
                FileReader fr = new FileReader("Directorio Alumnos.csv");
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while(linea!=null){
                    directorio.add(linea);
                    linea=br.readLine();
                    i++;
                }
                br.close();
            } catch (FileNotFoundException ex) {
                JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No fue posible encontrar el archivo para generar direcciones", "Error",JOptionPane.WARNING_MESSAGE);
            } catch (IOException ex) {
                JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se puede leer el archivo", "Error",JOptionPane.WARNING_MESSAGE);
            }
    }
    public String LeerDireccion(){
        int indice=(int)(Math.random()*(directorio.size()-1-0+1)+0);
        while(indicesUsados.contains(indice)){
            indice=(int)(Math.random()*(directorio.size()-1-0+1)+0);
        }
        indicesUsados.add(indice);
        direccion= directorio.get(indice);
        return direccion;
}

    public String getDireccion() {
        return direccion;
    }
    
}
