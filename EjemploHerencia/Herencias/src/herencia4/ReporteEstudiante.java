/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;
   
    public ReporteEstudiante(String doc){
          super(doc); 
    }
    public void establecerLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {

            suma = suma + lista.get(i).getMatricula();
        }
         promedioMatriculas = suma /lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public double ObtenerPromedioMatriculas() {
        return promedioMatriculas;

    }
     @Override
    public String toString() {

        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Apellidos: %s\n"
                    + "Edad %s\n"
                    + "Matricula: %s\n",
                    cadena,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad(),
                    lista.get(i).getMatricula());

        }
        cadena = String.format("%s\nEL total de la matricula %.2f\n", 
                cadena, ObtenerPromedioMatriculas());
        return cadena;
        
    }
}
