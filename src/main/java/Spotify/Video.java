package Spotify;

public class Video extends Pista {
    
    private String formato;

    public Video() {
    }

    public Video(String formato) {
        this.formato = formato;
    }

    public Video(String formato, String titulo, int duracion, int reproducciones) {
        super(titulo, duracion, reproducciones);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
          return
                "\nTitulo:"+ titulo +
                "\nDuracion:"+ duracion +
                "\nNo. reproducciones:" + reproducciones +
                "\nFormato:" + formato;
    }
    
    
    
}
