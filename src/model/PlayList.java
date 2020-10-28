package model;

public class PlayList{

	//Attribute

	private String name;
	private int duration;
	private int typeList;

	//Relations

	private Song[] songs;

	//Methods

	public PlayList(String name){

		this.name = name;
		this.duration = 0;
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

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getTypeList(){
		return typeList;
	}

	public void setTypeList(int typeList){
		this.typeList = typeList;
	}
}