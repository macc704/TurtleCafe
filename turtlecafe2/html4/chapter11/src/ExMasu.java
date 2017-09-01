/*
 * ì¬ÒFYoshiaki Matsuzawa
 * ì¬“úF2011/12/06
 */
public class ExMasu extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new ExMasu());
	}

	public void start() {
		drawMasu(2, 3, 50);
	}

	void drawMasu(int row, int col, int size) {
		for (int i = 0; i < row; i++) {
			rt(180);
			fd(size);
			lt(180);
			drawRow(col, size);
		}
	}

	void drawRow(int col, int size) {
		for (int i = 0; i < col; i++) {
			drawRect(size);
			rt(90);
			fd(size);
			lt(90);
		}
		lt(90);
		fd(size * col);
		rt(90);
	}

	void drawRect(int size) {
		for (int i = 0; i < 4; i++) {
			fd(size);
			rt(90);
		}
	}
}