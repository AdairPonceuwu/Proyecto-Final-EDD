package Spotify;

public class Video extends Pista {
    
    private String formato;

    public Video() {
    }

    public Video(String formato, String titulo, int duracion) {
        super(titulo, duracion);
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
                "\nFormato:" + formato;
    }
    
    
    
}
