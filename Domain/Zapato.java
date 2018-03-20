package Domain;

public class Zapato {
   
    private int numCalzado;

    public Zapato(int numCalzado) {
        this.numCalzado = numCalzado;
    }
    public Zapato() {
    }

    /**
     * @return the numCalzado
     */
    public int getNumCalzado() {
        return numCalzado;
    }

    /**
     * @param numCalzado the numCalzado to set
     */
    public void setNumCalzado(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    @Override
    public String toString() {
        return "Zapato{" + "numCalzado=" + numCalzado + '}';
    }
    
    
    
}
