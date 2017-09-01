/*
* WalkingMan2.java
* 人が歩くアニメーションプログラム (List使用版)
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class WalkingMan2 extends Turtle {
	
	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingMan2(), args);
	}
	
	// タートルを動かす処理
	public void start() {
		hide();
		window.setSize(1100,500);
		ListTurtle<ImageTurtle> holder = new ListTurtle<ImageTurtle>(true);
		holder.warpByTopLeft(50,200);
		{	//アニメーション用画像を用意する
			int i = 1;
			while(i <= 8){
				holder.addLast(new ImageTurtle((("man" + i) + ".gif")));
				i++;
			}
		}
		Turtle man = new Turtle();
		while(true){
			sleep(0.1);
			{	//1コマの処理
				holder.moveCursorToNext();
				man.looks(holder.getObjectAtCursor());
			}
			update();
		}
	}
}