package ua.test.taf.core.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:src/test/resources/MainConfig.properties"})
public interface MainConfig extends Config {
    String base_url();
}
