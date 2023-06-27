/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;

/**
 *
 * @author villa
 */
public class Cuenta {
    /*datos iniciales como: nombre del cliente, 
IVA, listado de cartas -menú-, 
valor a cancelar total*/
    private String nombreC; 
    private ArrayList<Menu> listadoMenus;
    private double iva;
    private double valorCancelar;
    private double valorSubTotal;
    public Cuenta(String nc, ArrayList<Menu> l, double i) {
        nombreC= nc;
        listadoMenus = l;
        iva = i;
    }

    public String obtenerNombreC() {
        return nombreC;
    }

    public void establecerNombreC(String nc) {
        nombreC = nc;
    }

    public ArrayList<Menu> obtenerListadoMenus() {
        return listadoMenus;
    }

    public void establecerListadoMenus(ArrayList<Menu> l) {
        listadoMenus = l;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public void establecerValorCancelar() {
        valorCancelar = (valorSubTotal*(iva/100))+valorSubTotal;
    }

    public double obtenerSubTotal() {
        return valorSubTotal;
    }

     public void establecerSubtotal() {
        double suma=0;
        for (int i=0;i<obtenerListadoMenus().size();i++){
            suma+=listadoMenus.get(i).obtenerValorMenu();
        }
        valorSubTotal = suma;
    }
    
    
    public Cuenta(String nC,ArrayList<Menu> m, int i){
        nombreC= nC;
        listadoMenus = m;
        iva = i;
    }
    @Override
    public String toString() {
        /*String informacion = "Factura\n";
        informacion += "Cliente: " + nombreC + "\n";
        for (Menu menu : listadoMenus) {
            informacion += menu.obtenerNombrePlato()+ "\n";
        }
        informacion += "Subtotal: " + valorSubTotal + "\n";
        informacion += "IVA: " + iva + "%\n";
        informacion += "Total a pagar: " + valorCancelar + "\n";
        return informacion;*/
        
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", 
                nombreC);
        for (Menu menu : listadoMenus) {
        cadena=String.format("%s\n"
                +"%s\n"
                ,cadena
                ,menu
                
        );
        }
        
        cadena=String.format("%s\n"
        +"\nSubtotal: %.2f"
        +"\nIVA: %.2f"
        +"\nTotal a pagar: %.3f",
                cadena,
                obtenerSubTotal(),
                obtenerIva(),
                obtenerValorCancelar());
        
        
        
        return cadena;
    }
    
    
    
}
