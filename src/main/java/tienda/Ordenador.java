package tienda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ordenador {

	double precio;
	String marca;
	PlacaBase placaBase;
	Procesador procesador;
	ArrayList<Ram> listaRam;
	ArrayList<Periferico> listaPerifericos;
	ArrayList<TarjetaGrafica> listaTarjetasGraficas;
	
	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public PlacaBase getPlacaBase() {
		return placaBase;
	}



	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}



	public Procesador getProcesador() {
		return procesador;
	}



	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}



	public List<Ram> getListaRam() {
		return listaRam;
	}



	public void setListaRam(ArrayList<Ram> listaRam) {
		this.listaRam = listaRam;
	}



	public List<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}



	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}



	public ArrayList<TarjetaGrafica> getListaTarjetasGraficas() {
		return listaTarjetasGraficas;
	}



	public void setListaTarjetasGraficas(ArrayList<TarjetaGrafica> listaTarjetasGraficas) {
		this.listaTarjetasGraficas = listaTarjetasGraficas;
	}



	public  double calcularPrecioComponentes(Ordenador ordenador) {
		
		double total = 0;
		double totalRams = 0;
		double totalPerifericos = 0;
		double totalTarjetas = 0;
		
		for (int i = 0; i < listaPerifericos.size() ; i++) {
			totalPerifericos += listaPerifericos.get(i).getPrecio();
		}
		
		for (int i = 0; i < listaTarjetasGraficas.size() ; i++) {
			totalTarjetas += listaTarjetasGraficas.get(i).getPrecio();
		}
		
		for (int i = 0; i < listaRam.size() ; i++) {
			totalRams += listaRam.get(i).getPrecio();
		}
		
		total = totalPerifericos + totalRams + totalTarjetas + procesador.getPrecio()+ placaBase.getPrecio();
		
		return total;
		 
	}
	
	public static String setRandomMarca() {
		String marcaRand;
		String[] marcas = new String[]{"HP","Toshiba","Lenovo","Asus"};
		int rand = (int)(Math.random() * marcas.length-1) + 0;
		marcaRand = marcas[rand];
		
		return marcaRand;		
	};



	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", marca=" + marca + ", placaBase=" + placaBase + ", procesador="
				+ procesador + ", listaRam=" + listaRam + ", listaPerifericos=" + listaPerifericos
				+ ", listaTarjetasGraficas=" + listaTarjetasGraficas + "]";
	}



	
	
	
	
}
