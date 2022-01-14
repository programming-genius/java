package it.jdk.pattern.abstractfactory;

public class DefaultAbstractFactoryBusinessUser implements AbstractFactoryBusinessUser<DefaultUser,Integer, DefaultFiltro>{

    @Override
    public DefaultUser createUser(DefaultUser user) {
        return null;
    }

    @Override
    public DefaultUser updateUser(DefaultUser user) {
        return null;
    }

    @Override
    public DefaultUser mergeUser(DefaultUser user) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public DefaultUser findById(Integer id) {
        return null;
    }

    @Override
    public DefaultUser findUsers(int start, int max) {
        return null;
    }

    @Override
    public DefaultUser findUsersByFilter(int start, int max, DefaultFiltro filter) {
        return null;
    }
}
