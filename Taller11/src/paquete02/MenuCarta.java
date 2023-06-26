/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class MenuCarta extends Menu {

    public double valorGuarnicion;
    public double valorBebida;
    public double porcentaje;

    public MenuCarta(String n, double v, double vg,
            double vb, double p) {
        super( n,v);
        valorGuarnicion = vg;
        valorBebida = vb;
        porcentaje = p;

    }

    public void establecerVal_guarnicion(double val_guarnicion) {
        this.valorGuarnicion = val_guarnicion;
    }

    public void establecerVal_bebida(double val_bebida) {
        this.valorBebida = val_bebida;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = (valorInicialMenu + valorBebida + valorGuarnicion)+(valorInicialMenu*porcentaje/100);
    }

    public double obtenerVal_guarnicion() {
        return valorGuarnicion;
    }

    public double obtenerVal_bebida() {
        return valorBebida;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menú a la Carta: \n"
                + "%s"
                + "Valor bebida: %.2f\n"
                + "Valor guarnicion: %.2f\n"
                + "Porcentaje adicional: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                 obtenerVal_bebida(),
                 obtenerVal_guarnicion(), 
                  obtenerPorcentaje(),
                 obtenerValorMenu());

        return mensaje;
    }

}
