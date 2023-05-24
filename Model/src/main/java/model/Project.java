package model;

import java.util.ArrayList;

import javax.json.JsonObject;

public final class Project {

	private int criteria1;
	private int criteria2;
	private String criteria3;
	private String criteria4;
	private String criteria5;
	private String criteria6;
	
	public Project(JsonObject bigProject) {
		this.criteria1 = bigProject.getInt("");
		this.criteria2 = bigProject.getInt("");
		this.criteria3 = bigProject.getString("");
		this.criteria4 = bigProject.getString("");
		this.criteria5 = bigProject.getString("");
		this.criteria6 = bigProject.getString("");
	}
	

		
		
}
