/**
* �v���O�������F
* �쐬�ҁF 
* �쐬���F Tue Nov 15 15:22:44 JST 2011
*/
public class Snow extends Turtle {
	
	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new Snow(), args);
	}
	
	//�^�[�g���𓮂�������
	double scale = 0;
	public double getScale(){
		return scale;			
	}
	public void setScale(double s){
		scale = s;
	}
	
	public void start() {

		int i = 0;		
		int j = 0;
		
		int angle;
		int ue;
		int sita;
		
		color(java.awt.Color.lightGray);
		
		up();
		fd(-100);
		down();		
		
		j = 0;
		while(j < 6){
			
			fd(100);
			
			up();
			fd(-100);
			down();
			
			fd(20);
			
			//1�߂̖_
			angle = 90;
			ue=10;
			sita=10;
			rt(angle);
			fd(ue);
			up();
			fd(-ue-sita);
			down();
			fd(sita);
			lt(angle);
			
			fd(25);
			
			//�Q�߂̖_
			angle = 45;
			ue=40;
			sita=20;
			i = 0;
			while(i < 2){
				if(i ==1)
				angle = -angle;
				
				rt(angle);
				fd(ue);
				up();
				fd(-ue-sita);;
				down();
				fd(sita);
				lt(angle);
				
				i++;	
			}		
			
			fd(20);
			
			//�R�߂̖_
			angle = 45;
			ue=20;
			sita=0;
			i = 0;
			while(i < 2){
				if(i ==1)
				angle = -angle;
				
				rt(angle);
				fd(ue);
				up();
				fd(-ue-sita);;
				down();
				fd(sita);
				lt(angle);
				
				i++;	
			}
			
			up();
			fd(-65);
			down();
			rt(60);
			j++;
		}
		
	}
	
}								