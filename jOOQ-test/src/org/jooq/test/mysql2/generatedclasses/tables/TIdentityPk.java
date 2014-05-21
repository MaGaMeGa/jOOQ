/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPk extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = -99639949;

	/**
	 * The singleton instance of <code>test2.t_identity_pk</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord.class;
	}

	/**
	 * The column <code>test2.t_identity_pk.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>test2.t_identity_pk.val</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>test2.t_identity_pk</code> table reference
	 */
	public TIdentityPk() {
		this("t_identity_pk", null);
	}

	/**
	 * Create an aliased <code>test2.t_identity_pk</code> table reference
	 */
	public TIdentityPk(java.lang.String alias) {
		this(alias, org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}

	private TIdentityPk(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentityPk(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.mysql2.generatedclasses.Keys.IDENTITY_T_IDENTITY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_IDENTITY_PK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_IDENTITY_PK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk rename(java.lang.String name) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk(name, null);
	}
}
