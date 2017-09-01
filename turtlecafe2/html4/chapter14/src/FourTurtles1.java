/*
* FourTurtles.java
* ４匹の亀を動かすプログラム１（ListTurtle＋カーソルで管理する）
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class FourTurtles1 extends Turtle {
	
	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles1(), args);
	}
	
	// タートルを動かす処理
	public void start() {
		hide();
		window.setSize(1100,500);
		ListTurtle<Turtle> turtles = new ListTurtle<Turtle>();
		turtles.warpByTopLeft(100,300);
		{	//c//タートルを4匹作成する
			int i = 0;
			while(i < 4){
				turtles.add(new Turtle());
				i++;
			}
		}
		{	//c//初期位置に移動する
			turtles.get(0).warp(100,100);
			turtles.get(1).warp(100,200);
			turtles.get(2).warp(200,100);
			turtles.get(3).warp(200,200);
		}
		{	//for
			int i = 0;
			while(i < 360){
				{	//for
					int j = 0;
					while(j < 4){
						{	//一コマの処理
							turtles.moveCursorToNext();
							turtles.getObjectAtCursor().fd(1);
							turtles.getObjectAtCursor().rt(1);
							j++;
						}
					}
				}
				i++;
			}
		}
	}
}