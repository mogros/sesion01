package sesion01;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mund o");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("cual es tu nnombre");
		
		String nombre=sc.nextLine();
		System.out.println("Hola "+nombre);
		
		sc.close();
	}

}

