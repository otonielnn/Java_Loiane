package aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private double tamanho;
    private String raca;

    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Au, Au");
    }
    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void chamarVeterinario() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void levarVeterinario() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void brincar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void levarPassear() {
        // TODO Auto-generated method stub
        
    }
}
