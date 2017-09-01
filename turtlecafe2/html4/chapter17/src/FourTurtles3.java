import java.util.LinkedList;

/*
 * FourTurtles3.java
 * ４匹の亀を動かすプログラム３（LinkedListで管理する）
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FourTurtles3 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles3(), args);
	}

	// タートルを動かす処理
	public void start() {
		// ウインドウの準備
		hide();
		window.setSize(1100, 500);

		// リスト（入れ物）を作る　- JavaライブラリのLinkedList
		LinkedList<Turtle> turtles = new LinkedList<Turtle>();

		// 4匹のカメを生成
		for (int i = 0; i < 4; i++) {
			turtles.add(new Turtle());
		}

		// 初期位置へ移動
		turtles.get(0).warp(100, 100);
		turtles.get(1).warp(100, 200);
		turtles.get(2).warp(200, 100);
		turtles.get(3).warp(200, 200);

		// カメを動かす
		for (int i = 0; i < 360; i++) {
			for (int j = 0; j < 4; j++) {
				turtles.get(j).fd(1);
				turtles.get(j).rt(1);
			}
		}
	}
}
