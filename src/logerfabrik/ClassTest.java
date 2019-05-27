package logerfabrik;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractloggerfactory f = new Loggerfactory();
		Ilogger logger = f.createLogger();
		logger.selog(ClassTest.class.toString(), "Bonjour");
		logger.selog(ClassTest.class.toString(), "tout le");
	}

}
