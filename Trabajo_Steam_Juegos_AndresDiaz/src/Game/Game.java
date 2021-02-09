package Game;

public class Game {
    private int id;
    private String name;
    private double size;
    private int edad;

    /**
     * @param id
     * @param name
     * @param size
     * @param edad
     */

    public Game() {
        //constructor
    }

    public Game(int id, String name, double size,int edad) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the edad
     */
    public int getedad() {
        return edad;
    }

    /**
     * @param edad the id to set
     */
    public void setedad(int edad) {
        this.edad = edad;
    }



    @Override
    public String toString() {
        return name + ", size: " + size +"\n";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}