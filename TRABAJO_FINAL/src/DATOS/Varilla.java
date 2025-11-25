
package DATOS;



public class Varilla {
    
    private String nombre;
    public final double medida = 5.95;
    private String Grosor;
    private String Color;
    private int Cantidad;

    public Varilla(String nombre, String Grosor, String Color, int Cantidad) {
        this.nombre = nombre;
        this.Grosor = Grosor;
        this.Color = Color;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrosor() {
        return Grosor;
    }

    public void setGrosor(String Grosor) {
        this.Grosor = Grosor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

   
    
}
