package cfg;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tienda.Ordenador;
import tienda.Periferico;
import tienda.PlacaBase;
import tienda.Procesador;
import tienda.Ram;
import tienda.TarjetaGrafica;

@Configuration
public class ConfiguracionSpring {

	
	
	
	//Creacion d las RAMS
	@Bean(value="ramDedicada")
	public Ram ramDedicada() {	
		int randSmall = (int)(Math.random() * 50) + 20;
		Ram ramDedicada = new Ram(randSmall, 1.2, "Primera");
		return ramDedicada;		
	}
	
	@Bean(value="ramIntegrada")
	public Ram ramIntegrada() {
		int randSmall = (int)(Math.random() * 50) + 20;
		Ram ramIntegrada = new Ram(randSmall, 2.4, "Segubnda");
		return ramIntegrada;		
	}
	
	@Bean(value="ramOrdenador")
	public Ram ramOrdenador() {
		int randSmall = (int)(Math.random() * 50) + 20;
		Ram ramPc = new Ram(randSmall, 3.2, "Tercera");
		return ramPc;		
	}
	
	//Creacion de las Graficas
	@Bean(value="graficaIntegrada")
	public TarjetaGrafica graficaIntegrada(@Qualifier("ramIntegrada") Ram ram) {
		int randSmall = (int)(Math.random() * 50) + 20;
		TarjetaGrafica integrada = new TarjetaGrafica(randSmall, TarjetaGrafica.setRandomMarca(),ram, "Ultra Durable");
		return integrada;		
	}
	
	@Bean(value="graficaDedicada")
	public TarjetaGrafica graficaDedicada(@Qualifier("ramDedicada") Ram ram) {
		int randBig = (int)(Math.random() * 200) + 50; 
		TarjetaGrafica dedicada = new TarjetaGrafica(randBig, TarjetaGrafica.setRandomMarca(),ram, "Gaming Ultra");
		return dedicada;		
	}
	
	@Bean(value="raton")
	public Periferico raton() {
		int randSmall = (int)(Math.random() * 50) + 20;
		Periferico raton = new Periferico("raton", randSmall, Periferico.setRandomMarca());
		return raton;		
	}
	
	//Creacion del procewador
	@Bean
	public Procesador procesador (@Qualifier("graficaIntegrada") TarjetaGrafica integrada) {
		int randBig = (int)(Math.random() * 200) + 50; 
		Procesador procesador = new Procesador(randBig, 3.4, Procesador.setRandomMarca(), integrada);	
		return procesador;
	}
	
	//Creacion de la placa base
	@Bean
	public PlacaBase placaBase() {
		int randBig = (int)(Math.random() * 200) + 50; 
		PlacaBase placa = new PlacaBase(randBig, PlacaBase.setRandomMarca(), "Ultra Durable 1000");	
		return placa;
	}
	
	//Creacion Listas
	//lista de rams
	@Bean
	public ArrayList<Ram> listaRams(@Qualifier("ramDedicada") Ram dedicada,
									@Qualifier("ramIntegrada") Ram integrada,
									@Qualifier("ramOrdenador") Ram ramOrdenador){
		ArrayList<Ram> listaRams = new ArrayList<>();
		listaRams.add(dedicada);
		listaRams.add(integrada);
		listaRams.add(ramOrdenador);
		return listaRams;
		
	}
	//listaPerifericos
	@Bean
	public ArrayList<Periferico> listaPerifericos(@Qualifier("raton") Periferico raton){
		ArrayList<Periferico> listaPerifericos = new ArrayList<>();
		listaPerifericos.add(raton);
	
		return listaPerifericos;
		
	}
	
	//lista de graficas
	@Bean
	public ArrayList<TarjetaGrafica> listaGraficas(@Qualifier("graficaDedicada") TarjetaGrafica dedicada,
												   @Qualifier("graficaIntegrada") TarjetaGrafica integrada){
		ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList<>();
		listaTarjetas.add(dedicada);
		listaTarjetas.add(integrada);
	
		return listaTarjetas;
		
	}
	
	@Bean
	public Ordenador ordenador(PlacaBase placa, Procesador procesador, 
								ArrayList<Ram> listaRam,
								ArrayList<Periferico> lisPerifericos,
								ArrayList<TarjetaGrafica> listaTarjetasGraficas ) {
		Ordenador pc = new Ordenador();
		pc.setMarca(Ordenador.setRandomMarca());
		pc.setProcesador(procesador);
		pc.setPlacaBase(placa);
		pc.setListaRam(listaRam);
		pc.setListaPerifericos(lisPerifericos);
		pc.setListaTarjetasGraficas(listaTarjetasGraficas);
		pc.setPrecio(pc.calcularPrecioComponentes(pc));
		return pc;
		
	}
	
	
}
