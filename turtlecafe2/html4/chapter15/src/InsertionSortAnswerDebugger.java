import java.awt.Color;

/*
 * プログラム名：挿入法のテンプレート 
 * 作成者： Yoshiaki Matsuzawa
 * 作成日： 2012/01/17
 */
public class InsertionSortAnswerDebugger extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new InsertionSortAnswerDebugger(), args);
	}

	public void start() {
		hide();
		window.size(550, 400);

		// カードの束を作る
		ListTurtle<CardTurtle> 未処理束 = new ListTurtle<CardTurtle>(true, "未処理束");
		ListTurtle<CardTurtle> 並替済束 = new ListTurtle<CardTurtle>(true, "並替済束");
		未処理束.warpByTopLeft(50, 90);
		未処理束.setBgColor(new Color(51, 102, 255));
		並替済束.warpByTopLeft(50, 230);
		並替済束.setBgColor(new Color(255, 255, 0));
		update();

		// カードを8枚作り、未処理束に入れる
		for (int i = 0; i < 8; i++) {
			未処理束.addLast(new CardTurtle(random(100)));
			update();
		}
		並替済束.addLast(new CardTurtle(999));// 魔法のスパイス
		update();

		// 以下，挿入法のプログラムを書く
		while (未処理束.getSize() > 0) {
			並替済束.setCursor(0);
			update();
			while (並替済束.getObjectAtCursor().getNumber() < 未処理束
					.getObjectAtCursor().getNumber()) {
				並替済束.moveCursorToNext();
				update();
			}
			並替済束.addToCursor(未処理束.getObjectAtCursor());
			update();
		}

		update();
	}

}