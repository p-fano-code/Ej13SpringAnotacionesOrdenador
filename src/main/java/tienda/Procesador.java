package tienda;

public class Procesador {

	private double precio;
	private double hz;
	private String marca;
	private TarjetaGrafica tarjetaIntegrada;
	
	
	
	public Procesador(double precio, double hz, String marca, TarjetaGrafica tarjetaIntegrada) {
		this.precio = precio;
		this.hz = hz;
		this.marca = marca;
		this.tarjetaIntegrada = tarjetaIntegrada;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getHz() {
		return hz;
	}
	public void setHz(double hz) {
		this.hz = hz;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public TarjetaGrafica getTarjetaIntegrada() {
		return tarjetaIntegrada;
	}
	public void setTarjetaIntegrada(TarjetaGrafica tarjetaIntegrada) {
		this.tarjetaIntegrada = tarjetaIntegrada;
	}
	
	public static String setRandomMarca() {
		String marcaRand;
		String[] marcas = new String[]{"Intel","AMD"};
		int rand = (int)(Math.random() * marcas.length-1) + 0;
		marcaRand = marcas[rand];
		
		return marcaRand;		
	};
	
	@Override
	public String toString() {
		return "Procesador [precio=" + precio + ", hz=" + hz + ", marca=" + marca + ", tarjetaIntegrada="
				+ tarjetaIntegrada + "]";
	}
	
	
}
