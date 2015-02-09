package org.celtab.domain.address;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.celtab.domain.model.TimeStampedBean_;

@Generated(value="Dali", date="2015-02-06T11:14:48.116-0200")
@StaticMetamodel(Country.class)
public class Country_ extends TimeStampedBean_ {
	public static volatile SingularAttribute<Country, String> name;
	public static volatile SingularAttribute<Country, String> symbol;
	public static volatile SingularAttribute<Country, String> nationality_name;
}
