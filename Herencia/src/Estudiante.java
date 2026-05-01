public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    // Setters
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código no puede estar vacío.");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no puede estar vacío.");
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido (0-10).");
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        } else {
            System.out.println("La matrícula debe ser mayor que 0.");
        }
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
    public double getValorMatricula() { return valorMatricula; }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal() {
        return valorMatricula; // pago base
    }

    // Sobrecarga
    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
