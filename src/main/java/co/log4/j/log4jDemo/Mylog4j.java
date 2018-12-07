package co.log4.j.log4jDemo;

import javax.persistence.Basic;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Mylog4j {
	
	public static Logger log=Logger.getLogger(Mylog4j.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.fatal("fatal errors");
		log.error("error ");
		log.warn("warning msg");
		log.info("information msg");
		log.debug("dubuging msg");
		log.trace("tracing msg");
	
		
	}

}

