package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import handler.WebHandler;
import model.Pokemon;
import model.ResultAll;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ResultAll resultAll;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String op = request.getParameter("op");

		switch (op) {
		case "inicio": {
			WebHandler webHandler = new WebHandler("https://pokeapi.co/api/v2/pokemon-species?limit=1010");
			resultAll = webHandler.getResult();
			setFotos();
			request.setAttribute("pokemons", resultAll.getPokemons());
			request.getRequestDispatcher("page.jsp").forward(request, response);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}

	private void setFotos() {
		for (Pokemon pokemon : resultAll.getPokemons()) {
			String foto = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
			String[] trozosfoto = pokemon.getUrl().split("/");
			foto += trozosfoto[trozosfoto.length - 1] + ".png";
			pokemon.setFoto(foto);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}