package enumeracao1.entidade.enums;

public enum OrdemStatus {

  PAGAMENTO_PENDENTE("Pagamento pendente"),
  EM_PROCESSAMENTO("Em processamento"),
  ENVIADO("Enviado"),
  ENTREGUE("Entregue");
  
  private String nome;

  private OrdemStatus(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  @Override
  public String toString() {
    return getNome();
  }
 
}
