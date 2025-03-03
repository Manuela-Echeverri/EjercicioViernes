package ejercicio_28022025;

import java.util.Scanner;

public class Ejercicio_28022025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = scanner.nextInt();

        Estatura estu = new Estatura(cantidad);
        estu.registrarEstaturas();
        estu.mostrarResultados();
    }
}
