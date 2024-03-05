package Actividad03;

public class Bicicleta extends Taller implements DosRuedas{

    public Bicicleta(int numeroVehiculo, String matricula, String color, String modelo, String marca, String cilindrada, String puertas, String matriculacion, Vehiculo vehiculo) {
        super(numeroVehiculo, matricula, color, modelo, marca, cilindrada, puertas, matriculacion, vehiculo);
    }
}
