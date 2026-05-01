public class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula,
                            double porcentajeBeca, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }

    public void setBonoExcelencia(double bono) {
        if (bono >= 0) {
            this.bonoExcelencia = bono;
        } else {
            System.out.println("El bono no puede ser negativo.");
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pagoBase = super.calcularPagoFinal();
        double pagoFinal = pagoBase - bonoExcelencia;
        return Math.max(pagoFinal, 0); // No permite negativos
    }
}
