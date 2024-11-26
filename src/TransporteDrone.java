public class TransporteDrone implements EstrategiaTransporte {
    @Override
    public boolean aplicar(Pedido pedido) {
        return pedido.isEmAreaMetropolitana() && pedido.getPeso() <= 5;
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entrega realizada via drone.");
    }
}