public class EjercicioTema8 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setEdad(30);
        p.setNombre("Juan");
        p.setTelefono("1234567890");


        System.out.println("Edad: " + p.getEdad());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Teléfono: " + p.getTelefono());
    }
    public static class Persona {
        private int edad;
        private String nombre;
        private String telefono;



        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }




}














