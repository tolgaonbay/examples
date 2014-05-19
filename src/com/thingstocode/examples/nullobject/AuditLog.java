package com.thingstocode.examples.nullobject;

/**
 * Null object pattern example
 */
public class AuditLog {
	public static final AuditLog NULL = new NullAuditLog();
	
	private String id;
	private long date;
	private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void save() {
		//Persist to database
	}
	
	private static class NullAuditLog extends AuditLog {
		@Override
		public String getId() {
			return null;
		}

		@Override
		public void setId(String id) {
			//Do nothing
		}

		@Override
		public long getDate() {
			return 0;
		}

		@Override
		public void setDate(long date) {
			//Do nothing
		}

		@Override
		public String getText() {
			return null;
		}

		@Override
		public void setText(String text) {
			//Do nothing
		}

		@Override
		public void save() {
			//Do nothing
		}
	}
}
