package estoque;

public class RoupaTamanhoUnico extends Peca implements Item{
    protected int estoque;
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, int estoque) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
        this.estoque=estoque;
    }

    @Override
    public boolean venda(int qtdVendida) {
        if(qtdVendida>=estoque){
            estoque-=qtdVendida;
            return true;
        }
        return false;
    }
}
