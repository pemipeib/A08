package Actividad08;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class A08 {

//    Variables
//    Numero de Entrada
    static int localidadesPalco = 1, localidadesPrincipal = 1, localidadesCentral= 1, localidadesLateral= 1;
//    NÚmero máximo entradas
    static int maxLocalidadesPalco=40, maxLocalidadesPrincipal=200, maxLocalidadesCentral=400, maxLocalidadesLateral=100;

//    Objetos
    static Palco palco;
    static Principal principal;
    static Central central;
    static Lateral lateral;

//    Arraylist
    static ArrayList<Palco> palcoArrayList= new ArrayList<Palco>();
    static ArrayList<Principal> principalArrayList= new ArrayList<Principal>();
    static ArrayList<Central> centralArrayList= new ArrayList<Central>();
    static ArrayList<Lateral> lateralArrayList= new ArrayList<Lateral>();

    public static void main(String[] args) {

        int opt= 0;

       do {
           opt= menu();
           opcion(opt);
       }while (opt != 4);

    }

//    Menú principal
    public static int menu(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elije una opción\n" +
                "1. Vender entrada\n" +
                "2. Consulta entrada\n" +
                "3. Informe de zona\n" +
                "4. Finalizar\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 4);

        return opt;
    }
//    Opciones del menú principal
    public static void opcion(int opt){
        switch (opt){
            case 1:
                opcionVentas();
                break;
            case 2:
                opcionConsulta();
                break;
            case 3:
                opcionZona();
                break;
        }
    }

//   Venta de entradas
    public static int menuVentas(){
    int opt= 0;

    Scanner pedirDatos= new Scanner(System.in);

    String menu= "Elije una zona\n" +
            "1. Palco\n" +
            "2. Principal\n" +
            "3. Central\n" +
            "4. Lateral\n" +
            "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

//    Opciones de venta
    public static void opcionVentas(){

        int opt= menuVentas();

        switch (opt){

//            ventas Palco
            case 1:
                if (localidadesPalco == maxLocalidadesPalco){
                    imprimir("Ya no quedan entradas de palco");
                }else {
                    imprimir("Vender entrada palco");
                    int entrada= localidadesPalco;
                    String numeroEntrada= "palco" + localidadesPalco;
                    palco= new Palco(entrada, numeroEntrada);
                    palco.precio();
                    palco.entradasRestentes();
                    imprimir(palco.toString());
                    palcoArrayList.add(palco);
                    localidadesPalco++;
                }
                break;

//            ventas Principal
            case 2:
                if (localidadesPrincipal == maxLocalidadesPrincipal){
                    imprimir("Ya no quedan entradas de principal");
                }else {
                    imprimir("Vender entrada principal");
                    int entrada= localidadesPrincipal;
                    String numeroEntrada= "principal" + localidadesPrincipal;
                    principal= new Principal(entrada, numeroEntrada);
                    principal.precio();
                    principal.entradasRestentes();
                    imprimir(principal.toString());
                    principalArrayList.add(principal);
                    localidadesPrincipal++;
                }
                break;

//            ventas Central
            case 3:
                if (localidadesCentral == maxLocalidadesCentral){
                    imprimir("Ya no quedan entradas de central");
                }else {
                    imprimir("Vender entrada central");
                    int entrada= localidadesCentral;
                    String numeroEntrada= "central" + localidadesCentral;
                    central= new Central(entrada, numeroEntrada);
                    central.precio();
                    central.entradasRestentes();
                    imprimir(central.toString());
                    centralArrayList.add(central);
                    localidadesCentral++;
                }
                break;

//            ventas Lateral
            case 4:
                if (localidadesLateral == maxLocalidadesPalco){
                    imprimir("Ya no quedan entradas de lateral");
                }else {
                    imprimir("Vender entrada lateral");
                    int entrada= localidadesLateral;
                    String numeroEntrada= "lateral" + localidadesLateral;
                    lateral= new Lateral(entrada, numeroEntrada);
                    lateral.precio();
                    lateral.entradasRestentes();
                    imprimir(lateral.toString());
                    lateralArrayList.add(lateral);
                    localidadesLateral++;
                }
                break;
            case 5:
                menu();
                break;
        }
    }


//    Consulta entradas
    public static int menuConsulta(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elije una opción\n" +
                "1. Verificar entrada palco\n" +
                "2. Verificar entrada principal\n" +
                "3. Verificar entrada central\n" +
                "4. Verificar entrada lateal\n" +
                "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

//    Opciones de consulta
    public static void opcionConsulta(){

        int opt= menuConsulta();

        switch (opt){
            case 1:
                if (localidadesPalco > 1){
                    comprobarEntradaPalco();
                }else {
                    noEntradas("palco");
                }
                break;
            case 2:
                if (localidadesPrincipal > 1){
                    comprobarEntradaPrincipal();
                }else {
                    noEntradas("principal");
                }
                break;
            case 3:
                if (localidadesCentral > 1){
                    comprobarEntradaCentral();
                }else {
                    noEntradas("central");
                }
                break;
            case 4:
                if (localidadesLateral> 1){
                    comprobarEntradaLateral();
                }else {
                    noEntradas("lateral");
                }
                break;
            case 5:
                break;
        }
    }

    public static void comprobarEntradaPalco(){

        boolean correcto= false;

        Scanner pedirDatos= new Scanner(System.in);



        imprimir(
                "Ejemplo de número de entrada\n" +
                "palco1"
        );

        imprimir("Dime el numero de entrada");
        String numeroEntrada= pedirDatos.nextLine();

        for (Zonas palco1 : palcoArrayList) {

//            Comparar dos String
            if (Objects.equals(numeroEntrada, palco1.getNumeroEntrada())){
                imprimir("La entrada es correcta\n" + palco1.toString());
                imprimir("");
                correcto= true;
                break;
            }

        }

        if (!correcto){
            imprimir("No hay ninguna entrada con ese número");
        }
    }

    public static void comprobarEntradaPrincipal(){

        boolean correcto= false;

        Scanner pedirDatos= new Scanner(System.in);

        imprimir(
                "Ejemplo de número de entrada\n" +
                        "principal1"
        );

        imprimir("Dime el numero de entrada");
        String numeroEntrada= pedirDatos.nextLine();

        for (Zonas principal1 : principalArrayList) {

//            Comparar dos String
            if (Objects.equals(numeroEntrada, principal1.getNumeroEntrada())){
                imprimir("La entrada es correcta\n" + principal1.toString());
                imprimir("");
                correcto= true;
                break;
            }

        }

        if (!correcto){
            imprimir("No hay ninguna entrada con ese número");
        }
    }

    public static void comprobarEntradaCentral(){

        boolean correcto= false;

        Scanner pedirDatos= new Scanner(System.in);

        imprimir(
                "Ejemplo de número de entrada\n" +
                        "central1"
        );

        imprimir("Dime el numero de entrada");
        String numeroEntrada= pedirDatos.nextLine();

        for (Zonas central1 : centralArrayList) {

//            Comparar dos String
            if (Objects.equals(numeroEntrada, central1.getNumeroEntrada())){
                imprimir("La entrada es correcta\n" + central1.toString());
                imprimir("");
                correcto= true;
                break;
            }

        }

        if (!correcto){
            imprimir("No hay ninguna entrada con ese número");
        }
    }

    public static void comprobarEntradaLateral(){

        boolean correcto= false;

        Scanner pedirDatos= new Scanner(System.in);

        imprimir(
                "Ejemplo de número de entrada\n" +
                        "lateral1"
        );

        imprimir("Dime el numero de entrada");
        String numeroEntrada= pedirDatos.nextLine();

        for (Zonas  lateral1 : lateralArrayList) {

//            Comparar dos String
            if (Objects.equals(numeroEntrada, lateral1.getNumeroEntrada())){
                imprimir("La entrada es correcta\n" + lateral1.toString());
                imprimir("");
                correcto= true;
                break;
            }

        }

        if (!correcto){
            imprimir("No hay ninguna entrada con ese número");
        }
    }

//    Informe de Zonas

//    Opciones de Zona
    public static int menuZona(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Informe zonas\n" +
                "1. Zona palco\n" +
                "2. Zona principal\n" +
                "3. Zona central\n" +
                "4. Zona lateral\n" +
                "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

    public static void opcionZona(){

        int opt= menuZona();

        switch (opt){
            case 1:
                if (localidadesPalco > 1){
                    float total= 0;
                    for (int i = 0; i < palcoArrayList.size(); i++) {
                        total= total +  palcoArrayList.get(i).precio;
                    }
                    palco.setTotal(total);
                    imprimir(palco.informeZona());
                    palco.setTotal(0.00f);
                    opcionZona();
                }else {
                    noEntradas("palco");
                    opcionZona();
                }
                break;
            case 2:
                if (localidadesPrincipal > 1){
                    float total= 0;
                    for (int i = 0; i < principalArrayList.size(); i++) {
                        total= total +  principalArrayList.get(i).precio;
                    }
                    principal.setTotal(total);
                    imprimir(principal.informeZona());
                    principal.setTotal(0.00f);
                    opcionZona();
                }else {
                    noEntradas("Principal");
                    opcionZona();
                }
                break;
            case 3:
                if (localidadesCentral > 1){
                    float total= 0;
                    for (int i = 0; i < centralArrayList.size(); i++) {
                        total= total +  centralArrayList.get(i).precio;
                    }
                    central.setTotal(total);
                    imprimir(central.informeZona());
                    central.setTotal(0.00f);
                    opcionZona();
                }else {
                    noEntradas("central");
                    opcionZona();
                }
                break;
            case 4:
                if (localidadesLateral > 1){
                    float total= 0;
                    for (int i = 0; i < lateralArrayList.size(); i++) {
                        total= total +  lateralArrayList.get(i).precio;
                    }
                    lateral.setTotal(total);
                    imprimir(lateral.informeZona());
                    lateral.setTotal(0.00f);
                    opcionZona();
                }else {
                    noEntradas("lateral");
                    opcionZona();
                }
                break;
            case 5:
                break;
        }
    }

    public static void noEntradas(String entrada){
        imprimir("No se han vendido entradas de " + entrada);
    }

    public static void imprimir(String datos){
        System.out.println(datos);
    }

}
