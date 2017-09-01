/*
* プログラム名：カードをリスト１からリスト２に移動するプログラム
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class MoveCards extends Turtle {
	
	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards(), args);
	}
	
	// タートルを動かす処理
	public void start() {
		hide();
		Turtle.window.size(550,300);
		ListTurtle<CardTurtle> list1 = new ListTurtle<CardTurtle>(true,"リスト1");
		ListTurtle<CardTurtle> list2 = new ListTurtle<CardTurtle>(true,"リスト2");
		{	//位置を移動する
			list1.warp(50,40);
			list2.warp(50,110);
		}
		{	//カードを入れる
			int i = 0;
			while(i < 10){
				list1.addLast(new CardTurtle(i * 10));
				i++;
			}
		}
		do{
			sleep(0.5);
			{	//移動する
				if(list1.getSize() != 0){
					list2.addLast(list1.getObjectAtCursor());
				}else if(list1.getSize() == 0){
					break;
				}
				
			}
			update();
		}while(true);
		print("アニメーションループが終了しました．");
	}
	
}