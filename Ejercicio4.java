public class Ejercicio4 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setEdad(21);
        cliente1.setTelefono(302123122);
        cliente1.setCredito(80000);
        System.out.println("--------------PARTE 1-----------");
        System.out.println("Nombre:" + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("Su credito es: " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Jose");
        trabajador1.setEdad(23);
        trabajador1.setTelefono(306783122);
        trabajador1.setSalario(100000);
        System.out.println("--------------PARTE 2-----------");
        System.out.println("Nombre:" + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Telefono: " + trabajador1.getTelefono());
        System.out.println("Su Salario es: " + trabajador1.getSalario());

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
    class Cliente extends Persona{
        private float Credito;

        public float getCredito() {
            return Credito;
        }
        public void setCredito(int credito){
            Credito=credito;
        }


    }
    class Trabajador extends Persona{
        private float Salario;

        public float getSalario() {
            return Salario;
        }
        public void setSalario(float salario){
            Salario=salario;
        }


    }
