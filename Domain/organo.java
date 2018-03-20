
package Domain;

public class organo {
    
    private String  funtion;
    private String nombre;

    public organo(String funtion, String nombre) {
        this.funtion = funtion;
        this.nombre = nombre;
    }
    public organo() {
        
    }

    /**
     * @return the funtion
     */
    public String getFuntion() {
        return funtion;
    }

    /**
     * @param funtion the funtion to set
     */
    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "organo{" + "funtion=" + funtion + ", nombre=" + nombre + '}';
    }
}
