package Actividad03;

public class Coche extends Taller implements CuatroRuedas{


    public Coche(int numeroVehiculo, String matricula, String color, String modelo, String marca, String cilindrada, String puertas, String matriculacion, Vehiculo vehiculo) {
        super(numeroVehiculo, matricula, color, modelo, marca, cilindrada, puertas, matriculacion, vehiculo);
    }
}
