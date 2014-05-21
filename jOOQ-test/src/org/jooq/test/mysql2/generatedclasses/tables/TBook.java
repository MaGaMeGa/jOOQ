/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -657303269;

	/**
	 * The singleton instance of <code>test2.t_book</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.mysql2.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>test2.t_book.ID</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The book ID");

	/**
	 * The column <code>test2.t_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The author ID in entity 'author'");

	/**
	 * The column <code>test2.t_book.co_author_id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>test2.t_book.DETAILS_ID</code>. Some more details about the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "Some more details about the book");

	/**
	 * The column <code>test2.t_book.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "The book's title");

	/**
	 * The column <code>test2.t_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The year the book was published in");

	/**
	 * The column <code>test2.t_book.LANGUAGE_ID</code>. The language of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "The language of the book");

	/**
	 * The column <code>test2.t_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "Some textual content of the book");

	/**
	 * The column <code>test2.t_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this, "Some binary content of the book");

	/**
	 * The column <code>test2.t_book.STATUS</code>. The book's stock status
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.TBookStatus.class), this, "The book's stock status");

	/**
	 * Create a <code>test2.t_book</code> table reference
	 */
	public TBook() {
		this("t_book", null);
	}

	/**
	 * Create an aliased <code>test2.t_book</code> table reference
	 */
	public TBook(java.lang.String alias) {
		this(alias, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, aliased, parameters, "An entity holding books");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.mysql2.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.mysql2.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.TBook rename(java.lang.String name) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TBook(name, null);
	}
}
