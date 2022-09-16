package Test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	static Logger log=Logger.getLogger(Sample.class);


		public static void main(String[] args) {
		BasicConfigurator.configure();
		try {
			String a=null;
			int b=a.length();
				System.out.println(b);
			}catch (NullPointerException e) {
		log.error("ha",e); {
				e.printStackTrace();
			} 
				}}}
				
			
			

			

