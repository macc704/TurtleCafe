import java.util.Scanner;

/**
 * 西暦和暦変換プログラム（1レベルをメソッド化）
 * 
 * @author オブプロ例題
 * @version 2.0
 */
public class ConvertYearApplication2 {

	public static void main(String[] args) {
		ConvertYearApplication2 main = new ConvertYearApplication2();
		main.run();
	}

	Scanner scanner = new Scanner(System.in);

	// 西暦を和暦に変換する
	public void run() {
		showTitle();
		convertYear();
		showEndTitle();
	}

	// 西暦を和暦に変換する
	void convertYear() {

		int year;
		String japaneseYear;

		// 西暦を入力する
		System.out.println("西暦を入力してください");
		year = scanner.nextInt();

		// 西暦を和暦に変換する
		if (year >= 1989) {
			japaneseYear = "平成" + (year - 1988);
		} else if (year >= 1926) {
			japaneseYear = "昭和" + (year - 1925);
		} else {
			japaneseYear = "不明";
		}

		// 変換結果を出力する
		System.out.println(year + "年は" + japaneseYear + "年です.");
	}

	// アプリケーションの開始を知らせる
	void showTitle() {
		System.out.println("西暦和暦変換プログラムを開始します");
	}

	// アプリケーションの終了を知らせる
	void showEndTitle() {
		System.out.println("西暦和暦変換プログラムを終了します");
	}

}
