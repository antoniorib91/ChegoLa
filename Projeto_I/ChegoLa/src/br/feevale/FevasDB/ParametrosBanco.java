package br.feevale.FevasDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ParametrosBanco {
	
	private static String pathParametros;
	
	private Properties parametros;
	private static ParametrosBanco mySelf;

	public static void setPathParametros( String pathParametros ) {
		ParametrosBanco.pathParametros = pathParametros;
	}
	
	public static ParametrosBanco getInstance() {
		
		if( mySelf == null ) {
			mySelf = new ParametrosBanco();
		}
		
		return mySelf;
	}
	
	private ParametrosBanco() {
		
		parametros = new Properties();
		carregaParametros();
	}

	public void setParametro( String chave, String valor ) {
		parametros.put( chave, valor );
	}
	
	public String getParametro( String chave ) {
		return parametros.getProperty( chave );
	}

	public void salvaParametros() throws IOException {

		File file = new File( pathParametros );
		FileOutputStream fos = new FileOutputStream(file);
		parametros.storeToXML( fos, "Este arquivo contém parâmetros" );
	}
	
	private void carregaParametros() {

		File file = new File( pathParametros );
		
		if( file.exists() ) {

			try {
				FileInputStream fis = new FileInputStream( file );
				parametros.loadFromXML( fis );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
