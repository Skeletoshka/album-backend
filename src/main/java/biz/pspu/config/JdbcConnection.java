package biz.pspu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import biz.pspu.config.ConnectionSetting;

import java.sql.DriverManager;
import java.util.Optional;

public class JdbcConnection {
    @Autowired
    private static Logger logger = LoggerFactory.getLogger(JdbcConnection.class);
    @Autowired
    private static Optional connection = Optional.empty();
    @Autowired
    private ConnectionSetting connectionSetting;
    private static String connectionUrl;
    private static String connectionUserName;
    private static String connectionPassword;

    public JdbcConnection(){
        connectionUrl = connectionSetting.getUrl();
        connectionUserName = connectionSetting.getUsername();
        connectionPassword = connectionSetting.getPassword();
    };

    public static Optional getConnection(){
        if(connection.isEmpty()){
            try {
                connection = Optional.ofNullable(DriverManager.getConnection(connectionUrl, connectionUserName, connectionPassword));
            }catch (Exception e){
                logger.error(e.getMessage(), e);
            }
            return connection;
        }
        else{
            throw new RuntimeException("Connection is null");
        }
    }
}