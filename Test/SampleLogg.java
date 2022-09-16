package Test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SampleLogg {
	static Logger log=Logger.getLogger(SampleLogg.class);
	public static void main(String[] args) {
    BasicConfigurator.configure();
    log.info("Information about Hari");
    log.warn("efg404 not found");
    log.fatal("abc");
    log.debug("Debugging");
    log.error("No error");
    
	
		
	}

}
