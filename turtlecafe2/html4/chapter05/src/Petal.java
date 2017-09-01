/*
 * ‰Ô‚Ñ‚ç‚ğ‘‚­ƒvƒƒOƒ‰ƒ€
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 ‰ü’ù Yoshiaki Matsuzawa
 */
public class Petal extends Turtle {

	// ‹N“®ˆ—
	public static void main(String[] args) {
		Turtle.startTurtle(new Petal());
	}

	// ƒ^[ƒgƒ‹‚ğ“®‚©‚·ˆ—
	public void start() {
		{// ‰Ô‚Ñ‚ç‚ğ•`‚­
			{// ‰~ŒÊ‚ğ•`‚­
				int i = 1;
				while (i <= 120) {
					rt(1);
					fd(1);
					i++;
				}
			}

			{// Ÿ‚Ì‰~ŒÊ‚ÌŠp“x‚Ö
				rt(60);
			}

			{// ‰~ŒÊ‚ğ•`‚­
				int i = 1;
				while (i <= 120) {
					rt(1);
					fd(1);
					i++;
				}
			}

		}
	}
}