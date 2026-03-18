package Perfume;

public class MainPerfumes {

    public static void main(String[] args) {

        Perfumes Obj1 = new Perfumes("YOU", "ESIKA", 500, 200.000);

        Obj1.aplicarPerfume(10);

        System.out.println(Obj1.toString());

        Obj1.ajustarPrecio(180.00);
        Obj1.aplicarPerfume(20);
        Obj1.ajustarPrecio(100.00);
        System.out.println(Obj1.toString());

    }

}
