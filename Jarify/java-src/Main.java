import org.python.core.PyException;
import org.python.util.PythonInterpreter;

public class Main {
    public static void main(String[] args) throws PyException, Exception{
	PythonInterpreter intrp = new PythonInterpreter();
	intrp.exec("import jyrimaa");
	intrp.exec("jyrimaa.main()");
    }
}
