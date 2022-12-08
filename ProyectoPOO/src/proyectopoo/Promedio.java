/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author richa
 */
public class Promedio {
   int a,b;
   int[] materias_por_semestre={5,10,16,21,26,31,37,42,47,52};
   float calificacion;
   int Semestre;
   List<Object> listaMaterias= new ArrayList<>();
   String[] Materias={"Álgebra","Cálculo y geometría analítica","Química","Fundamentos de física","Fundamentos de programación"
   ,"Álgebra lineal","Cálculo Integral","Mecánica","Redacción y exposición de temas de ingeniería","Estructura de datos y algoritmos I"
   ,"Probabilidad","Calculo vectorial","Ecuaciones Diferenciales","Cultura y comunicación","Estructura de datos y algoritmos II","Programación Orientada a objetos",
   "Fundamentos de estadistica","Electricidad y magnetismo","Análisis numérico","Matemáticas avanzadas","Estructuras discretas",
   "Estructura y programación de computadoras","Dispositivos electrónicos","Lenguajes formales y autómatas","Señales y sistemas","Ingeniería de software",
   "Sistemas operativos","Diseño digital moderno","Bases de datos","Circuitos eléctricos","Administración de proyectos de software",
   "Finanzas en la ingeniería en computación","Diseño digital VLSI","Inteligencia artificial","Compiladores","Sistemas de comunicaciones","Introducción a la economía",
   "Optativa[s] de ciencias sociales","Microcomputadoras","Computación gráfica e interacción humano computadora","Ética profesional","Redes de datos seguras",
   "Organización y arquitectura de computadoras","Fundamentos de sistemas embebidos","Sistemas distribuidos","Optativas de campo de profundización","Recursos y necesidades de México"
   ,"Optativa","Optativa","Optativa","Optativa","Optativa"};

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }
   
   public void CalcularCalificacion(){
       Semestre=(int)((Math.random()*(materias_por_semestre.length))+1);
       for (int i = 0; i < materias_por_semestre[Semestre]; i++) {
           a=(int)((Math.random()*(materias_por_semestre.length))+1);
           listaMaterias.add(a,Materias[i]);
       }
    }
}
