package tienda;

public class Periferico {

	private String nombre;
	private double precio;
	private String marca;
	
	
	
	public Periferico(String nombre, double precio, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	
	public static String setRandomMarca() {
		String marcaRand;
		String[] marcas = new String[]{"Mars","Logitech","Redragon"};
		int rand = (int)(Math.random() * marcas.length-1) + 0;
		marcaRand = marcas[rand];
		
		return marcaRand;		
	};
	
	@Override
	public String toString() {
		return "Periferico [nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + "]";
	}
	
	
}
