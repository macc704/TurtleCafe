/*
 * 人が歩くアニメーションプログラム
 * 
 * 2003/06/17　Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class WalkingMan extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingMan());
	}

	// タートルを動かす処理
	public void start() {
		hide();
		ImageTurtle man1 = new ImageTurtle("man1.gif");
		ImageTurtle man2 = new ImageTurtle("man2.gif");
		ImageTurtle man3 = new ImageTurtle("man3.gif");
		ImageTurtle man4 = new ImageTurtle("man4.gif");
		ImageTurtle man5 = new ImageTurtle("man5.gif");
		ImageTurtle man6 = new ImageTurtle("man6.gif");
		ImageTurtle man7 = new ImageTurtle("man7.gif");
		ImageTurtle man8 = new ImageTurtle("man8.gif");
		{ // c//1番以外のアニメーション用画像を消す
			man2.hide();
			man3.hide();
			man4.hide();
			man5.hide();
			man6.hide();
			man7.hide();
			man8.hide();
		}
		{ // アニメーションループ
			int i = 0;
			while (true) {
				sleep(0.1);
				{ // 一コマの処理を行う
					if ((i % 8) == 0) {
						man1.looks(man1);
					} else if ((i % 8) == 1) {
						man1.looks(man2);
					} else if ((i % 8) == 2) {
						man1.looks(man3);
					} else if ((i % 8) == 3) {
						man1.looks(man4);
					} else if ((i % 8) == 4) {
						man1.looks(man5);
					} else if ((i % 8) == 5) {
						man1.looks(man6);
					} else if ((i % 8) == 6) {
						man1.looks(man7);
					} else if ((i % 8) == 7) {
						man1.looks(man8);
					}
				}
				i++;
				update();
			}
		}

	}
}