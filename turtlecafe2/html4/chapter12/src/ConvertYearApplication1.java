import java.util.Scanner;

/**
 * 西暦和暦変換プログラム（メソッドなし）
 * 
 * @author オブプロ例題
 * @version 1.0
 */
public class ConvertYearApplication1 {

	public static void main(String[] args) {
		ConvertYearApplication1 main = new ConvertYearApplication1();
		main.run();
	}

	// 西暦を和暦に変換する
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		{// アプリケーションの開始を知らせる
		System.out.println("西暦和暦変換プログラムを開始します");
		}

		{// 西暦を和暦に変換する
			int year;
			String japaneseYear;

			{// 西暦を入力する
			System.out.println("西暦を入力してください");
			year = scanner.nextInt();
			}

			{// 西暦を和暦に変換する
			if (year >= 1989) {
				japaneseYear = "平成" + (year - 1988);
			} else if (year >= 1926) {
				japaneseYear = "昭和" + (year - 1925);
			} else {
				japaneseYear = "不明";
			}
			}

			{// 変換結果を出力する
			System.out.println(year + "年は" + japaneseYear + "年です.");
			}
		}

		{// アプリケーションの終了を知らせる
		System.out.println("西暦和暦変換プログラムを終了します");
		}
	}
}																