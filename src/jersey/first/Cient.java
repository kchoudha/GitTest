package jersey.first;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class Cient {
	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		System.out.println("Modified by Staline......");
		// Fluent interfaces
		System.out.println(service.path("rest").path("hello").accept(
				MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
		// Get plain text
		System.out.println(service.path("rest").path("hello").accept(
				MediaType.TEXT_PLAIN).get(String.class));
		// Get XML
		System.out.println(service.path("rest").path("hello").accept(
				MediaType.TEXT_XML).get(String.class));
		// The HTML
		System.out.println(service.path("rest").path("hello").accept(
				MediaType.TEXT_HTML).get(String.class));
		System.out.println(" Here Kunal, Changed something");
		System.out.println(" Here Manoja, Changed something, changing again");
		System.out.println(" Here Kunal, Testing Conflict Resolving Again");
		System.out.println(" Here kunal choudhary again, Changed client file again,Changing @again kunal @again again @again and @againa");
		System.out.println(" Here Manoja, doing R&D to resolve conflict in git Hub......");
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/RestFirst").build();
	}


}
