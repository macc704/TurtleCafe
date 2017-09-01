import java.util.*;

/**
* プログラム名：成績平均計算プログラム
* 作成者： Megumi Araki
* 作成日： Sat Oct 20 15:11:37 JST 2007
*/
public class ScoreAverage{
	
	//起動処理
	public static void main(String[] args) {
		ScoreAverage main = new ScoreAverage();
		main.run();
	}
	
	//メイン処理
	public void run() {
		
		//各教科の点数を設定する
		int japanese = 49; //国語
		int mathematics = 72; //数学
		int english = 25; //英語
		
		//３教科の合計点を求める
		double total = japanese + mathematics  + english;
		//３教科の平均を求める
		double average = total / 3.0; //平均を計算する
		
		//平均を四捨五入する
		average = average * 10;
		if ((average % 10) >= 5) { //１の位が５以上なら
			average = average + 10; //繰り上げる
		}
		int result = (int) (average / 10);//double型のaverageをint型に型変換して、resultに代入する
		
		//四捨五入した平均を表示する
		System.out.println(result);
		
	}
	
}