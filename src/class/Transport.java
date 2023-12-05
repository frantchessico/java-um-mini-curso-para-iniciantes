public class Transport {
    public String tipo;
    public int capacidadePassageiros;
    public double velocidadeMaxima;
    
}


class Carro extends Transport {
    private String modelo;
    private String marca;
    private int numeroPortas;
    
    public Carro(String modelo, String marca, int numeroPortas, String tipo, int capacidadePassageiros, double velocidadeMaxima) {
        this.tipo = tipo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPortas = numeroPortas;
    }

    // Getters and setters for modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getters and setters for marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getters and setters for numeroPortas
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    
}
