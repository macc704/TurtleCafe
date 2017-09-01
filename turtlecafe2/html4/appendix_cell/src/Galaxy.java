/*
 * プログラム名：Galaxy 
 * 作成者： 大嶽寛晃
 * 作成日： Sun Dec 18 18:45:10 JST 2011
 */
public class Galaxy extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Galaxy());
	}

	// タートルを動かす処理
	public void start() {
		window.setKameSpeed("no kame"); // 初期状態をノーカメに
		window.setSize(170, 220); // windowサイズの変更
		hide(); // カメを隠す

		int cellCount = 15;
		CellTurtle taro = new CellTurtle(10);
		int count = 0;

		drawstart(taro);

		Liferule(taro, cellCount, count);
	}

	void Liferule(CellTurtle taro, int cellCount, int count) { // 生存規則

		while (true) {
			sleep(0.4);
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

		taro.right(3); // 1行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 2行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 3行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(4);

		taro.right(1); // 4行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 5行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 6行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(6);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 7行目
		taro.fd(10);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 8行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

		taro.right(1); // 9行目
		taro.fd(3);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.fd(2);
		taro.mark();
		taro.fd(1);
		taro.mark();
		taro.bk(11);

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