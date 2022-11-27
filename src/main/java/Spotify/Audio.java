package Spotify;

public class Audio extends Pista {
    
    private String autor;

    public Audio() {
    }

    public Audio(String autor, String titulo, int duracion,int repro) {
        super(titulo, duracion,repro);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return 
                "\nTitulo:"+ titulo +
                "\nAutor:" + autor +
                "\nDuracion:"+duracion+
                "\nReproducciones:" + repro;
    }
}
