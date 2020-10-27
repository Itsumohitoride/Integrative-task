package ui;
import java.util.Scanner;
import model.*;

public class Main{

	//Attribute

	private MCS mcs;
	public final static String YES = "si";
	public final static String NO = "no";
	public final static int NUM_MAX_USERS = 9;

	//Global variable

	public Scanner lector;

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
		System.out.println("* (6) Agragar canciones a una play list  *");
		System.out.println("* (7) Mostrar las play lists registradas *");
		System.out.println("* (0) Salir                              *");
		System.out.println("******************************************");
		option = lector.nextInt();lector.nextLine();

		switch(option){
			case 0:
			System.out.println("***********************************************************************");
			System.out.println("*                Gracias por utilizar nuestro software                 ");
			System.out.println("***********************************************************************");

			break;
			case 1:
			if(msc.getUsers()[N_USERS] != null){
				System.out.println("***********************************************************************");
				System.out.println("              Ya se registro el numero maximo de usuarios              ");
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
			createSong();
			break;
			case 4:
			listSongs();
			break;
			case 5:
			createPlayList();
			break;
			case 6:

			break;
			case 7:

			break;
			default:
			System.out.println("**********************************************************************");
			System.out.println("*                  Opcion invalida, digite de nuevo                  *");
			System.out.println("**********************************************************************");
			break;
		}
		return option;
	}

	public void createMCS(){

		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((((/((((((((((((((((((((((((((((((((");
		System.out.println("(((/  .(((((((*  .((((((*        (((((/      /(((");
		System.out.println("(((/   .((((((.  .(((((   ,((((((((((*  .((((((((");
		System.out.println("(((/    /((((/   .((((/  ,(((((((((((.  /((((((((");
		System.out.println("(((/     ((((*   .((((*  ,(((((((((((/   ((((((((");
		System.out.println("(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((");
		System.out.println("(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((");
		System.out.println("(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((");
		System.out.println("(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((");
		System.out.println("(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((");
		System.out.println("(((/  .((    ((   /((((  .(((((((((((((((((.  /((");
		System.out.println("(((/  .((.  .((.  *((((,  *((((((((((((((((   /((");
		System.out.println("(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((");
		System.out.println("(((/  .((((((((.  *((((((.        *((   .   .((((");
		System.out.println("(((((((((((((((/*/((((((((((///(((((((////(((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("               ./(###((///((###(*                ");
		System.out.println("           *#(,                   *((,           ");
		System.out.println("        ,#/                           ((         ");
		System.out.println("     .#*          .**/////*,.          ((        ");
		System.out.println("     *(.      .//////////////////*       *#      ");
		System.out.println("    .#,     *///////////////////////,     /(     ");
		System.out.println("   /(    *///////////////////////////    .#.     ");
		System.out.println("  ,/////,*/////////////////////////////,*////*.  ");
		System.out.println("  /////////////////////////*,...,/////////////,  ");
		System.out.println("  //////*,,,********,,.............,,,,,//////,  ");
		System.out.println("  //////*.........//*........//*.......,//////,  ");
		System.out.println("  //////*.........,,.........,,........,//////,  ");
		System.out.println("  //////*..............................,//////,  ");
		System.out.println("   *///*  ........,/.........**.......  .*///,   ");
		System.out.println("            .......,/*.....,/*.......            ");
		System.out.println("               ........,,,,.......               ");
		System.out.println("                    .........                    ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");

		mcs = new MCS();
	}

	public void regiterUser(){

		String verific, name, team, password;
		boolean find = true;
		boolean verificTeam = false;
		boolean  verificName = false;
		Category category =  

		do{
			System.out.println("**********************************************************************");
			System.out.println("                          REGISTRO DE USUARIO                          ");
			System.out.println("**********************************************************************\n");

			do{
				System.out.println("Ingrese un nombre o apodo (Sin espacios)");
				name = lector.nextLine();

				find = mcs.findUser(name);

				for(int i = 0; i<name.length && verificName; i++){

					if(name.equalsIgnoreCase("")){
						verificName = true;
					}
				}
				if(verificName){
					System.out.println("El nombre/apodo no debe de contener espacios\n");
				}
				else if(find){
					System.out.println("El usuario ya se encuentra registrado, por favor ingrese otro");
				}	
			}while(find && !verificName);

			System.out.println("Ingrese una contaseña");
			password = lector.nextLine();

			System.out.println("Ingrese la edad del usuario");
			int age = lector.nextInt();
			lector.nextLine();


			if(mcs.getUsers()[NUM_MAX_USERS] != null){
				System.out.println("**********************************************************************");
				System.out.println("           Este es el ultimo usuario que se puede registrar           ");
				System.out.println("**********************************************************************");
				verific = NO;
			}
			else{
				System.out.println("Desea ingresar otro usuario? (Si/No)");
				verific = lector.nextLine();
			}

			mcs.createUsers(name,password,age,genre);
		}while(verific.equalsIgnoreCase(YES));
	}

	public void listUsers(){

		System.out.println("***********************************************************************");
		System.out.println("                          LISTADO DE USUARIOS                          ");
		System.out.println("***********************************************************************\n");

		String message = msc.showUsers();

		System.out.println(message);
	}

	public void createSong(){

		boolean find = true;
		String tittle, releaseDate, artisName, genre;
		int duracion = 0;

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

				find = mcs.findSong(tittle,releaseDate,artisName);

				if(find){
					System.out.println("\nLa cancion ya se encuentra registrada, por favor ingrese otra\n");
				}	
			}while(find);

			System.out.println("Ingrese el genero musical de la cancion");
			genre = lector.nextLine();

			System.out.println("Ingrese la duracion de la cancion");
			duracion = lector.nextLine();

			if(mcs.getUsers()[NUM_MAX_USERS] != null){
				System.out.println("**********************************************************************");
				System.out.println("           Esta es la ultima cancion que se puede registrar           ");
				System.out.println("**********************************************************************");
				verific = NO;
			}
			else{
				System.out.println("Desea ingresar otra cancion? (Si/No)");
				verific = lector.nextLine();
			}

			mcs.addSong(tittle,releaseDate,artisName,genre,duration);
		}while(verific.equalsIgnoreCase(YES));
	}

	public void listSongs(){

		System.out.println("************************************************************************");
		System.out.println("                          LISTADO DE CANCIONES                          ");
		System.out.println("************************************************************************\n");

		String message = msc.showSongs();

		System.out.println(message);
	}

	public void createPlayList(){

		System.out.println("************************************************************************");
		System.out.println("                          CREACION DE PLAYLIST                          ");
		System.out.println("************************************************************************\n");

		do{
			System.out.println("Ingrese el nombre de la playlist");
			namePlay = lector.nextLine();

			find = mcs.findPlayList(name);

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

			typeList = lector.nextInt();

			if(typeList != 1 && typeList != 2 && typeList != 3){
				System.out.println("Opcion invalida, digitela de nuevo");
			}
		}while(typeList != 1 && typeList != 2 && typeList != 3);

		
	}
}