package org.celtab.domain.person;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-06T13:52:09.656-0200")
@StaticMetamodel(Natural.class)
public class Natural_ extends Person_ {
	public static volatile SingularAttribute<Natural, Date> birthDate;
	public static volatile SingularAttribute<Natural, String> surname;
	public static volatile SingularAttribute<Natural, String> MotherName;
	public static volatile SingularAttribute<Natural, String> FatherName;
	public static volatile SingularAttribute<Natural, Gender> gender;
}
