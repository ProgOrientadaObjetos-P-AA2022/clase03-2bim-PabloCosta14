/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String doc) {
        super(doc);
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void establecerPromedioEdades() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {

            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();

    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public void establecer(ArrayList<Policia> l) {
        lista = l;
    }

    @Override
    public String toString() {

        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Apellidos: %s\n"
                    + "Edad: %d\n"
                    + "Rango: %s\n",
                    cadena,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad(),
                    lista.get(i).getRango());

        }
        cadena = String.format("%s\nEL total de edades %.2f\n",
                cadena, obtenerPromedioEdades());
        return cadena;

    }

}
