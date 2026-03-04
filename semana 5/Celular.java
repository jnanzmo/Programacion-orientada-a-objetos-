public class Celular {
   // Atributos
    String marca;
    String modelo;
    int bateria = 100;
    // Metodo (Comportamiento)

    /*
     *firma de metodo 
     *publico
     *void----> no retorna
     *el metodo tiene como nombre "llamar"
     *tiene un parametro y es de tipo enero 
    */
    public void llamar(String numero) {
     System.out.println("Llamando al " + numero + "...");
     this.bateria-= 5;
   }
}