package app.ito.poo;

import java.awt.HeadlessException;


import excepcion.ito.poo.CuentaExistente;
import excepcion.ito.poo.EliminarCuenta;
import excepcion.ito.poo.Deposito;
import excepcion.ito.poo.NumCuenta;
import excepcion.ito.poo.Retiro;
import excepcion.ito.poo.Saldo;
//
public class MyApp {
	

	public static void main(String[] args) throws HeadlessException, NumCuenta, Saldo, Retiro, Deposito, CuentaExistente, EliminarCuenta{
		
			Aplicacion.menu();
			
	}
		
}