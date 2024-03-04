package Actividad03;

public class Taller {

//    Variables de clase

    protected int numeroVehiculo;
    protected String matricula, color, modelo, marca, cilindrada, puertas, matriculacion;

    Vehiculo vehiculo;
    boolean reparado;

    //    Para coche y camion
    public Taller(
            int numeroVehiculo,
            String matricula,
            String color,
            String modelo,
            String marca,
            String cilindrada,
            String puertas,
            String matriculacion,
            Vehiculo vehiculo
    ) {
        this.numeroVehiculo = numeroVehiculo;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.matriculacion = matriculacion;
        this.reparado = false;
        this.vehiculo = vehiculo;
    }

    //    para bicicleta
    public Taller(int numeroVehiculo, String color, String modelo, String marca, Vehiculo vehiculo) {
        this.numeroVehiculo = numeroVehiculo;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.reparado = false;
        this.vehiculo = vehiculo;
    }

    //    para moto
    public Taller(int numeroVehiculo, String matricula, String color, String modelo, String marca, String cilindrada, String matriculacion, Vehiculo vehiculo) {
        this.numeroVehiculo = numeroVehiculo;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.matriculacion = matriculacion;
        this.reparado = false;
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "numeroVehiculo=" + numeroVehiculo +
                ", matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", puertas='" + puertas + '\'' +
                ", matriculacion='" + matriculacion + '\'' +
                ", vehiculo=" + vehiculo +
                ", reparado=" + reparado +
                '}';
    }
}
