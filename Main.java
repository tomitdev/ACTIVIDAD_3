public class Main {
    public static void main(String[] args) {


       //parte uno

        int numeroIf = 7;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }


       //parte dos

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        //parte tres


        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);



       //parte cuatro

        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println(numeroFor);
        }


        //parte cinco

        String estacion ="invierno";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;


















        }






        }

    }









