package ui;
import java.util.Scanner;
import model.*;

public class Main{

	//Attribute

	private MCS mcs;
	public final static String YES = "si";
	public final static String NO = "no";
	public final static int NUM_MAX_USERS = 9;
	public final static int FIVE = 5;

	//Global variable

	public Scanner lector;

	/**
	*<b>name:</b> Main <br>
	* Initializes the sccaner and the object mcs <br>
	* <b>post:</b> create an object mcs. <br>
	*/

	public Main(){

		lector = new Scanner(System.in);
		createMCS();
	}

	public static void main(String[] args){

		Main objMain = new Main();
		int option = 0;

		do{
			option = objMain.menu();
		}while(option != 0);
	}

	/**
	*<b>name:</b> menu <br>
	* Select and option to do an action. <br>
	* <b>post:</b> send the option. <br>
	* @return <code>int</code> specifying option is the selecction of the user to do an action.
	*/

	public int menu(){

		int option;

		System.out.println("******************************************");
		System.out.println("*                  MENU                  *");
		System.out.println("******************************************");
		System.out.println("* Que desea hacer?:                      *");
		System.out.println("* (1) Registrar un usuario               *");
		System.out.println("* (2) Mostrar los usuarios registrados   *");
		System.out.println("* (3) Ingresar una cancion               *");
		System.out.println("* (4) Mostrar las canciones registradas  *");
		System.out.println("* (5) Crear una play list                *");
		System.out.println("* (6) Agregar canciones a una play list  *");
		System.out.println("* (7) Mostrar las play lists registradas *");
		System.out.println("* (8) Calificar una play list publica    *");
		System.out.println("* (0) Salir                              *");
		System.out.println("******************************************");
		option = lector.nextInt();lector.nextLine();

		switch(option){
			case 0:
			System.out.println("***********************************************************************");
			System.out.println("*                Gracias por utilizar nuestro software                *");
			System.out.println("***********************************************************************");

			break;
			case 1:
			if(mcs.getUsers()[MCS.N_USERS-1] != null){
				System.out.println("***********************************************************************");
				System.out.println("*             Ya se registro el numero maximo de usuarios             *");
				System.out.println("***********************************************************************");
			}
			else{
				registerUser();
			}
			break;
			case 2:
			listUsers();
			break;
			case 3:
			if(mcs.getSongsPool()[MCS.N_SONG-1] != null){
				System.out.println("***********************************************************************");
				System.out.println("*           Ya se registraron el numero maximo de canciones           *");
				System.out.println("***********************************************************************");
			}
			else{
				createSong();
			}	
			break;
			case 4:
			listSongs();
			break;
			case 5:
			if(mcs.getPlayList()[MCS.N_PLIST-1] != null){
				System.out.println("***********************************************************************");
				System.out.println("*           Ya se registraron el numero maximo de play list           *");
				System.out.println("***********************************************************************");
			}
			else{
				createPlayList();
			}
			break;
			case 6:
			addSongToPList();
			break;
			case 7:
			showPList();
			break;
			case 8:
			addCalification();
			break;
			default:
			System.out.println("**********************************************************************");
			System.out.println("*                  Opcion invalida, digite de nuevo                  *");
			System.out.println("**********************************************************************");
			break;
		}
		return option;
	}

	/**
	*<b>name:</b> createMCS <br>
	* Show and "image" of the MCS and crate an object mcs. <br>
	* <b>post:</b> the object mcs is create. <br>
	*/

