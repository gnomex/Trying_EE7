package org.celtab.domain.address;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-03T22:10:41.038-0200")
@StaticMetamodel(EspecificAddress.class)
public class EspecificAddress_ {
	public static volatile SingularAttribute<EspecificAddress, Integer> id;
	public static volatile SingularAttribute<EspecificAddress, Integer> number;
	public static volatile SingularAttribute<EspecificAddress, String> complement;
	public static volatile SingularAttribute<EspecificAddress, Address> address;
}
