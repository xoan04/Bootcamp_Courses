public class Tarea_2 {
    public static void main(String[] args) {

        System.out.println("----------PUNTO 1---------------");
        int numeroIf = -2;
        if (numeroIf < 0) {
            System.out.println("El numero es negativo-");
        } else if (numeroIf > 0) {

            System.out.println("El numero es positivo.");

        } else {
            System.out.println("El numero es 0");
        }

        System.out.println("\n-----------------PUNTO 2-----------------");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile++);
        }
        System.out.println("\n-----------------PUNTO 3-----------------");
        int numeroDowhile=0;
        do{
            System.out.println(numeroDowhile++);

            }while(numeroDowhile<1);


        System.out.println("\n-----------------PUNTO 4-----------------");
        int numeroFor=0;
       for(int i=0;numeroFor<=3;i++) {
            System.out.println(numeroFor++);
        }

        System.out.println("-------------------PUNTO 5-----------------");
       var estacion="";

       switch (estacion) {
           case "Invierno":
               System.out.println("Es Invierno");
               break;
           case "Verano":
               System.out.println("Es Verano");
               break;
           case "Otoño":
               System.out.println("Es Otoño");
               break;
           case "Primavera":
               System.out.println("Es Primavera");
               break;
           default:
               System.out.println("ESTACION INCORRETA");

       }
    }


}