	public void createMCS(){

		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("(((((((((((((((((((((((((((/(((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((/  .(((((((*  .((((((*        (((((/      /((((((((((((((");
		System.out.println("((((((((((((((/   .((((((.  .(((((   ,((((((((((*  .(((((((((((((((((((");
		System.out.println("((((((((((((((/    /((((/   .((((/  ,(((((((((((.  /(((((((((((((((((((");
		System.out.println("((((((((((((((/     ((((*   .((((*  ,(((((((((((/   (((((((((((((((((((");
		System.out.println("((((((((((((((/  *  *(((     ((((*  ,((((((((((((,  .((((((((((((((((((");
		System.out.println("((((((((((((((/  /.  ((*     ((((*  *(((((((((((((,   (((((((((((((((((");
		System.out.println("((((((((((((((/  //  ,(  .   ((((*  *((((((((((((((/   /(((((((((((((((");
		System.out.println("((((((((((((((/  *(*  ,  (   ((((*  *((((((((((((((((   /((((((((((((((");
		System.out.println("((((((((((((((/  ,(/    ,(   /(((*  ,(((((((((((((((((   ((((((((((((((");
		System.out.println("((((((((((((((/  .((    ((   /((((  .(((((((((((((((((.  /(((((((((((((");
		System.out.println("((((((((((((((/  .((.  .((.  *((((,  *((((((((((((((((   /(((((((((((((");
		System.out.println("((((((((((((((/  .((((((((.  *(((((   *((((///(((((((/   ((((((((((((((");
		System.out.println("((((((((((((((/  .((((((((.  *((((((.       ((((   .   .(((((((((((((((");
		System.out.println("((((((((((((((((((((((((((/*/((((((((((///(((((((////((((((((((((((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((((((((((((((                    (((((((((((((((((((((((((");
		System.out.println("(((((((((((((((((((                                 (((((((((((((((((((");
		System.out.println("((((((((((((((((          ./(###((///((###(*           ((((((((((((((((");
		System.out.println("(((((((((((((         *#(,                   *((,         (((((((((((((");
		System.out.println("(((((((((((        ,#/                           ((         (((((((((((");
		System.out.println("((((((((((      .#*          .**/////*,.          ((         ((((((((((");
		System.out.println("(((((((((       *(.      .//////////////////*       *#        (((((((((");
		System.out.println("(((((((((      .#,     *///////////////////////,     /(       (((((((((");
		System.out.println("(((((((((     /(    *///////////////////////////    .#.       (((((((((");
		System.out.println("(((((((((    ,/////,*/////////////////////////////,*////*.    (((((((((");
		System.out.println("(((((((((    /////////////////////////*,...,/////////////,    (((((((((");
		System.out.println("(((((((((    //////*,,,********,,.............,,,,,//////,    (((((((((");
		System.out.println("(((((((((    //////*.........//*........//*.......,//////,    (((((((((");
		System.out.println("(((((((((    //////*.........,,.........,,........,//////,    (((((((((");
		System.out.println("(((((((((    //////*..............................,//////,    (((((((((");
		System.out.println("((((((((((    *///*  ........,/.........**.......  .*///,    ((((((((((");
		System.out.println("(((((((((((            .......,/*.....,/*.......            (((((((((((");
		System.out.println("(((((((((((((             ........,,,,.......            ((((((((((((((");
		System.out.println("((((((((((((((((               .........               ((((((((((((((((");
		System.out.println("(((((((((((((((((((                                 (((((((((((((((((((");
		System.out.println("((((((((((((((((((((((((((                    (((((((((((((((((((((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((\n");

		mcs = new MCS();
	}

	/**
	*<b>name:</b> registerUser <br>
	* Create an user. <br>
	* <b>post:</b> save an user. <br>
	*/

	public void registerUser(){

		String verific, name, password, verificName;
		boolean find = true;
		boolean cont; 

		do{
			System.out.println("**********************************************************************");
			System.out.println("                          REGISTRO DE USUARIO                          ");
			System.out.println("**********************************************************************\n");

			do{
				do{
					cont = true;
					System.out.println("Ingrese un nombre o apodo (Sin espacios)");
					name = lector.nextLine();

					find = mcs.findUser(name);

					for(int i = 0; i<name.length() && cont; i++){

						verificName = (name.substring(i,i+1));
						if(verificName.equalsIgnoreCase(" ")){
							System.out.println("El nombre/apodo no debe de contener espacios\n");
							cont = false;
						}
					}
				}while(!cont);	
			}while(find);

			System.out.println("Ingrese una contasenia");
			password = lector.nextLine();

			System.out.println("Ingrese la edad del usuario");
			int age = lector.nextInt();
			lector.nextLine();


			if(mcs.getUsers()[MCS.N_USERS-1] != null){
				System.out.println("**********************************************************************");
				System.out.println("           Este es el ultimo usuario que se puede registrar           ");
				System.out.println("**********************************************************************");
				verific = NO;
			}
			else{
				System.out.println("Desea ingresar otro usuario? (Si/No)");
				verific = lector.nextLine();
			}

			mcs.createUser(name,password,age);
		}while(verific.equalsIgnoreCase(YES));
	}

	/**
	*<b>name:</b> listUsers <br>
	* A list of the users. <br>
	* <b>post:</b> show a list of the users. <br>
	*/

	public void listUsers(){

		System.out.println("***********************************************************************");
		System.out.println("                          LISTADO DE USUARIOS                          ");
		System.out.println("***********************************************************************\n");

		String message = mcs.showUsers();

		System.out.println(message);
	}

