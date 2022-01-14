package it.jdk.pattern.abstractfactory;

public class CustomAbstractFactoryBusinessUser extends DefaultAbstractFactoryBusinessUser{
    @Override
    public UserExpanded findUsersByFilter(int start, int max, DefaultFiltro defaultFiltro){
        return new UserExpanded();
    }
}
