/*
 * Circle.java
 * 
 * Created on 2003/06/12
 */

/**
 * Class Circle.
 * 
 * @author macchan
 * @version $Id: Circle.java,v 1.1 2009/03/02 00:55:39 hashiyaman Exp $
 */
public class Circle extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Circle());
	}
	
	//�^�[�g���𓮂�������
	public void start() {
		int i = 0;
		while (i < 360) {
			fd(1);
			rt(1);
			i = i + 1;
		}
	}
}