//Martin Alvarez Salazar 19460870
package wwerunnable;

import java.util.logging.Level;
import java.util.logging.Logger;


public class WWECampeon {
    private String nombre;
 
    public WWECampeon(String nombre){
        this.nombre=nombre;
    }

    public void procesarCombate(WWERetador postulante, long tiempo){
        System.out.println("La campeona "+ this.nombre+
         " COMIENZA A LUCHAR CONTRA SU RIVAL "+postulante.getNombre()+" EN EL TIEMPO: "+(System.currentTimeMillis()-tiempo)/1000+ " seg");
        for(int i=0; i<postulante.getCombos().length;i++){
            espeaXsegundos(postulante.getCombos()[i]);
            System.out.println("UTILIZO " +(i+1)+ " FINISHER PARA REMATAR AL RIVAL " + postulante.getNombre()+ " EN EL TIEMPO DE: "+ (System.currentTimeMillis()-tiempo)/1000+ " SEG");
        }
        System.out.println("La CAMPEONA "+ this.nombre+
        " HA TERMINADO DE CON SU RIVAL "+postulante.getNombre()+" EN EL TIEMPO DE:"
        +(System.currentTimeMillis()-tiempo)/1000+ " SEG");
        
    }
    //Método para simular el tiempo de proceso del articulo
    private void espeaXsegundos(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WWECampeon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }

