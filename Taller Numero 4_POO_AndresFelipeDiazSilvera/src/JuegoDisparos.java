public class JuegoDisparos {
  // Author: Andres Felipe Diaz Silvera
}
public class JuegoDisparos {

    //Attributes
    private String nameplayer;

    //Constructor
    public JuegoDisparos() {}

    public JuegoDisparos(String nameplayer) {
        this.nameplayer = nameplayer;
    }

    //Setters & Getters

    public String getNameplayer() {
        return nameplayer;
    }

    public void setNameplayer(String nameplayer) {
        this.nameplayer = nameplayer;
    }

    @Override
    public String toString() {
        return " nameplayer: " + nameplayer;
    }

}
