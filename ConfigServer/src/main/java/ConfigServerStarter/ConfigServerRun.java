package ConfigServerStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerRun {
	
		
		public static void main(String args[])
		{
		SpringApplication.run(ConfigServerRun.class, args);
		}
		
		

	}


