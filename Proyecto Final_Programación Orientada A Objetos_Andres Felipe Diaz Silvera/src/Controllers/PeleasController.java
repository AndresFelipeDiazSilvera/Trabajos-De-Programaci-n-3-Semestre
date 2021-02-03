package Controllers;



import Model.Disparos;
import Model.Peleas;


//AUTHOR: Andres Felipe Diaz Silvera
//DATE:26/11/2020

public class PeleasController extends AbstractFacade<Peleas>{

    public PeleasController() {
        data = new Peleas[1];
    }

    //Own methods
    public boolean save(String nameplayer, int id, String cedula, String celular, int edad, String categoriaJuego, String entrada, int avatares){
        try{
            if(findOne(id) == null ){
                Peleas newPeleas = new Peleas(nameplayer,id, cedula, celular,edad, categoriaJuego,entrada,avatares);
                data[id] = newPeleas;

            }else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(String nameplayer, int id, String cedula, String celular, int edad, String categoriaJuego, String entrada, int avatares){
        try {
            if(findOne(id) == null){
                //No longer necessary because is being showing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            //Another option
            /*Owner currentOwner = findOne(id);
            currentOwner.setName(name);
            currentOwner.setNit(nit);
            owners[id] = currentOwner;*/

            //Optimal option
            data[id].setNameplayer(nameplayer);
            data[id].setCedula(cedula);
            data[id].setCelular(celular);
            data[id].setEdad(edad);
            data[id].setCategoriaJuego(categoriaJuego);
            data[id].setEntrada(entrada);
            data[id].setAvatares(avatares);

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}