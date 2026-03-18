public class MainLibro {

    public static void main(String[] args) {
        // creo varios objetos
        Libro Obj1 = new Libro("EL BANCO", "GERENTE", "123", 90);
        Libro Obj2 = new Libro("LA UNIVERSIDAD ", "PROFESOR", "456", 250);
        // ESTADO DEL LIBRO
        System.out.println(Obj1);
        //PRESTAMO DEL LIBRO
         Obj1.prestar();
         //DEVOLVER LIBRO
         Obj1.devolver();
        //ESTADO DEL LIBRO
        System.out.println(Obj1);
        System.out.println(Obj2);
        //PRESTAMO DEL LIBRO
        Obj2.prestar();
        //DEVOLVER EL LIBRO Y MUESTRA EL ESTADO
        System.out.println(Obj2);
        //MUESTRA EL ERROR SI ESTA PRESTADO
        Obj2.prestar();

    }
}
 

