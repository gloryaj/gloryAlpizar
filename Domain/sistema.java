package Domain;

import java.util.ArrayList;

public class sistema {

    private String nombre;
    private ArrayList<organo> organos;

    public sistema(String nombre, ArrayList<organo> organos) {
        this.nombre = nombre;
        this.organos = organos;
    }

    public sistema() {
        
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

    /**
     * @return the organos
     */
    public ArrayList<organo> getOrganos() {
        return organos;
    }

    /**
     * @param organos the organos to set
     */
    public void setOrganos(ArrayList<organo> organos) {
        this.organos = organos;
    }

//    @Override
//    public String toString() {
////        return "sistema{" + "nombre=" + nombre + ", organos=" + organos + '}';
// 
//        for (int i = 0; i < this.getOrganos().size(); i++) {
//            System.out.println(this.getOrganos().get(i).toString());
//        }
//    }
    public void imprimir() {
        System.out.println("Sistema " + this.nombre);
        for (int i = 0; i < this.getOrganos().size(); i++) {
            System.out.println(this.getOrganos().get(i).toString());

        }
    }
}
