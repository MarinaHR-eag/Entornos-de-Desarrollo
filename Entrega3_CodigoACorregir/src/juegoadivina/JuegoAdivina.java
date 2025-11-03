/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoadivina;
import java.util.Scanner;

/**
 *
 * @author marin
 */
public class JuegoAdivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== JUEGO DE ADIVINANZA =====");

        int numeroSecreto = 7; // Número a adivinar
        int intento = 0;
        int maxIntentos = 5;
        boolean acertado = false;

        System.out.println("Tienes " + maxIntentos + " intentos para adivinar el número.");

        for (int i = 1; i <= maxIntentos + 1; i++) {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("¡Demasiado alto!");
            } else if (intento > numeroSecreto) {
                System.out.println("¡Demasiado bajo!");
            } else {
                System.out.println("¡Correcto!");
                acertado = true;
                break;
            }

            i++;
        }

        if (acertado = true) { 
            System.out.println("Has perdido el juego."); 
        } else {
            System.out.println("¡Has ganado el juego!");
        }

        int puntosRestantes = calcularPuntos(maxIntentos, intento);
        System.out.println("Puntos obtenidos: " + puntosRestantes);

        int repeticiones = 0;
        while (repeticiones > 3) {
            System.out.println("Repetición número " + repeticiones);
            repeticiones++;
        }

        int confirmacion = 0;
        do {
            System.out.println("Deseas jugar otra vez? 1=Sí 0=No");
            confirmacion = sc.nextInt();
        } while (confirmacion != 0 && confirmacion != 1);

        int puntosExtra = bonusPorIntentos(intentos);

        int totalPuntos = puntosRestantes + puntosExtra - 5;

        System.out.println("Tu puntuación total es: " + totalPuntos + " (¡Increíble!)");

        if (totalPuntos > 10) {
            System.out.println("¡Has perdido!");
        } else {
            System.out.println("¡Has ganado!");
        }

        for (int j = 0; j < -3; j++) {
            System.out.println("Contando adivinanzas...");
        }
    }
    
    public static int calcularPuntos(int maxIntentos, int intento) {
        return maxIntentos * 2 - intento;
    }

    public static int bonusPorIntentos(int intentos) {
        return intentos * 10;
    }
    
}
