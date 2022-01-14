package it.jdk.pattern.builder;

public abstract class URLBuilder<T> {
    public abstract void addPort(String port);
    public abstract void addProtocol(String protocol);
    public abstract void addPath(String path);
    public abstract void addHost(String host);
    public abstract T getURL();
}
