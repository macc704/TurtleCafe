import java.util.Scanner;

/*
* プログラム名：累乗計算プログラム 
* 作成者： MegumiAraki 
* 作成日： Tue Dec 04 12:28:06 JST 2007
*/
public class Power01 {
	
	// 起動処理
	public static void main(String[] args) {
		Power01 main = new Power01();
		main.run();
	}
	
	public void run(){
		System.out.println("calculatePower(" + 2 + ", " + 2 + ") = " + calculatePower(2, 2));
		System.out.println("calculatePower(" + 2 + ", " + 3 + ") = " + calculatePower(2, 3));
		System.out.println("calculatePower(" + 2 + ", " + 4 + ") = " + calculatePower(2, 4));
		System.out.println("calculatePower(" + 3 + ", " + 3 + ") = " + calculatePower(3, 3));
	}
	
	// 累乗を計算する
	int calculatePower(int base, int exponent) {
		int power = 1;// 累乗数の初期値を、数の0乗（1）に設定する
		
		// 累乗を計算する
		int i = 0;
		while (i < exponent) {
			power = power * base;
			i++;
		}
		
		return power;
	}
	
}																																																																			