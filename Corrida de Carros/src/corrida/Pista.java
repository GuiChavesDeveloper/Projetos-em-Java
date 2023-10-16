package corrida;

public class Pista extends Carro{
    public Pista() {
        this.distancia = 0;
        this.velocidade = 0;
    }

    @Override
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void moverCarro(){
        for(int i = 0; i<super.getVelocidade(); i++){
            System.out.print(" ");
        }
        for(int i = 0; i<super.getDistancia(); i++){
            System.out.print(" ");
        }
        System.out.println("#");
        super.setDistancia(getVelocidade()+getDistancia());
    }

    public void inicioCorrida(){
        System.out.println("----------------------------------------------------");
        System.out.println("#");
        System.out.println("#");
        System.out.println("----------------------------------------------------");
    }
}
