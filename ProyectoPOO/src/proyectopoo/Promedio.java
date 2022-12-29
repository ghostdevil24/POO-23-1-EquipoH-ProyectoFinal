/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author richa
 */
public class Promedio {
   
   int[] materias_por_semestre={5,10,16,21,26,31,37,42,47,52};
   Double promedio;
   String[] materias={"Álgebra","Cálculo y geometría analítica","Química","Fundamentos de física","Fundamentos de programación"
   ,"Álgebra lineal","Cálculo Integral","Mecánica","Redacción y exposición de temas de ingeniería","Estructura de datos y algoritmos I"
   ,"Probabilidad","Calculo vectorial","Ecuaciones Diferenciales","Cultura y comunicación","Estructura de datos y algoritmos II","Programación Orientada a objetos",
   "Fundamentos de estadistica","Electricidad y magnetismo","Análisis numérico","Matemáticas avanzadas","Estructuras discretas",
   "Estructura y programación de computadoras","Dispositivos electrónicos","Lenguajes formales y autómatas","Señales y sistemas","Ingeniería de software",
   "Sistemas operativos","Diseño digital moderno","Bases de datos","Circuitos eléctricos","Administración de proyectos de software",
   "Finanzas en la ingeniería en computación","Diseño digital VLSI","Inteligencia artificial","Compiladores","Sistemas de comunicaciones","Introducción a la economía",
   "Optativa[s] de ciencias sociales","Microcomputadoras","Computación gráfica e interacción humano computadora","Ética profesional","Redes de datos seguras",
   "Organización y arquitectura de computadoras","Fundamentos de sistemas embebidos","Sistemas distribuidos","Optativas de campo de profundización","Recursos y necesidades de México"
   ,"Optativa I","Optativa II","Optativa III","Optativa IV","Optativa V"};
   Integer creditosAcumulados;
   Double escolaridad;
   Double velocidad;
   Integer materiasReprobadas;
   Integer[] creditosMaterias={8,12,10,6,10,8,8,12,6,10,8,8,8,2,10,10,8,10,8,8,8,8,10,8,8,8,8,10,14,8,8,6,8,8,8,8,8,6,8,10,6,14,8,8,8,8,8,8,8,8,8,8};
   Integer[] creditosSemestre={46,44,46,42,42,48,46,44,40,40};
   public void CalcularCalificacion(int semestre){
       creditosAcumulados=0;
       materiasReprobadas=0;
       int suma=0;
       double prom;
       Integer[] calificaciones = new Integer[materias_por_semestre[semestre]];
       //Alumno  alu1 = new Alumno(Nomcomp.getNombre(),Nomcomp.getApPat(),Nomcomp.getApMat(),Cuenta.getNumCuenta(),45,9,i,3,"Primera cerrada",null);
       for (int i = 0; i < materias_por_semestre[semestre]; i++) {
           calificaciones[i]=(int)(Math.random()*(10-6+1)+6);
           if(i<materias_por_semestre[semestre]-(materias_por_semestre[semestre]-5)){
               calificaciones[i]=(int)(Math.random()*(10-5+1)+5);
           }
       }
       int k=0;
       for (Integer x : calificaciones) {
           if(x!=5){
               suma=x+suma;
               creditosAcumulados=creditosMaterias[k]+creditosAcumulados;
           }else{
               materiasReprobadas=materiasReprobadas+1;
           }
           k=k+1;
       }
       promedio=((double)suma/(double)(materias_por_semestre[semestre]-materiasReprobadas));
       promedio=Math.floor(promedio*100)/100;
       String[] copiaMaterias= Arrays.copyOfRange(materias,0,materias_por_semestre[semestre]);
       Calificacion calif = new Calificacion(promedio,copiaMaterias,calificaciones);
       escolaridad=(double)(materias_por_semestre[semestre]-materiasReprobadas)/(double)materias_por_semestre[semestre];
       escolaridad=(Math.floor(escolaridad*1000)/1000)*100;
       velocidad=(double)creditosAcumulados/(double)creditosSemestre[semestre];
       velocidad=(Math.floor(velocidad*1000)/1000)*100;
       }

    public Double getPromedio() {
        return promedio;
    }

    public Double getEscolaridad() {
        return escolaridad;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public Integer getMateriasReprobadas() {
        return materiasReprobadas;
    }
    
   
}
