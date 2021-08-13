package com.aline.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The Application config will allow
 * for POJO access to any property defined in
 * the application.properties/yml as long as it is
 * prefixed with <code>application</code>.
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {


    /**
     * The API URL of the microservices.
     * @apiNote The url has a {port} placeholder.
     */
    private String api;

    /**
     * The landing portal url.
     */
    private String landingPortal;

    /**
     * The member dashboard url.
     */
    private String memberDashboard;

    /**
     * The admin portal url.
     */
    private String adminPortal;

    /**
     * Accessor for security properties
     */
    private final Security security = new Security();

    /**
     * Access for email properties
     */
    private final Email email = new Email();

    @Getter
    @Setter
    public static class Email {
        /**
         * Enable email services
         */
        private boolean enable;

        /**
         * Email address to send emails from
         */
        private String from;
    }

    @Getter
    @Setter
    public static class Security {
        /**
         * Secret Key for encryption and decryption.
         */
        private String secretKey;
    }
}