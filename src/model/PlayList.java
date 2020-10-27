package model;

public class PlayList{

	//Attribute

	public final static String PRIVATE = "private";
	public final static String  = "private";
	public final static String PRIVATE = "private"; 
	private String name;
	private int duration;
	private int typeList;

	//Relations

	private Song[] songs;

	//Methods

	public PlayList(String name, int typeList){

		this.name = name;
		this.duration = 0;

		switch(typeList){
			case 1:
			this.
			break;
			case 2:

			break;
			case 3:

			break;
		}
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getDuration(){
		return duration;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getTypeList(){
		return typeList;
	}

	public void setTypeList(){
		this.typeList = typeList;
	}
}