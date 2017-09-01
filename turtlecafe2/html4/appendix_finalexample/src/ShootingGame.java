/**
* インベーダーゲーム
* 
* Katsuto Minatsuki
* 2008/01/09
*/
public class ShootingGame extends Turtle {
	
	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new ShootingGame());
	}
	
	//タートルを動かす処理
	public void start() {
		
		hide();//タートルを消す
		
		//画面の調整
		window.size(640, 480);
		window.warp(100, 100);
		
		int score; //得点を入れる変数
		int i = 0;
		int j = 1;
		int k =1;
		int point=0;
		int life = 2;
		//背景の生成
		ImageTurtle bg = new ImageTurtle("black.jpg");
		//キャラクターの生成
		ImageTurtle enemy1 = new ImageTurtle("inv1.gif");  
		ImageTurtle enemy2 = new ImageTurtle("inv2.gif");
		ImageTurtle enemy3 = new ImageTurtle("inv3.gif");
		ImageTurtle enemy4 = new ImageTurtle("inv4.gif");
		ImageTurtle enemy5 = new ImageTurtle("inv5.gif");
		ImageTurtle enemy6 = new ImageTurtle("inv6.gif");
		ImageTurtle enemy7 = new ImageTurtle("inv7.gif"); 
		ImageTurtle enemy8 = new ImageTurtle("inv1.gif");  
		ImageTurtle enemy9 = new ImageTurtle("inv2.gif");
		ImageTurtle enemy10 = new ImageTurtle("inv3.gif");
		ImageTurtle enemy11 = new ImageTurtle("inv4.gif");
		ImageTurtle enemy12 = new ImageTurtle("inv5.gif");
		ImageTurtle enemy13 = new ImageTurtle("inv6.gif");
		ImageTurtle enemy14 = new ImageTurtle("inv7.gif"); 
		ImageTurtle ufo = new ImageTurtle("ufo.gif");      //enemyという名前の敵を生成
		ImageTurtle ship = new ImageTurtle("ship.gif");   //shipという名前の船を生成
		ImageTurtle bullet = new ImageTurtle("bullet.jpg");   //bulletという名前の弾を作成
		ImageTurtle after = new ImageTurtle("after.jpg"); //afterという名前の消滅絵を作成
		ImageTurtle shot = new ImageTurtle("shot.jpg");
		ImageTurtle shot1 = new ImageTurtle("shot.jpg");
		ImageTurtle shot2 = new ImageTurtle("shot.jpg");
		ImageTurtle bullet1 = new ImageTurtle("bullet1.jpg"); //おまけ要素の弾を生成
		//得点板の生成
		TextTurtle scoreBoard = new TextTurtle(); //scoreBoardという名前のTextTurtleを生成
		TextTurtle scoretag = new TextTurtle("score");
		TextTurtle comment = new TextTurtle("CLEAR");
		TextTurtle comment1 = new TextTurtle("GAME OVER");
		//キャラクターのサイズを調整
		scoretag.fontsize(14);
		comment.fontsize(50);
		bullet1.size(30, 30);
		//キャラクターの位置を調整
		scoretag.warp(600, 30);
		comment.warp(300, 250);
		comment1.warp(300, 250);
		ufo.warp(-1000, 50);
		enemy1.warp(100, 100);
		enemy2.warp(125, 100);
		enemy3.warp(150, 100);
		enemy4.warp(175, 100);
		enemy5.warp(200, 100);
		enemy6.warp(225, 100);
		enemy7.warp(250, 100);
		enemy8.warp(100, 125);
		enemy9.warp(125, 125);
		enemy10.warp(150, 125);
		enemy11.warp(175, 125);
		enemy12.warp(200, 125);
		enemy13.warp(225, 125);
		enemy14.warp(250, 125);
		ship.warp(320, 350);
		bullet.warp(-100, -100);//弾は最初見えない位置に置いておく
		bullet1.warp(-100, -100);
		shot.warp(100, 500);
		shot1.warp(100, 5100);
		shot2.warp(100, 500);		
		
		//得点板の位置を調整
		scoreBoard.warp(600, 50);
		after.hide();
		comment.hide();
		comment1.hide();
		//得点を初期化
		score = 0;
		while (true) {
			// --- 待つ ---
			sleep(0.025);
			// 左右に往復する
			if (j == 1){
				enemy1.warp(enemy1.x() + 2, enemy1.y());
				enemy2.warp(enemy2.x() + 2, enemy2.y());	
				enemy3.warp(enemy3.x() + 2, enemy3.y());	
				enemy4.warp(enemy4.x() + 2, enemy4.y());	
				enemy5.warp(enemy5.x() + 2, enemy5.y());	
				enemy6.warp(enemy6.x() + 2, enemy6.y());	
				enemy7.warp(enemy7.x() + 2, enemy7.y());
				enemy8.warp(enemy8.x() + 2, enemy8.y());
				enemy9.warp(enemy9.x() + 2, enemy9.y());	
				enemy10.warp(enemy10.x() + 2, enemy10.y());	
				enemy11.warp(enemy11.x() + 2, enemy11.y());	
				enemy12.warp(enemy12.x() + 2, enemy12.y());	
				enemy13.warp(enemy13.x() + 2, enemy13.y());	
				enemy14.warp(enemy14.x() + 2, enemy14.y());				
			} else{
				enemy1.warp(enemy1.x() - 2, enemy1.y());	
				enemy2.warp(enemy2.x() - 2, enemy2.y());	
				enemy3.warp(enemy3.x() - 2, enemy3.y());	
				enemy4.warp(enemy4.x() - 2, enemy4.y());	
				enemy5.warp(enemy5.x() - 2, enemy5.y());	
				enemy6.warp(enemy6.x() - 2, enemy6.y());	
				enemy7.warp(enemy7.x() - 2, enemy7.y());
				enemy8.warp(enemy8.x() - 2, enemy8.y());
				enemy9.warp(enemy9.x() - 2, enemy9.y());	
				enemy10.warp(enemy10.x() - 2, enemy10.y());	
				enemy11.warp(enemy11.x() - 2, enemy11.y());	
				enemy12.warp(enemy12.x() - 2, enemy12.y());	
				enemy13.warp(enemy13.x() - 2, enemy13.y());	
				enemy14.warp(enemy14.x() - 2, enemy14.y());		
			}
			if (enemy1.x() < 50) { // 左端に着いたら進む方向を右に
				j = 1;
			}
			if (enemy7.x() > 500) { // 右端に着いたら進む方向を左に
				j = -1;
			}
			
			if (k == 1){
				ufo.warp(ufo.x() + 4, ufo.y());
			} else{
				ufo.warp(ufo.x()-4, ufo.y());
			}
			if (ufo.x() < -1500) { // 左端に着いたら進む方向を右に
				k = 1;
			}
			if (ufo.x() > 1500) { // 右端に着いたら進む方向を左に
				k = -1;
			}
			
			//船を左右に動かす
			if (key() == 37) { //左
				ship.warp(ship.x() - 5, ship.y());
			} else if (key() == 39) { //右
				ship.warp(ship.x() + 5, ship.y());
			}
			
			if (key() == 38){
				bullet.warp(ship.x(), ship.y());	//上を押したら弾を出す(弾を船と同じ位置にする)
			}
			bullet.warp(bullet.x(), bullet.y() - 5);
			
			
			if(key() == 40 && score >= 100){ //おまけ要素
				bullet1.warp(ship.x(), ship.y());
				score = score - 100;           
			}
			bullet1.warp(bullet1.x(), bullet1.y() -5);
			
			if(0 < shot.x() && shot.x() < 500 && shot.y() > 500){ //敵による攻撃
				shot.warp(enemy1.x(), enemy1.y()); //とりあえず0<x<500の範囲のみ攻撃してくるように設定
			}else if(0 < shot1.x() && shot1.x() < 500 && shot1.y() > 500){
				shot1.warp(enemy3.x(), enemy3.y());			
			}else if(0 < shot2.x() && shot2.x() < 500 && shot2.y() > 500){
				shot2.warp(enemy5.x(), enemy5.y());			
			}
			shot.warp(shot.x(), shot.y() + 5); //それぞれの弾を下に向かって撃つ
			shot1.warp(shot1.x(), shot1.y() + 3);
			shot2.warp(shot2.x(), shot2.y() + 4);
			
			if (bullet.intersects(enemy1) || bullet1.intersects(enemy1)){ //もし，弾が敵に当たっていたら
				score = score + 10; //得点を増やす
				point++; //クリアポイント
				bullet.warp(-100, -100); //貫通対策
				shot.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy1.looks(after);
					}
					if(i % 2 == 1){
						enemy1.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy2) || bullet1.intersects(enemy2)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy2.looks(after);
					}
					if(i % 2 == 1){
						enemy2.hide();
					}
					update();
					i++;
				}
				i=0;
			}		
			if (bullet.intersects(enemy3) || bullet1.intersects(enemy3)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				shot1.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy3.looks(after);
					}
					if(i % 2 == 1){
						enemy3.hide();
					}
					update();
					i++;
				}
				i=0;
			}	
			if (bullet.intersects(enemy4) || bullet1.intersects(enemy4)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy4.looks(after);
					}
					if(i % 2 == 1){
						enemy4.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy5) || bullet1.intersects(enemy5)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				shot2.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy5.looks(after);
					}
					if(i % 2 == 1){
						enemy5.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy6) || bullet1.intersects(enemy6)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy6.looks(after);
					}
					if(i % 2 == 1){
						enemy6.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy7) || bullet1.intersects(enemy7)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy7.looks(after);
					}
					if(i % 2 == 1){
						enemy7.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy8) || bullet1.intersects(enemy8)){
				score = score +10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy8.looks(after);
					}
					if(i % 2 == 1){
						enemy8.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy9) || bullet1.intersects(enemy9)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy9.looks(after);
					}
					if(i % 2 == 1){
						enemy9.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy10) || bullet1.intersects(enemy10)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy10.looks(after);
					}
					if(i % 2 == 1){
						enemy10.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy11) || bullet1.intersects(enemy11)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy11.looks(after);
					}
					if(i % 2 == 1){
						enemy11.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy12) || bullet1.intersects(enemy12)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy12.looks(after);
					}
					if(i % 2 == 1){
						enemy12.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy13) || bullet1.intersects(enemy13)){
				score = score + 10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy13.looks(after);
					}
					if(i % 2 == 1){
						enemy13.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(enemy14) || bullet1.intersects(enemy14)){
				score = score +10;//得点を増やす
				point++;
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						enemy14.looks(after);
					}
					if(i % 2 == 1){
						enemy14.hide();
					}
					update();
					i++;
				}
				i=0;
			}
			if (bullet.intersects(ufo) || bullet1.intersects(ufo)){
				score=score+100;//得点を増やす
				bullet.warp(-100, -100);
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						ufo.looks(after);
					}
					if(i % 2 == 1){
						ufo.hide();
					}
					update();
					i++;
				}
				i=0;
			}												
			//得点板の数字を更新
			scoreBoard.text(score);
			
			if(point == 14){ //コメントを表示する
				comment.color(java.awt.Color.red);
				comment.show();
			}
			
			if (shot.intersects(ship)){ //もし，敵の弾が船に当たっていたら
				life--;//lifeを減らす
				shot.warp(enemy1.x(), enemy1.y());
			}else if(shot1.intersects(ship)){
				life--;
				shot1.warp(enemy3.x(), enemy3.y());
			}else if(shot2.intersects(ship)){
				life--;	
				shot2.warp(enemy5.x(), enemy5.y());
			}	
			
			if(life == 0){ //船が敵の弾に当たるとゲームオーバーにする
				while(i < 2){
					sleep(0.1);
					if(i % 2 == 0){
						ship.looks(after);
					}
					if(i % 2 == 1){
						ship.hide();
					}
					update();
					i++;
				}
				comment1.color(java.awt.Color.red);
				comment1.show();
			}      
			
			// --- 再描画 ---
			update();
		}
	}
}