/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author DELL
 */
public abstract class Estudiante {

    protected String nombresEstudiante;
    protected String apellidosEstudiante;
    protected String identificacionEstudiante;
    protected int edadEstudiante;
    protected double matricula;

    // Método establecerNombresEstudiante(nom: Cadena)
    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;
    }

    // Método establecerApellidoEstudiante(ape: Cadena)
    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;
    }

    //  Método establecerIdentificacionEstudiante(iden: Cadena)
    public void establecerIdentificacionEstudiante(String iden) {
        identificacionEstudiante = iden;
    }

    // Método establecerEdadEstudiante(ed: Edad)
    public void establecerEdadEstudiante(int ed) {
        edadEstudiante = ed;
    }

    /*
    Método abstracto calcularMatricula()
        // método sin impĺementar, se deja la responsabilidad 
        // a las clases derivadas
     */
    public abstract void calcularMatricula();

    //  Métodos obtener para los datos o atributos de la clase
    //  Método obtenerNombresEstudiante() : Cadena
    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    // Método obtenerApellidoEstudiante() : Cadena
    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    // Método obtenerIdentificacionEstudiante() : Cadena
    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    //  Método obtenerEdadEstudiante() : Entero
    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

    /*
    Método obtenerMatricula() : Real
        a.  return matricula
        b.  Fin Método obtenerMatricula
     */
    public double obtenerMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Reporte del estudiante\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificación: %s\n"
                + "Edad: %d\n"
                + "Costo Matricula: %.2f\n",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(),
                obtenerEdadEstudiante(),
                obtenerMatricula());
        return cadena;
    }
}
