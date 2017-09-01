/**
 * プログラム名：
 * 作成者： 
 * 作成日： Sat Oct 20 15:29:10 JST 2007
 */
public class ScoreAverageApplet extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ScoreAverageApplet());
	}

	//タートルを動かす処理
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		//各教科の点数を設定する
		int japanese = 49; //国語
		int mathematics = 72; //数学
		int english = 25; //英語
		
		//３教科の合計点を求める
		double total = japanese + mathematics  + english;
		//５教科の平均を求める
		double average = total / 3.0; //平均を計算する
		
		//平均を四捨五入する
		average = average * 10;
		if ((average % 10) >= 5) { //１の位が５以上なら
			average = average + 10; //繰り上げる
		}
		int result = (int) (average / 10);
		
		//四捨五入した平均を表示する
		print(result);
		
	}

}