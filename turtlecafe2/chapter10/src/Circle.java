/*
 * Circle.java
 * 
 * Created on 2003/06/12
 */

/**
 * Class Circle.
 * 
 * @author macchan
 * @version $Id: Circle.java,v 1.2 2007/11/13 10:30:59 queen Exp $
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