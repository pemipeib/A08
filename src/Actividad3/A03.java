package Actividad3;

import java.util.ArrayList;
import java.util.Scanner;

public class A03 {

//    variables de clase
    static Taller taller;
    static ArrayList<Taller> vehiculo = new ArrayList<Taller>();

    public static void main(String[] args) {

//        creación de objetos para probar
        Taller taller1 = new Taller("1234-ABC", "Rojo", "Polo", "Volkswagen", "1.6", "5", "2023");
        Taller taller2 = new Taller("4567-DEF", "Azul", "Golf", "Volkswagen", "2.0", "4", "2022");
        Taller taller3 = new Taller("7890-GHI", "Blanco", "Ibiza", "Seat", "1.2", "3", "2021");
        Taller taller4 = new Taller("9012-JKL", "Negro", "Ateca", "Seat", "2.0", "5", "2020");
        Taller taller5 = new Taller("1235-ABC", "Plata", "Focus", "Ford", "1.5", "5", "2019");
        Taller taller6 = new Taller("4567-DEF", "Verde", "Fiesta", "Ford", "1.0", "3", "2018");
        Taller taller7 = new Taller("7891-GHI", "Amarillo", "Corolla", "Toyota", "1.8", "5", "2017");
        Taller taller8 = new Taller("9013-JKL", "Naranja", "Auris", "Toyota", "2.0", "4", "2016");
        Taller taller9 = new Taller("1236-ABC", "Rosa", "308", "Peugeot", "1.6", "5", "2015");
        Taller taller10 = new Taller("4568-DEF", "Morado", "208", "Peugeot", "1.2", "3", "2014");

        vehiculo.add(taller1);
        vehiculo.add(taller2);
        vehiculo.add(taller3);
        vehiculo.add(taller4);
        vehiculo.add(taller5);
        vehiculo.add(taller6);
        vehiculo.add(taller7);
        vehiculo.add(taller8);
        vehiculo.add(taller9);
        vehiculo.add(taller10);

        int opt= 0;

        do {
            opt= menu();
            eleccion(opt);
        }while (opt != 7);
    }

    public static int menu(){

        int opt;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elige una opción\n" +
                "1.- Entrada de un coche al taller\n" +
                "2.- Coche pendientes de reparar\n" +
                "3.- Coche reparados\n" +
                "4.- Marcar taller como reparado\n" +
                "5.- Coche en el taller\n" +
                "6.- Salida del coche del taller\n" +
                "7.- Salir";

        do {
            imprimir(menu);
            opt= pedirDatos.nextInt();

        }while (opt <1 || opt >7);

        return opt;
    }

    public static void eleccion( int opt){

        switch (opt){
            case 1:
                cocheNuevo();
                break;

            case 2:
                if (vehiculo.size() > 0) {
                    pendienteReparar();
                }else {
                    tallerVacio();
                }
                break;

            case 3:
                if (vehiculo.size() > 0) {
                    reparado();
                }else {
                    tallerVacio();
                }
                break;

            case 4:
                if (vehiculo.size() > 0) {
                    marcarReparado();
                }else {
                    tallerVacio();
                }
                break;

            case 5:
                if (vehiculo.size() > 0) {
                    cochesEnTaller();
                }else {
                    tallerVacio();
                }
                break;

            case 6:
                if (vehiculo.size() > 0) {
                    marcarSalidaTaller();
                }else {
                    tallerVacio();
                }
                break;
        }
    }

//    Pedir datos para crear el objeto Taller y añadirlo al arrayList
    public static void cocheNuevo(){

        String matricula, color, modelo, marca, cilindrada, puertas, matriculación;

        Scanner pedirDatos= new Scanner(System.in);

//        Pedir los datos del taller
        imprimir("Numero de matrícula");
        matricula= pedirDatos.nextLine();

        imprimir("Color del taller");
        color= pedirDatos.nextLine();

        imprimir("Modelo de taller");
        modelo= pedirDatos.nextLine();

        imprimir("Marca del taller");
        marca= pedirDatos.nextLine();

        imprimir("Cilindrada del taller");
        cilindrada= pedirDatos.nextLine();

        imprimir("Número de puertas");
        puertas= pedirDatos.nextLine();

        imprimir("Fecha de matriculación");
        matriculación= pedirDatos.nextLine();

//        Crear el objeto
        Taller taller = new Taller(matricula, color, modelo, marca, cilindrada, puertas, matriculación);

//        Añadir al arrayList
        A03.vehiculo.add(taller);
    }

    public static void pendienteReparar(){

        imprimir("Los coches pendientes de reparar son:");

//        Recorrer los Coche con reparado en false
        for (Taller taller1 : vehiculo){
            if (taller1.reparado == false){
                imprimir("El coche modelo " + taller1.modelo + " y con matrícula " + taller1.matricula);
            }
        }
    }

    public static void reparado(){

        imprimir("Los coches reparados son:");

//        Recorrer los Coche con reparado en true
        for (Taller taller1 : vehiculo){
            if (taller1.reparado == true){
                imprimir("El coche modelo " + taller1.modelo + " y con matrícula " + taller1.matricula);
            }
        }
    }

    public static void marcarReparado(){

        Scanner pedirDatos= new Scanner(System.in);

        imprimir("Indique la matrícula del coche que ha sido reparado");
        String reparar= pedirDatos.nextLine();

        for (Taller taller1 : vehiculo){
            if (taller1.matricula.equals(reparar)){
                taller1.reparado= true;
                imprimir(
                        "El coche con matrícula " + taller1.matricula + " ha sido marcado como reparado"
                );
            }
        }
    }

    public static void marcarSalidaTaller(){

        Scanner pedirDatos= new Scanner(System.in);

        imprimir("Indique la matrícula del coche que ha sido retirado del taller");
        String salirTaller= pedirDatos.nextLine();

        for (Taller taller1 : vehiculo){

            int pos= taller1.matricula.indexOf(salirTaller);

            if (taller1.matricula.equals(salirTaller)){
                imprimir(
                        "El coche con matrícula " + taller1.matricula + " ha salido del taller"
                );
                vehiculo.remove(pos);
                break;
            }
        }
    }

    public static void cochesEnTaller(){
        int num=1;
        for (Taller taller1 : vehiculo){
            imprimir("Número " + num + " " + taller1.toString());
            num++;
        }
    }

    public static void tallerVacio(){
        imprimir("No hay coches en el taller");
    }

    public static void imprimir(String datos){
        System.out.println(datos);
    }
}
