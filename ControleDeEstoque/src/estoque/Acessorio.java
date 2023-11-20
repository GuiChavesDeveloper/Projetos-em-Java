package estoque;

public class Acessorio extends Peca implements Item{
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public boolean venda(int qtdVendida) {
        if(qtdVendida<=quantidade){
            quantidade-=qtdVendida;
            return true;
        }
        return false;
    }
}
