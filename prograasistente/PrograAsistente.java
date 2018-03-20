package prograasistente;

import Domain.Deportivo;
import Domain.Zapato;
import Domain.organo;
import Domain.sistema;
import java.util.ArrayList;


public class PrograAsistente {

    public static void main(String[] args) {
        
//        sistema digestivo= new sistema();
//        
//        organo estomago= new organo("Digerir alimentos", "Estomago");
//        organo boca= new organo("Masticar", "Boca");
//        
//        ArrayList<organo> organos = new ArrayList<>();
//        organos.add(boca);
//        organos.add(estomago);
//        
//        digestivo.setOrganos(organos);
//        digestivo.setNombre("Digestivo");
//        digestivo.imprimir();
        
        Zapato nike = new Deportivo("futbool", 38);
        System.out.println(nike.toString());
        
    }
    
}
