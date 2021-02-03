public class JuegoPeleas {
    //Author: Andres Felipe Diaz Silvera
}
public class JuegoPeleas {

    //Attributes
    private String name;

    //Constructor
    public JuegoPeleas() {}

    public JuegoPeleas(String name) {
        this.name = name;
    }

    //Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ", name: " + name;
    }

}
