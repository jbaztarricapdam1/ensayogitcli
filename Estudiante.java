
/**
 *  Descripción de un estudiante
 * 
 * @author - Julen Baztarrica 
 *  
 */
public class Estudiante
{
    private String nombre;
    private int edad;

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queEdad)    {
        nombre = queNombre;
        edad = queEdad;

    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return nombre;

    }

    /**
     * Accesor para la edad
     */
    public int getEdad() {
        return edad;

    }

    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
            "\nEdad: " + edad);

    }

}
