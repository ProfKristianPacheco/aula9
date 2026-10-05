import model.Musica;
import model.Player;
import model.Spotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //STREAMING DE MÚSICAS
        List<Musica> listaMusicas = new ArrayList<>();
        List<Musica> historico = new LinkedList<>();
        cadastrarMusicas(listaMusicas);
        Player player = new Spotify();
        Scanner scanner = new Scanner(System.in);
        //player.tocarMusica(listaMusicas.get(0));
        int menu;
        boolean continua;
        do{
            System.out.println("Menu: \n1-Tocar Música\n2-Exibir Histórico\n3-Encerrar");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    player.exibirMusicas(listaMusicas);
                    System.out.println("Informe a música que deseja: ");
                    int codigo = scanner.nextInt();
                    Musica musica = player.retornarMusica(listaMusicas, codigo);
                    if(musica == null){
                        System.out.println("Música não encontrada!");
                    }else{
                        player.tocarMusica(musica);
                        player.atualizarHistorico(historico, musica);
                    }
                    continua = true;
                    break;
                case 2:
                    player.exibirHistorico(historico);
                    continua = true;
                    break;
                case 3:
                    System.out.println("Encerrando!");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continua = true;
                    break;

            }
        }while (continua);
    }

    public static void cadastrarMusicas(List<Musica> listaMusicas){
        Musica musica1 = new Musica(1, "O que será", 5, "Chico Buarque", 1970);
        Musica musica2 = new Musica(2, "Caneta Azul", 4, "Manoel Gomes", 2020);
        Musica musica3 = new Musica(3, "Diário de um detento", 10, "Racionais", 1998);

        listaMusicas.add(musica1);
        listaMusicas.add(musica2);
        listaMusicas.add(musica3);
    }


}