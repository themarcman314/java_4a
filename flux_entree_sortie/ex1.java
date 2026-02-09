import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

class ex1 {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("somefile");
			byte[] data = f.readAllBytes();
			f.close();
			String s = new String(data, StandardCharsets.UTF_8);
			System.out.printf(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
