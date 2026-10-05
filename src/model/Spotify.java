package model;

import java.util.List;

public class Spotify implements Player{
    @Override
    public void tocarMusica(Musica musica) {
        System.out.println(musica.getTitulo() + " iniciando!");
    }

    @Override
    public void exibirMusicas(List<Musica> musicas) {
        for(Musica musicaAtual : musicas){
            System.out.println(musicaAtual.toString());
        }
    }

    @Override
    public Musica retornarMusica(List<Musica> musicas, int codigo) {
        for(Musica musicaAtual : musicas){
            if(musicaAtual.getCodigo() == codigo){
                return musicaAtual;
            }
        }
        return null;
    }

    @Override
    public void atualizarHistorico(List<Musica> historico, Musica musica) {
        historico.add(0, musica);

    }

    @Override
    public void exibirHistorico(List<Musica> historico) {
        for(Musica musicaAtual : historico){
            System.out.println(musicaAtual.getTitulo());
        }
    }
}
