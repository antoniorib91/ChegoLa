package br.feevale.controle;

import java.sql.SQLException;

import br.feevale.FevasDB.Localizador;
import br.feevale.model.LocalizadorDeUsuario;
import br.feevale.model.Usuario;

public class ControleLogin {
	
	private boolean usuarioOk;
	private String nomeCompleto;
	
	public ControleLogin( String nome, String senha ) {

		usuarioOk = false;
		
		LocalizadorDeUsuario lu = new LocalizadorDeUsuario();
		try {
			Usuario usuario = lu.buscaUsuario( nome );
			
			if( usuario != null && usuario.getInfoSenha().trim().equals( senha ) ) {
				usuarioOk = true;
				nomeCompleto = usuario.getNomeCompleto();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ControleLogin( String nome, String senha, boolean generico ) {

		usuarioOk = false;
		
		Localizador lu = new Localizador( Usuario.class );
		try {
			Usuario usuario = (Usuario) lu.buscaRegistroPorChaveAlternativa( "porNomeLogin", nome );
			
			if( usuario != null && usuario.getInfoSenha().trim().equals( senha ) ) {
				usuarioOk = true;
				nomeCompleto = usuario.getNomeCompleto();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isUsuarioOk() {
		return usuarioOk;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
}