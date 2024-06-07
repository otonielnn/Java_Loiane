package vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // public void adiciona(String elemento) {
    // for (int i = 0; i < this.elementos.length; i++) {
    // if (this.elementos[i] == null) {
    // this.elementos[i] = elemento;
    // break;
    // }
    // }
    // }

    // public void adiciona(String elemento) throws Exception {
    // if (this.tamanho < this.elementos.length) {
    // this.elementos[this.tamanho] = elemento;
    // this.tamanho++;
    // } else {
    // throw new Exception("O veto está lotado. Não é possivel adicionar um novo
    // elemento!");
    // }
    // }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }
}
