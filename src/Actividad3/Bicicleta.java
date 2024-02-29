package Actividad3;

public class Bicicleta extends Taller{


    public Bicicleta(String color, String modelo, String marca) {
        super(color, modelo, marca);
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", reparado=" + reparado +
                '}';
    }
}
