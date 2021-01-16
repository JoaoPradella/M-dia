package Projeto1;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("O valor de A: ");
		double A = leitor.nextDouble();
		System.out.println("O valor de B: ");
		double B = leitor.nextDouble();
		System.out.println("O valor de C: ");
		double C = leitor.nextDouble();
		System.out.println("O valor de D: ");
		double D = leitor.nextDouble();
		double media1;
		media1 = (A*3 + B*3 + C*2 + D*3) / 11;
		
		System.out.println("A média1 é: " + media1);
		
		System.out.println("O valor de E: ");
		double E = leitor.nextDouble();
		System.out.println("O valor de F: ");
		double F = leitor.nextDouble();
		System.out.println("O valor de G: ");
		double G = leitor.nextDouble();
		System.out.println("O valor de H: ");
		double H = leitor.nextDouble();
		double media2;
		media2 = (E*3 + F*3 + G*2 + H*3) / 11;
		
		System.out.println("A média2 é: " + media2);
		
	    boolean aprovado = (media1 + media2) / 2 >= 8;
	    System.out.println("A média das notas foi " + (media1 + media2) / 2 + ">= 8" + aprovado);
	    
	    boolean examefinal = ((( media1 + media2) / 2) - 10) < 8;
	    System.out.println("Falta para passar " + ((( media1 + media2) / 2) - 10)+ "<  8" + examefinal);
	    
	    
				
	
		
		
		
		
		
		
		
		
	
		
	
		
	}

}
