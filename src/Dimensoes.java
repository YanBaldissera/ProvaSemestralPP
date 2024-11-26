public class Dimensoes {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensoes(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public boolean permiteTransporteAereo() {
        return altura <= 100 && largura <= 100 && profundidade <= 100;
    }

    // Getters e setters.
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    public double getProfundidade() { return profundidade; }
    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }
}