package org.celtab.domain.contacts;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.celtab.domain.person.Person;

@Generated(value="Dali", date="2015-02-09T10:39:29.298-0200")
@StaticMetamodel(Phone.class)
public class Phone_ {
	public static volatile SingularAttribute<Phone, Integer> id;
	public static volatile SingularAttribute<Phone, Integer> code;
	public static volatile SingularAttribute<Phone, String> number;
	public static volatile SingularAttribute<Phone, Person> owner;
}
