package xai.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;
import xai.rest.jettyserver.api.Volum;

/**
 * @author Joan-Manuel Marques
 *
 */

public class RESTclient {

	public double sup(String address, int port, int value1, int value2) {
		LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/cil/sup/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: text/plain");

		/* COMPLETAR */
		
		return Double.MIN_VALUE;
	}
	
	public double per(String address, int port, int value1, int value2) {
		LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/cil/per/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: application/json");

		/* COMPLETAR */
		
		return Double.MIN_VALUE;
	}

	public Volum vol(String address, int port, int value1, int value2) {
		LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/cil/vol/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: application/json");

		/* COMPLETAR */
		
		return null;
	}
}
