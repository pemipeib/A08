package Actividad03;

public class Camion extends Taller implements CuatroRuedas{

    public Camion(int numeroVehiculo, String matricula, String color, String modelo, String marca, String cilindrada, String puertas, String matriculacion, Vehiculo vehiculo) {
        super(numeroVehiculo, matricula, color, modelo, marca, cilindrada, puertas, matriculacion, vehiculo);
    }
}
