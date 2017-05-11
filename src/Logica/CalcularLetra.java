package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="12345378";
	private int dni_numero=0;
	private char letra='A';
//	public Object devolverLetra;
	
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni=dni;
	}
	
	//REaliza el calculo
	public char devolverLetra(){
		return this.letra;
	}

}
