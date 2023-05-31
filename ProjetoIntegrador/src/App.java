public class App {
    public static void main(String[] args) throws Exception {

      Cadastro cadastro = new Cadastro();

      cadastro.addFilme();
      System.out.println(cadastro.retornaFilmes());
    
    }
}
