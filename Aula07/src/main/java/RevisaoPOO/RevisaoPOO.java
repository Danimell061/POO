package RevisaoPOO;
import Modelo.*;

public class RevisaoPOO {

    public static void main(String[] args) {
        Gerente gestor = new Gerente();
        gestor.setNome("João da Silva");
        gestor.setSalario(30000.0);
        System.out.println(gestor.getNome());
        System.out.println(gestor.Bonificacao());
        
    }
}
