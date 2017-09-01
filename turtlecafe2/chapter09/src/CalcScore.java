/**
 * プログラミングI 成績計算プログラム
 */
public class CalcScore extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CalcScore());
	}
  
  //タートルを動かす処理
	public void start() {
    
    //変数
    int 出席点;//10点
    int 課題点;//50点満点
    int 最終作品点;//25点満点
    int 最終レポート点;//25点満点
    
    int 総合成績;
    
    //各点数を入力する
    print("出席点を入力してください");
		出席点 = input();
    print("課題点を入力してください");
    課題点 = input();
    print("最終作品点を入力してください");
    最終作品点 = input();
    print("最終レポート点を入力してください");
    最終レポート点 = input();
    
    //総合成績を計算する
    総合成績 = 課題点 + 最終作品点 + 最終レポート点;
    
    //成績を表示する
    if(総合成績 > 80){
      print("あなたの成績はAです");
    }
    else if(総合成績 > 60){
      print("あなたの成績はBです");
    }
    else if(総合成績 > 40){
      print("あなたの成績はCです");
    }
    else{
      if(出席点 >= 7){
        print("あなたの成績はCです");
      }
      else{
        print("あなたの成績はDです");
      }
    }
  }
  
}