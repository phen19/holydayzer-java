import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holydays feriados = new Holydays();

        while (true){
            Scanner entrada = new Scanner(System.in);

            System.out.print("O que você gostaria de fazer ? \n 1 - Pesquisar Data \n 2 - Lista dos Feriados\n 3 - Sair\n");
            int opt = Integer.parseInt(entrada.nextLine());

            if(opt == 3){
                System.out.print("Até a próxima!!");
                break;
            }

            if(opt == 1){
                Scanner entrada2 = new Scanner(System.in);
                System.out.print("Digite uma data no formato DD/MM/AAAA: ");
                String data = entrada2.nextLine();
                feriados.checkData(data);
                continue;
            }

            if(opt == 2){
                feriados.getAll();
            }
        }


    }

}