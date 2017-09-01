/*
 * プログラム名：グライダー銃 
 * 作成者： 大嶽寛晃
 * 作成日： Sun Dec 18 18:05:03 JST 2011
 */
public class Glider extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Glider());
	}

	// タートルを動かす処理
	public void start() {
		window.setKameSpeed("no kame"); // 初期状態をノーカメに
		window.setSize(480, 400); // windowサイズの変更
		hide(); // カメを隠す

		int cellCount = 38;
		CellTurtle taro = new CellTurtle(10);
		int count = 0;

		drawstart(taro);

		Liferule(taro, cellCount, count);
	}

	void Liferule(CellTurtle taro, int cellCount, int count) { // 生存規則

		while (true) {
			sleep(0.025);
			taro.beginNextTurn();
			for (int j = 0; j < cellCount; j++) {
				for (int i = 0; i < cellCount; i++) {
					count = cellcounter(taro);
					if (!taro.isMarked() && count == 3) {
						taro.flip(5);
					}
					if (taro.isMarked() && count <= 1) {
						taro.flip(5);
					}
					if (taro.isMarked() && count >= 4) {
						taro.flip(5);
					}
					taro.fd(1);
				}// for
				taro.bk(cellCount);
				taro.right();
			}// for
			taro.left(cellCount);
		}// while

	}

	void drawstart(CellTurtle taro) {
		// 初期図形を描く

		taro.right(2); // 1行目
		taro.fd(26);
		taro.mark();
		taro.bk(26);

		taro.right(1); // 2行目
		taro.fd(24);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.bk(26);

		taro.right(1); // 3行目　以下同様
		taro.fd(14);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(7);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(13);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(37);

		taro.right(1);
		taro.fd(13);
		taro.mark();
		taro.fd(4);
		taro.mark();
		taro.fd(5);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(13);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(37);

		taro.right(1);
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(9);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(4);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(23);

		taro.right(1);
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(9);
		taro.mark();
		taro.fd(4);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(5);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.bk(26);

		taro.right(1);
		taro.fd(12);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(8);
		taro.mark();
		taro.bk(26);

		taro.right(1);
		taro.fd(13);
		taro.mark();
		taro.fd(4);
		taro.mark();
		taro.bk(17);

		taro.right(1);
		taro.fd(14);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(15);

		taro.left(11);

	}

	int cellcounter(CellTurtle taro) {// 周囲の黒セルの数を数える

		int count = 0;

		if (taro.isMarked(1)) {
			count++;
		}
		if (taro.isMarked(2)) {
			count++;
		}
		if (taro.isMarked(3)) {
			count++;
		}
		if (taro.isMarked(4)) {
			count++;
		}
		if (taro.isMarked(6)) {
			count++;
		}
		if (taro.isMarked(7)) {
			count++;
		}
		if (taro.isMarked(8)) {
			count++;
		}
		if (taro.isMarked(9)) {
			count++;
		}
		return count;
	}

}