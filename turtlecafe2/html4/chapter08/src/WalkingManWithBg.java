/**
 * 人が歩くアニメーションプログラム
 * (背景付き)
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class WalkingManWithBg extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingManWithBg());
	}

  //タートルを動かす処理
	public void start() {
    
    //ウインドウを移動, 大きさ調整
    window.warp(100, 100);
    window.size(480, 420);
    
    int i;//ループカウンタ
    
    //座標を取得するための変数
    int x;
    int y;
    
    hide();//亀を消去
    
    //バックグラウンド画像を用意する
    ImageTurtle bg = new ImageTurtle("bg.jpg");
    
    //アニメーション用画像を用意する
    ImageTurtle man1 = new ImageTurtle("man1.gif");
    ImageTurtle man2 = new ImageTurtle("man2.gif");
    ImageTurtle man3 = new ImageTurtle("man3.gif");
    ImageTurtle man4 = new ImageTurtle("man4.gif");
    ImageTurtle man5 = new ImageTurtle("man5.gif");
    ImageTurtle man6 = new ImageTurtle("man6.gif");
    ImageTurtle man7 = new ImageTurtle("man7.gif");
    ImageTurtle man8 = new ImageTurtle("man8.gif");
    
    //1番を移動
    man1.warp(240, 240);
    
    //1番以外のアニメーション用画像を消す
    man2.hide();
    man3.hide();
    man4.hide();
    man5.hide();
    man6.hide();
    man7.hide();
    man8.hide();
    
    //アニメーションループ
    i = 0;
    while (true) {
      
      // --- 待つ ---
      sleep(0.1); //0.1秒
      
      // --- 処理を行う ---
      //背景を動かす
      x = bg.getX();
      y = bg.getY();
      bg.warp(x - 2, y);
      
      //人の画像を変える
      if(i % 8 == 0){
        man1.looks(man1);			
      }
      else if(i % 8 == 1){
        man1.looks(man2);
      }
      else if(i % 8 == 2){
        man1.looks(man3);
      }
      else if(i % 8 == 3){
        man1.looks(man4);
      }
      else if(i % 8 == 4){
        man1.looks(man5);
      }
      else if(i % 8 == 5){
        man1.looks(man6);
      }
      else if(i % 8 == 6){
        man1.looks(man7);
      }
      else if(i % 8 == 7){
        man1.looks(man8);
      }
      
      // --- 再描画する ---
      update();
      i++;
    }
    
  }
  
}