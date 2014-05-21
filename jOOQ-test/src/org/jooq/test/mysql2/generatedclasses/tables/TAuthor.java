/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 1203207537;

	/**
	 * The singleton instance of <code>test2.t_author</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.mysql2.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>test2.t_author.ID</code>. The author ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The author ID");

	/**
	 * The column <code>test2.t_author.FIRST_NAME</code>. The author's first name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "The author's first name");

	/**
	 * The column <code>test2.t_author.LAST_NAME</code>. The author's last name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "The author's last name");

	/**
	 * The column <code>test2.t_author.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this, "The author's date of birth");

	/**
	 * The column <code>test2.t_author.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this, "The author's year of birth");

	/**
	 * The column <code>test2.t_author.ADDRESS</code>. The author's address
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "The author's address");

	/**
	 * Create a <code>test2.t_author</code> table reference
	 */
	public TAuthor() {
		this("t_author", null);
	}

	/**
	 * Create an aliased <code>test2.t_author</code> table reference
	 */
	public TAuthor(java.lang.String alias) {
		this(alias, org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	private TAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private TAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, aliased, parameters, "An entity holding authors of books");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TAuthor(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.TAuthor rename(java.lang.String name) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TAuthor(name, null);
	}
}
