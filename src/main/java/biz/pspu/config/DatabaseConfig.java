package biz.pspu.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import biz.pspu.config.ConnectionSetting;

import javax.sql.DataSource;
import java.util.Optional;

@Configuration
public class DatabaseConfig {

    @Autowired
    private final ConnectionSetting connectionSetting;

    @Autowired
    public DatabaseConfig(ConnectionSetting connectionSetting) {
        this.connectionSetting = connectionSetting;
    }

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(connectionSetting.getDriver());
        hikariConfig.setJdbcUrl(connectionSetting.getUrl());
        hikariConfig.setUsername(connectionSetting.getUsername());
        hikariConfig.setPassword(connectionSetting.getPassword());
        hikariConfig.setMaximumPoolSize(connectionSetting.getJdbcMaxPoolSize());
        hikariConfig.setPoolName("main");
        return new HikariDataSource(hikariConfig);
    }
}