package it.jdk.pattern.template;

public class Test {
    public static void main(String[] arg){
        MaxTemplateInt maxTemplateInt = new MaxTemplateInt();
        System.out.println(maxTemplateInt.max(new Integer[]{3,4,1,5,8,9}));
        MaxTemplateString maxTemplateString = new MaxTemplateString();
        System.out.println(maxTemplateString.max(new String[]{"123","4578","123456789"}));
    }
}
