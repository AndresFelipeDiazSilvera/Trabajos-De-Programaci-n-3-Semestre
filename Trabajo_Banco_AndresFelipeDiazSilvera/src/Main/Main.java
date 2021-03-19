package Main;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 16/03/2021




import Menu.Banco;
import Menu.Usuario;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Banco bank = new Banco();

        // bank.agregarUsuarios();
        /*
        System.out.println("El usuario con el manor saldo de cuenta de ahorros es: "+
                bank.menorSaldoAhorros().getNombre()+" "+bank.menorSaldoAhorros().getApellido());
*/
        Usuario t = bank.menorSaldoAhorros();
        System.out.println("El usuario con el menor saldo de cuenta de ahorros es: "+
                t.getNombre()+" "+t.getApellido());


        Usuario tmy = bank.menorSaldoAhorros();
        System.out.println("El usuario con el mayor saldo de cuenta de correinte es: "+
                tmy.getNombre()+" "+t.getApellido());

        System.out.println("El tipo de cuenta con menor saldo es: "+bank.menorSaldoCuenta());
    }

}
