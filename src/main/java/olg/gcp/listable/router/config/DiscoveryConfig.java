package olg.gcp.listable.router.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableDiscoveryClient
@Profile( { "local", "cloud" } )
public class DiscoveryConfig {
}
