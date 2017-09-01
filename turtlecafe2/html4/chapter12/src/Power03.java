import java.util.Scanner;

/*
* プログラム名：累乗計算プログラム 
* 作成者： MegumiAraki 
* 作成日： Tue Dec 04 12:28:06 JST 2007
*/
public class Power03 {
	
	// 起動処理
	public static void main(String[] args) {
		Power03 main = new Power03();
		main.run();
	}
	
	public void run(){
		test(2, 2, 4);
		test(2, 3, 8);
		test(2, 4, 16);
		test(3, 3, 27);
	}
	
	void test(int base, int exp, int expected) {
		int answer = calculatePower(base,exp);
		String result = "";
		if(answer == expected){
			result = "PASS";
		}else{
			result = "FAIL";
		}
		System.out.println("calculatePower(" + base + ", " + exp + ") = " + answer + ", 判定: " + result);
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