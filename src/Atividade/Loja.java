package Atividade;

public class Loja {
    public static void main(String[] args) {
        LojaFactory factory = new LojaModerna();
        Mesa mesa = factory.criarMesa();
        Cadeira cadeira = factory.criarCadeira();
        cadeira.montar();
        mesa.montar();
    }
}
