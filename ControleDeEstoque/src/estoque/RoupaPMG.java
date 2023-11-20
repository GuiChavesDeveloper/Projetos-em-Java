package estoque;

public class RoupaPMG implements Item{
    protected String descricao;
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public boolean venda(String tamanho){
        return switch (tamanho) {
            case "P" -> {
                quantidadeP--;
                yield true;
            }
            case "M" -> {
                quantidadeM--;
                yield true;
            }
            case "G" -> {
                quantidadeG--;
                yield true;
            }
            default -> false;
        };
    }

    public boolean reposicaoEstoque(){
        if(quantidadeP<estoqueMinimo){
            quantidadeP=estoqueMaximo;
            return true;
        }
        if (quantidadeM<estoqueMinimo){
            quantidadeM=estoqueMaximo;
            return true;
        }
        if (quantidadeG<estoqueMinimo){
            quantidadeG=estoqueMaximo;
            return true;
        }
        return false;
    }
}
