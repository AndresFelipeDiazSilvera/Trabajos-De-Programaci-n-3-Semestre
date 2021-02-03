public class Incripciones {
    //Author: Andres Felipe Diaz Silvera
}
public class Incripciones extends JuegoDisparos implements JuegoPeleas{
    //Attributes
    private double chargeAmount;

    //Constructors
    public Incripciones() {
        super();
    }

    public Incripciones(double nameplayer, int id, String Cedula, String Celular, JuegoDisparos juegoDisparos, int Edad, String Categoriajuego, String Entrada ) {
        JuegoPeleas(id, nameplayer, Cedula JuegoDisparos, Celular, Edad, Categoriajuego, Entrada);
        this.chargeAmount = chargeAmount;
    }

    //Setters & Getters
    public double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @Override
    public String toString() {
        return "chargeAmount: " + chargeAmount + ", (" + super.toString() + ")" + ", incripciones: " + getTax() + ", Entrada: " + getSoat();
    }

    @Override
    public double getTax() {
        return price * (5.5 / 100);
    }

    @Override
    public double getSoat() {
        return getTax() * (10 / 100);
    }


}
