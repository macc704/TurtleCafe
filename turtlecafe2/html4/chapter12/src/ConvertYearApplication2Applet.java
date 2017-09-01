/**
 * 西暦和暦変換プログラム（1レベルをメソッド化）
 * 
 * @author オブプロ例題
 * @version 2.0
 */
public class ConvertYearApplication2Applet extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ConvertYearApplication2Applet());
	}

	// 西暦を和暦に変換する
	// タートルを動かす処理
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		showTitle();
		convertYear();
		showEndTitle();
	}

	// 西暦を和暦に変換する
	void convertYear() {

		int year;
		String japaneseYear;

		// 西暦を入力する
		print("西暦を入力してください\n");
		year = input();

		// 西暦を和暦に変換する
		if (year >= 1989) {
			japaneseYear = "平成" + (year - 1988);
		} else if (year >= 1926) {
			japaneseYear = "昭和" + (year - 1925);
		} else {
			japaneseYear = "不明";
		}

		// 変換結果を出力する
		print(year + "年は" + japaneseYear + "年です.\n");
	}

	// アプリケーションの開始を知らせる
	void showTitle() {
		print("西暦和暦変換プログラムを開始します\n");
	}

	// アプリケーションの終了を知らせる
	void showEndTitle() {
		print("西暦和暦変換プログラムを終了します");
	}

}
