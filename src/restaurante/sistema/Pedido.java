package restaurante.sistema;

import restaurante.cozinha.Chef;

public class Pedido implements Comanda {
    private Chef chef;
    private String food;

    // Construtor
    public Pedido(Chef chef, String food) {
        this.chef = chef;
        this.food = food;
    }

    @Override
    public void executar() {
        if (this.food.equalsIgnoreCase("Feijoada")) {
            this.chef.prepararFeijoada();
        } else if (this.food.equalsIgnoreCase("Cocada")) {
            this.chef.prepararCocada();
        } else {
            System.out.println("Prato indisponível.");
        }
    }
    
}
