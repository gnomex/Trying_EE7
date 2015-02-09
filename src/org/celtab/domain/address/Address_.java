package org.celtab.domain.address;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-03T22:15:48.781-0200")
@StaticMetamodel(Address.class)
public class Address_ {
	public static volatile SingularAttribute<Address, Integer> id;
	public static volatile SingularAttribute<Address, CEP> cep;
	public static volatile SingularAttribute<Address, Street> street;
	public static volatile SingularAttribute<Address, Neighborhood> neighborhood;
	public static volatile SingularAttribute<Address, City> city;
}
