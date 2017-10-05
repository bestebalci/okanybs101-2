package okan4;

import java.util.Scanner;

public class hesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double senelikf ;
		double borc ;
		int kacsene ;
		double aylikf ;
		double toplamb ;
		double ayliko ;
		
		
	    Scanner input = new Scanner (System.in);
		System.out.print("faiz oraný girin: ");
		senelikf = input.nextDouble();
		System.out.print("kac sene borc istersiniz");
		kacsene = input.nextInt();
		System.out.print("kac para borc istersiniz");                           
		borc = input.nextDouble();
		aylikf = senelikf / 1200;
		
		ayliko = borc * aylikf / (1
				-1 / Math.pow(1 +aylikf, kacsene * 12));
		toplamb = ayliko * kacsene *12;
		
		System.out.println("aylik odemeniz = " + ayliko);
		System.out.println("toplam borcunuz =" + toplamb);
		
		System.out.println("aylik odemeniz = " + String.format("%.2f", ayliko));
		System.out.println("toplam borcunuz = " + String.format("%.2f", toplamb));
		
		
	
		

	}

}
