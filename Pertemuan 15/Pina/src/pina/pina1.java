package pina;
import java.util.Scanner;
public class pina1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int nilai1, nilai2, nilai3;
		System.out.println("====================================");
		System.out.println("|     Menentukan Jenis Segitiga    |");
		System.out.println("====================================");
		System.out.print(" Masukkan sisi pertama\t : ");
		nilai1 = input.nextInt();
		System.out.print(" Masukkan sisi kedua\t : ");
		nilai2 = input.nextInt();
		System.out.print(" Masukkan sisi ketiga\t : ");
		nilai3 = input.nextInt();
		//Sistem Pemilihan Bersarang
		if ((nilai1 == 0) || (nilai2 == 0) || (nilai3 == 0)){
			System.out.println(" KET : BUKAN SEGITIGA ");
		} else {
			if ((nilai1 == nilai2) && (nilai1 == nilai3)){
				System.out.println(" KET\t : SEGITIGA SAMA SISI ");
			} else if ((nilai1 == nilai2 || nilai2 == nilai3 || nilai1 == nilai3)){
				System.out.println(" KET\t : SEGITIGA SAMA KAKI ");
			} else {
				System.out.println(" KET\t : SEGITIGA SEMBARANG");

			}
		}
	}
}
