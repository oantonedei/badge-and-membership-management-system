package BadgeAndMembership.config;

import edu.miu.common.config.CommonServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CommonServiceConfig.class)
public class AppConfig {
}
