/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class MenuDia extends Menu {

    public double valorPostre;
    public double valorBebida;

    public MenuDia(String n, double v, double vp,
            double vb) {
        super(n,v);
        valorPostre = vp;
        valorBebida = vb;

    }

    public void establecerVal_postre(double val_postre) {
        this.valorPostre = val_postre;
    }

    public void establecerVal_bebida(double val_bebida) {
        this.valorBebida = val_bebida;
    }
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorBebida + valorPostre;
    }


    public double obtenerVal_postre() {
        return valorPostre;
    }

    public double obtenerVal_bebida() {
        return valorBebida;
    }
    
     @Override
    public String toString() {

        String mensaje = String.format("Menu del dia: \n"
                + "%s"
                + "Valor bebida: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                 obtenerVal_bebida(),
                 obtenerVal_postre(), 
                 obtenerValorMenu());

        return mensaje;
    }

    
    
    

}
