package it.jdk.pattern.builder;

public class TextURLBuilder extends URLBuilder<String> {

    private String host = "127.0.0.1";
    private String port = "80";
    private String path = "";
    private String protocol= "http";

    @Override
    public void addPort(String port) {

        this.port = port;
    }

    @Override
    public void addProtocol(String protocol) {

        this.protocol = protocol;
    }

    @Override
    public void addPath(String path) {

        this.path = path;
    }

    @Override
    public void addHost(String host) {
        this.host = host;
    }

    @Override
    public String getURL(){
            return protocol + "://" + host + ":" + port + "/" + path;
    }
}
