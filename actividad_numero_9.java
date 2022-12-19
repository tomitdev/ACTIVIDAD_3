public class Main{

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Lionel");
        cliente.setEdad(25);
        cliente.setTelefono(761029341);
        cliente.setCredito(12000);
        System.out.println(cliente.getNombre() + " posee " + cliente.getEdad() + " años, su numero de telefono es: " + cliente.getTelefono() + " y tiene $" + cliente.getCredito() + " en su cuenta de banco");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Andres");
        trabajador.setEdad(36);
        trabajador.setTelefono(912983131);
        trabajador.setSalario(9200);
        System.out.println(trabajador.getNombre() + " tiene " + trabajador.getEdad() +  " años, su numero de celular es " + trabajador.getTelefono() + " y tiene un salario de " + trabajador.getSalario()   );
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(){}

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}



class Cliente extends Persona{
    private double  credito;

    public Cliente(){}

    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public Trabajador(){}

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}

