public class Main {
     public static void main(String [] args) throws Exception {
         
    
      //inicializamos el objeto 
      Producto objP1 = new Producto ("Teclado", 10012, 10, 230.0);
      
      //Mostrar el contenido del objeto
      System.out.println(objP1);
         
      //Agregar 5 Teclados y mostrar nuevamente el objeto
      objP1.agregarStock(5);
      System.out.println(objP1);
      
      //Descontar 8 Teclados y mostrar nuevamente el objeto "Cantidad = 7"
      objP1.reducirStock(9);
      System.out.println(objP1);
      
      //Calcular el inventario
      double total =objP1.calcularValorInventario();
      
     }
}