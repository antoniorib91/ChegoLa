package br.feevale.controle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.feevale.FevasDB.ParametrosBanco;

public class NossoListenerDeContexto implements ServletContextListener {

	@Override
	public void contextInitialized( ServletContextEvent evt ) {
		
		System.out.println( "Iniciando o Contexto" );
		
		String path = evt.getServletContext().getInitParameter( "caminhoDosParametros" );
		if( path == null ) {
			path = evt.getServletContext().getRealPath( "/WEB-INF/parametrosSGBD.xml" );
		}

		ParametrosBanco.setPathParametros( path );
		
		System.out.println( "Parametros localizados em: " + path );
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		System.out.println( "Finalizando o Contexto" );
	}
}