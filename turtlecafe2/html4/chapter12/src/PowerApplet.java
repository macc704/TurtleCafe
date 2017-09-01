/*
 * プログラム名： 
 * 作成者： 
 * 作成日： Tue Dec 04 13:20:29 JST 2007
 */
public class PowerApplet extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new PowerApplet());
	}

	// タートルを動かす処理
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		print("累乗計算プログラムを開始します\n");// アプリケーションの開始を知らせる

		// 底の入力を受け付ける
		print("底を入力してください>>\n");
		int base = input();

		// 指数の入力を受け付ける
		print("指数を入力してください>>\n");
		int exponent = input();

		// 累乗数を計算する
		int calculatedPower = calculatePower(base, exponent);

		// 累乗数を出力する
		print(base + "の" + exponent + "乗は" + calculatedPower + "です。\n");

		print("累乗計算プログラムを終了します\n");// アプリケーションの終了を知らせる
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