	/**
	*<b>name:</b> createSong <br>
	* Create a song. <br>
	* <b>post:</b> save a song. <br>
	*/

	public void createSong(){

		boolean find = true;
		boolean findUser = false;
		String tittle, releaseDate, artisName, verific, name;
		int genre;
		int duration = 0;

		do{

			System.out.println("***********************************************************************");
			System.out.println("                          REGISTRO DE CANCION                          ");
			System.out.println("***********************************************************************\n");

			do{
				System.out.println("Ingrese el titulo de la cancion");
				tittle = lector.nextLine();

				System.out.println("Ingrese la fecha de lanzamiento de la cancion (DD/MM/AA)");
				releaseDate = lector.nextLine();

				System.out.println("Ingrese el nombre del artista o de la banda");
				artisName = lector.nextLine();

				find = mcs.findSong(tittle,artisName);

				if(find){
					System.out.println("\nLa cancion ya se encuentra registrada, por favor ingrese otra\n");
				}	
			}while(find);

			System.out.println("Ingrese el genero musical de la cancion\n");
			System.out.println("*******************");
			System.out.println("* (1) Rock        *");
			System.out.println("* (2) Hip hop     *");
			System.out.println("* (3) Clasica     *");
			System.out.println("* (4) Reggea      *");
			System.out.println("* (5) Salsa       *");
			System.out.println("* (6) Metal       *");
			System.out.println("* (7) Pop         *");
			System.out.println("*******************");
			genre = lector.nextInt();

			System.out.println("Ingrese la duracion de la cancion en segundos");
			duration = lector.nextInt();lector.nextLine();

			do{
				System.out.println("Ingrese el nombre de la persona que registra la cancion");
				name = lector.nextLine();

				findUser = mcs.findUser(name);

				if(!findUser){
					System.out.println("No hay ningun usuario registrado con ese nombre");
				}
			}while(!findUser);

			if(mcs.getSongsPool()[MCS.N_SONG-1] != null){
				System.out.println("**********************************************************************");
				System.out.println("           Esta es la ultima cancion que se puede registrar           ");
				System.out.println("**********************************************************************");
				verific = NO;
			}
			else{
				System.out.println("Desea ingresar otra cancion? (Si/No)");
				verific = lector.nextLine();
			}

			mcs.addSong(name,tittle,releaseDate,artisName,genre,duration);
		}while(verific.equalsIgnoreCase(YES));
	}

	/**
	*<b>name:</b> listSongs <br>
	* A list of the songs. <br>
	* <b>post:</b> show a list of the songs. <br>
	*/

	public void listSongs(){

		System.out.println("************************************************************************");
		System.out.println("                          LISTADO DE CANCIONES                          ");
		System.out.println("************************************************************************\n");

		String message = mcs.showSongs();

		System.out.println(message);
	}

	/**
	*<b>name:</b> createPlayList <br>
	* Create a play list. <br>
	* <b>post:</b> save a play list. <br>
	*/

