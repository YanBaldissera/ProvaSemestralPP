public class TransporteAereo implements EstrategiaTransporte {
    @Override
    public boolean aplicar(Pedido pedido) {
        return pedido.getPeso() < 100 &&
                pedido.getDimensoes() != null && // Verifica se dimensões não são nulas.
                pedido.getDimensoes().permiteTransporteAereo();
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entrega realizada via transporte aéreo.");
    }
}