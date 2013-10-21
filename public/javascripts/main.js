var Movies = {
	savemovie: function() {
		jsRoutes.controllers.MoviesController.savemovies().ajax({
			data : data,
			action : "POST",
			success: function(data,status) {
				$("#addRow").remove();
				$("#detTable").append(data);
			},
			error : function(data){
				var json = data.responseText;
			    obj = JSON.parse(json);
				alert(obj.name);
			}
		});

	}
}
			