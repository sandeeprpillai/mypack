package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.collections.movies;

public class Movies extends Controller {
	
	public static Result loadmoviepage() {
		return ok(movies.render());
	}

}
