package enumeracao1.app;

import java.util.Date;

import enumeracao1.entidade.Ordem;
import enumeracao1.entidade.enums.OrdemStatus;

public class Programa {

  public static void main(String[] args) {
    

    Ordem order = new Ordem(1080, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
    
    System.out.println(order);
    
    OrdemStatus os1 = OrdemStatus.ENVIADO;
    
    OrdemStatus os2 = OrdemStatus.valueOf("EM_PROCESSAMENTO");
    
    System.out.println(os1);
    System.out.println(os2);

  }

}
