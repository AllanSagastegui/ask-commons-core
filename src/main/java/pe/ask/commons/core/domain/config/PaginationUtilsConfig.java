package pe.ask.commons.core.domain.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import pe.ask.commons.core.domain.utils.PaginationUtils;

@AutoConfiguration
public class PaginationUtilsConfig {
    @Bean
    @ConditionalOnMissingBean
    public PaginationUtils paginationUtils() {
        return new PaginationUtils();
    }
}
