package composicao2.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao2.entidade.Cliente;
import composicao2.entidade.Ordem;
import composicao2.entidade.OrdemItem;
import composicao2.entidade.Produto;
import enumeracao1.entidade.enums.OrdemStatus;

public class Programa {

  public static void main(String[] args) throws ParseException {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Insira os dados do Cliente: ");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.next();
    System.out.print("Data de nascimento (DD/MM/YYYY): ");
    Date dataNascimento = sdf.parse(sc.next());

    Cliente cliente = new Cliente(nome, email, dataNascimento );

    System.out.println("Informe os dados da Ordem");
    System.out.print("Status(int): 1-Pagamento pendente 2-Em processamento 3-Enviado 4-Entregue ");
    int opcoes = sc.nextInt();
    OrdemStatus status = null;
    
    if(opcoes == 1) {
      status = OrdemStatus.PAGAMENTO_PENDENTE;
    }
    if(opcoes == 2) {
      status = OrdemStatus.EM_PROCESSAMENTO;
    }
    if(opcoes == 3) {
      status = OrdemStatus.ENVIADO;
    }
    if(opcoes == 4) {
      status = OrdemStatus.ENTREGUE;
    }
    
    Ordem ordem = new Ordem(new Date(), status, cliente);

    System.out.print("Quantos itens para esta Ordem? ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println("Informe #" + i + " dados do item:");
      System.out.print("Nome Produto: ");
      sc.nextLine();
      String nomeProduto = sc.nextLine();
      System.out.print("Preço Produto: ");
      double precoProduto = sc.nextDouble();

      Produto produto = new Produto(nomeProduto, precoProduto);

      System.out.print("Quantidade: ");
      int quantidade = sc.nextInt();

      OrdemItem ordemItem = new OrdemItem(quantidade, precoProduto, produto);

      ordem.addItem(ordemItem);
    }

    System.out.println();
    System.out.println("Resumo Ordem:");
    System.out.println(ordem);

    sc.close();

  }

}
