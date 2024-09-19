public class Pessoa {
   private String genero;
   private String nome;

   public Pessoa ( String nome, String genero ) {
      this.nome = nome;
      this.genero = genero;
   }

   @Override
   public String toString() {
      return "Pessoa{" +
              "genero='" + genero + '\'' +
              ", nome='" + nome + '\'' +
              '}';
   }
}
