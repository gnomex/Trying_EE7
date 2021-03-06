package org.celtab.domain.person;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.celtab.domain.address.EspecificAddress;
import org.celtab.domain.contacts.Email;
import org.celtab.domain.contacts.Phone;
import org.celtab.domain.model.TimeStampedBean_;

@Generated(value="Dali", date="2015-02-10T12:00:41.108-0200")
@StaticMetamodel(Person.class)
public class Person_ extends TimeStampedBean_ {
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, EspecificAddress> address;
	public static volatile CollectionAttribute<Person, Phone> phones;
	public static volatile CollectionAttribute<Person, Email> emails;
}
