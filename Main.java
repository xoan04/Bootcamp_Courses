/*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.*/

public class Main {
    public static void main(String[] args) {
    Persona persona1= new Persona();
    persona1.setNombre("Juan");
    persona1.setEdad(21);
    persona1.setTelefono(302123122);
    System.out.println("Nombre:" +persona1.getNombre());
    System.out.println("Edad: "+persona1.getEdad());
    System.out.println("Telefono: "+persona1.getTelefono());
    }
}

class Persona{
    private int Edad;
    private String Nombre;
    private int Telefono;
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }



}