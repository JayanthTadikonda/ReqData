package com.jay.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:dbConfig.properties")
public class DbProperties {

   // @Value("${db.className}")
    private String className;

   //@Value("${db.user}")
    private String user;

   //@Value("${db.password}")
    private String password;

   //@Value("${db.url}")
    private String url;

    public DbProperties(String className, String user, String password, String url) {
        this.className = className;
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DbProperties{" +
                "className='" + className + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
