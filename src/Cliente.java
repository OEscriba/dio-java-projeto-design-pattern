import restaurante.cozinha.Chef;
import restaurante.salao.Garcom;
import restaurante.sistema.Pedido;

public class Cliente {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Pedido pedido = new Pedido(chef, "feijoada");
        Garcom garcom = new Garcom(pedido);
        garcom.executar();
        
        pedido = new Pedido(chef, "cocada");
        garcom = new Garcom(pedido);
        garcom.executar();
        
        pedido = new Pedido(chef, "lasanha");
        garcom = new Garcom(pedido);
        garcom.executar();
    }
}
