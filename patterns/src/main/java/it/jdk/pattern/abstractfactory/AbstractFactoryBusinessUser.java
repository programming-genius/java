package it.jdk.pattern.abstractfactory;

/**
 * Abstract factory/Factory Method per la funzionalit√† gestione utente.
 * Lo scopo √® realizzare un framework per riutilizzare codice
 * personalizzandolo.
 * @param <T> Utente
 * @param <K> Identificatore Utente
 * @param <R> Filtro
 */
public interface AbstractFactoryBusinessUser<T,K,R> {
        T createUser(T user);
        T updateUser(T user);
        T mergeUser(T user);
        void deleteUser(K id);
        T findById(K id);
        T findUsers(int start, int max);
        T findUsersByFilter(int start, int max, R filter);
}
