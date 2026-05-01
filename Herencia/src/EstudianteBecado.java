public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca; // 0 a 100

    public EstudianteBecado(String codigo, String nombre, double promedio,
                            double valorMatricula, double porcentajeBeca) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("❌ Porcentaje de beca inválido (0-100).");
        }
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = (porcentajeBeca / 100) * getValorMatricula();
        return getValorMatricula() - descuento;
    }
}
