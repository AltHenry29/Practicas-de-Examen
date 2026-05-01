import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Valor matrícula: ");
        double valorMatricula = sc.nextDouble();

        System.out.println("\n--- Datos adicionales ---");
        System.out.print("Porcentaje de beca: ");
        double beca = sc.nextDouble();

        System.out.print("Número de materias: ");
        int materias = sc.nextInt();

        System.out.print("Recargo pendiente: ");
        double recargo = sc.nextDouble();

        Estudiante e1 = new BecadoExcelencia(codigo, nombre, promedio, valorMatricula, beca, 50);
        Estudiante e2 = new RegularConRecargo(codigo, nombre, promedio, valorMatricula, materias, recargo);

        // Resultados
        System.out.println("\n==== ESTUDIANTE BECA EXCELENCIA ====");
        e1.mostrarDatos();
        System.out.println("Pago final: $" + e1.calcularPagoFinal());

        System.out.println("\n==== ESTUDIANTE REGULAR CON RECARGO ====");
        e2.mostrarDatos();
        System.out.println("Pago final: $" + e2.calcularPagoFinal());
    }
}