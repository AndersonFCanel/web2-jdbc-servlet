package com.suam.acao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suam.bean.Usuario;
import com.suam.service.UsuarioService;



public class NovoUsuario implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("A��O = INSERINDO USUARIO");
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String endereco = request.getParameter("endereco");
		String senha = request.getParameter("senha");
		String login = request.getParameter("login");
		String data = request.getParameter("data");
		String ehAdm = request.getParameter("ehAdm");
		
		/*Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}*/

		
		Usuario usuario = new Usuario();
				
		usuario.setNome(nome);
		usuario.setSobrenome(sobrenome);
		usuario.setEndereco(endereco);
		usuario.setSenha(senha);
		usuario.setLogin(login);
		usuario.setDataNascimento(data);
		usuario.setIsAdm(ehAdm);

		
		UsuarioService us = new UsuarioService();
		try {
			us.inserir(usuario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return "redirect:entrada?acao=ListaUsuario";

	}
}
