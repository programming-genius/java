package it.jdk.pattern.builder;

// Costruzione complessa di un oggetto e riutilizzo del codice
// separare il processo di creazione dalla sua rappresentazione
public class CustomURL<T> {
    public T construct(URLBuilder<T> builder, String protocol, String port, String path, String host) {
        builder.addProtocol(protocol);
        builder.addPort(port);
        builder.addPath(path);
        builder.addHost(host);
        return builder.getURL();
    }
}
