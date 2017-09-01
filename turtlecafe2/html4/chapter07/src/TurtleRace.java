import java.util.ArrayList;

/*
 * TurtleRace.java
 * Created on 2011/11/15
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/**
 * @author macchan
 */
public class TurtleRace extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TurtleRace());
	}

	// タートルを動かす処理
	public void start() {

		hide();
		int numOfTurtles = 3;

		ArrayList<Turtle> turtles = new ArrayList<Turtle>();

		// タートル達を作成する
		for (int i = 0; i < numOfTurtles; i++) {
			Turtle turtle = new Turtle();
			turtles.add(turtle);
		}

		// タートル達を順序良く並べる
		int size = turtles.size();
		for (int i = 0; i < size; i++) {
			Turtle turtle = turtles.get(i);
			turtle.bk(30 * i);
		}

		// タートル達を右向きに
		for (int i = 0; i < size; i++) {
			turtles.get(i).rt(90);
		}

		// タートルたちをスタート位置へ
		for (Turtle turtle : turtles) {
			turtle.fd(20);
		}

		// 「用意！スタート！」を演出する
		sleep(1);// 1秒待つ

		// レースをする
		for (int i = 0; i < 100; i++) {
			for (Turtle turtle : turtles) {
				turtle.fd(random(5));
			}
		}
	}
}
