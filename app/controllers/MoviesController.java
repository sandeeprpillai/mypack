package controllers;

import java.util.List;

import models.Movie;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.collections.movies;

public class MoviesController extends Controller {
	
	public static Result loadmoviepage() {
		List<Movie> movie = Movie.find.findList();
		return ok(movies.render(movie));
	}
	
	public static Result addmovies() {
		return ok();
	}
	
	public static Result savemovies() {
		return ok();
	}

}
