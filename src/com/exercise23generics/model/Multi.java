package com.exercise23generics.model;

public class Multi 
{
	public static <T> String MuestraTipoDato(T objeto)
	{
		return "Tipo de dato es: "+objeto.getClass()+
				"\n Nombre del parametro"+objeto.getClass().getName()+
				"\n Valor del elmento:"+objeto;
	}
}
