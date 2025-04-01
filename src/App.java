import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arregloOriginal = {10, 9, 21, 5, 15, 2, -1, 0};
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        metodoburbuja burbuja = new metodoburbuja();
        metodoseleccion seleccion= new metodoseleccion();
        metodoinsercion insercion = new metodoinsercion();
        metodoburbujamejorado mbm = new metodoburbujamejorado();
        while (continuar) {
            System.out.println("\n=== Métodos de Ordenamiento ===");
            System.out.println("1 -> Burbuja");
            System.out.println("2 -> Selección");
            System.out.println("3 -> Inserción");
            System.out.println("4 -> Burbuja Mejorado");
            System.out.println("5 -> Salir");
            System.out.print("Seleccione una opción: ");
            int metodo = scanner.nextInt();
            if (metodo == 5) {
                System.out.println("¡Adiós!");
                continuar = false;
                break;
            }
            System.out.print("¿Desea ver los pasos? (true/false): ");
            boolean conPasos = scanner.nextBoolean();
            System.out.print("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
            char orden = scanner.next().toUpperCase().charAt(0);
            int[] copia = arregloOriginal.clone();
            int[] resultados;
            switch (metodo) {
                case 1:
                    System.out.println("\nMétodo Burbuja");
                    resultados = (orden == 'A') ? 
                        burbuja.ascendente(copia, conPasos) : 
                        burbuja.descendente(copia, conPasos);
                    break;
                case 2:
                    System.out.println("\nMétodo Selección");
                    resultados = (orden == 'A') ? 
                        seleccion.ascendente(copia, conPasos) : 
                        seleccion.descendente(copia, conPasos);
                    break;
                case 3:
                    System.out.println("\nMétodo Inserción");
                    resultados = (orden == 'A') ? 
                        insercion.ascendente(copia, conPasos) : 
                        insercion.descendente(copia, conPasos);
                    break;
                case 4:
                    System.out.println("\nMétodo Burbuja Mejorado");
                    resultados = (orden == 'A') ? 
                        mbm.ascendente(copia, conPasos) : 
                        mbm.descendente(copia, conPasos);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }
            System.out.println("Arreglo ordenado:");
            printArray(copia);
            System.out.println("Comparaciones -> " + resultados[0]);
            System.out.println("Cambios -> " + resultados[1]);
        }
        scanner.close();
    }
    public static void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}