public class Controllers {
         //Author: Andres Felipe Diaz Silvera
}
public class Controller {
    public Controller[] controllers;

    //Constructors
    public Controller() {
        controllers = new Controller[10];
    }

    //Own Methods
    public boolean save(int id, String name, String Cedula, String Celular, String Edad, String Categoriajuego, String Entrada) {
        try {
            if (findOne(id) == null) {
                System.err.println("La llave primaria (indice) especificada no existe o no tiene ningun objeto asociado");

                return false;

            }
        } finally {

        }
        return false;

        controllers[id].setName(name);
        controllers[id].setCedula(Cedula);
        controllers[id].setCelular(Celular);
        controllers[id].setEdad(Edad);
        controllers[id].setCategoriajuego(Categoriajuego);
        controllers[id].setEntrada(Entrada);


    }
}
