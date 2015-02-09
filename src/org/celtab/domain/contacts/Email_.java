package org.celtab.domain.contacts;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.celtab.domain.person.Person;

@Generated(value="Dali", date="2015-02-09T10:39:29.258-0200")
@StaticMetamodel(Email.class)
public class Email_ {
	public static volatile SingularAttribute<Email, Integer> id;
	public static volatile SingularAttribute<Email, Person> owner;
	public static volatile SingularAttribute<Email, String> virtualAddress;
}
