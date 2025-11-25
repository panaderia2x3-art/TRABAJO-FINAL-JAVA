
package DATOS;

public class Retazo {
    
    private String nombre;
    private double medida;
    private String grosor;
    private String color;  
    private int cantidad;

    public Retazo(String nombre, double medida, String grosor, String color, int cantidad) {
        this.nombre = nombre;
        this.medida = medida;
        this.grosor = grosor;
        this.color = color;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    
    
   

    
    
}
