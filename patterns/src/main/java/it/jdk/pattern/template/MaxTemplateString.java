package it.jdk.pattern.template;

public class MaxTemplateString extends MaxTemplate<String>{
    @Override
    public boolean compare(String t1, String t2) {
        return t2.length()>t1.length();
    }
}
