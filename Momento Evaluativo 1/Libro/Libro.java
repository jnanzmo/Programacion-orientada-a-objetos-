public class Libro {

    // ATRIBUTOS
    String titulo;
    String autor;
    String isbn;
    int numeroPaginas;
    boolean disponible;

    // COSTRUCTOR
    public Libro(String titulo, String autor, String isbn, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;
    }

    // METODO PARA MIRAR SI HAY DISPONIBILIDAD
        public boolean estaDisponible() {
        return disponible;
    }

    // METODO PARA PRESTAR EL LIBRO
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Se ha prestado el libro: " + titulo);
        } else {
            System.out.println("Error: El libro " + titulo + " ya se encuentra prestado.");
        }
    }

    // METODO PARA DEVOLVER EL LIBRO
    public void devolver() {
        if (disponible) {
            disponible = true;
            System.out.println("Has devuelto el libro: " + titulo);
        } else {
            System.out.println("El libro" + titulo + "ya estaba en la biblioteca");
        }

    }

    public String toString() {
        // MOSTRSR DISPONIBILIDAD SI ESTA DISPONIBLE
        String estado = disponible ? "Disponible" : "Prestado";

        return titulo + " (" + autor + ") - Estado: " + estado;
    }
}
