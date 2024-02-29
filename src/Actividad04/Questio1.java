package Actividad04;

public class Questio1 {
    public static void main(String[] args) {
        A obj= new B();
//        obj.metodo();
    }
}

class A{}

class B extends A{
    public void metodo(){
        System.out.println("Método de B");
    }
}