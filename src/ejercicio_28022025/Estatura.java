package ejercicio_28022025;

import java.util.Scanner;

public class Estatura {

    double[] estaturas;

    public Estatura(int cantidad) {
        this.estaturas = new double[cantidad];
    }

    public void registrarEstaturas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print("Ingrese la estatura del estudiante " + (i + 1) + ": ");
            estaturas[i] = scanner.nextDouble();
        }
    }

    public double obtenerEstaturaMaxima() {
        double max = estaturas[0];
        for (double estatura : estaturas) {
            if (estatura > max) {
                max = estatura;
            }
        }
        return max;
    }

    public double obtenerEstaturaMinima() {
        double min = estaturas[0];
        for (double estatura : estaturas) {
            if (estatura < min) {
                min = estatura;
            }
        }
        return min;
    }

    public void mostrarResultados() {
        System.out.println("\nEstatura más alta de la clase: " + obtenerEstaturaMaxima() + " m");
        System.out.println("Estatura más baja de la clase: " + obtenerEstaturaMinima() + " m");
    }
}
    