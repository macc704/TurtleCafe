/*
 * Web�t�@�C���ǂ݂��݂̃e�X�g
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class WebSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WebSample());
	}

	// �^�[�g���𓮂�������
	public void start() {
		print(loadFromFile("http://www.inf.shizuoka.ac.jp/", "UTF-8"));
	}
}
