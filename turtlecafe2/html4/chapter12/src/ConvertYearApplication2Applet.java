/**
 * ����a��ϊ��v���O�����i1���x�������\�b�h���j
 * 
 * @author �I�u�v�����
 * @version 2.0
 */
public class ConvertYearApplication2Applet extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new ConvertYearApplication2Applet());
	}

	// �����a��ɕϊ�����
	// �^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		showTitle();
		convertYear();
		showEndTitle();
	}

	// �����a��ɕϊ�����
	void convertYear() {

		int year;
		String japaneseYear;

		// �������͂���
		print("�������͂��Ă�������\n");
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
		print(year + "�N��" + japaneseYear + "�N�ł�.\n");
	}

	// �A�v���P�[�V�����̊J�n��m�点��
	void showTitle() {
		print("����a��ϊ��v���O�������J�n���܂�\n");
	}

	// �A�v���P�[�V�����̏I����m�点��
	void showEndTitle() {
		print("����a��ϊ��v���O�������I�����܂�");
	}

}
