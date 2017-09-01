import java.awt.Color;

/*
* プログラム名：最小値選択法による並び替え 
* Created on 2012/01/07
* Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
*/
public class SelectionSort extends Turtle {
	
	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SelectionSort(), args);
	}
	
	// タートルを動かす処理
	public void start() {
		hide();
		window.size(400,400);
		ListTurtle<CardTurtle> 最小値候補 = new ListTurtle<CardTurtle>(true,"最小値候補");
		ListTurtle<CardTurtle> 未処理束 = new ListTurtle<CardTurtle>(true,"未処理束");
		ListTurtle<CardTurtle> 検索済束 = new ListTurtle<CardTurtle>(true,"検索済束");
		ListTurtle<CardTurtle> 並替済束 = new ListTurtle<CardTurtle>(true,"並替済束");
		{	//c//初期位置に設定する
			最小値候補.warpByTopLeft(50,20);
			最小値候補.setBgColor(new Color(255,153,204));
			未処理束.warpByTopLeft(50,90);
			未処理束.setBgColor(new Color(51,102,255));
			検索済束.warpByTopLeft(50,160);
			検索済束.setBgColor(new Color(0,204,153));
			並替済束.warpByTopLeft(50,230);
			並替済束.setBgColor(new Color(255,255,0));
			update();
		}
		{	//カードを追加する
			int i = 0;
			while(i < 8){
				未処理束.addLast(new CardTurtle(random(100)));
				update();
				i++;
			}
		}
		{	//並び替える
			while(未処理束.getSize() > 0){
				{	//最小値を検索する
					{	//未処理束の一番上を最小値候補に
						最小値候補.addLast(未処理束.getObjectAtCursor());
						update();
					}
					while(未処理束.getSize() > 0){
						if(未処理束.getObjectAtCursor().getNumber() < 最小値候補.getObjectAtCursor().getNumber()){
							{	//最小値候補を引いたカードと入れ替え，古い最小値候補は検索済み束へ
								検索済束.addLast(最小値候補.getObjectAtCursor());
								update();
								最小値候補.addLast(未処理束.getObjectAtCursor());
								update();
							}
						}else {
							{	//引いたカードを検索済み束へ
								検索済束.addLast(未処理束.getObjectAtCursor());
								update();
							}
						}
						
					}
					{	//検索済み束を元に戻す
						検索済束.moveAllTo(未処理束);
						update();
					}
				}
				{	//見つけた最小値を並替済み束へ移動する
					並替済束.addLast(最小値候補.getObjectAtCursor());
					update();
				}
			}
		}
	}
	
}