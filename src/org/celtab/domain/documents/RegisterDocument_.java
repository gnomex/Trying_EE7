package org.celtab.domain.documents;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.celtab.domain.model.TimeStampedBean_;

@Generated(value="Dali", date="2015-02-06T13:52:09.576-0200")
@StaticMetamodel(RegisterDocument.class)
public class RegisterDocument_ extends TimeStampedBean_ {
	public static volatile SingularAttribute<RegisterDocument, DocumentType> doc;
	public static volatile SingularAttribute<RegisterDocument, Date> shipping_date;
	public static volatile SingularAttribute<RegisterDocument, Integer> print_edition;
	public static volatile SingularAttribute<RegisterDocument, String> barcode;
	public static volatile SingularAttribute<RegisterDocument, String> code;
}
