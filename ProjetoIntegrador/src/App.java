import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

     
      Filme Vingadores = new Filme(); 
      ArrayList <Filme> listaFilme = new ArrayList<>();
      Vingadores.setNomeDoFilme("Vingadores 2 ");
      Vingadores.setAnoDeLancamento(2015);
      Vingadores.setClassificacao("L");
      Vingadores.setAtorPrincipal("Volide");
      Vingadores.setDuracao(120);
      listaFilme.add(Vingadores);
      
System.out.println(listaFilme.get(0).toString());
    }


  }
