import java.util.*;

/**
* �v���O�������F���ѕ��όv�Z�v���O����
* �쐬�ҁF Megumi Araki
* �쐬���F Sat Oct 20 15:11:37 JST 2007
*/
public class ScoreAverage{
	
	//�N������
	public static void main(String[] args) {
		ScoreAverage main = new ScoreAverage();
		main.run();
	}
	
	//���C������
	public void run() {
		
		//�e���Ȃ̓_����ݒ肷��
		int japanese = 49; //����
		int mathematics = 72; //���w
		int english = 25; //�p��
		
		//�R���Ȃ̍��v�_�����߂�
		double total = japanese + mathematics  + english;
		//�R���Ȃ̕��ς����߂�
		double average = total / 3.0; //���ς��v�Z����
		
		//���ς��l�̌ܓ�����
		average = average * 10;
		if ((average % 10) >= 5) { //�P�̈ʂ��T�ȏ�Ȃ�
			average = average + 10; //�J��グ��
		}
		int result = (int) (average / 10);//double�^��average��int�^�Ɍ^�ϊ����āAresult�ɑ������
		
		//�l�̌ܓ��������ς�\������
		System.out.println(result);
		
	}
	
}