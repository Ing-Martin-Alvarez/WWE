//Martin Alvarez Salazar 19460870
package wwerunnable;

public class WWErunnable implements Runnable{
    private WWERetador retador;
    private WWECampeon campeonawwe;
    private long initialTime;
 
    public WWErunnable ( WWERetador postulante, WWECampeon campeona, long tiempoinicial){
        campeonawwe=campeona;
        retador=postulante;
        initialTime=tiempoinicial;
    }
 
    public static void main(String[] args) {
  
        WWERetador retador1 = new WWERetador("Sasha Banks", new int[]{2,2,1,5,2,3,4});
        WWERetador retador2 = new WWERetador("Liv Morgan", new int[] {1,3,5,1,1});
        WWERetador retador3 = new WWERetador("Ruby Riott", new int[] {1,3,5,1,1,6,8,3,1});
        
        WWECampeon campeona = new WWECampeon("Alexa Bliss");
  
        long tiempoinicial = System.currentTimeMillis();
  
        Runnable proceso1 = new WWErunnable(retador1, campeona, tiempoinicial);
        Runnable proceso2 = new WWErunnable(retador2, campeona, tiempoinicial);
        Runnable proceso3 = new WWErunnable(retador3, campeona, tiempoinicial);
  
        new Thread(proceso1).start();
        new Thread(proceso2).start();
        new Thread(proceso3).start();
    }

 @Override
    public void run() {
        campeonawwe.procesarCombate(retador, initialTime);
    }
}
