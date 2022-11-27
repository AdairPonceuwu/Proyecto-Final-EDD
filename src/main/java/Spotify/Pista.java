package Spotify;

public class Pista {
    protected String titulo;
    protected int duracion;
    protected int repro;

    public Pista() {
    }
    
    public Pista(String titulo, int duracion, int reproducciones) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.repro = reproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
    public int getReproducciones(){
        return repro;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return 
                "\nTitulo:" + titulo +
                "\nDuracion:" + duracion+
                "\nReproducciones:" + repro;
    }
}
