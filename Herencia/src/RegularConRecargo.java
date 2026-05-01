public class RegularConRecargo extends EstudianteRegular {
    private double recargoPendiente;

    public RegularConRecargo(String codigo, String nombre, double promedio,
                             double valorMatricula, int numeroMaterias, double recargoPendiente) {
        super(codigo, nombre, promedio, valorMatricula, numeroMaterias);
        setRecargoPendiente(recargoPendiente);
    }

    public void setRecargoPendiente(double recargo) {
        if (recargo >= 0) {
            this.recargoPendiente = recargo;
        } else {
            System.out.println("❌ El recargo no puede ser negativo.");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargoPendiente;
    }
}