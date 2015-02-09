package org.celtab.domain.model.listeners;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.celtab.domain.model.TimeStampedBean;

/**
 * Callbacks from {@link TimestampedBean}.
 * 
 * Fill in createdAt and updatedAt in their respective callbacks.
 * 
 * @author Carlos A Becker
 */
public class TimestampListener {

	@PrePersist
	public void onPrePersist(TimeStampedBean bean) {
		bean.setCreatedAt(new Date());
		bean.setUpdatedAt(new Date());
	}

	@PreUpdate
	public void onPreUpdate(TimeStampedBean bean) {
		bean.setUpdatedAt(new Date());
	}
}
