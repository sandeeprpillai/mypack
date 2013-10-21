package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
@Table(name="movies")
public class Movie extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 856227185802047288L;
	
	@Id
	public Long Id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="language")
	public String language;
	
	@Column(name="type")
	public String type;
	
	public static final Finder<Long, Movie> find = new Finder<Long, Movie>(Long.class, Movie.class);
}
