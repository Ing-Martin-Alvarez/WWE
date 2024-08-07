//Martin Alvarez Salazar 19460870
package wwerunnable;


public class WWERetador {
    private String nombre;
    private int[] Combos;

    public WWERetador(String nom, int[] CombosF){
        nombre=nom;
        Combos=CombosF;
    }
    //Métodos get
    public String getNombre(){
        return nombre;
    }
    public int[] getCombos(){
        return Combos;
    }    
}
