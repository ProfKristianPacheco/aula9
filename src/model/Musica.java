package model;

public class Musica {
    private int codigo;
    private String titulo;
    private int duracao;
    private String artista;
    private int anoLancamento;

    @Override
    public String toString() {
        return "Musica{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", artista='" + artista + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

    public Musica(int codigo, String titulo, int duracao, String artista, int anoLancamento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
