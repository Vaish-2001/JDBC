package basic_str.jdbc;

public class StudentData {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is installed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
