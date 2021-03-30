package Model;
public class Account {
    private int id;
    private boolean type;
    private double residue;

    public Account() {
    }

    public Account(int id, boolean type, double residue) {
        this.id = id;
        this.type = type;
        this.residue = residue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public double getResidue() {
        return residue;
    }

    @Override
    public String toString() {
        String at;
        if (type){
            at="Cuenta de ahorro";
        }else{
            at="Cuenta de cheques";
        }
        return "\n"+"Account; " +
                "id: " + id +
                ", type: "+at+
                ", residue=" + residue;
    }

    public void setResidue(double residue) {
        this.residue = residue;
    }

}

