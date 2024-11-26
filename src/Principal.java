public class Principal {
    public static void main(String[] args) {
        GerenciadorTransporte gerenciador = new GerenciadorTransporte();


        Pedido pedidoDrone = new Pedido();
        pedidoDrone.setPeso(3);
        pedidoDrone.setEmAreaMetropolitana(true);
        gerenciador.entregarPedido(pedidoDrone);


        Pedido pedidoTerrestre = new Pedido();
        pedidoTerrestre.setPeso(50);
        pedidoTerrestre.setLocal(true);
        gerenciador.entregarPedido(pedidoTerrestre);


        Pedido pedidoAereo = new Pedido();
        pedidoAereo.setPeso(20);
        pedidoAereo.setDimensoes(new Dimensoes(50, 50, 50)); // Configurando dimensões
        gerenciador.entregarPedido(pedidoAereo);


        Pedido pedidoMaritimo = new Pedido();
        pedidoMaritimo.setPeso(100);
        pedidoMaritimo.setInternacional(true);
        gerenciador.entregarPedido(pedidoMaritimo);
    }
}