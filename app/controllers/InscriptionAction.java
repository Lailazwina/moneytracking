package controllers;

import models.*;
import play.*;
import play.mvc.*;
import java.util.*;
import play.data.validation.*;

public class InscriptionAction  extends Application{
	
	public static void index()
	{
		render();
	}
	
	public static void handleSubmit(@Valid Inscription user)
	{
		if(validation.hasErrors())
		{
			render("@index",user);
		}
		
		render(user);
	}
//	public static void save(Inscription user) {
//	    user.save(); // ok with 1.0.1
//	}

}
