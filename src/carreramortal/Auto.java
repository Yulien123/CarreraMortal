package carreramortal;

import java.util.ArrayList;

public class Auto {

    private String marca;
    private String modelo;
    private String ventaja;
    private String color;
    private String patente;
    private int litros;
    private boolean suficiente;
    private ArrayList<Rueda> ruedas;

    public Auto(String marca, String modelo, String ventaja,String color, String patente) {
        this.marca=marca;
        this.modelo=modelo;
        this.ventaja=ventaja;
        this.color = color;
        this.patente = patente;
        this.litros = 50;
        suficiente = true;
        ruedas = new ArrayList<Rueda>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVentaja() {
        return ventaja;
    }

    public void setVentaja(String ventaja) {
        this.ventaja = ventaja;
    }

    public void agregarRuedas(Rueda r) {
        ruedas.add(r);
        System.out.println("Rueda agregada");
    }

    public void mostrarEstadoDeRuedas() {
        for (Rueda it : ruedas) {
            System.out.println(it.toString());
        }
    }

    public void Avanzar(double metros) {
        double lts = (metros * 1) / 10;
        if (litros >= lts) {
            litros -= lts;
        } else {
            System.out.println("No hay combustible suficiente para avanzar");
        }
    }

    public void Retroceder(double metros) {
        double lts = (metros * 1) / 10;
        if (litros >= lts) {
            litros -= lts;
        } else {
            System.out.println("No hay combustible suficiente para retroceder");
        }
    }

    public void LlenarTanque() {
        setLitros(50);
    }
}
