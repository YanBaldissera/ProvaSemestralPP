
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTransporte {
    private final List<EstrategiaTransporte> estrategias = new ArrayList<>();

    public GerenciadorTransporte() {
        estrategias.add(new TransporteTerrestre());
        estrategias.add(new TransporteAereo());
        estrategias.add(new TransporteDrone());
        estrategias.add(new TransporteMaritimo());
    }

    public void entregarPedido(Pedido pedido) {
        for (EstrategiaTransporte estrategia : estrategias) {
            if (estrategia.aplicar(pedido)) {
                estrategia.entregar(pedido);
                return;
            }
        }
        throw new RuntimeException("Nenhuma estratégia de transporte aplicável encontrada.");
    }
}
