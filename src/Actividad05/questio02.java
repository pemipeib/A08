package Actividad05;

public class questio02 {
    public static void main(String[] args) {
        C obje= new D();
        obje.metodo2();
    }
}

class C{
    void metodo2(){
        System.out.println("Método de c");
    }
}

class D extends C{
    void metodo2(){
        System.out.println("Método de D");
    }
}
