import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
 * ファイル読み書きのテスト
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Converter {

	// 起動処理
	public static void main(String[] args) throws Exception {
		new Converter().main();
	}

	// タートルを動かす処理
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
			// index = line.indexOf("(読み ");
			// String word = line.substring(index + 4);
			// index = word.indexOf(")");
			// word = word.substring(0, index);
			// for midashi
			index = line.indexOf("見出し語 (");
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
