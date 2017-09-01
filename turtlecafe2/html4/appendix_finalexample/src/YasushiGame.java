/**
 * プログラム名：やすしの出勤
 * 作成者：兼子直也
 * 作成日： Tue Jan 08 19:03:09 JST 2008
 */
public class YasushiGame extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new YasushiGame());
	}

	//タートルを動かす処理
	public void start() {
     hide(); //タートルを消す。

	//画面の調整
	window.size(1000,550);

	//変数の定義
	int lange= 2500; //事務所までの距離
	int keycode; //キー番号
	int x, y; //やすしの座標
	int x1, y1; //どなりの座標
	int x2, x3, x4; //背景の座標
	int a1, a2, a3, b1, b2, b3; //障害物の座標
	int life = 500; //やすしのライフ
	int officex; //事務所の座標
	
	//キャラクターの生成
	ImageTurtle road1 = new ImageTurtle ("road.jpg"); //背景１
	ImageTurtle road2 = new ImageTurtle ("road.jpg"); //背景２
	ImageTurtle road3 = new ImageTurtle ("road.jpg"); //背景３
	ImageTurtle office  = new ImageTurtle ("office.jpg"); //事務所
     ImageTurtle yasushi = new ImageTurtle ("yasushi.jpg"); //やすし
	ImageTurtle bentz = new ImageTurtle ("bentz.jpg"); //ベンツ
	ImageTurtle bus = new ImageTurtle ("bus.jpg"); //バス
	ImageTurtle dump = new ImageTurtle ("dump.jpg"); //ダンプ
	
	ImageTurtle donari = new ImageTurtle ("donari.jpg"); //どなり
	ImageTurtle vanishment = new ImageTurtle ("vanishment.jpg"); //消滅
     ImageTurtle explosion = new ImageTurtle ("explosion.jpg");//爆発
	
	//変数を画面に表示する
	
     TextTurtle langemeter=new TextTurtle();
	TextTurtle lifebar = new TextTurtle(); //lifebarという名前のTextTurtle

	TextTurtle lifebartext = new TextTurtle();
	TextTurtle langetext1 = new TextTurtle();
	TextTurtle langetext2 = new TextTurtle();
	
	lifebartext.text("LIFE:"); 	
	langetext1.text("事務所まであと");
	langetext2.text("m");
	
	//赤い文字で表示する
	langemeter.color(java.awt.Color.red);
	langetext1.color(java.awt.Color.red);
	langetext2.color(java.awt.Color.red);
	
	lifebartext.color(java.awt.Color.red);
	lifebar.color(java.awt.Color.red);

	//初期位置に移動
	yasushi.warp(100,250);
	bentz.warp(2500,100);
	bus.warp(1500,200);
	dump.warp(3000,300);
	
	donari.warp(1200,1000);
	road1.warp(0,250);
	road2.warp(1000,250);
     road3.warp(2000,250);
	bentz.scale(0.5);
	bus.scale(0.5);
	dump.scale(0.5);
	
	yasushi.scale(0.4);
	langemeter.warp(840,25);
	lifebar.warp(950,420);
	lifebartext.warp(880,420);
	langetext1.warp(680,25); 
	langetext2.warp(920,25);
	office.warp(1300,250);
	
	vanishment.warp(2000,2000);
     explosion.warp(2000,2000);
	
	donari.rt(90);

	while (true) {
	//待つ
	sleep(0.01);

	//処理
	//今押されているキーを取得する
	keycode = key();

	//キャラクターが今いる位置を取得する
	x = yasushi.getX(); //やすし
	y = yasushi.getY(); //やすし
	x1 = donari.getX(); //どなり
 	y1 = donari.getY(); //どなり
	x2 = road1.getX(); //背景1
	x3 = road2.getX(); //背景2
	x4 = road3.getX(); //背景3
	a1 = bentz.getX(); //障害物1
	a2 = bus.getX(); //障害物2
	a3 = dump.getX(); //障害物3
	b1 = bentz.getY(); //障害物1
	b2 = bus.getY(); //障害物2
	b3 = dump.getY(); //障害物3
	
	officex = office.getX(); //事務所

	//メーターの文字色を変化させる

	if (life <= 100) {
	lifebar.color(java.awt.Color.red);
	}

	
	//クリアとゲームオーバー
	
	     if (life < 0) {
		life = 0;
		lifebar.text(life);
		donari.show(false);
		yasushi.looks(explosion);
		sleep(0.2);
		yasushi.looks(explosion);
		TextTurtle gameover = new TextTurtle("GAME OVER");
		gameover.color(java.awt.Color.red);
		lifebar.text(life);
		update();
		break;
	
	}

	if (lange < 0) {
		lange = 0;
		TextTurtle clear = new TextTurtle("目的地到着！");
		clear.color(java.awt.Color.blue);	
		office.warp(800,250);
		update();
		break;
	} else if (lange <= 500) {
		langemeter.color(java.awt.Color.red);	
		office.warp(officex - 1,250);
	}

	//アニメーション
		//背景を動かす
		road1.warp(x2 - 11,250);
		road2.warp(x3 - 11,250);
		road3.warp(x4 - 11,250);
		if (x2 < -500) {
		    road1.warp (2000,250);
			}
		if (x3 < -500) {
		    road2.warp (2000,250);
			}
		if (x4 < -500) {
		    road3.warp (2000,250);
			}
	
		//やすしを操作する
			//スペースキーが押されたらどなりを発射
			if (keycode == 32) { //スペースキー
	    		donari.warp(x + 100,y);
						}
	
			//上下左右キーが押されたらやすしを動かす
		       if (keycode == 37) { //左
			yasushi.warp(x - 18, y);
			
		
			} else if (keycode == 38) { //上
			yasushi.warp(x, y - 18);
			
		
			} else if (keycode == 39) { //右
			yasushi.warp(x + 18, y);
			
			} else if (keycode == 40) { //下
			yasushi.warp(x, y + 18);
			
			}

			
			//上下の動きを制限する
			if (y < 30) {
			yasushi.warp(x,30);
			}
			if (y > 410) {
			yasushi.warp(x,410);
			}

			//左右の動きを制限する
			if (x < 60) {
			yasushi.warp(60,y);
			}
			if (x > 930) {
			yasushi.warp(930,y);
			}


		//どなりのアニメーション
           donari.fd(30);
          if(x1>1500){
          donari.warp(0,1000);
		}

		//障害物のアニメーション
			//障害物が向かってくる
			bentz.warp(a1 - 10, b1);
			bus.warp(a2 - 10, b2);
			dump.warp(a3 - 10, b3);
			
			//障害物が何度も向かってくるようにする
			if (a1 < -500) {
			bentz.warp(1300 , 100);
			bentz.looks(bentz);
			}
			if (a2 < -150) {
			    bus.warp(2280 + life, 200);
			    bus.looks(bus);
			}
			if (a3 < -20) {
			    dump.warp(1600 + life, 300);
			    dump.looks(dump);
			}
		
	
	//あたり判定
		//やすしと障害物
		if (yasushi.intersects(bentz)){
		life--;
		life--;
		bentz.looks(explosion);
		}
		if (yasushi.intersects(bus)){
		life--;
		life--;
		bus.looks(explosion);
		}
		if (yasushi.intersects(dump)){
		life--;
		life--;
		dump.looks(explosion);
		}
	

		//どなりと障害物
		if (donari.intersects(bentz)){
		bentz.looks(vanishment);
		sleep(0.05);
		bentz.warp(2500 ,100);
		bentz.looks(bentz);
		}
		if (donari.intersects(bus)){
		bus.looks(vanishment);
		sleep(0.05);
		bus.warp(1300+y + life,200);
		bus.looks(bus);
		}
		if (donari.intersects(dump)){
		dump.looks(vanishment);
		sleep(0.05);
		dump.warp(x+y+2000 ,300);
		dump.looks(dump);
		}
		
	//再描画
	update();

	//得点、ライフの更新
	langemeter.text(lange);
	lifebar.text(life);
	

	//スコア加算
	lange--;


	}	



}

}