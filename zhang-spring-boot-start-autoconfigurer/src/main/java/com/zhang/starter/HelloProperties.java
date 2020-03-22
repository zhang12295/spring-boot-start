package com.zhang.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p></p>
 *
 * @version V1.0
 * @author: zhangfanxing
 * @since: ${date} ${time}
 */
@ConfigurationProperties(prefix = "zhang.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
