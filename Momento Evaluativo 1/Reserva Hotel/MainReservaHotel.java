public class MainReservaHotel {
    public static void main(String[] args) {

        ReservaHotel Obj1 = new ReservaHotel("intercontinental", "01/03/2026", "07/03/2026", 507);

        // CONSULTA SI LA HABITACION ESTA DISPONIBLE
        System.out.println(Obj1.toString());

        Obj1.ReservarHabitacion();
        System.out.println(Obj1.toString());

        Obj1.ReservarHabitacion();

        Obj1.CancelarReserva();

        System.out.println(Obj1.toString());
    }
}
