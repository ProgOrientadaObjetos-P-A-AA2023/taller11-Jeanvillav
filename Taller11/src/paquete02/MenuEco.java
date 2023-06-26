/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class MenuEco extends Menu {

    public double porcentaje;

    public MenuEco(String n, double v, double p) {
        super(n,v);

        porcentaje = p;

    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentaje/100);
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu Economico: \n"
                + "%s"
                + "Porcentaje adicional: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                obtenerPorcentaje(),
                obtenerValorMenu());

        return mensaje;
    }

}
