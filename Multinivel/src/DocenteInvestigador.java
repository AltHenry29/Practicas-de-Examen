public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad, int horasClase, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        } else {
            System.out.println("❌ Publicaciones no pueden ser negativas.");
        }
    }

    @Override
    public double calcularPago(){
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;
    }

    public double calcularPago(double bonoExtra){
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol(){
        System.out.println("Rol: Docente investigador con producción académica.");
    }

    // Mostrar datos
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Publicaciones: " + publicaciones);
    }
}
