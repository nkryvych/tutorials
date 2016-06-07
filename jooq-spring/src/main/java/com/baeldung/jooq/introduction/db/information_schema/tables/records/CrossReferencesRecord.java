/**
 * This class is generated by jOOQ
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.CrossReferences;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrossReferencesRecord extends TableRecordImpl<CrossReferencesRecord> implements Record14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> {

	private static final long serialVersionUID = -328289893;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
	 */
	public void setPktableCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
	 */
	public String getPktableCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
	 */
	public void setPktableSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
	 */
	public String getPktableSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
	 */
	public void setPktableName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
	 */
	public String getPktableName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
	 */
	public void setPkcolumnName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
	 */
	public String getPkcolumnName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
	 */
	public void setFktableCatalog(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
	 */
	public String getFktableCatalog() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
	 */
	public void setFktableSchema(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
	 */
	public String getFktableSchema() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
	 */
	public void setFktableName(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
	 */
	public String getFktableName() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
	 */
	public void setFkcolumnName(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
	 */
	public String getFkcolumnName() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
	 */
	public void setOrdinalPosition(Short value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
	 */
	public Short getOrdinalPosition() {
		return (Short) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
	 */
	public void setUpdateRule(Short value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
	 */
	public Short getUpdateRule() {
		return (Short) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
	 */
	public void setDeleteRule(Short value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
	 */
	public Short getDeleteRule() {
		return (Short) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
	 */
	public void setFkName(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
	 */
	public String getFkName() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
	 */
	public void setPkName(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
	 */
	public String getPkName() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
	 */
	public void setDeferrability(Short value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
	 */
	public Short getDeferrability() {
		return (Short) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return CrossReferences.CROSS_REFERENCES.PKTABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CrossReferences.CROSS_REFERENCES.PKTABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CrossReferences.CROSS_REFERENCES.PKTABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return CrossReferences.CROSS_REFERENCES.PKCOLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CrossReferences.CROSS_REFERENCES.FKTABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return CrossReferences.CROSS_REFERENCES.FKTABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return CrossReferences.CROSS_REFERENCES.FKTABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return CrossReferences.CROSS_REFERENCES.FKCOLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field9() {
		return CrossReferences.CROSS_REFERENCES.ORDINAL_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field10() {
		return CrossReferences.CROSS_REFERENCES.UPDATE_RULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field11() {
		return CrossReferences.CROSS_REFERENCES.DELETE_RULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return CrossReferences.CROSS_REFERENCES.FK_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return CrossReferences.CROSS_REFERENCES.PK_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field14() {
		return CrossReferences.CROSS_REFERENCES.DEFERRABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getPktableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getPktableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPktableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPkcolumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getFktableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getFktableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getFktableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getFkcolumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value9() {
		return getOrdinalPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value10() {
		return getUpdateRule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value11() {
		return getDeleteRule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getFkName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getPkName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value14() {
		return getDeferrability();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value1(String value) {
		setPktableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value2(String value) {
		setPktableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value3(String value) {
		setPktableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value4(String value) {
		setPkcolumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value5(String value) {
		setFktableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value6(String value) {
		setFktableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value7(String value) {
		setFktableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value8(String value) {
		setFkcolumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value9(Short value) {
		setOrdinalPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value10(Short value) {
		setUpdateRule(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value11(Short value) {
		setDeleteRule(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value12(String value) {
		setFkName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value13(String value) {
		setPkName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value14(Short value) {
		setDeferrability(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Short value9, Short value10, Short value11, String value12, String value13, Short value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CrossReferencesRecord
	 */
	public CrossReferencesRecord() {
		super(CrossReferences.CROSS_REFERENCES);
	}

	/**
	 * Create a detached, initialised CrossReferencesRecord
	 */
	public CrossReferencesRecord(String pktableCatalog, String pktableSchema, String pktableName, String pkcolumnName, String fktableCatalog, String fktableSchema, String fktableName, String fkcolumnName, Short ordinalPosition, Short updateRule, Short deleteRule, String fkName, String pkName, Short deferrability) {
		super(CrossReferences.CROSS_REFERENCES);

		setValue(0, pktableCatalog);
		setValue(1, pktableSchema);
		setValue(2, pktableName);
		setValue(3, pkcolumnName);
		setValue(4, fktableCatalog);
		setValue(5, fktableSchema);
		setValue(6, fktableName);
		setValue(7, fkcolumnName);
		setValue(8, ordinalPosition);
		setValue(9, updateRule);
		setValue(10, deleteRule);
		setValue(11, fkName);
		setValue(12, pkName);
		setValue(13, deferrability);
	}
}