package composicao1.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import composicao1.entidade.Comentario;
import composicao1.entidade.Publicacao;

public class Programa {

  public static void main(String[] args) throws ParseException {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    Comentario comentario1 = new Comentario("Boa viagem!");
    Comentario comentario2 = new Comentario("Nossa, que legal!");
    Publicacao publi1 = new Publicacao(
            sdf.parse("09/06/2022 13:05:44"), 
            "Viagem Brasil", 
            "Vou viajar p/ o Brasil", 
            12);
    publi1.addComentario(comentario1);
    publi1.addComentario(comentario2);
    
    Comentario comentario3 = new Comentario("Bom dia");
    Comentario comentario4 = new Comentario("Bom dia a todos...");
    Publicacao publi2 = new Publicacao(
            sdf.parse("05/04/2022 08:14:19"), 
            "Bom dia", 
            "Bom dia senhores e senhoras!", 
            5);
    publi2.addComentario(comentario3);
    publi2.addComentario(comentario4);
    
    System.out.println(publi1);
    System.out.println(publi2);

  }
}
