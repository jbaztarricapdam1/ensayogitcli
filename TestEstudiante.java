
/**
 *  Para probar Git Github 
 *  desde línea de comandos
 *  @author - Julen Baztarrica
 */
public class TestEstudiante
{

    /**
     *  
     */
    public static void main(String[] args){
        System.out.println("Creamos varios objetos Estudiante");
        Estudiante e1 = new Estudiante("Alberto", 6);
        e1.printEstudiante();
        Estudiante e2 = new Estudiante("Ana", 8);
        e2.printEstudiante();
        Estudiante e3 = new Estudiante("Elisa", 26);
        e3.printEstudiante();
        
        Estudiante e4 = new Estudiante("Julen", 19);
        e4.printEstudiante();
        
        Estudiante e5 = new Estudiante("Baztarrica", 19);
        e5.printEstudiante();
    }
}
