/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class MenuNinos extends Menu {
    public double valorHelado;
    public double valorPastel;
    
    public MenuNinos(String n, double v, double vh,
            double vp) {
        super(n,v);
        valorHelado = vh;
        valorPastel = vp;

    } 
     public void establecerVal_postre(double vh) {
        valorHelado = vh;
    }

    public void establecerVal_bebida(double vp) {
        valorPastel = vp;
    }
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPastel + valorHelado;
    }


    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }
    
     @Override
    public String toString() {

        String mensaje = String.format("Menu Ninios: \n"
                + "%s"
                + "Valor healdo: %.2f\n"
                + "Valor pastel: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                 obtenerValorHelado(),
                 obtenerValorPastel(), 
                 obtenerValorMenu());

        return mensaje;
    }

    
    
    

}

