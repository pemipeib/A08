package Actividad3;

public class Taller {

//    Variables de clase
    String matricula, color, modelo, marca, cilindrada, puertas, matriculacion;
    boolean reparado;

    public Taller(
            String matricula,
            String color,
            String modelo,
            String marca,
            String cilindrada,
            String puertas,
            String matriculacion
    ) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.matriculacion = matriculacion;
        this.reparado = false;
    }

    public Taller(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.reparado = false;
    }

    public Taller(String matricula, String color, String modelo, String marca, String cilindrada, String matriculación) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.matriculacion = matriculacion;
        this.reparado = false;
    }

    @Override
    public String toString() {
        String rep= "";

        if (reparado == false) {
            rep= "no reparado";
        }else {
            rep= "reparado";
        }

        return "Taller{" +
                "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", puertas='" + puertas + '\'' +
                ", matriculación='" + matriculacion + '\'' +
                ", reparado=" + rep +
                '}';
    }
}
