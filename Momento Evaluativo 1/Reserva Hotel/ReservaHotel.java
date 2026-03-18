public class ReservaHotel {

    // ATRIBUTOS
    String nombre;
    String fechaEntrada;
    String fechaSalida;
    int numHabita;
    boolean disponibilidad;

    // COSTRUCTOR
    public ReservaHotel(String nombre, String fechaEntrada, String fechaSalida, int numeroHabita) {
        this.nombre = nombre;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numHabita = numeroHabita;
        this.disponibilidad = true;

    }

    // RESERVA DE LA HABITACION
    public void ReservarHabitacion() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("Se ha reservado la habitacion apartir de la fecha " + fechaEntrada
                    + " Y fecha de Salida: " + fechaSalida + " Con Numero de Habitacion : " + numHabita);

        } else {
            System.out.println("La habitacion: " + nombre + "" + numHabita + "Se encuenrea reservada");

        }

    }

    public void CancelarReserva() {

        if (!disponibilidad) {
            System.out.println("Cancelacion dela reserva: " + nombre + "" + numHabita);
            disponibilidad = true;
        }

    }
    public String toString (){
        String estado = disponibilidad ? "Disponible" : "Reservado";
        return " La habitación " + nombre + "-" + numHabita + " Se encuentra : " + estado;

    }

}
