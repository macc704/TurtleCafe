/*
 * �v���O�������F 
 * �쐬�ҁF 
 * �쐬���F Tue Dec 04 13:20:29 JST 2007
 */
public class PowerApplet extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new PowerApplet());
	}

	// �^�[�g���𓮂�������
	public void start() {
		Turtle.window.split.setDividerLocation(25);

		print("�ݏ�v�Z�v���O�������J�n���܂�\n");// �A�v���P�[�V�����̊J�n��m�点��

		// ��̓��͂��󂯕t����
		print("�����͂��Ă�������>>\n");
		int base = input();

		// �w���̓��͂��󂯕t����
		print("�w������͂��Ă�������>>\n");
		int exponent = input();

		// �ݏ搔���v�Z����
		int calculatedPower = calculatePower(base, exponent);

		// �ݏ搔���o�͂���
		print(base + "��" + exponent + "���" + calculatedPower + "�ł��B\n");

		print("�ݏ�v�Z�v���O�������I�����܂�\n");// �A�v���P�[�V�����̏I����m�点��
	}

	// �ݏ���v�Z����
	int calculatePower(int base, int exponent) {
		int power = 1;// �ݏ搔�̏����l���A����0��i1�j�ɐݒ肷��

		// �ݏ���v�Z����
		int i = 0;
		while (i < exponent) {
			power = power * base;
			i++;
		}

		return power;
	}
}