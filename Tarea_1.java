public class Tarea_1 {
    public static void main(String[] args) {
        int a=5,b=10,c=5;
        System.out.println("----------PRIMERA PARTE---------------");
        System.out.println("La suma de los 3 parametros es: "+Parte1(a,b,c));
        Coche miCoche= new Coche();
        System.out.println("-------------SEGUNDA PARTE-----------");
        System.out.println("\nLas puertas actuales del coche son: "+miCoche.Puertas);
        miCoche.Increment();
        System.out.println("\n¡Se ha aumentado 1 puerta!");
        System.out.println("Las puertas del coche ahora son: "+miCoche.Puertas);

    }
    public static int Parte1(int a, int b, int c) {
        return a+b+c;


    }
    public static class Coche{
        public int Puertas=0;
        public void Increment(){
            this.Puertas++;
        }
    }
}



