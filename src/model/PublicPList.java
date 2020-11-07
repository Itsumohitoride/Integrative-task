package model;

public class PublicPList extends PlayList{

	//Attribute

	private double calification;
	private int contCalification;
	
	//Methods

	public PublicPList(String namePlay){

		super(namePlay);
		calification = 0;
		contCalification = 0;
	}

	@Override

	public String addSongToPList(Song objSong, User objUser){

		String message = "La cancion se agrego correctamente";
		boolean verific = false;

		verific = true;
		message = super.addSongToPList(objSong,objUser);

		setDuration(getDuration()+objSong.getDuration());

		return message;
	}

	public String addCalification(double calification){

		String message;

		contCalification++;
		setCalification((calification+getCalification())/contCalification);

		message = "Se agrego correctamente la calificacion";

		return message;
	}

	public double getCalification(){
		return calification;
	}

	public void setCalification(double calification){
		this.calification = calification;
	}

	public double getContCalification(){
		return contCalification;
	}

	public void setContCalification(int contCalification){
		this.contCalification = contCalification;
	}
}