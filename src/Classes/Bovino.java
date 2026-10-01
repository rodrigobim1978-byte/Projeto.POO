package Classes;

public class Bovino {

    // Atributos
    private String brinco;
    private String raca;
    private double peso;

    // Construtor
    public Bovino(String brinco, String raca, double peso) {
        this.brinco = brinco;
        this.raca = raca;
        this.peso = peso;
    }

    // Getter e Setter do brinco
    public String getBrinco() {
        return brinco;
    }

    public void setBrinco(String brinco) {
        this.brinco = brinco;
    }

    // Getter e Setter da raça
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Getter e Setter do peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para exibir os dados
    public void exibirDados() {

        System.out.println("\n===== DADOS DO BOVINO =====");
        System.out.println("Brinco: " + brinco);
        System.out.println("Raça: " + raca);
        System.out.println("Peso: " + peso + " kg");
    }
}