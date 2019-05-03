package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {
	
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
//cenario
			Usuario umUsuario = new Usuario();
//acao
			umUsuario.setNome("Pressman");
			umUsuario.setRa("121212");
		} catch (RuntimeException e) {
//verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComNomeInvalido() {
		try {
//cenario
			Usuario umUsuario = new Usuario();
//acao
			umUsuario.setNome("");
			umUsuario.setRa("121212");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Nome Invalido!", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComNomeNulo() {
		try {
//cenario
			Usuario umUsuario = new Usuario();
//acao
			umUsuario.setNome(null);
			umUsuario.setRa("121212");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Nome Invalido!", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComRaInvalido() {
		try {
//cenario
			Usuario umUsuario = new Usuario();
//acao
			umUsuario.setNome("Pressman");
			umUsuario.setRa("");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("RA Invalido!", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComRaNulo() {
		try {
//cenario
			Usuario umUsuario = new Usuario();
//acao
			umUsuario.setNome("Pressman");
			umUsuario.setRa(null);
		} catch (RuntimeException e) {
//verificacao
			assertEquals("RA Invalido!", e.getMessage());
		}
	}
	
	
	@Test
	public void CT05VerificaObtemNome() {
		//cenario
		Usuario umUsuario = new Usuario();
		try {			
//acao
			umUsuario.setNome("Pressman");
			umUsuario.setRa("121212");
		} catch (RuntimeException e) {
			fail("Nao deve falhar!");
		}
//verificacao
		assertEquals("Pressman", umUsuario.getNome());
	}	

	@Test
	public void CT06VerificaObtemRa() {
		//cenario
		Usuario umUsuario = new Usuario();
		try {			
//acao
			umUsuario.setNome("Pressman");
			umUsuario.setRa("121212");
		} catch (RuntimeException e) {
//verificacao
			fail("Nao deve falhar!");
		}			
		assertEquals("121212", umUsuario.getRa());
		
	}	
	
}
