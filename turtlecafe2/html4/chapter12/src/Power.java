import java.util.Scanner;

/*
 * プログラム名：累乗計算プログラム 
 * 作成者： MegumiAraki 
 * 作成日： Tue Dec 04 12:28:06 JST 2007
 */
public class Power {

	// 起動処理
	public static void main(String[] args) {
		Power main = new Power();
		main.run();
	}

	// メイン処理
	public void run() {
		System.out.println("累乗計算プログラムを開始します");// アプリケーションの開始を知らせる

		Scanner scanner = new Scanner(System.in);// 入力を受け付けるスキャナーを作る

		// 底の入力を受け付ける
		System.out.println("底を入力してください>>");
		int base = scanner.nextInt();

		// 指数の入力を受け付ける
		System.out.println("指数を入力してください>>");
		int exponent = scanner.nextInt();

		// 累乗数を計算し、計算結果をcalculatedPowerという変数に書き込む
		int calculatedPower = calculatePower(base, exponent);

		// 累乗数を出力する
		System.out.println(base + "の" + exponent + "乗は" + calculatedPower
				+ "です。");

		System.out.println("累乗計算プログラムを終了します");// アプリケーションの終了を知らせる
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