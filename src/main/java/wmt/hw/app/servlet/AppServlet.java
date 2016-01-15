package wmt.hw.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wmt.hw.app.domain.Item;
import wmt.hw.app.service.ProductService;
import wmt.hw.app.service.ProductServiceImpl;

/**
 * @author lakshmiganesh
 *
 */
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String QUERY_PARAM = "query";
	private ProductService productService = new ProductServiceImpl();

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		writeDocumentStart(response);
		writeSearchForm(response);
		String query = request.getParameter(QUERY_PARAM);
		if (query != null) {
			for (Item item : productService.getProductRecommendationsByRating(query)) {
				writeResults(item, response);
			}
		}
		writeDocumentEnd(response);

	}

	/**
	 * @param response
	 * @throws IOException
	 */
	private void writeDocumentStart(HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>")
		.append("<body>")
		.append("<h1> Wal-Mart Product Search </h1>");
		response.getWriter().println(sb.toString());
	}

	/**
	 * @param response
	 * @throws IOException
	 */
	private void writeSearchForm(HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<form action='/wmt-hw-app'>")
		.append("<input type='text' name='" + QUERY_PARAM + "'/>")
		.append("<input type='submit' value='Search'>")
		.append("</form>")
		.append("<br/>");
		response.getWriter().println(sb.toString());
	}

	/**
	 * @param response
	 * @throws IOException
	 */
	private void writeDocumentEnd(HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("</body>").append("</html>");
		response.getWriter().println(sb.toString());
	}
	
	/**
	 * @param item
	 * @param response
	 * @throws IOException
	 */
	private void writeResults(Item item, HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("<h2>%s</h2>", item.getName()))
		.append(String.format("<h3>%s</h3>", item.getShortDescription()))
		.append(String.format("$%1$,.2f<br/>", item.getSalePrice()))
		.append(String.format("<img src='%s'><br/>", item.getThumbnailImage()))
		.append(String.format("<img src='%s'><br/>", item.getCustomerRatingImage()));
		response.getWriter().println(sb.toString());
	}
	
}
