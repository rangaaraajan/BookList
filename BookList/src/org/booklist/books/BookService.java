/**
 * 
 */
package org.booklist.books;

/**
 * @author rangaa1990
 *
 */
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/BookService")
public class BookService {

	BooksDao bookDao = new BooksDao();
	
	@GET
	@Path("/books")
	@Produces(MediaType.APPLICATION_XML)
	public List<Books> getBooks()
	{
		return bookDao.getBooksList();
	}
}
