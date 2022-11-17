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
    String[] NombredePila = {"Hugo","Martín","Lucas","Mateo","Leo","Daniel","Alejandro","Pablo","Manuel","Álvaro","Adrián","David","Mario","Enzo","Diego","Marcos","Izan","Javier","Marco","Álex","Bruno","Oliver","Miguel","Thiago","Antonio","Marc",
        "Carlos","Ángel","Juan","Gonzalo","Gael","Sergio","Nicolás","Dylan","Gabriel","Jorge","José","Adam","Liam","Eric","Samuel","Darío","Héctor","Luca","Iker","Amir","Rodrigo","Saúl","Víctor","Francisco","Aitana","Alba","Amaia","Carla","Daniela",
        "Emma","Greta","India","Isabella","Martina","Olivia","Valeria","Vega","Vera","Zara","Abigail","Belén","Elis","Gabriela","Johana","Mara","Naomi","Odelia","Rafaela","Rebeca","Ruth","Sara","Susana","Tamara","Zahara","Adela","Dina","Esther","Isabel",
        "Inmaculada","Irene","Judit","María","Magdalena","Miriam","Nazaret","Noemí","Priscila","Sarai","Raquel","Rosa","Isabel"};
    String[] ApellidoPaterno = {"Martinez","Garcia","Fernandez","Perez","Jimenez","Gonzalez","Ruiz","Lopez","Saenz","Rodriguez","Gomez","Moreno","Hernandez","Sanchez","Alonso","Pascual","Gil","Marin","Diez","Alvarez","Gutierrez","Martin","Calvo","Ezquerro",
        "Blanco","Rubio","Ibañez","Muñoz","Garrido","Saez","Diaz","Ramirez","Palacios","Ortega","Santamaria","Benito","Ochoa","Romero","Leon","Dominguez","Gabarri","Peña","Herce","Torres","Merino","Sainz","Castillo","Sanz","Ortiz","Cordon","Aranda","Melo",
        "Melano","Aranda","Sosa","Medrano","Pedraza","Barbosa","Tovar","Angeles","Benitez","Mancera","Obrador","Wayne","Tapia","Jurado","Pineda","Manzanarez","Diaz","Solis"};
    String[] ApellidoMaterno = {"Martinez","Garcia","Fernandez","Perez","Jimenez","Gonzalez","Ruiz","Lopez","Saenz","Rodriguez","Gomez","Moreno","Hernandez","Sanchez","Alonso","Pascual","Gil","Marin","Diez","Alvarez","Gutierrez","Martin","Calvo","Ezquerro",
        "Blanco","Rubio","Ibañez","Muñoz","Garrido","Saez","Diaz","Ramirez","Palacios","Ortega","Santamaria","Benito","Ochoa","Romero","Leon","Dominguez","Gabarri","Peña","Herce","Torres","Merino","Sainz","Castillo","Sanz","Ortiz","Cordon","Aranda","Melo",
        "Melano","Aranda","Sosa","Medrano","Pedraza","Barbosa","Tovar","Angeles","Benitez","Mancera","Obrador","Wayne","Tapia","Jurado","Pineda","Manzanarez","Diaz","Solis"};
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

    public void setNombre(int indice) {
        
        this.Nombre = NombredePila[indice];
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(int indice) {
        this.ApPat = ApellidoPaterno[indice];
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(int indice) {
        this.ApMat = ApellidoMaterno[indice];
    }

    public String[] getNombreCom() {
        String[] arr ={Nombre,ApPat,ApMat};
        return   arr;
    }

    
}
