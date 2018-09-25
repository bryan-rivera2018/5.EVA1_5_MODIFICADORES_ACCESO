/*
 * CONTINUACION DE LA DESCRIPCION CLASES Y OBJETOS
     MODIFICADORES DE ACCESO PARA ATRIBUTOS, METODOS Y CLASES
 */
package eva1_5_modificadores_acceso;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_5_MODIFICADORES_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crear un objeto (crear una instancia de la clase)
        Banco sBank = new Banco();
        sBank.bNombreCliente = "Bryan Rivera Villaseñor";
        sBank.rSaldoCuenta = 1000;
        System.out.println("Cliente: " + sBank.bNombreCliente);
        System.out.println("Saldo: " + sBank.rSaldoCuenta);
        //Otro Cliente
        sBank.rSaldoCuenta = 0;
        System.out.println("Cliente: " + sBank.bNombreCliente);
        System.out.println("Saldo: " + sBank.rSaldoCuenta); 
    }
    
}
//ABSTRACCION DEL PROBLEMA DE REPRESENTAR UN BANCO
class Banco{
    //EN GENERAL, LOS ATRIBUTOS DE UNA CLASE SON PRIVADOS
    public String bNombreCliente;
    public double rSaldoCuenta;
}