package restaurante.salao;

import restaurante.sistema.Pedido;

public class Garcom {
    private Pedido pedido;

    public Garcom(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.executar();
    }
}
