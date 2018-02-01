package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ricetta;
import persistence.DatabaseManager;
import persistence.dao.RicettaDao;

/**
 * Servlet implementation class EditRecipe
 */
@WebServlet("/EditRecipe")
public class EditRecipe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditRecipe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RicettaDao ricettaDao = DatabaseManager.getInstance().getDaoFactory().getRicettaDAO();
		String recipeId = request.getParameter("idRecipe");
		Long id = Long.parseLong(recipeId);
		Ricetta recipe = ricettaDao.findByPrimaryKey(id);
		request.setAttribute("recipe", recipe);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/pages/editRecipe.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
