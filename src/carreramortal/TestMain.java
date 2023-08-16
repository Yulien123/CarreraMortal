/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreramortal;

/**
 *
 * @author julan
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rueda r1 = new Rueda("Firelli",28.0,1);
       Rueda r2 = new Rueda("Firelli",28.0,2);
       Rueda r3 = new Rueda("Firelli",28.0,3);
       Rueda r4 = new Rueda("Firelli",28.0,4);
       
       Auto auto = new Auto("Chevrolet","Camaro","Nitro","Negro","AR-158-13");
       auto.agregarRuedas(r1);
       auto.agregarRuedas(r2);
       auto.agregarRuedas(r3);
       auto.agregarRuedas(r4);
       r1.desinflarRueda();
       r1.inflarRueda();
       auto.Avanzar(30);
       auto.Retroceder(10);
       auto.LlenarTanque();
       auto.mostrarEstadoDeRuedas();
       
    }
    
}
