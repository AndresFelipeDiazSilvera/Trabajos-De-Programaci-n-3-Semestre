package Main;

import Controladores.GameControlador;
import Util.Constants;
import Util.IOManager;

import java.util.Arrays;


//Author:Andres Felipe Diaz Silvera
//DATE: 04/02/2021

public class Main {

    private static GameControlador gc;

    public static void main(String[] args) {

        gc = new GameControlador();

        gc.save(0, "Forza Horizon 4",32.6,13);


        gc.save(1, "Mortal Kombat",28.0,18);


        gc.save(2, "Destiny 2",14.6,15);


        gc.save(3, "Star Wars Jedi The Fallen Order",68.7,15);


        int menuOption;

        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);

            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = GameModule();
                    break;

                default:
                    break;
            }

        }while(menuOption != 0);

    }

    //game module
    private static int GameModule(){
        int gameOption;
        do{
            gameOption = IOManager.showCustomMenu(Constants.Game_MENU_TITLE, Constants.Game_MENU_INFO);
            switch(gameOption){

                case 1:

                    IOManager.showMessage(Arrays.toString(gc.list()));
            }
        }while(gameOption != 0);

        return -1;
    }



}