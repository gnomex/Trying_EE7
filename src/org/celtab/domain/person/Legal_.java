package org.celtab.domain.person;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-09T10:39:29.302-0200")
@StaticMetamodel(Legal.class)
public class Legal_ extends Person_ {
	public static volatile SingularAttribute<Legal, String> registration_number;
	public static volatile SingularAttribute<Legal, String> tradingName;
	public static volatile SingularAttribute<Legal, String> cod_desc_economy_activity;
	public static volatile SingularAttribute<Legal, String> cod_decs_legal_nature;
}
