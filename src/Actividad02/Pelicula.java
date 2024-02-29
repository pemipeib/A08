package Actividad02;

public class Pelicula extends Multimedia{

    String actor, actriz;

    public Pelicula(String titulo, String autor, String duracion, Formato formato, String actor, String actriz) {
        super(titulo, autor, duracion, formato);
        this.autor = actor;
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                ", titulo='" + titulo + '\'' +
                "autor='" + autor + '\'' +
                ", actriz='" + actriz + '\'' +
                ", duracion='" + duracion + '\'' +
                ", formato=" + formato +
                '}';
    }
}
