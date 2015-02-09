package org.celtab.domain.documents;

import javax.persistence.Entity;

import org.celtab.domain.model.TimeStampedBean;

@Entity
public class RegisterDocument extends TimeStampedBean {

	private static final long serialVersionUID = 1L;
	
	private DocumentType doc;

	private java.util.Date shipping_date;
	
	private Integer print_edition;
	private String barcode;
	private String code;
	
	public DocumentType getDoc() {
		return doc;
	}
	public void setDoc(DocumentType doc) {
		this.doc = doc;
	}
	public java.util.Date getShipping_date() {
		return shipping_date;
	}
	public void setShipping_date(java.util.Date shipping_date) {
		this.shipping_date = shipping_date;
	}
	public Integer getPrint_edition() {
		return print_edition;
	}
	public void setPrint_edition(Integer print_edition) {
		this.print_edition = print_edition;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((barcode == null) ? 0 : barcode.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((doc == null) ? 0 : doc.hashCode());
		result = prime * result
				+ ((print_edition == null) ? 0 : print_edition.hashCode());
		result = prime * result
				+ ((shipping_date == null) ? 0 : shipping_date.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterDocument other = (RegisterDocument) obj;
		if (barcode == null) {
			if (other.barcode != null)
				return false;
		} else if (!barcode.equals(other.barcode))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (doc != other.doc)
			return false;
		if (print_edition == null) {
			if (other.print_edition != null)
				return false;
		} else if (!print_edition.equals(other.print_edition))
			return false;
		if (shipping_date == null) {
			if (other.shipping_date != null)
				return false;
		} else if (!shipping_date.equals(other.shipping_date))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RegisterDocument [doc=" + doc + ", shipping_date="
				+ shipping_date + ", print_edition=" + print_edition
				+ ", barcode=" + barcode + ", code=" + code + "]";
	}
}
