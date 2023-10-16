package corrida;

import java.util.Random;

public class Carro {
    protected int velocidade;
    protected int distancia;

    public void setVelocidade() {
        Random rand=new Random();
        this.velocidade = rand.nextInt(3) + 1;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setDistancia(int i) {
        this.distancia += velocidade;
    }

    public int getDistancia() {
        return distancia;
    }
}
