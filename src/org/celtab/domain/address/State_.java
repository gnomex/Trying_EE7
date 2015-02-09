package org.celtab.domain.address;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-03T22:10:41.052-0200")
@StaticMetamodel(State.class)
public class State_ {
	public static volatile SingularAttribute<State, Integer> id;
	public static volatile SingularAttribute<State, String> name;
	public static volatile SingularAttribute<State, String> symbol;
	public static volatile SingularAttribute<State, Country> country;
}
