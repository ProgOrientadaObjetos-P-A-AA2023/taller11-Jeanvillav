/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.ArrayList;
import paquete02.*;
/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuDia menuNinos = new MenuDia("Niños 01", 2.0, 1.0, 1.5);
        MenuDia menuNinos2 = new MenuDia("Niños 02", 3.0, 1.0, 1.5);
        MenuEco menuEco1 = new MenuEco("Carta 001", 4.0, 25.00);
        MenuEco menuEconomico = new MenuEco("Econo 001", 4.0, 25.0);
        
        // Inicio de solución
        
        ArrayList<Menu> lista2 = new ArrayList<>();
        lista2.add(menuNinos);
        lista2.add(menuNinos2);
        lista2.add(menuCarta);
        lista2.add(menuEconomico);
        
        
        for (int i = 0; i < lista2.size(); i++) {
            //lista.get(i).calcularValorMenu();
            lista2.get(i).establecerValorMenu();
        }
        
        
        Cuenta miCuenta = new Cuenta("René Elizalde", lista2, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/