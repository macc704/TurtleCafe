/**
 * �v���O�������F
 * �쐬�ҁF 
 * �쐬���F Sat Oct 20 15:29:10 JST 2007
 */
public class ScoreAverageApplet extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ScoreAverageApplet());
	}

	//�^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		//�e���Ȃ̓_����ݒ肷��
		int japanese = 49; //����
		int mathematics = 72; //���w
		int english = 25; //�p��
		
		//�R���Ȃ̍��v�_�����߂�
		double total = japanese + mathematics  + english;
		//�T���Ȃ̕��ς����߂�
		double average = total / 3.0; //���ς��v�Z����
		
		//���ς��l�̌ܓ�����
		average = average * 10;
		if ((average % 10) >= 5) { //�P�̈ʂ��T�ȏ�Ȃ�
			average = average + 10; //�J��グ��
		}
		int result = (int) (average / 10);
		
		//�l�̌ܓ��������ς�\������
		print(result);
		
	}

}