package vetor.teste;

import vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("1 elemento");
        vetor.adiciona("2 elemento");
        vetor.adiciona("3 elemento");

        System.out.println(vetor.busca(3));
    }
}
