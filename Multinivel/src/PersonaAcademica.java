public class PersonaAcademica {
    // Atributos privados
    private String codigo;
    private String nombre;
    private int edad;

    // Constructor
    public PersonaAcademica(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setEdad(edad);
    }

    // Setters con validación
    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("❌ Edad inválida (mínimo 18)");
        }
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica general.");
    }

    // Método que se sobrescribirá
    public double calcularPago() {
        return 0;
    }
}