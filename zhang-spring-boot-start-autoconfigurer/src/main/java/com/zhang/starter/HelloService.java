package com.zhang.starter;

/**
 * <p></p>
 *
 * @version V1.0
 * @author: zhangfanxing
 * @since: ${date} ${time}
 */
public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties(){
        return helloProperties;
    }
    public String sayHello(String name){
        return helloProperties.getPrefix()+name + helloProperties.getSuffix();
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
