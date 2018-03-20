package Domain;

public class Deportivo extends Zapato{

    private String deporte;
    
    public Deportivo(){
        super();
    }

    public Deportivo(String deporte, int numCalzado) {
        super(numCalzado);
        this.deporte = deporte;
    }

    public Deportivo(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString()+ "Deportivo{" + "deporte=" + deporte + '}';//falta algo
    }
    
    
    
}
