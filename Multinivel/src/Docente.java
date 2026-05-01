public class Docente extends PersonaAcademica {
    protected int horasClase;
    protected double valorHora;

    // Constructor
    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }

    // Setters con validación
    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            System.out.println("❌ Horas de clase inválidas (1-40).");
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("❌ El valor por hora debe ser mayor a 0.");
        }
    }

    // Getter requerido
    public int getHorasClase() {
        return horasClase;
    }

    // Método sobrescrito
    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    // Método sobrescrito
    @Override
    public void describirRol() {
        System.out.println("Rol: Docente de educación superior.");
    }
}
