package com.suam.acao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suam.bean.Usuario;
import com.suam.service.UsuarioService;



public class RemoveUsuario  implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("A��O = REMOVENDO USUARIO");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Usuario usuario = null;
		try {
			usuario = UsuarioService.buscaUsuarioPelaId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			UsuarioService.delete(usuario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//request.setAttribute("usuario",usuario);
		return "redirect:usuarioDeletado.html";
	}
}
