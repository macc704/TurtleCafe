/*
 * ŠLŠk‚ğ‘‚­ƒvƒƒOƒ‰ƒ€
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ‰ü’ù Yoshiaki Matsuzawa
 */
public class Shell extends Turtle {

	// ‹N“®ˆ—
	public static void main(String[] args) {
		Turtle.startTurtle(new Shell());
	}

	// ƒ^[ƒgƒ‹‚ğ“®‚©‚·ˆ—
	public void start() {
		{// ŠLŠk‚ğ‘‚­
			int i = 1;
			while (i <= 10) {
				rt(20);

				{// lŠp‚ğ‘‚­
					int j = 1;
					while (j <= 4) {
						fd(i * 10);
						rt(90);
						j++;
					}
				}

				i++;
			}
		}

	}
}