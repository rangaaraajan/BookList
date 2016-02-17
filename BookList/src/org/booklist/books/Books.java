/**
 * 
 */
package org.booklist.books;

/**
 * @author rangaa1990
 *
 */
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Books implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String bookName;
	private double version;
	private String authorName;
	private String language;
	private String releaseDate;
	
	//constructor using Super Class.
	public Books() {
		super();
	}
	
	//Constructor using fields.
	public Books(int id, String bookName, double version, String authorName, String language, String releaseDate) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.version = version;
		this.authorName = authorName;
		this.language = language;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}
	@XmlElement
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getVersion() {
		return version;
	}
	@XmlElement
	public void setVersion(double version) {
		this.version = version;
	}

	public String getAuthorName() {
		return authorName;
	}
	@XmlElement
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getLanguage() {
		return language;
	}
	@XmlElement
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	@XmlElement
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
	
}
