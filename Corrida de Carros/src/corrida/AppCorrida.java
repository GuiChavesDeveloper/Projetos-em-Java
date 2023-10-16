package corrida;

public class AppCorrida {
    public static void main(String[] args) {
        Pista carro1=new Pista();
        Pista carro2=new Pista();

        carro1.inicioCorrida();
        while (carro1.getDistancia()<50 && carro2.getDistancia()<50){
            carro1.setVelocidade();
            carro2.setVelocidade();
            System.out.println("----------------------------------------------------");
            carro1.moverCarro();
            carro2.moverCarro();
            System.out.println("----------------------------------------------------");

            if (carro1.getDistancia()>=50 && carro1.getDistancia()>carro2.getDistancia()){
                System.out.println("Carro 01 venceu!");
            } else if (carro2.getDistancia()>=50 && carro2.getDistancia()>carro1.getDistancia()){
                System.out.println("Carro 02 venceu!");
            } else if (carro1.getDistancia()>=50 && carro1.getDistancia()==carro2.getDistancia()){
                System.out.println("Empate!");
            }

            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }
    }
}
