/*
 * �t�@�C���ǂݏ����̃e�X�g
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FileIOSample extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FileIOSample());
	}

	// �^�[�g���𓮂�������
	public void start() {
		saveToFile("a.txt", "�ق�");
		print(loadFromFile("a.txt"));
	}
}
