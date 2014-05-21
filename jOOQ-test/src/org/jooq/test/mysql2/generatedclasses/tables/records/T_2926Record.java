/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_2926", schema = "test2")
public class T_2926Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1477242013;

	/**
	 * Setter for <code>test2.t_2926.t1</code>.
	 */
	public void setT1(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test2.t_2926.t1</code>.
	 */
	@javax.persistence.Column(name = "t1", length = 255)
	public java.lang.String getT1() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>test2.t_2926.t2</code>.
	 */
	public void setT2(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test2.t_2926.t2</code>.
	 */
	@javax.persistence.Column(name = "t2", length = 65535)
	public java.lang.String getT2() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>test2.t_2926.t3</code>.
	 */
	public void setT3(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test2.t_2926.t3</code>.
	 */
	@javax.persistence.Column(name = "t3", length = 16777215)
	public java.lang.String getT3() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>test2.t_2926.t4</code>.
	 */
	public void setT4(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test2.t_2926.t4</code>.
	 */
	@javax.persistence.Column(name = "t4")
	public java.lang.String getT4() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926.T1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926.T2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926.T3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926.T4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getT1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getT2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getT3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getT4();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value1(java.lang.String value) {
		setT1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value2(java.lang.String value) {
		setT2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value3(java.lang.String value) {
		setT3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value4(java.lang.String value) {
		setT4(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2926Record
	 */
	public T_2926Record() {
		super(org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926);
	}

	/**
	 * Create a detached, initialised T_2926Record
	 */
	public T_2926Record(java.lang.String t1, java.lang.String t2, java.lang.String t3, java.lang.String t4) {
		super(org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926);

		setValue(0, t1);
		setValue(1, t2);
		setValue(2, t3);
		setValue(3, t4);
	}
}
