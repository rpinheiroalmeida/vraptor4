package br.com.caelum.vraptor4.serialization.xstream;

import br.com.caelum.vraptor4.ioc.ApplicationScoped;

import com.thoughtworks.xstream.converters.SingleValueConverter;

/**
 * for DI purposes
 */
@ApplicationScoped
public class NullConverter implements SingleValueConverter {
    public String toString(Object o) {return null;}

    public Object fromString(String s) {return null;}

    public boolean canConvert(Class aClass) {return false;}
}