	public void createPlayList(){

		String namePlay, namePriv, namePublic;
		boolean find = true;
		boolean findUser = false;
		boolean findUserPublic = false;
		boolean findUserShared = false;
		String[] nameShared = new String[FIVE]; 
		int typeList;
		int cont;

		System.out.println("************************************************************************");
		System.out.println("                          CREACION DE PLAYLIST                          ");
		System.out.println("************************************************************************\n");

		do{
			System.out.println("Ingrese el nombre de la playlist");
			namePlay = lector.nextLine();

			find = mcs.findPlayList(namePlay);

			if(find){
				System.out.println("Ya se encuentra creada una lista con ese nombre");
			}
		}while(find);

		do{
			System.out.println("Cual es el tipo de playlist?");

			System.out.println("*******************");
			System.out.println("* (1) Privado     *");
			System.out.println("* (2) Restringido *");
			System.out.println("* (3) Publico     *");
			System.out.println("*******************");

			typeList = lector.nextInt();lector.nextLine();

			if(typeList != 1 && typeList != 2 && typeList != 3){
				System.out.println("Opcion invalida, digitela de nuevo");
			}
		}while(typeList != 1 && typeList != 2 && typeList != 3);

		if(typeList == 1){

			do{
				System.out.println("Ingrese el nombre de la persona que tiene acceso a la play list");
				namePriv = lector.nextLine();

				findUser = mcs.findUser(namePriv);

				if(!findUser){
					System.out.println("No hay ningun usuario registrado con ese nombre");
				}
			}while(!findUser);
			mcs.createPlayList(namePlay,namePriv);
		}
		else if(typeList == 2){

			System.out.println("Ingrese el numero de usuarios que tendran acceso a esta lista");
			cont = lector.nextInt();lector.nextLine();

			for(int i = 0; i<cont; i++){
				do{
					System.out.println("Ingrese el nombre del usuario #"+(i+1)+" que va a tener acceso a la play list");
					nameShared[i] = lector.nextLine();

					findUserShared = mcs.findUser(nameShared[i]);

					if(!findUserShared){
						System.out.println("No hay ningun usuario registrado con ese nombre");
					}
				}while(!findUserShared);
			}
			mcs.createPlayList(namePlay,nameShared,cont);
		}
		else if(typeList == 3){

			do{
				System.out.println("Ingrese el nombre de la persona que crea la play list");
				namePublic = lector.nextLine();

				findUserPublic = mcs.findUser(namePublic);

				if(!findUserPublic){
					System.out.println("No hay ningun usuario registrado con ese nombre");
				}
			}while(!findUserPublic);
			
			mcs.createPlayList(namePlay);
		}
		if(mcs.getPlayList()[MCS.N_PLIST-1] != null){
			System.out.println("**********************************************************************");
			System.out.println("          Esta es la ultima play list que se puede registrar          ");
			System.out.println("**********************************************************************");
		}
	}

	/**
	*<b>name:</b> addSongToPList <br>
	* Add a song to a play list. <br>
	* <b>post:</b> save a song into a play list. <br>
	*/

	public void addSongToPList(){

		String nameList, nameSong, artisName, name, message;
		boolean verific = false;
		boolean verificSong = false;
		boolean verificPermission = false; 
		boolean verificUser = false;

		do{

			System.out.println("Ingrese el nombre de la lista a la que se desea ingresar la cancion");
			nameList = lector.nextLine();

			verific = mcs.findPlayList(nameList);

			if(!verific){
				System.out.println("No hay ninguna play list con ese nombre, ingrese de nuevo");
			}
		}while(!verific);

		do{

			System.out.println("Ingrese el nombre de la cancion que desea agregar (De las canciones del pool)");
			nameSong = lector.nextLine();

			System.out.println("Ingrese el nombre del artista o de la banda");
			artisName = lector.nextLine();

			verificSong = mcs.findSong(nameSong,artisName);

			if(!verificSong){
				System.out.println("No se encontro ninguna cancion del pool, ingrese de nuevo");
			}
		}while(!verificSong);

		do{

			System.out.println("Ingrese el nombre de la persona que esta agregando la cancion");
			name = lector.nextLine();

			verificUser = mcs.findUser(name);

			if(!verificUser){
				System.out.println("No se encontro ningun usuario con ese nomber, ingrese de nuevo");
			}
		}while(!verificUser);

		message = mcs.addSongToPList(nameList,name,nameSong,artisName);

		System.out.println("**********************************************************************");
		System.out.println(message);
		System.out.println("**********************************************************************");
	}

	/**
	*<b>name:</b> showPList <br>
	* A list of the play lists. <br>
	* <b>post:</b> Show a list of the play list. <br>
	*/

	public void showPList(){

		System.out.println("************************************************************************");
		System.out.println("                          LISTADO DE PLAYLIST                           ");
		System.out.println("************************************************************************\n");

		String message = mcs.showPList();

		System.out.println(message);
	}

	/**
	*<b>name:</b> addCalification <br>
	* Add a calification for a public play list. <br>
	* <b>post:</b> save a calification for a public play list. <br>
	*/

	public void addCalification(){

		String name;
		boolean verific = false;
		double calification = 0.0;

		System.out.println("*************************************************************************");
		System.out.println("                      CALIFICAR UNA PUBLIC PLAYLIST                      ");
		System.out.println("*************************************************************************\n");

		do{

			System.out.println("Ingrese el nombre de la play list que se va a calificar");
			name = lector.nextLine();

			verific = mcs.findPlayListPublic(name);

			if(!verific){
				System.out.println("La play list que ingrese no existe o no es publica");
			}
		}while(!verific);

		do{

			System.out.println("Ingrese la calificacion");
			calification = lector.nextDouble();

		}while(calification<0 || calification>5);

		String message = mcs.addCalification(name,calification);

		System.out.println(message);
	}
}