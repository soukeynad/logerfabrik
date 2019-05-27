package logerfabrik;

public abstract class Abstractloggerfactory {
	private boolean print;
    public void AbstractLoggerFactory(){
    	this.print=print;
    }

    public abstract Ilogger createLogger();

	public boolean getprint() {
		return print;
	}

	public void setPrint(boolean print) {
		this.print = print;
	}
    }
	
		
	


