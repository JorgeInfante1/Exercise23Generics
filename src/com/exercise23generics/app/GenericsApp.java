package com.exercise23generics.app;

import com.exercise23generics.model.Multi;
import com.exercise23generics.model.Resta;
import com.exercise23generics.model.Suma;
public class GenericsApp 
{
	public static void main(String[] args) 
	{
		Suma<Integer> miObjeto = new Suma<Integer>(15);  
		Suma<String> miObjetoString = new Suma<String>("Testo");
		Resta<Integer, Integer> miObjetoResta = new Resta<Integer, Integer>(10, 20);
		Resta<Integer, Integer> miObjetoResta2 = new Resta<Integer, Integer>();
		
		
		System.out.println("Objeto de miObjeto: "+miObjeto.getMiObjeto());
		System.out.println("Objeto de miObjetoString: "+miObjetoString.getMiObjeto());
		
		miObjetoResta2.setKey(100);
		miObjetoResta2.setValue(200);
		System.out.println("\nObjeto Resta1:"+miObjetoResta.ToString());
		System.out.println("Objeto Resta2:"+miObjetoResta2.ToString());
		
	    System.out.println("\n"+Multi.MuestraTipoDato(10));
	    System.out.println(Multi.MuestraTipoDato("El macho"));
	    System.out.println(Multi.MuestraTipoDato(10.0));
	    //Suma con generics
	    System.out.println("\n10.0+10.0"+Suma.SumaNumeros(10, 10));
	}

}
