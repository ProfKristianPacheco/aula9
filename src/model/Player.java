package model;

import java.util.List;

public interface Player {
    public void tocarMusica(Musica musica);
    public void exibirMusicas(List<Musica> musicas);
    public Musica retornarMusica(List<Musica> musicas, int codigo);
    public void atualizarHistorico(List<Musica> historico, Musica musica);
    public void exibirHistorico(List<Musica> historico);

}
