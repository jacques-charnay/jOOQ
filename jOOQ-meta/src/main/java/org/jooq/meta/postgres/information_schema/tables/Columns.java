/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;
import org.jooq.meta.postgres.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.columns</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.columns.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.ordinal_position</code>.
     */
    public final TableField<Record, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.column_default</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("column_default"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_nullable</code>.
     */
    public final TableField<Record, String> IS_NULLABLE = createField(DSL.name("is_nullable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.data_type</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.numeric_precision</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.numeric_scale</code>.
     */
    public final TableField<Record, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.datetime_precision</code>.
     */
    public final TableField<Record, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.interval_type</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.interval_precision</code>.
     */
    public final TableField<Record, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.character_set_catalog</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.character_set_schema</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.character_set_name</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_catalog</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_schema</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_name</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("collation_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_catalog</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_schema</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_name</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField(DSL.name("domain_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_catalog</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_schema</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_name</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_catalog</code>.
     */
    public final TableField<Record, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_schema</code>.
     */
    public final TableField<Record, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_name</code>.
     */
    public final TableField<Record, String> SCOPE_NAME = createField(DSL.name("scope_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.maximum_cardinality</code>.
     */
    public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.dtd_identifier</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_self_referencing</code>.
     */
    public final TableField<Record, String> IS_SELF_REFERENCING = createField(DSL.name("is_self_referencing"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.is_identity</code>.
     */
    public final TableField<Record, String> IS_IDENTITY = createField(DSL.name("is_identity"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.identity_generation</code>.
     */
    public final TableField<Record, String> IDENTITY_GENERATION = createField(DSL.name("identity_generation"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_start</code>.
     */
    public final TableField<Record, String> IDENTITY_START = createField(DSL.name("identity_start"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_increment</code>.
     */
    public final TableField<Record, String> IDENTITY_INCREMENT = createField(DSL.name("identity_increment"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_maximum</code>.
     */
    public final TableField<Record, String> IDENTITY_MAXIMUM = createField(DSL.name("identity_maximum"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_minimum</code>.
     */
    public final TableField<Record, String> IDENTITY_MINIMUM = createField(DSL.name("identity_minimum"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_cycle</code>.
     */
    public final TableField<Record, String> IDENTITY_CYCLE = createField(DSL.name("identity_cycle"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.is_generated</code>.
     */
    public final TableField<Record, String> IS_GENERATED = createField(DSL.name("is_generated"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.generation_expression</code>.
     */
    public final TableField<Record, String> GENERATION_EXPRESSION = createField(DSL.name("generation_expression"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_updatable</code>.
     */
    public final TableField<Record, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), SQLDataType.VARCHAR(3), this, "");

    private Columns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Columns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
    }

    /**
     * Create a <code>information_schema.columns</code> table reference
     */
    public Columns() {
        this(DSL.name("columns"), null);
    }

    public <O extends Record> Columns(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.COLUMNS__SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES, Keys.COLUMNS__SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Tables _tables;
    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the <code>information_schema.tables</code>
     * table.
     */
    public Tables tables() {
        if (_tables == null)
            _tables = new Tables(this, Keys.COLUMNS__SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES);

        return _tables;
    }

    /**
     * Get the implicit join path to the
     * <code>information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.COLUMNS__SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA);

        return _schemata;
    }

    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    @Override
    public Columns as(Table<?> alias) {
        return new Columns(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(String name) {
        return new Columns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Name name) {
        return new Columns(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Table<?> name) {
        return new Columns(name.getQualifiedName(), null);
    }
}
