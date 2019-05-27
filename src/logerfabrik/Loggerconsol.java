package logerfabrik;

public class Loggerconsol implements Ilogger {

	@Override
	public void selog(String c, String i) {
		// TODO Auto-generated method stub
		System.out.println(c + " : " + i + "\n");
	}

}
