package it.jdk.pattern.template;

public class MaxTemplateInt extends MaxTemplate<Integer> {
    @Override
    public boolean compare(Integer t1, Integer t2) {
        return t2>t1;
    }
}
