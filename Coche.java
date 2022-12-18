public class Coche {
    private int numPuertas;
    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    public void añadirPuerta() {
        numPuertas++;
    }


    public int getNumPuertas() {
        return numPuertas;
}

    public static void main(String[] args) {

        Coche miCoche = new Coche(2);
        miCoche.añadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}

class SUMA {
    public static void main(String[] args) {

        int resultado  = numeros(30,20,50);
        System.out.println(resultado);

    }

    public static int numeros (int a, int b, int c) {

        int resultado= a + b + c;
        return resultado;




    }
}









