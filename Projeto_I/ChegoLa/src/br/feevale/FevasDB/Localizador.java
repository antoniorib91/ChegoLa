package br.feevale.FevasDB;

import java.util.List;

public class Localizador {
	
	private Class<?> infoClasse;
	
	public Localizador( Class<?> infoClasse ) {
		this.infoClasse = infoClasse;
	}
	
	/* Para fazer este m�todo, use como modelo o m�todo buscaUsuario( String nomeLogin ) 
	 * na classe LocalizadorDeUsuario, e o arquivo telaInicial.jsp
	 */
	public Object buscaRegistroPorChaveAlternativa( String nomeChave, Object... chaves ) {
		
		for( int i = 0; i < chaves.length; i++ ) {
			System.out.println( chaves[ i ] );
		}
		return null;
	}

	/* Para fazer este m�todo, use como modelo o m�todo buscaUsuario( Integer idUsuario ) 
	 * na classe LocalizadorDeUsuario, e o arquivo telaInicial.jsp
	 */
	public Object buscaRegistro( Object... chaves ) {
		return null;
	}

	public Object buscaRegistroOrThrow( Object... chaves ) throws FevasDBException {
		
		Object result = buscaRegistro( chaves );
		
		if( result == null ) {
			throw new FevasDBException( "Registro n�o encontrado" );
		}

		return result;
	}
	
	/* Para fazer este m�todo, use como modelo o m�todo getUsuarios() 
	 * na classe LocalizadorDeUsuario, e o arquivo telaInicial.jsp
	 */
	public List<?> getRegistros( String condicao ) {
		return null;
	}
}