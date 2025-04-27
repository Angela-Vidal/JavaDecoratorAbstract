package Atividade;

public class LojaRustica implements LojaFactory {
    @Override
    public Mesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRustica() {
        };
    }
}
