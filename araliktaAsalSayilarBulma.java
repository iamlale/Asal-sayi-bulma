// verilen araliktaki asal sayilari bulma 
import java.util.Scanner;
public class araliktaAsalSayilarBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("araligin baslangic sayisini giriniz : ");
		int baslangic=input.nextInt();
		System.out.print("araligin son sayisini giriniz :  ");
		int son=input.nextInt();
		int count=0;
		boolean asalMi=true;
		
		if (baslangic<2) {
			baslangic=2;
		}
		
		for (int i=baslangic; i<son+1; i++ ) {
			for (int j=2; j<i; j++) {
				if (i%j==0) {	
					asalMi=false;
				}
			}
			if (asalMi) {
				System.out.print(i+" ");
				count++;
			}
			else {
				asalMi=true;
			}
		}
		System.out.println("asal sayi sayisi : "+count);
	}
}
