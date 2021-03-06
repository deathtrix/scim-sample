package eugene.zhukov.api;

import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

import eugene.zhukov.ApplicationContextProvider;
import eugene.zhukov.SCIMFilter;

public class ServiceProviderConfigsEndpointTest extends JerseyTest {

	private static final AppDescriptor APP_DESCRIPTOR
			= new WebAppDescriptor.Builder("eugene.zhukov").addFilter(SCIMFilter.class, "f").build();
	
	public ServiceProviderConfigsEndpointTest() {
		super(APP_DESCRIPTOR);
	}

	@BeforeClass
	public static void initAppContext() throws Exception {
		new ApplicationContextProvider().setApplicationContext(
				new ClassPathXmlApplicationContext("springConfiguration.xml"));
	}

	@Test
	public void testServiceProviderConfiguration() {
		ClientResponse cr = resource().path("v1/ServiceProviderConfigs")
				.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);

//		String response = cr.getEntity(String.class);
//		System.out.println(response);
		Assert.assertEquals("Http status code 200 expected.", 200, cr.getStatus());
	}
}
