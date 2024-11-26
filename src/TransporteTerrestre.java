
public class TransporteTerrestre implements EstrategiaTransporte {
    @Override
    public boolean aplicar(Pedido pedido) {
        return pedido.isLocal();
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entrega realizada via transportadora terrestre.");
    }
}