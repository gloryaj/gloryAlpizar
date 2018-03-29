package domain;

public class Material {
    
    private String name;
    private String code;
    private int cantidad;
    private boolean available;

    public Material() {
        
    }

    public Material(String name, String code, int cantidad, boolean available) {
        this.name = name;
        this.code = code;
        this.cantidad = cantidad;
        this.available = available;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", code=" + code + ", cantidad=" + cantidad + ", available=" + available + '}';
    }
 
}
