import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer dos números y deducir si están en orden creciente. a <= b
        int a =0, b= 0;
        System.out.print("digite a: "); //Solicitamos por tecladoel valor se "a"
        a = sc.nextInt();  // capturamospor teclado el valor de "a"
        System.out.print("digite b_:");
        b = sc.nextInt();
        // Condicional para deducir si esta en orde creciente o decreciente.
        if(a<=b){
            System.out.println("Orden creciente");
         }else{
            System.out.println("Orden decreciente");

        }
         sc. close();

    }
}
