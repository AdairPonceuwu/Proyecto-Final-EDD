package Spotify;

public class Pista {
    protected String titulo;
    protected int duracion;
    protected int reproducciones;

    public Pista() {
    }

    public Pista(String titulo, int duracion, int reproducciones) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return 
                "\nTitulo:" + titulo +
                "\nDuracion:" + duracion +
                "\nNo. reproducciones:" + reproducciones;
    }
}
