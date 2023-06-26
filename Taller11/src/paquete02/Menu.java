/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    public Menu( String n, double v) {
        nombrePlato = n;
        valorInicialMenu = v;

    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public abstract void establecerValorMenu();

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public void establecerValorInicialMenu(double vi) {
        valorInicialMenu = vi;
    }
    @Override
    public String toString() {

        String mensaje = String.format("----Platos: %s\n"
                + "Valor inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicialMenu());

        return mensaje;

    }
}
