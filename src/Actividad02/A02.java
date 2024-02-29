package Actividad02;

public class A02 {
    public static void main(String[] args) {

        Pelicula p1= new Pelicula("pelicula1", "autor1", "90", Formato.midi, "actor1", "actriz1");
        Pelicula p2= new Pelicula("pelicula2", "autor2", "120", Formato.wav, "actor2", "actriz2");
        Pelicula p3= new Pelicula("pelicula3", "autor3", "240", Formato.mpg, "actor3", "actriz3");
        Pelicula p4= new Pelicula("pelicula4", "autor4", "180", Formato.mp3, "actor4", "actriz4");
        Pelicula p5= new Pelicula("pelicula4", "autor4", "185", Formato.avi, "actor5", "actriz5");


        if (p4.equals(p5)) {
            imprimir("Las dos películas son iguales");
        }

        imprimir(p1.toString());
        imprimir(p2.toString());
        imprimir(p3.toString());
        imprimir(p4.toString());
        imprimir(p5.toString());
    }

    public static void imprimir(String datos){
        System.out.println(datos);
    }
}
