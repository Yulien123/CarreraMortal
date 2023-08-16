package carreramortal;

public class Rueda {

    private String marca;
    private double presion;
    private int num;

    public Rueda(String marca, double presion, int num) {
        this.marca=marca;
        this.presion=presion;
        this.num=num;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    public void inflarRueda(){
        presion=28.0;
        System.out.println("Rueda "+num+" inflada");
    }
    public void pincharRueda(){
        presion=10;
        System.out.println("Rueda "+num+" pinchada");
    }
    public void desinflarRueda(){
        setPresion(getPresion()-0.5);
        System.out.println("Rueda "+num+" desinflada, presion: "+getPresion());
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + ", presion=" + presion + ", num=" + num + '}';
    }
    
}
