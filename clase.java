import java.util.*;

public class clase{
	private String cadena;
	private Integer numerito;
	
	/*
	*Constructor
	*/	
	public clase(String in_cadena){
		this.cadena = in_cadena;
		this.numerito = 69;
	}
	
	/*
	*GetCadena
	*/
	public String getCadena(){
		return this.cadena;
	}
	
	/*
	*GetNumerito
	*/
	public Integer getNumerito(){
		return this.numerito;
	}
}