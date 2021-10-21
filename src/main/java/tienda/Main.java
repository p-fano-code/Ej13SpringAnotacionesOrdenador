package tienda;

import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cfg.ConfiguracionSpring;

public class Main {
	
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		Ordenador o1 = context.getBean("ordenador", Ordenador.class);
		System.out.println(o1);
		
	}

}
