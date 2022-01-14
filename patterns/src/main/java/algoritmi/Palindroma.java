package algoritmi;


public class Palindroma {

    public static void main(String[] arg) {
        System.out.println(palindroma2(("ottetto")));
        System.out.println(palindroma2(("otto")));
        System.out.println(palindroma2(("ingegni")));
        System.out.println(palindroma2(("pippo")));
        System.out.println(palindroma2(("pluto")));
    }

    public static boolean palindroma(String caratteri){
        char[] chars = caratteri.toCharArray();
        int n = chars.length;
        for(int i=0; i<n; i++){
            if(chars[i]!=chars[n-1-i])
                return false;
        }
        return true;
    }

    public static boolean palindroma2(String caratteri){
        char[] chars = caratteri.toCharArray();
        int n = chars.length;
        for(int i=0; i<n; i++){
            int j = n-1-i;
            if(chars[i]!=chars[j])
                return false;
            if( (n%2==0 && i==j+1) || (n%2!=0 && i==j)){
                break;
            }
        }
        return true;
    }
}
