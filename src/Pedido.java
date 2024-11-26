public class Pedido {
    private double peso;
    private Dimensoes dimensoes;
    private boolean local;
    private boolean emAreaMetropolitana;
    private boolean internacional;

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public Dimensoes getDimensoes() { return dimensoes; }
    public void setDimensoes(Dimensoes dimensoes) { this.dimensoes = dimensoes; }
    public boolean isLocal() { return local; }
    public void setLocal(boolean local) { this.local = local; }
    public boolean isEmAreaMetropolitana() { return emAreaMetropolitana; }
    public void setEmAreaMetropolitana(boolean emAreaMetropolitana) { this.emAreaMetropolitana = emAreaMetropolitana; }
    public boolean isInternacional() { return internacional; }
    public void setInternacional(boolean internacional) { this.internacional = internacional; }
}