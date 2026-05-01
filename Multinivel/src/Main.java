import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Horas de clase: ");
        int horas = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Publicaciones: ");
        int publicaciones = sc.nextInt();

        PersonaAcademica docente = new DocenteInvestigador(
                codigo, nombre, edad, horas, valorHora, publicaciones);

        // Mostrar datos
        docente.mostrarDatos();
        docente.describirRol();

        // Cálculo de pago
        double pago = docente.calcularPago();
        System.out.println("Pago final: $" + pago);

        // Cálculo con bono extra
        double pagoConBono = ((DocenteInvestigador) docente).calcularPago(50);
        System.out.println("Pago con bono extra: $" + pagoConBono);
    }
}