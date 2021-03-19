package Menu;

public class Usuario {

    private static int numUsuarios = 0;
    private int numero;
    private String nombre;
    private String apellido;
    private Cuenta cuentas[];

    public Usuario() {
        numUsuarios++;
        this.numero = numUsuarios;

        cuentas = new Cuenta[3];
        for(int i = 0; i<3;i++)
        {
            cuentas[i] = new Cuenta();
        }
    }
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        numUsuarios++;
        this.numero = numUsuarios;

        cuentas = new Cuenta[3];
        for(int i = 0; i<3;i++)
        {
            cuentas[i] = new Cuenta();
        }
    }

    public static int getNumUsuarios() {
        return numUsuarios;
    }

    public static void setNumUsuarios(int numUsuarios) {
        Usuario.numUsuarios = numUsuarios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public void llenarCuentas()
    {

    }

}
