package bt.com.fabricadeprogramador;

import bt.com.fabricadeprogramador.persistencia.entidade.Usuario;
import bt.com.fabricadeprogramador.persistencia.jbdc.usuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
	 testExcluir();
	}
	
	public static void testAlterar() {	
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jõazão da Silva");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		usuarioDAO usuDAO = new usuarioDAO();
		usuDAO.alterar(usu);
	}

	public static void testCadastro() {	
		Usuario usu = new Usuario();
		usu.setNome("Jõazão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		usuarioDAO usuDAO = new usuarioDAO();
		usuDAO.cadastrar(usu);
	}
	public static void testExcluir() {	
		Usuario usu = new Usuario();
		usu.setId(4);
		
		usuarioDAO usuDAO = new usuarioDAO();
		usuDAO.excluir(usu);
	}
}
