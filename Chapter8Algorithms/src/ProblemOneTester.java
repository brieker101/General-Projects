import java.io.IOException;

public class ProblemOneTester {

	public static void main(String[] args) throws IOException {
		ProblemOne<String> core = new ProblemOne<String>("Lorem.txt");
		core.sort();
	}
}
