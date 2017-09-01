/*
 * 今日の浜松の天気
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class WeatherInfo extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WeatherInfo(), args);
	}

	// タートルを動かす処理
	public void start() {
		String file = loadFromFile(
				"http://weather.yahoo.co.jp/weather/jp/22/5040.html", "UTF-8");
		int index1 = file.indexOf("><br>");
		String weather = file.substring(index1 + 5 + 13);
		int index2 = weather.indexOf("</td></tr>");
		weather = weather.substring(0, index2 - 13);
		System.out.println("今日の浜松の天気は「" + weather + "」です");
	}
}
