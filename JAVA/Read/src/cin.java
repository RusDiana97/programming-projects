import java.io.*;
public class cin {
	static String linie ()
	{ String sir = ""; char ch;
		try
		{ while ((ch = (char)System.in.read()) != 13)
			sir = sir + ch;
		}
		catch (IOException e) {} try { System.in.read(); }
		catch (IOException e) {}
		return sir;
	}
}
