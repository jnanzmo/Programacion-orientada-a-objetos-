package Perfume;

public class Perfumes {

    // ATRIBUTOS 
    String nombre;
    String marca;
    double capacidad; 
    double precio;

    // COSTRUCTOR 
    public Perfumes(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    public void aplicarPerfume(double cantidad) {
        
        if (capacidad >= cantidad) {
            capacidad = capacidad - cantidad;

            System.out.println("Saplico el perfume y see uso " + cantidad + " ml");
        } else {
            System.out.println("No queda suficiente perfume.");
        }
    }

    // CANTIDAD 
    public String toString () { 
        return "Queda " + capacidad + " ml";
    }

    //AJUSTE DE PRECIO
    public void ajustarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio de " + nombre + " es: $" + precio);
    }
}

