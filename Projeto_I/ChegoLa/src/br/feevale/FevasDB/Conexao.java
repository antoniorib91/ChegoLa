package br.feevale.FevasDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private Connection cnx;
	private boolean livre;
	
	public Conexao() throws SQLException {
		ParametrosBanco p = ParametrosBanco.getInstance();
		
		try {
			Class.forName( p.getParametro( "driverJDBC" ) );
			
			cnx = DriverManager.getConnection(
					p.getParametro( "urlBanco" ), 
					p.getParametro( "usuarioBanco" ), 
					p.getParametro( "senhaBanco" ) );
				
				livre = true;

		} catch (ClassNotFoundException e) {
			throw new SQLException( e );
		}
	}

	public void reserva() {
		livre = false;
	}
	
	public void libera() {
		livre = true;
	}
	
	public boolean isLivre() {
		return livre;
	}
	
	public Connection getConnection() {
		return cnx;
	}
}