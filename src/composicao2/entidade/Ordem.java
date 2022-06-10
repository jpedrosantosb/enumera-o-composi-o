package composicao2.entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeracao1.entidade.enums.OrdemStatus;

public class Ordem {

  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  private Date momento;
  private OrdemStatus status;
  private Cliente cliente;
  private List<OrdemItem> itens = new ArrayList<>();

  public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
    this.momento = momento;
    this.status = status;
    this.cliente = cliente;
  }

  public Date getMomento() {
    return momento;
  }

  public void setMomento(Date momento) {
    this.momento = momento;
  }

  public OrdemStatus getStatus() {
    return status;
  }

  public void setStatus(OrdemStatus status) {
    this.status = status;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<OrdemItem> getItens() {
    return itens;
  }

  public void addItem(OrdemItem item) {
    itens.add(item);
  }

  public void removeItem(OrdemItem item) {
    itens.remove(item);
  }

  public double total() {
    double soma = 0.0;
    for (OrdemItem item : itens) {
      soma += item.subTotal();
    }
    return soma;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Data: ");
    sb.append(sdf.format(momento) + "\n");
    sb.append("Status da Ordem: ");
    sb.append(status + "\n");
    sb.append("Cliente: ");
    sb.append(cliente + "\n");
    sb.append("Itens da Ordem:\n");
    for (OrdemItem item : itens) {
      sb.append(item + "\n");
    }
    sb.append("Preço total: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }

}
