package it.jdk.pattern.template;
//Algoritmo con dettagli specializzati dalle classi
public abstract class MaxTemplate<T>{
    public T max(T[] elements){
        T t1 = elements[0];
        for(T t2: elements){
            if(compare(t1,t2)){
                t1 = t2;
            }
        }
        return t1;
    }
    public abstract boolean compare(T t1, T t2);
}
