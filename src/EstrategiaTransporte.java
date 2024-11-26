public interface EstrategiaTransporte {
    boolean aplicar(Pedido pedido);
    void entregar(Pedido pedido);
}