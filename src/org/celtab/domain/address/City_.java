package org.celtab.domain.address;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-03T22:10:41.002-0200")
@StaticMetamodel(City.class)
public class City_ {
	public static volatile SingularAttribute<City, Integer> id;
	public static volatile SingularAttribute<City, String> name;
	public static volatile SingularAttribute<City, String> symbol;
	public static volatile SingularAttribute<City, State> state;
}
