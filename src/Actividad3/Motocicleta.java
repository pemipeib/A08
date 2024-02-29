package Actividad3;

public class Motocicleta extends Taller{


    public Motocicleta(String matricula, String color, String modelo, String marca, String cilindrada, String matriculacion) {
        super(matricula, color, modelo, marca, cilindrada, matriculacion);
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", matriculacion='" + matriculacion + '\'' +
                ", reparado=" + reparado +
                '}';
    }
}
