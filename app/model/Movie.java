package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import play.db.ebean.Model;

@Entity
@Table(name="movies")
public class Movie extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 856227185802047288L;
	
	@Id
	public String Id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="language")
	public String language;
	
	@Column(name="type")
	public String type;

}
