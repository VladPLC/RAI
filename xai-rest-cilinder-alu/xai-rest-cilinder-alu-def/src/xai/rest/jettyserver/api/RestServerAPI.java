package xai.rest.jettyserver.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

/**
 * @author Joan-Manuel Marques
 *
 */
 @Path("/cil")
public class RestServerAPI {

	private static final double PI = 3.1416;
	
	/**
	 * Calculates cilinder's surface
	 *
	 * @param num_1
	 * @param num_2
	 * @return
	 */
	@GET
	@Path("/sup/{num_1}/{num_2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sup(@PathParam("num_1") int rad, @PathParam("num_2") int alt) {
		LSimLogger.log(Level.INFO, "sup");

		double result = Double.MIN_VALUE;

		/* Calculate surface */

		LSimLogger.log(Level.INFO, "response: "+(new Double(result)).toString());
		return (new Double(result)).toString();
	}

	/**
	 * Calculates cilinder's perimeter
	 *
	 * @param num_1
	 * @param num_2
	 * @return
	 */
	@GET
	@Path("/per/{num_1}/{num_2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String per(@PathParam("num_1") int rad, @PathParam("num_2") int alt) {
		LSimLogger.log(Level.INFO, "per");
		Object obj = null;

		double result = Double.MIN_VALUE;

		/* Calculate result & create json value with GSON library */

		return "" + result;
	}

	/**
	 * Calculates cilinder's volume
	 *
	 * @param num_1
	 * @param num_2
	 * @return a json object containing the parameters and the result
	 */
	@GET
	@Path("/vol/{num_1}/{num_2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String vol(@PathParam("num_1") int rad, @PathParam("num_2") int alt) {
		LSimLogger.log(Level.INFO, "vol");

		/* Call Volum class and send json value with GSON library */
		
		return "";
	}
}
