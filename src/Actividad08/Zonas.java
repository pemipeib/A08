package Actividad08;

public class Zonas {

//    Constantes
    float precio, total;
    int entradasVendidas= 0, entradasRestantes= 0;
    String numeroEntrada= "";

//    Constructor
    public Zonas(){};

//    getters y setters
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public int getEntradasRestantes() {
        return entradasRestantes;
    }

    public void setEntradasRestantes(int entradasRestantes) {
        this.entradasRestantes = entradasRestantes;
    }

    public String getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(String numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }
}
