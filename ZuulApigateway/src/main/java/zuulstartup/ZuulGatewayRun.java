package zuulstartup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulGatewayRun {

	static int RequestNumber=0;
	
	public static void main(String[] args) {
		
		for(int i=0;i<=1;)
		{
			RequestNumber++;
			break;
		}
		System.out.println(RequestNumber);
		
		SpringApplication.run(ZuulGatewayRun.class, args);
	}
}

