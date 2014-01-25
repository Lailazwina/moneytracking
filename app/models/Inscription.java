package models;

import java.util.*;

import javax.persistence.Entity;

import play.data.validation.*;
import play.db.jpa.Model;

@Entity
public class Inscription extends Model{
	
	
	@Required public String firstName; 
	@Required public String lastName; 
	@Required @MinSize(6) public String username; 
	@Required @Email public String email; 
	@Required @MinSize(6) public String password; 
	@Required @Equals("password") public String passwordConfirm;
	
    
}

