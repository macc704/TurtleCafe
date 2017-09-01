import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
 * �t�@�C���ǂݏ����̃e�X�g
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Converter {

	// �N������
	public static void main(String[] args) throws Exception {
		new Converter().main();
	}

	// �^�[�g���𓮂�������
	public void main() throws Exception {
		a("text/chapter17/src/Noun");
		a("text/chapter17/src/Verb");
	}

	public void a(String name) throws Exception {
		String infile = name + ".dic";
		String outfile = name + ".txt";
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(infile), "EUC-JP"));
		PrintStream out = new PrintStream(new File(outfile));
		String line = "";
		while ((line = in.readLine()) != null) {
			int index;
			// for yomi
			// index = line.indexOf("(�ǂ� ");
			// String word = line.substring(index + 4);
			// index = word.indexOf(")");
			// word = word.substring(0, index);
			// for midashi
			index = line.indexOf("���o���� (");
			String word = line.substring(index + 6);
			index = word.indexOf(" ");
			word = word.substring(0, index);
			if (word.startsWith("{")) {
				continue;
			}
			out.println(word);
		}
		in.close();
		out.close();
	}
}
