public class TransporteMaritimo implements EstrategiaTransporte {
    @Override
    public boolean aplicar(Pedido pedido) {
        return pedido.isInternacional();
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entrega realizada via transporte marítimo.");
    }
}