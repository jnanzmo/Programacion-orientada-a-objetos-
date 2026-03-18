public class CuentaBancaria {
    
      private String numeroCuenta;
      private double saldo;
      private String titular;
    
      public CuentaBancaria(String numeroCuenta, double saldo, String titular){
        
        this.numeroCuenta = numeroCuenta;
	    this.saldo = saldo;
        this.titular = titular;
        
      }
      
      
      public void depositar(int cantidad){
	    saldo += cantidad;
    }

    public void retirar(int cantidad){
	     saldo -= saldo;
    }

    public double consultarSaldo(){
	    return saldo;
    }
    
	public String toString(){
        return "CuentaBancaria[ Numero de cuenta: " + numeroCuenta + " Saldo: " + saldo + " Titular: " + titular + "]";
	}
	
}