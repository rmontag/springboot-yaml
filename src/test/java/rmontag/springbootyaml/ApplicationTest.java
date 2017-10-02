package rmontag.springbootyaml;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import rmontag.springbootyaml.Application;
import rmontag.springbootyaml.AvailableChannelsConfiguration;
import rmontag.springbootyaml.ChannelConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes={Application.class})
@ContextConfiguration
public class ApplicationTest {

	@Autowired
	AvailableChannelsConfiguration conf;
	
	@Test
	public void testConfig() throws Exception {
		assertTrue(conf != null);
	}


	@Test
	public void testConfigValues() throws Exception {
		assertTrue(conf != null);
		List<ChannelConfiguration> configs = conf.getChannelConfigurations();
		assertTrue(configs !=null);
		assertTrue(configs.size() == 2);
		for (ChannelConfiguration cc : configs) {
			assertTrue(cc.getName() != null);
			assertTrue(cc.getCompanyBankAccount() != null);
			System.out.println("name=" + cc.getName() + " companyBankAccount=" + cc.getCompanyBankAccount());
		}
	}	
}

