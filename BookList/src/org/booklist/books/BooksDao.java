/**
 * 
 */
package org.booklist.books;

/**
 * @author rangaa1990
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BooksDao {

	// Get book list.

	public List<Books> getBooksList() {
		List<Books> bookList = null;
		try {
			File file = new File("Book.dat");
			if (!file.exists()) {
				Books book = new Books(1, "Java Programming", 7.0, "Javas Author", "English", "02/16/2016");
				Books book1 = new Books(2, "Java J2EE Techniques", 2.0, "J2EE Author", "English", "02/10/2016");
				Books book2 = new Books(3, "Struts 2", 3.0, "MyOrgCom", "English", "02/01/2016");
				Books book3 = new Books(4, "Spring Framework", 3.0, "OrgSpring", "English", "02/16/2016");
				Books book4 = new Books(5, "Cook Master", 4.0, "Bob Flaye", "English", "01/16/2014");
				Books book5 = new Books(6, "Angular JS", 2.0, "Google Corp", "English", "03/16/2015");
				Books book6 = new Books(7, "Apache Tomcat", 8.0, "Apache Org.", "English", "02/16/2013");
				Books book7 = new Books(8, "Foodie!", 1.0, "Karis Kitchen", "English", "02/28/2015");
				Books book8 = new Books(9, "C", 10.110, "Bell Labs", "English", "07/16/2012");
				Books book9 = new Books(10, "Java Script", 6.023, "W4 ORG", "English", "05/18/2013");

				bookList = new ArrayList<Books>();
				bookList.add(book);
				bookList.add(book1);
				bookList.add(book2);
				bookList.add(book3);
				bookList.add(book4);
				bookList.add(book5);
				bookList.add(book6);
				bookList.add(book7);
				bookList.add(book8);
				bookList.add(book9);

				saveBookList(bookList);

			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				bookList = (List<Books>) ois.readObject();
				ois.close();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		return bookList;
	}

	private void saveBookList(List<Books> bookList) {
		try {
			File file = new File("Book.dat");
			FileOutputStream fos;

			fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bookList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
