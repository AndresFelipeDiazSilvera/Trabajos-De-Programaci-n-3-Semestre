package Menu;

import java.util.Scanner;

public class Banco {

    private int numUsuarios;
    private Usuario clientes[];

    public Banco() {
        numUsuarios = 5;

        clientes = new Usuario[numUsuarios];
        for(int i = 0; i<numUsuarios;i++)
        {
            clientes[i] = new Usuario();
        }

        agregarUsuarios();
    }

    public int getNumUsuarios() {
        return numUsuarios;
    }

    public void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    public Usuario[] getClientes() {
        return clientes;
    }

    public void setClientes(Usuario[] clientes) {
        this.clientes = clientes;
    }

    public void agregarUsuarios(){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< clientes.length;i++)
        {
            System.out.println("Nombre");
            clientes[i].setNombre(sc.next());
            for (int j = 0; j< clientes[i].getCuentas().length;j++) {
                System.out.println("Saldo");
                clientes[i].getCuentas()[j].setSaldo(sc.nextDouble());
            }
        }
    }

    public String menorSaldoCuenta()
    {
        Cuenta cutemp = new Cuenta('a',10000000);

        for (int i = 0; i< clientes.length;i++)
        {
            for (int j = 0; j< clientes[i].getCuentas().length;j++) {

                if(clientes[i].getCuentas()[j].getSaldo() < cutemp.getSaldo())
                {
                    cutemp = clientes[i].getCuentas()[j];
                }
            }
        }

        // return cutemp.getTipo();
        if(cutemp.getTipo()=='a')
            return "Ahorros";
        else
            return "Corriente";
    }

    public Usuario menorSaldoAhorros()
    {
        Usuario ustemp = new Usuario();
        Cuenta cuentastemp[] = {new Cuenta('a',10000000)};
        ustemp.setCuentas(cuentastemp);
        for (int i = 0; i< clientes.length;i++)
        {
            for (int j = 0; j< clientes[i].getCuentas().length;j++) {
                if (clientes[i].getCuentas()[j].getTipo()=='a') //if (clientes[i].getCuentas()[j].getTipo().equals("Ahorros"))
                {
                    if(clientes[i].getCuentas()[j].getSaldo() < ustemp.getCuentas()[0].getSaldo())
                    {
                        ustemp = clientes[i];
                    }
                }
            }
        }

        return ustemp;
    }

    public Usuario mayorSaldoCorriente()
    {
        Usuario ustemp = new Usuario();
        Cuenta cuentastemp[] = {new Cuenta('c',0)};
        ustemp.setCuentas(cuentastemp);
        for (int i = 0; i< clientes.length;i++)
        {
            for (int j = 0; j< clientes[i].getCuentas().length;j++) {
                if (clientes[i].getCuentas()[j].getTipo()=='c') //if (clientes[i].getCuentas()[j].getTipo().equals("Corriente"))
                {
                    if(clientes[i].getCuentas()[j].getSaldo() > ustemp.getCuentas()[0].getSaldo())
                    {
                        ustemp = clientes[i];
                    }
                }
            }
        }

        return ustemp;
    }

}
