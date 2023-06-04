package Main;

public class CuentaDeAhorros extends Cuenta{
    
    private boolean activa;
    
    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if(saldo<10000){
            activa = false;
        } else{
            activa = true;
        }
    }
    
    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }
    }
    
    public void extractoMensual(){
        if (numeroRetiros>4){
            comisionMensual +=(numeroRetiros - 4)*100;
        }
        super.extractoMensual();
        
        if (saldo<1000){
            activa = false;
        }
    }
    
    public void imprimir(){
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comision mensual = $" + comisionMensual);
        System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
    
} 
