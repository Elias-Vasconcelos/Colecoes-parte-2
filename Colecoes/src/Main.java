import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Pessoa joao = new Pessoa( "joao" , "masculino");
            Pessoa marcio = new Pessoa( "marcio" , "masculino");
            Pessoa felipe = new Pessoa( "felipe" , "masculino");
            Pessoa julia = new Pessoa( "julia" , "feminino");
            Pessoa ana = new Pessoa( "ana" , "feminino");
            Pessoa carolina = new Pessoa( "carolina" , "feminino");
            Boolean interacao = true;

            List<Pessoa> listaMasculina = new ArrayList<Pessoa>();
            List<Pessoa> listaFeminina = new ArrayList<Pessoa>();


            listaMasculina.add(joao);
            listaMasculina.add(marcio);
            listaMasculina.add(felipe);
            listaFeminina.add(julia);
            listaFeminina.add(ana);
            listaFeminina.add(carolina);


             while (interacao){

                 String currentName = "";
                 String currenGender = "";

                 System.out.println("Voce deseja adicionar um novo usuario? sim ou nao");
                 String continuar = scan.next();

                 if (Objects.equals(continuar, "sim")){
                     System.out.println("Digite o nome do usuario: ");
                     currentName = scan.next();
                     System.out.println("Digite o genero do usuario [ masculino ] ou [ feminino ]: ");
                     currenGender = scan.next();
                     Pessoa newUser = new Pessoa( currentName,  currenGender );

                     if(Objects.equals(currenGender, "masculino")){
                         listaMasculina.add(newUser);
                     }
                     if(Objects.equals(currenGender, "feminino")){
                         listaFeminina.add(newUser);
                     }
                 }

                 if (Objects.equals(continuar, "nao")){
                     interacao = false;
                 }


             }



                System.out.println("****** Lista Maculina *******  ");
                for( int i = 0; i < listaMasculina.size() ; i++){
                    System.out.println(listaMasculina.get(i));
                }

                System.out.println(" ");
                System.out.println("****** Lista Feminina *******  ");
                for( int i = 0; i < listaFeminina.size() ; i++){
                    System.out.println(listaFeminina.get(i));
                }


    }


}