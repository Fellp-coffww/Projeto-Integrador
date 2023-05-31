import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    
Scanner sc = new Scanner(System.in); 

ArrayList <Filme> listaFilme = new ArrayList<>();

ArrayList <Sala> listaSala = new ArrayList<>();

ArrayList <Sessao> listaSessao = new ArrayList<>();


Sala sala = new Sala(); 


public void addFilme(){

    Filme filme = new Filme();

    System.out.print("Nome do filme: ");
    filme.setNomeDoFilme(sc.nextLine());
    
    System.out.print("Ano de lançamento: ");
    filme.setAnoDeLancamento(Integer.parseInt(sc.nextLine()));
    
    System.out.print("Classificação: ");
    filme.setClassificacao(sc.nextLine());

    System.out.print("Genêro: ");
    filme.setGenero(sc.nextLine());

    System.out.print("Sinopse: ");
    filme.setSinopse(sc.nextLine());

    listaFilme.add(filme);
}

public String retornaFilmes(){

String temp  = ""; 

for (int n = 0; n < listaFilme.size(); n++){

    temp = temp + listaFilme.get(n).toString();
}

return temp;


}


}
