/**
 * ����a��ϊ��v���O�����i���\�b�h�Ȃ��j
 * 
 * @author �I�u�v�����
 * @version 1.0
 */
public class ConvertYearApplication1Applet extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ConvertYearApplication1Applet());
	}
	
	// �����a��ɕϊ�����
	//�^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);
		
		// �A�v���P�[�V�����̊J�n��m�点��
		print("����a��ϊ��v���O�������J�n���܂�");

		{// �����a��ɕϊ�����
			int year;
			String japaneseYear;

			// �������͂���
			print("�������͂��Ă�������");
			year = input();

			// �����a��ɕϊ�����
			if (year >= 1989) {
				japaneseYear = "����" + (year - 1988);
			} else if (year >= 1926) {
				japaneseYear = "���a" + (year - 1925);
			} else {
				japaneseYear = "�s��";
			}

			// �ϊ����ʂ��o�͂���
			print(year + "�N��" + japaneseYear + "�N�ł�.");
		}

		// �A�v���P�[�V�����̏I����m�点��
		print("����a��ϊ��v���O�������I�����܂�");
	}
}