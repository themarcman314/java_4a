import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

class ex2 {
	public static void main(String[] args) {
		try {
			Reader in = new FileReader("./somefile");
			String data = in.readAllAsString();
			in.close();
			System.out.printf(data);
			FileWriter out = new FileWriter("file_copy");
			out.write(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
