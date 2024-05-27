package aula49;

public class FinallyPegadinha {
    public static void main(String[] args) {
        int[] numeros = { 4, 8, 16, 32, 64, 128 };
        int[] denominador = { 2, 0, 4, 8, 0 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + numeros[i] / denominador[i]);
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero.");
                System.exit(0); // Finaliza o programa
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Posição do Array inválida.");
                System.exit(0);
            } finally {
                System.out.println("Essa linha sempre será impressa após o try ou catch.");
            }
        }
    }
}