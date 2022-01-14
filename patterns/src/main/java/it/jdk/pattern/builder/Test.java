package it.jdk.pattern.builder;

import java.net.URL;

public class Test {
    public static void main(String[] params){
        CustomURL<URL> customURL = new CustomURL<URL>();
        URL url1 = customURL.construct(new JavaURLBuilder(),"http","80","example","127.0.0.1");
        System.out.println(url1);
        CustomURL<String> customURL2 = new CustomURL<String>();
        String url2 = customURL2.construct(new TextURLBuilder(),"http","80","example","127.0.0.1");
        System.out.println(url2);
    }
}
