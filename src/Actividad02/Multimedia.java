package Actividad02;

public class Multimedia {
    String titulo, autor, duracion;
    Formato formato;

    public Multimedia(String titulo, String autor, String duracion, Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Multimedia) {
            Multimedia other = (Multimedia) obj;
            return this.titulo.equals(other.titulo) && this.autor.equals(other.autor);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", duracion='" + duracion + '\'' +
                ", formato=" + formato +
                '}';
    }
}

