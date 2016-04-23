package br.feevale.FevasDB;

import java.sql.SQLException;
import java.util.ArrayList;

public class PoolDeConexoes {
	
	private ArrayList<Conexao> listaConexoes;
	private static PoolDeConexoes mySelf;
	
	private PoolDeConexoes() {
		listaConexoes = new ArrayList<Conexao>();
	}
	
	public static PoolDeConexoes getInstance() {
		if( mySelf == null ) {
			mySelf = new PoolDeConexoes();
		}
		
		return mySelf;
	}
	
	public synchronized Conexao getConexao() throws SQLException {

		for( Conexao c : listaConexoes ) {
			
			if( c.isLivre() ) {
				c.reserva();
				return c;
			}
		}
		
		Conexao cnx = new Conexao();
		cnx.reserva();
		listaConexoes.add( cnx );
		
		return cnx;
	}
}














