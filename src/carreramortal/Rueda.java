package carreramortal;

public class Rueda {

    private String marca;

    private double presion;

    public Rueda(String marca, double presion) {
        this.marca=marca;
        this.presion=presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
}
