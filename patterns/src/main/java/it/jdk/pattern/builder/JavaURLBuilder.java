package it.jdk.pattern.builder;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaURLBuilder extends URLBuilder<URL> {

    private String host = "127.0.0.1";
    private String port = "80";
    private String protocol= "http";
    private String path;

    @Override
    public void addPort(String port) {
        this.port = port;
    }

    @Override
    public void addProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public void addHost(String host) {
        this.host = host;
    }

    @Override
    public void addPath(String path){
        this.path = path;
    }

    @Override
    public URL getURL(){
        try {
            return new URL(protocol + "://" + host + ":" + port + "/" + path);
        } catch(MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
