/*
 * Copyright 2009-2010 BeDataDriven (alex@bedatadriven.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package java.sql;

public interface DatabaseMetaData extends Wrapper {

  //----------------------------------------------------------------------
  // First, a variety of minor information about the target database.

  /**
   * Retrieves whether the current user can call all the procedures
   * returned by the method <code>getProcedures</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean allProceduresAreCallable() throws SQLException;

  /**
   * Retrieves whether the current user can use all the tables returned
   * by the method <code>getTables</code> in a <code>SELECT</code>
   * statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean allTablesAreSelectable() throws SQLException;

  /**
   * Retrieves the URL for this DBMS.
   *
   * @return the URL for this DBMS or <code>null</code> if it cannot be
   *         generated
   * @throws SQLException if a database access error occurs
   */
  String getURL() throws SQLException;

  /**
   * Retrieves the user name as known to this database.
   *
   * @return the database user name
   * @throws SQLException if a database access error occurs
   */
  String getUserName() throws SQLException;

  /**
   * Retrieves whether this database is in read-only mode.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean isReadOnly() throws SQLException;

  /**
   * Retrieves whether <code>NULL</code> values are sorted high.
   * Sorted high means that <code>NULL</code> values
   * sort higher than any other value in a domain.  In an ascending order,
   * if this method returns <code>true</code>,  <code>NULL</code> values
   * will appear at the end. By contrast, the method
   * <code>nullsAreSortedAtEnd</code> indicates whether <code>NULL</code> values
   * are sorted at the end regardless of sort order.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean nullsAreSortedHigh() throws SQLException;

  /**
   * Retrieves whether <code>NULL</code> values are sorted low.
   * Sorted low means that <code>NULL</code> values
   * sort lower than any other value in a domain.  In an ascending order,
   * if this method returns <code>true</code>,  <code>NULL</code> values
   * will appear at the beginning. By contrast, the method
   * <code>nullsAreSortedAtStart</code> indicates whether <code>NULL</code> values
   * are sorted at the beginning regardless of sort order.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean nullsAreSortedLow() throws SQLException;

  /**
   * Retrieves whether <code>NULL</code> values are sorted at the start regardless
   * of sort order.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean nullsAreSortedAtStart() throws SQLException;

  /**
   * Retrieves whether <code>NULL</code> values are sorted at the end regardless of
   * sort order.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean nullsAreSortedAtEnd() throws SQLException;

  /**
   * Retrieves the name of this database product.
   *
   * @return database product name
   * @throws SQLException if a database access error occurs
   */
  String getDatabaseProductName() throws SQLException;

  /**
   * Retrieves the version number of this database product.
   *
   * @return database version number
   * @throws SQLException if a database access error occurs
   */
  String getDatabaseProductVersion() throws SQLException;

  /**
   * Retrieves the name of this JDBC driver.
   *
   * @return JDBC driver name
   * @throws SQLException if a database access error occurs
   */
  String getDriverName() throws SQLException;

  /**
   * Retrieves the version number of this JDBC driver as a <code>String</code>.
   *
   * @return JDBC driver version
   * @throws SQLException if a database access error occurs
   */
  String getDriverVersion() throws SQLException;

  /**
   * Retrieves this JDBC driver's major version number.
   *
   * @return JDBC driver major version
   */
  int getDriverMajorVersion();

  /**
   * Retrieves this JDBC driver's minor version number.
   *
   * @return JDBC driver minor version number
   */
  int getDriverMinorVersion();

  /**
   * Retrieves whether this database stores tables in a local file.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean usesLocalFiles() throws SQLException;

  /**
   * Retrieves whether this database uses a file for each table.
   *
   * @return <code>true</code> if this database uses a local file for each table;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean usesLocalFilePerTable() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case unquoted SQL identifiers as
   * case sensitive and as a result stores them in mixed case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsMixedCaseIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case unquoted SQL identifiers as
   * case insensitive and stores them in upper case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesUpperCaseIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case unquoted SQL identifiers as
   * case insensitive and stores them in lower case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesLowerCaseIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case unquoted SQL identifiers as
   * case insensitive and stores them in mixed case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesMixedCaseIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case quoted SQL identifiers as
   * case sensitive and as a result stores them in mixed case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsMixedCaseQuotedIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case quoted SQL identifiers as
   * case insensitive and stores them in upper case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesUpperCaseQuotedIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case quoted SQL identifiers as
   * case insensitive and stores them in lower case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesLowerCaseQuotedIdentifiers() throws SQLException;

  /**
   * Retrieves whether this database treats mixed case quoted SQL identifiers as
   * case insensitive and stores them in mixed case.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean storesMixedCaseQuotedIdentifiers() throws SQLException;

  /**
   * Retrieves the string used to quote SQL identifiers.
   * This method returns a space " " if identifier quoting is not supported.
   *
   * @return the quoting string or a space if quoting is not supported
   * @throws SQLException if a database access error occurs
   */
  String getIdentifierQuoteString() throws SQLException;

  /**
   * Retrieves a comma-separated list of all of this database's SQL keywords
   * that are NOT also SQL:2003 keywords.
   *
   * @return the list of this database's keywords that are not also
   *         SQL:2003 keywords
   * @throws SQLException if a database access error occurs
   */
  String getSQLKeywords() throws SQLException;

  /**
   * Retrieves a comma-separated list of math functions available with
   * this database.  These are the Open /Open CLI math function names used in
   * the JDBC function escape clause.
   *
   * @return the list of math functions supported by this database
   * @throws SQLException if a database access error occurs
   */
  String getNumericFunctions() throws SQLException;

  /**
   * Retrieves a comma-separated list of string functions available with
   * this database.  These are the  Open Group CLI string function names used
   * in the JDBC function escape clause.
   *
   * @return the list of string functions supported by this database
   * @throws SQLException if a database access error occurs
   */
  String getStringFunctions() throws SQLException;

  /**
   * Retrieves a comma-separated list of system functions available with
   * this database.  These are the  Open Group CLI system function names used
   * in the JDBC function escape clause.
   *
   * @return a list of system functions supported by this database
   * @throws SQLException if a database access error occurs
   */
  String getSystemFunctions() throws SQLException;

  /**
   * Retrieves a comma-separated list of the time and date functions available
   * with this database.
   *
   * @return the list of time and date functions supported by this database
   * @throws SQLException if a database access error occurs
   */
  String getTimeDateFunctions() throws SQLException;

  /**
   * Retrieves the string that can be used to escape wildcard characters.
   * This is the string that can be used to escape '_' or '%' in
   * the catalog search parameters that are a pattern (and therefore use one
   * of the wildcard characters).
   * <p/>
   * <P>The '_' character represents any single character;
   * the '%' character represents any sequence of zero or
   * more characters.
   *
   * @return the string used to escape wildcard characters
   * @throws SQLException if a database access error occurs
   */
  String getSearchStringEscape() throws SQLException;

  /**
   * Retrieves all the "extra" characters that can be used in unquoted
   * identifier names (those beyond a-z, A-Z, 0-9 and _).
   *
   * @return the string containing the extra characters
   * @throws SQLException if a database access error occurs
   */
  String getExtraNameCharacters() throws SQLException;

  //--------------------------------------------------------------------
  // Functions describing which features are supported.

  /**
   * Retrieves whether this database supports <code>ALTER TABLE</code>
   * with add column.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsAlterTableWithAddColumn() throws SQLException;

  /**
   * Retrieves whether this database supports <code>ALTER TABLE</code>
   * with drop column.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsAlterTableWithDropColumn() throws SQLException;

  /**
   * Retrieves whether this database supports column aliasing.
   * <p/>
   * <P>If so, the SQL AS clause can be used to provide names for
   * computed columns or to provide alias names for columns as
   * required.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsColumnAliasing() throws SQLException;

  /**
   * Retrieves whether this database supports concatenations between
   * <code>NULL</code> and non-<code>NULL</code> values being
   * <code>NULL</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean nullPlusNonNullIsNull() throws SQLException;

  /**
   * Retrieves whether this database supports the JDBC scalar function
   * <code>CONVERT</code> for the conversion of one JDBC type to another.
   * The JDBC types are the generic SQL data types defined
   * in <code>java.sql.Types</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsConvert() throws SQLException;

  /**
   * Retrieves whether this database supports the JDBC scalar function
   * <code>CONVERT</code> for conversions between the JDBC types <i>fromType</i>
   * and <i>toType</i>.  The JDBC types are the generic SQL data types defined
   * in <code>java.sql.Types</code>.
   *
   * @param fromType the type to convert from; one of the type codes from
   *                 the class <code>java.sql.Types</code>
   * @param toType   the type to convert to; one of the type codes from
   *                 the class <code>java.sql.Types</code>
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @see Types
   */
  boolean supportsConvert(int fromType, int toType) throws SQLException;

  /**
   * Retrieves whether this database supports table correlation names.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsTableCorrelationNames() throws SQLException;

  /**
   * Retrieves whether, when table correlation names are supported, they
   * are restricted to being different from the names of the tables.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsDifferentTableCorrelationNames() throws SQLException;

  /**
   * Retrieves whether this database supports expressions in
   * <code>ORDER BY</code> lists.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsExpressionsInOrderBy() throws SQLException;

  /**
   * Retrieves whether this database supports using a column that is
   * not in the <code>SELECT</code> statement in an
   * <code>ORDER BY</code> clause.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOrderByUnrelated() throws SQLException;

  /**
   * Retrieves whether this database supports some form of
   * <code>GROUP BY</code> clause.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsGroupBy() throws SQLException;

  /**
   * Retrieves whether this database supports using a column that is
   * not in the <code>SELECT</code> statement in a
   * <code>GROUP BY</code> clause.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsGroupByUnrelated() throws SQLException;

  /**
   * Retrieves whether this database supports using columns not included in
   * the <code>SELECT</code> statement in a <code>GROUP BY</code> clause
   * provided that all of the columns in the <code>SELECT</code> statement
   * are included in the <code>GROUP BY</code> clause.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsGroupByBeyondSelect() throws SQLException;

  /**
   * Retrieves whether this database supports specifying a
   * <code>LIKE</code> escape clause.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsLikeEscapeClause() throws SQLException;

  /**
   * Retrieves whether this database supports getting multiple
   * <code>ResultSet</code> objects from a single call to the
   * method <code>execute</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsMultipleResultSets() throws SQLException;

  /**
   * Retrieves whether this database allows having multiple
   * transactions open at once (on different connections).
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsMultipleTransactions() throws SQLException;

  /**
   * Retrieves whether columns in this database may be defined as non-nullable.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsNonNullableColumns() throws SQLException;

  /**
   * Retrieves whether this database supports the ODBC Minimum SQL grammar.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsMinimumSQLGrammar() throws SQLException;

  /**
   * Retrieves whether this database supports the ODBC Core SQL grammar.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCoreSQLGrammar() throws SQLException;

  /**
   * Retrieves whether this database supports the ODBC Extended SQL grammar.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsExtendedSQLGrammar() throws SQLException;

  /**
   * Retrieves whether this database supports the ANSI92 entry level SQL
   * grammar.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsANSI92EntryLevelSQL() throws SQLException;

  /**
   * Retrieves whether this database supports the ANSI92 intermediate SQL grammar supported.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsANSI92IntermediateSQL() throws SQLException;

  /**
   * Retrieves whether this database supports the ANSI92 full SQL grammar supported.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsANSI92FullSQL() throws SQLException;

  /**
   * Retrieves whether this database supports the SQL Integrity
   * Enhancement Facility.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsIntegrityEnhancementFacility() throws SQLException;

  /**
   * Retrieves whether this database supports some form of outer join.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOuterJoins() throws SQLException;

  /**
   * Retrieves whether this database supports full nested outer joins.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsFullOuterJoins() throws SQLException;

  /**
   * Retrieves whether this database provides limited support for outer
   * joins.  (This will be <code>true</code> if the method
   * <code>supportsFullOuterJoins</code> returns <code>true</code>).
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsLimitedOuterJoins() throws SQLException;

  /**
   * Retrieves the database vendor's preferred term for "schema".
   *
   * @return the vendor term for "schema"
   * @throws SQLException if a database access error occurs
   */
  String getSchemaTerm() throws SQLException;

  /**
   * Retrieves the database vendor's preferred term for "procedure".
   *
   * @return the vendor term for "procedure"
   * @throws SQLException if a database access error occurs
   */
  String getProcedureTerm() throws SQLException;

  /**
   * Retrieves the database vendor's preferred term for "catalog".
   *
   * @return the vendor term for "catalog"
   * @throws SQLException if a database access error occurs
   */
  String getCatalogTerm() throws SQLException;

  /**
   * Retrieves whether a catalog appears at the start of a fully qualified
   * table name.  If not, the catalog appears at the end.
   *
   * @return <code>true</code> if the catalog name appears at the beginning
   *         of a fully qualified table name; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean isCatalogAtStart() throws SQLException;

  /**
   * Retrieves the <code>String</code> that this database uses as the
   * separator between a catalog and table name.
   *
   * @return the separator string
   * @throws SQLException if a database access error occurs
   */
  String getCatalogSeparator() throws SQLException;

  /**
   * Retrieves whether a schema name can be used in a data manipulation statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSchemasInDataManipulation() throws SQLException;

  /**
   * Retrieves whether a schema name can be used in a procedure call statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSchemasInProcedureCalls() throws SQLException;

  /**
   * Retrieves whether a schema name can be used in a table definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSchemasInTableDefinitions() throws SQLException;

  /**
   * Retrieves whether a schema name can be used in an index definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSchemasInIndexDefinitions() throws SQLException;

  /**
   * Retrieves whether a schema name can be used in a privilege definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSchemasInPrivilegeDefinitions() throws SQLException;

  /**
   * Retrieves whether a catalog name can be used in a data manipulation statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCatalogsInDataManipulation() throws SQLException;

  /**
   * Retrieves whether a catalog name can be used in a procedure call statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCatalogsInProcedureCalls() throws SQLException;

  /**
   * Retrieves whether a catalog name can be used in a table definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCatalogsInTableDefinitions() throws SQLException;

  /**
   * Retrieves whether a catalog name can be used in an index definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCatalogsInIndexDefinitions() throws SQLException;

  /**
   * Retrieves whether a catalog name can be used in a privilege definition statement.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException;


  /**
   * Retrieves whether this database supports positioned <code>DELETE</code>
   * statements.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsPositionedDelete() throws SQLException;

  /**
   * Retrieves whether this database supports positioned <code>UPDATE</code>
   * statements.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsPositionedUpdate() throws SQLException;

  /**
   * Retrieves whether this database supports <code>SELECT FOR UPDATE</code>
   * statements.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSelectForUpdate() throws SQLException;

  /**
   * Retrieves whether this database supports stored procedure calls
   * that use the stored procedure escape syntax.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsStoredProcedures() throws SQLException;

  /**
   * Retrieves whether this database supports subqueries in comparison
   * expressions.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSubqueriesInComparisons() throws SQLException;

  /**
   * Retrieves whether this database supports subqueries in
   * <code>EXISTS</code> expressions.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSubqueriesInExists() throws SQLException;

  /**
   * Retrieves whether this database supports subqueries in
   * <code>IN</code> expressions.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSubqueriesInIns() throws SQLException;

  /**
   * Retrieves whether this database supports subqueries in quantified
   * expressions.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsSubqueriesInQuantifieds() throws SQLException;

  /**
   * Retrieves whether this database supports correlated subqueries.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsCorrelatedSubqueries() throws SQLException;

  /**
   * Retrieves whether this database supports SQL <code>UNION</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsUnion() throws SQLException;

  /**
   * Retrieves whether this database supports SQL <code>UNION ALL</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsUnionAll() throws SQLException;

  /**
   * Retrieves whether this database supports keeping cursors open
   * across commits.
   *
   * @return <code>true</code> if cursors always remain open;
   *         <code>false</code> if they might not remain open
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOpenCursorsAcrossCommit() throws SQLException;

  /**
   * Retrieves whether this database supports keeping cursors open
   * across rollbacks.
   *
   * @return <code>true</code> if cursors always remain open;
   *         <code>false</code> if they might not remain open
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOpenCursorsAcrossRollback() throws SQLException;

  /**
   * Retrieves whether this database supports keeping statements open
   * across commits.
   *
   * @return <code>true</code> if statements always remain open;
   *         <code>false</code> if they might not remain open
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOpenStatementsAcrossCommit() throws SQLException;

  /**
   * Retrieves whether this database supports keeping statements open
   * across rollbacks.
   *
   * @return <code>true</code> if statements always remain open;
   *         <code>false</code> if they might not remain open
   * @throws SQLException if a database access error occurs
   */
  boolean supportsOpenStatementsAcrossRollback() throws SQLException;


  //----------------------------------------------------------------------
  // The following group of methods exposes various limitations
  // based on the target database with the current driver.
  // Unless otherwise specified, a result of zero means there is no
  // limit, or the limit is not known.

  /**
   * Retrieves the maximum number of hex characters this database allows in an
   * inline binary literal.
   *
   * @return max the maximum length (in hex characters) for a binary literal;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxBinaryLiteralLength() throws SQLException;

  /**
   * Retrieves the maximum number of characters this database allows
   * for a character literal.
   *
   * @return the maximum number of characters allowed for a character literal;
   *         a result of zero means that there is no limit or the limit is
   *         not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxCharLiteralLength() throws SQLException;

  /**
   * Retrieves the maximum number of characters this database allows
   * for a column name.
   *
   * @return the maximum number of characters allowed for a column name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of columns this database allows in a
   * <code>GROUP BY</code> clause.
   *
   * @return the maximum number of columns allowed;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnsInGroupBy() throws SQLException;

  /**
   * Retrieves the maximum number of columns this database allows in an index.
   *
   * @return the maximum number of columns allowed;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnsInIndex() throws SQLException;

  /**
   * Retrieves the maximum number of columns this database allows in an
   * <code>ORDER BY</code> clause.
   *
   * @return the maximum number of columns allowed;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnsInOrderBy() throws SQLException;

  /**
   * Retrieves the maximum number of columns this database allows in a
   * <code>SELECT</code> list.
   *
   * @return the maximum number of columns allowed;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnsInSelect() throws SQLException;

  /**
   * Retrieves the maximum number of columns this database allows in a table.
   *
   * @return the maximum number of columns allowed;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxColumnsInTable() throws SQLException;

  /**
   * Retrieves the maximum number of concurrent connections to this
   * database that are possible.
   *
   * @return the maximum number of active connections possible at one time;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxConnections() throws SQLException;

  /**
   * Retrieves the maximum number of characters that this database allows in a
   * cursor name.
   *
   * @return the maximum number of characters allowed in a cursor name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxCursorNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of bytes this database allows for an
   * index, including all of the parts of the index.
   *
   * @return the maximum number of bytes allowed; this limit includes the
   *         composite of all the constituent parts of the index;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxIndexLength() throws SQLException;

  /**
   * Retrieves the maximum number of characters that this database allows in a
   * schema name.
   *
   * @return the maximum number of characters allowed in a schema name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxSchemaNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of characters that this database allows in a
   * procedure name.
   *
   * @return the maximum number of characters allowed in a procedure name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxProcedureNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of characters that this database allows in a
   * catalog name.
   *
   * @return the maximum number of characters allowed in a catalog name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxCatalogNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of bytes this database allows in
   * a single row.
   *
   * @return the maximum number of bytes allowed for a row; a result of
   *         zero means that there is no limit or the limit is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxRowSize() throws SQLException;

  /**
   * Retrieves whether the return value for the method
   * <code>getMaxRowSize</code> includes the SQL data types
   * <code>LONGVARCHAR</code> and <code>LONGVARBINARY</code>.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean doesMaxRowSizeIncludeBlobs() throws SQLException;

  /**
   * Retrieves the maximum number of characters this database allows in
   * an SQL statement.
   *
   * @return the maximum number of characters allowed for an SQL statement;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxStatementLength() throws SQLException;

  /**
   * Retrieves the maximum number of active statements to this database
   * that can be open at the same time.
   *
   * @return the maximum number of statements that can be open at one time;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxStatements() throws SQLException;

  /**
   * Retrieves the maximum number of characters this database allows in
   * a table name.
   *
   * @return the maximum number of characters allowed for a table name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxTableNameLength() throws SQLException;

  /**
   * Retrieves the maximum number of tables this database allows in a
   * <code>SELECT</code> statement.
   *
   * @return the maximum number of tables allowed in a <code>SELECT</code>
   *         statement; a result of zero means that there is no limit or
   *         the limit is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxTablesInSelect() throws SQLException;

  /**
   * Retrieves the maximum number of characters this database allows in
   * a user name.
   *
   * @return the maximum number of characters allowed for a user name;
   *         a result of zero means that there is no limit or the limit
   *         is not known
   * @throws SQLException if a database access error occurs
   */
  int getMaxUserNameLength() throws SQLException;

  //----------------------------------------------------------------------

  /**
   * Retrieves this database's default transaction isolation level.  The
   * possible values are defined in <code>java.sql.Connection</code>.
   *
   * @return the default isolation level
   * @throws SQLException if a database access error occurs
   * @see Connection
   */
  int getDefaultTransactionIsolation() throws SQLException;

  /**
   * Retrieves whether this database supports transactions. If not, invoking the
   * method <code>commit</code> is a noop, and the isolation level is
   * <code>TRANSACTION_NONE</code>.
   *
   * @return <code>true</code> if transactions are supported;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsTransactions() throws SQLException;

  /**
   * Retrieves whether this database supports the given transaction isolation level.
   *
   * @param level one of the transaction isolation levels defined in
   *              <code>java.sql.Connection</code>
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @see Connection
   */
  boolean supportsTransactionIsolationLevel(int level)
      throws SQLException;

  /**
   * Retrieves whether this database supports both data definition and
   * data manipulation statements within a transaction.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsDataDefinitionAndDataManipulationTransactions()
      throws SQLException;

  /**
   * Retrieves whether this database supports only data manipulation
   * statements within a transaction.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean supportsDataManipulationTransactionsOnly()
      throws SQLException;

  /**
   * Retrieves whether a data definition statement within a transaction forces
   * the transaction to commit.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean dataDefinitionCausesTransactionCommit()
      throws SQLException;

  /**
   * Retrieves whether this database ignores a data definition statement
   * within a transaction.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   */
  boolean dataDefinitionIgnoredInTransactions()
      throws SQLException;

  /**
   * Retrieves a description of the stored procedures available in the given
   * catalog.
   * <p/>
   * Only procedure descriptions matching the schema and
   * procedure name criteria are returned.  They are ordered by
   * <code>PROCEDURE_CAT</code>, <code>PROCEDURE_SCHEM</code>,
   * <code>PROCEDURE_NAME</code> and <code>SPECIFIC_ NAME</code>.
   * <p/>
   * <P>Each procedure description has the the following columns:
   * <OL>
   * <LI><B>PROCEDURE_CAT</B> String => procedure catalog (may be <code>null</code>)
   * <LI><B>PROCEDURE_SCHEM</B> String => procedure schema (may be <code>null</code>)
   * <LI><B>PROCEDURE_NAME</B> String => procedure name
   * <LI> reserved for future use
   * <LI> reserved for future use
   * <LI> reserved for future use
   * <LI><B>REMARKS</B> String => explanatory comment on the procedure
   * <LI><B>PROCEDURE_TYPE</B> short => kind of procedure:
   * <UL>
   * <LI> procedureResultUnknown - Cannot determine if  a return value
   * will be returned
   * <LI> procedureNoResult - Does not return a return value
   * <LI> procedureReturnsResult - Returns a return value
   * </UL>
   * <LI><B>SPECIFIC_NAME</B> String  => The name which uniquely identifies this
   * procedure within its schema.
   * </OL>
   * <p/>
   * A user may not have permissions to execute any of the procedures that are
   * returned by <code>getProcedures</code>
   *
   * @param catalog              a catalog name; must match the catalog name as it
   *                             is stored in the database; "" retrieves those without a catalog;
   *                             <code>null</code> means that the catalog name should not be used to narrow
   *                             the search
   * @param schemaPattern        a schema name pattern; must match the schema name
   *                             as it is stored in the database; "" retrieves those without a schema;
   *                             <code>null</code> means that the schema name should not be used to narrow
   *                             the search
   * @param procedureNamePattern a procedure name pattern; must match the
   *                             procedure name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a procedure description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getProcedures(String catalog, String schemaPattern,
                          String procedureNamePattern) throws SQLException;

  /**
   * Indicates that it is not known whether the procedure returns
   * a result.
   * <p/>
   * A possible value for column <code>PROCEDURE_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getProcedures</code>.
   */
  int procedureResultUnknown = 0;

  /**
   * Indicates that the procedure does not return a result.
   * <p/>
   * A possible value for column <code>PROCEDURE_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getProcedures</code>.
   */
  int procedureNoResult = 1;

  /**
   * Indicates that the procedure returns a result.
   * <p/>
   * A possible value for column <code>PROCEDURE_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getProcedures</code>.
   */
  int procedureReturnsResult = 2;

  /**
   * Retrieves a description of the given catalog's stored procedure parameter
   * and result columns.
   * <p/>
   * <P>Only descriptions matching the schema, procedure and
   * parameter name criteria are returned.  They are ordered by
   * PROCEDURE_CAT, PROCEDURE_SCHEM, PROCEDURE_NAME and SPECIFIC_NAME. Within this, the return value,
   * if any, is first. Next are the parameter descriptions in call
   * order. The column descriptions follow in column number order.
   * <p/>
   * <P>Each row in the <code>ResultSet</code> is a parameter description or
   * column description with the following fields:
   * <OL>
   * <LI><B>PROCEDURE_CAT</B> String => procedure catalog (may be <code>null</code>)
   * <LI><B>PROCEDURE_SCHEM</B> String => procedure schema (may be <code>null</code>)
   * <LI><B>PROCEDURE_NAME</B> String => procedure name
   * <LI><B>COLUMN_NAME</B> String => column/parameter name
   * <LI><B>COLUMN_TYPE</B> Short => kind of column/parameter:
   * <UL>
   * <LI> procedureColumnUnknown - nobody knows
   * <LI> procedureColumnIn - IN parameter
   * <LI> procedureColumnInOut - INOUT parameter
   * <LI> procedureColumnOut - OUT parameter
   * <LI> procedureColumnReturn - procedure return value
   * <LI> procedureColumnResult - result column in <code>ResultSet</code>
   * </UL>
   * <LI><B>DATA_TYPE</B> int => SQL type from java.sql.Types
   * <LI><B>TYPE_NAME</B> String => SQL type name, for a UDT type the
   * type name is fully qualified
   * <LI><B>PRECISION</B> int => precision
   * <LI><B>LENGTH</B> int => length in bytes of data
   * <LI><B>SCALE</B> short => scale -  null is returned for data types where
   * SCALE is not applicable.
   * <LI><B>RADIX</B> short => radix
   * <LI><B>NULLABLE</B> short => can it contain NULL.
   * <UL>
   * <LI> procedureNoNulls - does not allow NULL values
   * <LI> procedureNullable - allows NULL values
   * <LI> procedureNullableUnknown - nullability unknown
   * </UL>
   * <LI><B>REMARKS</B> String => comment describing parameter/column
   * <LI><B>COLUMN_DEF</B> String => default value for the column, which should be interpreted as a string when the value is enclosed in single quotes (may be <code>null</code>)
   * <UL>
   * <LI> The string NULL (not enclosed in quotes) - if NULL was specified as the default value
   * <LI> TRUNCATE (not enclosed in quotes)        - if the specified default value cannot be represented without truncation
   * <LI> NULL                                     - if a default value was not specified
   * </UL>
   * <LI><B>SQL_DATA_TYPE</B> int  => reserved for future use
   * <LI><B>SQL_DATETIME_SUB</B> int  => reserved for future use
   * <LI><B>CHAR_OCTET_LENGTH</B> int  => the maximum length of binary and character based columns.  For any other datatype the returned value is a
   * NULL
   * <LI><B>ORDINAL_POSITION</B> int  => the ordinal position, starting from 1, for the input and output parameters for a procedure. A value of 0
   * is returned if this row describes the procedure's return value.  For result set columns, it is the
   * ordinal position of the column in the result set starting from 1.  If there are
   * multiple result sets, the column ordinal positions are implementation
   * defined.
   * <LI><B>IS_NULLABLE</B> String  => ISO rules are used to determine the nullability for a column.
   * <UL>
   * <LI> YES           --- if the parameter can include NULLs
   * <LI> NO            --- if the parameter cannot include NULLs
   * <LI> empty string  --- if the nullability for the
   * parameter is unknown
   * </UL>
   * <LI><B>SPECIFIC_NAME</B> String  => the name which uniquely identifies this procedure within its schema.
   * </OL>
   * <p/>
   * <P><B>Note:</B> Some databases may not return the column
   * descriptions for a procedure.
   * <p/>
   * <p>The PRECISION column represents the specified column size for the given column.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @param catalog              a catalog name; must match the catalog name as it
   *                             is stored in the database; "" retrieves those without a catalog;
   *                             <code>null</code> means that the catalog name should not be used to narrow
   *                             the search
   * @param schemaPattern        a schema name pattern; must match the schema name
   *                             as it is stored in the database; "" retrieves those without a schema;
   *                             <code>null</code> means that the schema name should not be used to narrow
   *                             the search
   * @param procedureNamePattern a procedure name pattern; must match the
   *                             procedure name as it is stored in the database
   * @param columnNamePattern    a column name pattern; must match the column name
   *                             as it is stored in the database
   * @return <code>ResultSet</code> - each row describes a stored procedure parameter or
   *         column
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getProcedureColumns(String catalog,
                                String schemaPattern,
                                String procedureNamePattern,
                                String columnNamePattern) throws SQLException;

  /**
   * Indicates that type of the column is unknown.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnUnknown = 0;

  /**
   * Indicates that the column stores IN parameters.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnIn = 1;

  /**
   * Indicates that the column stores INOUT parameters.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnInOut = 2;

  /**
   * Indicates that the column stores OUT parameters.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnOut = 4;
  /**
   * Indicates that the column stores return values.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnReturn = 5;

  /**
   * Indicates that the column stores results.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureColumnResult = 3;

  /**
   * Indicates that <code>NULL</code> values are not allowed.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureNoNulls = 0;

  /**
   * Indicates that <code>NULL</code> values are allowed.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureNullable = 1;

  /**
   * Indicates that whether <code>NULL</code> values are allowed
   * is unknown.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getProcedureColumns</code>.
   */
  int procedureNullableUnknown = 2;


  /**
   * Retrieves a description of the tables available in the given catalog.
   * Only table descriptions matching the catalog, schema, table
   * name and type criteria are returned.  They are ordered by
   * <code>TABLE_TYPE</code>, <code>TABLE_CAT</code>,
   * <code>TABLE_SCHEM</code> and <code>TABLE_NAME</code>.
   * <p/>
   * Each table description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>TABLE_TYPE</B> String => table type.  Typical types are "TABLE",
   * "VIEW",	"SYSTEM TABLE", "GLOBAL TEMPORARY",
   * "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
   * <LI><B>REMARKS</B> String => explanatory comment on the table
   * <LI><B>TYPE_CAT</B> String => the types catalog (may be <code>null</code>)
   * <LI><B>TYPE_SCHEM</B> String => the types schema (may be <code>null</code>)
   * <LI><B>TYPE_NAME</B> String => type name (may be <code>null</code>)
   * <LI><B>SELF_REFERENCING_COL_NAME</B> String => name of the designated
   * "identifier" column of a typed table (may be <code>null</code>)
   * <LI><B>REF_GENERATION</B> String => specifies how values in
   * SELF_REFERENCING_COL_NAME are created. Values are
   * "SYSTEM", "USER", "DERIVED". (may be <code>null</code>)
   * </OL>
   * <p/>
   * <P><B>Note:</B> Some databases may not return information for
   * all tables.
   *
   * @param catalog          a catalog name; must match the catalog name as it
   *                         is stored in the database; "" retrieves those without a catalog;
   *                         <code>null</code> means that the catalog name should not be used to narrow
   *                         the search
   * @param schemaPattern    a schema name pattern; must match the schema name
   *                         as it is stored in the database; "" retrieves those without a schema;
   *                         <code>null</code> means that the schema name should not be used to narrow
   *                         the search
   * @param tableNamePattern a table name pattern; must match the
   *                         table name as it is stored in the database
   * @param types            a list of table types, which must be from the list of table types
   *                         returned from {@link #getTableTypes},to include; <code>null</code> returns
   *                         all types
   * @return <code>ResultSet</code> - each row is a table description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getTables(String catalog, String schemaPattern,
                      String tableNamePattern, String types[]) throws SQLException;

  /**
   * Retrieves the schema names available in this database.  The results
   * are ordered by <code>TABLE_CATALOG</code> and
   * <code>TABLE_SCHEM</code>.
   * <p/>
   * <P>The schema columns are:
   * <OL>
   * <LI><B>TABLE_SCHEM</B> String => schema name
   * <LI><B>TABLE_CATALOG</B> String => catalog name (may be <code>null</code>)
   * </OL>
   *
   * @return a <code>ResultSet</code> object in which each row is a
   *         schema description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getSchemas() throws SQLException;

  /**
   * Retrieves the catalog names available in this database.  The results
   * are ordered by catalog name.
   * <p/>
   * <P>The catalog column is:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => catalog name
   * </OL>
   *
   * @return a <code>ResultSet</code> object in which each row has a
   *         single <code>String</code> column that is a catalog name
   * @throws SQLException if a database access error occurs
   */
  ResultSet getCatalogs() throws SQLException;

  /**
   * Retrieves the table types available in this database.  The results
   * are ordered by table type.
   * <p/>
   * <P>The table type is:
   * <OL>
   * <LI><B>TABLE_TYPE</B> String => table type.  Typical types are "TABLE",
   * "VIEW",	"SYSTEM TABLE", "GLOBAL TEMPORARY",
   * "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
   * </OL>
   *
   * @return a <code>ResultSet</code> object in which each row has a
   *         single <code>String</code> column that is a table type
   * @throws SQLException if a database access error occurs
   */
  ResultSet getTableTypes() throws SQLException;

  /**
   * Retrieves a description of table columns available in
   * the specified catalog.
   * <p/>
   * <P>Only column descriptions matching the catalog, schema, table
   * and column name criteria are returned.  They are ordered by
   * <code>TABLE_CAT</code>,<code>TABLE_SCHEM</code>,
   * <code>TABLE_NAME</code>, and <code>ORDINAL_POSITION</code>.
   * <p/>
   * <P>Each column description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>COLUMN_NAME</B> String => column name
   * <LI><B>DATA_TYPE</B> int => SQL type from java.sql.Types
   * <LI><B>TYPE_NAME</B> String => Data source dependent type name,
   * for a UDT the type name is fully qualified
   * <LI><B>COLUMN_SIZE</B> int => column size.
   * <LI><B>BUFFER_LENGTH</B> is not used.
   * <LI><B>DECIMAL_DIGITS</B> int => the number of fractional digits. Null is returned for data types where
   * DECIMAL_DIGITS is not applicable.
   * <LI><B>NUM_PREC_RADIX</B> int => Radix (typically either 10 or 2)
   * <LI><B>NULLABLE</B> int => is NULL allowed.
   * <UL>
   * <LI> columnNoNulls - might not allow <code>NULL</code> values
   * <LI> columnNullable - definitely allows <code>NULL</code> values
   * <LI> columnNullableUnknown - nullability unknown
   * </UL>
   * <LI><B>REMARKS</B> String => comment describing column (may be <code>null</code>)
   * <LI><B>COLUMN_DEF</B> String => default value for the column, which should be interpreted as a string when the value is enclosed in single quotes (may be <code>null</code>)
   * <LI><B>SQL_DATA_TYPE</B> int => unused
   * <LI><B>SQL_DATETIME_SUB</B> int => unused
   * <LI><B>CHAR_OCTET_LENGTH</B> int => for char types the
   * maximum number of bytes in the column
   * <LI><B>ORDINAL_POSITION</B> int	=> index of column in table
   * (starting at 1)
   * <LI><B>IS_NULLABLE</B> String  => ISO rules are used to determine the nullability for a column.
   * <UL>
   * <LI> YES           --- if the parameter can include NULLs
   * <LI> NO            --- if the parameter cannot include NULLs
   * <LI> empty string  --- if the nullability for the
   * parameter is unknown
   * </UL>
   * <LI><B>SCOPE_CATLOG</B> String => catalog of table that is the scope
   * of a reference attribute (<code>null</code> if DATA_TYPE isn't REF)
   * <LI><B>SCOPE_SCHEMA</B> String => schema of table that is the scope
   * of a reference attribute (<code>null</code> if the DATA_TYPE isn't REF)
   * <LI><B>SCOPE_TABLE</B> String => table name that this the scope
   * of a reference attribure (<code>null</code> if the DATA_TYPE isn't REF)
   * <LI><B>SOURCE_DATA_TYPE</B> short => source type of a distinct type or user-generated
   * Ref type, SQL type from java.sql.Types (<code>null</code> if DATA_TYPE
   * isn't DISTINCT or user-generated REF)
   * <LI><B>IS_AUTOINCREMENT</B> String  => Indicates whether this column is auto incremented
   * <UL>
   * <LI> YES           --- if the column is auto incremented
   * <LI> NO            --- if the column is not auto incremented
   * <LI> empty string  --- if it cannot be determined whether the column is auto incremented
   * parameter is unknown
   * </UL>
   * </OL>
   * <p/>
   * <p>The COLUMN_SIZE column the specified column size for the given column.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @param catalog           a catalog name; must match the catalog name as it
   *                          is stored in the database; "" retrieves those without a catalog;
   *                          <code>null</code> means that the catalog name should not be used to narrow
   *                          the search
   * @param schemaPattern     a schema name pattern; must match the schema name
   *                          as it is stored in the database; "" retrieves those without a schema;
   *                          <code>null</code> means that the schema name should not be used to narrow
   *                          the search
   * @param tableNamePattern  a table name pattern; must match the
   *                          table name as it is stored in the database
   * @param columnNamePattern a column name pattern; must match the column
   *                          name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a column description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getColumns(String catalog, String schemaPattern,
                       String tableNamePattern, String columnNamePattern)
      throws SQLException;

  /**
   * Indicates that the column might not allow <code>NULL</code> values.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> returned by the method
   * <code>getColumns</code>.
   */
  int columnNoNulls = 0;

  /**
   * Indicates that the column definitely allows <code>NULL</code> values.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> returned by the method
   * <code>getColumns</code>.
   */
  int columnNullable = 1;

  /**
   * Indicates that the nullability of columns is unknown.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> returned by the method
   * <code>getColumns</code>.
   */
  int columnNullableUnknown = 2;

  /**
   * Retrieves a description of the access rights for a table's columns.
   * <p/>
   * <P>Only privileges matching the column name criteria are
   * returned.  They are ordered by COLUMN_NAME and PRIVILEGE.
   * <p/>
   * <P>Each privilige description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>COLUMN_NAME</B> String => column name
   * <LI><B>GRANTOR</B> String => grantor of access (may be <code>null</code>)
   * <LI><B>GRANTEE</B> String => grantee of access
   * <LI><B>PRIVILEGE</B> String => name of access (SELECT,
   * INSERT, UPDATE, REFRENCES, ...)
   * <LI><B>IS_GRANTABLE</B> String => "YES" if grantee is permitted
   * to grant to others; "NO" if not; <code>null</code> if unknown
   * </OL>
   *
   * @param catalog           a catalog name; must match the catalog name as it
   *                          is stored in the database; "" retrieves those without a catalog;
   *                          <code>null</code> means that the catalog name should not be used to narrow
   *                          the search
   * @param schema            a schema name; must match the schema name as it is
   *                          stored in the database; "" retrieves those without a schema;
   *                          <code>null</code> means that the schema name should not be used to narrow
   *                          the search
   * @param table             a table name; must match the table name as it is
   *                          stored in the database
   * @param columnNamePattern a column name pattern; must match the column
   *                          name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a column privilege description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getColumnPrivileges(String catalog, String schema,
                                String table, String columnNamePattern) throws SQLException;

  /**
   * Retrieves a description of the access rights for each table available
   * in a catalog. Note that a table privilege applies to one or
   * more columns in the table. It would be wrong to assume that
   * this privilege applies to all columns (this may be true for
   * some systems but is not true for all.)
   * <p/>
   * <P>Only privileges matching the schema and table name
   * criteria are returned.  They are ordered by
   * <code>TABLE_CAT</code>,
   * <code>TABLE_SCHEM</code>, <code>TABLE_NAME</code>,
   * and <code>PRIVILEGE</code>.
   * <p/>
   * <P>Each privilige description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>GRANTOR</B> String => grantor of access (may be <code>null</code>)
   * <LI><B>GRANTEE</B> String => grantee of access
   * <LI><B>PRIVILEGE</B> String => name of access (SELECT,
   * INSERT, UPDATE, REFRENCES, ...)
   * <LI><B>IS_GRANTABLE</B> String => "YES" if grantee is permitted
   * to grant to others; "NO" if not; <code>null</code> if unknown
   * </OL>
   *
   * @param catalog          a catalog name; must match the catalog name as it
   *                         is stored in the database; "" retrieves those without a catalog;
   *                         <code>null</code> means that the catalog name should not be used to narrow
   *                         the search
   * @param schemaPattern    a schema name pattern; must match the schema name
   *                         as it is stored in the database; "" retrieves those without a schema;
   *                         <code>null</code> means that the schema name should not be used to narrow
   *                         the search
   * @param tableNamePattern a table name pattern; must match the
   *                         table name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a table privilege description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   */
  ResultSet getTablePrivileges(String catalog, String schemaPattern,
                               String tableNamePattern) throws SQLException;

  /**
   * Retrieves a description of a table's optimal set of columns that
   * uniquely identifies a row. They are ordered by SCOPE.
   * <p/>
   * <P>Each column description has the following columns:
   * <OL>
   * <LI><B>SCOPE</B> short => actual scope of result
   * <UL>
   * <LI> bestRowTemporary - very temporary, while using row
   * <LI> bestRowTransaction - valid for remainder of current transaction
   * <LI> bestRowSession - valid for remainder of current session
   * </UL>
   * <LI><B>COLUMN_NAME</B> String => column name
   * <LI><B>DATA_TYPE</B> int => SQL data type from java.sql.Types
   * <LI><B>TYPE_NAME</B> String => Data source dependent type name,
   * for a UDT the type name is fully qualified
   * <LI><B>COLUMN_SIZE</B> int => precision
   * <LI><B>BUFFER_LENGTH</B> int => not used
   * <LI><B>DECIMAL_DIGITS</B> short	 => scale - Null is returned for data types where
   * DECIMAL_DIGITS is not applicable.
   * <LI><B>PSEUDO_COLUMN</B> short => is this a pseudo column
   * like an Oracle ROWID
   * <UL>
   * <LI> bestRowUnknown - may or may not be pseudo column
   * <LI> bestRowNotPseudo - is NOT a pseudo column
   * <LI> bestRowPseudo - is a pseudo column
   * </UL>
   * </OL>
   * <p/>
   * <p>The COLUMN_SIZE column represents the specified column size for the given column.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @param catalog  a catalog name; must match the catalog name as it
   *                 is stored in the database; "" retrieves those without a catalog;
   *                 <code>null</code> means that the catalog name should not be used to narrow
   *                 the search
   * @param schema   a schema name; must match the schema name
   *                 as it is stored in the database; "" retrieves those without a schema;
   *                 <code>null</code> means that the schema name should not be used to narrow
   *                 the search
   * @param table    a table name; must match the table name as it is stored
   *                 in the database
   * @param scope    the scope of interest; use same values as SCOPE
   * @param nullable include columns that are nullable.
   * @return <code>ResultSet</code> - each row is a column description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getBestRowIdentifier(String catalog, String schema,
                                 String table, int scope, boolean nullable) throws SQLException;

  /**
   * Indicates that the scope of the best row identifier is
   * very temporary, lasting only while the
   * row is being used.
   * <p/>
   * A possible value for the column
   * <code>SCOPE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowTemporary = 0;

  /**
   * Indicates that the scope of the best row identifier is
   * the remainder of the current transaction.
   * <p/>
   * A possible value for the column
   * <code>SCOPE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowTransaction = 1;

  /**
   * Indicates that the scope of the best row identifier is
   * the remainder of the current session.
   * <p/>
   * A possible value for the column
   * <code>SCOPE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowSession = 2;

  /**
   * Indicates that the best row identifier may or may not be a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowUnknown = 0;

  /**
   * Indicates that the best row identifier is NOT a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowNotPseudo = 1;

  /**
   * Indicates that the best row identifier is a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getBestRowIdentifier</code>.
   */
  int bestRowPseudo = 2;

  /**
   * Retrieves a description of a table's columns that are automatically
   * updated when any value in a row is updated.  They are
   * unordered.
   * <p/>
   * <P>Each column description has the following columns:
   * <OL>
   * <LI><B>SCOPE</B> short => is not used
   * <LI><B>COLUMN_NAME</B> String => column name
   * <LI><B>DATA_TYPE</B> int => SQL data type from <code>java.sql.Types</code>
   * <LI><B>TYPE_NAME</B> String => Data source-dependent type name
   * <LI><B>COLUMN_SIZE</B> int => precision
   * <LI><B>BUFFER_LENGTH</B> int => length of column value in bytes
   * <LI><B>DECIMAL_DIGITS</B> short	 => scale - Null is returned for data types where
   * DECIMAL_DIGITS is not applicable.
   * <LI><B>PSEUDO_COLUMN</B> short => whether this is pseudo column
   * like an Oracle ROWID
   * <UL>
   * <LI> versionColumnUnknown - may or may not be pseudo column
   * <LI> versionColumnNotPseudo - is NOT a pseudo column
   * <LI> versionColumnPseudo - is a pseudo column
   * </UL>
   * </OL>
   * <p/>
   * <p>The COLUMN_SIZE column represents the specified column size for the given column.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @param catalog a catalog name; must match the catalog name as it
   *                is stored in the database; "" retrieves those without a catalog;
   *                <code>null</code> means that the catalog name should not be used to narrow
   *                the search
   * @param schema  a schema name; must match the schema name
   *                as it is stored in the database; "" retrieves those without a schema;
   *                <code>null</code> means that the schema name should not be used to narrow
   *                the search
   * @param table   a table name; must match the table name as it is stored
   *                in the database
   * @return a <code>ResultSet</code> object in which each row is a
   *         column description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getVersionColumns(String catalog, String schema,
                              String table) throws SQLException;

  /**
   * Indicates that this version column may or may not be a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getVersionColumns</code>.
   */
  int versionColumnUnknown = 0;

  /**
   * Indicates that this version column is NOT a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getVersionColumns</code>.
   */
  int versionColumnNotPseudo = 1;

  /**
   * Indicates that this version column is a pseudo column.
   * <p/>
   * A possible value for the column
   * <code>PSEUDO_COLUMN</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getVersionColumns</code>.
   */
  int versionColumnPseudo = 2;

  /**
   * Retrieves a description of the given table's primary key columns.  They
   * are ordered by COLUMN_NAME.
   * <p/>
   * <P>Each primary key column description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>COLUMN_NAME</B> String => column name
   * <LI><B>KEY_SEQ</B> short => sequence number within primary key( a value
   * of 1 represents the first column of the primary key, a value of 2 would
   * represent the second column within the primary key).
   * <LI><B>PK_NAME</B> String => primary key name (may be <code>null</code>)
   * </OL>
   *
   * @param catalog a catalog name; must match the catalog name as it
   *                is stored in the database; "" retrieves those without a catalog;
   *                <code>null</code> means that the catalog name should not be used to narrow
   *                the search
   * @param schema  a schema name; must match the schema name
   *                as it is stored in the database; "" retrieves those without a schema;
   *                <code>null</code> means that the schema name should not be used to narrow
   *                the search
   * @param table   a table name; must match the table name as it is stored
   *                in the database
   * @return <code>ResultSet</code> - each row is a primary key column description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getPrimaryKeys(String catalog, String schema,
                           String table) throws SQLException;

  /**
   * Retrieves a description of the primary key columns that are
   * referenced by the given table's foreign key columns (the primary keys
   * imported by a table).  They are ordered by PKTABLE_CAT,
   * PKTABLE_SCHEM, PKTABLE_NAME, and KEY_SEQ.
   * <p/>
   * <P>Each primary key column description has the following columns:
   * <OL>
   * <LI><B>PKTABLE_CAT</B> String => primary key table catalog
   * being imported (may be <code>null</code>)
   * <LI><B>PKTABLE_SCHEM</B> String => primary key table schema
   * being imported (may be <code>null</code>)
   * <LI><B>PKTABLE_NAME</B> String => primary key table name
   * being imported
   * <LI><B>PKCOLUMN_NAME</B> String => primary key column name
   * being imported
   * <LI><B>FKTABLE_CAT</B> String => foreign key table catalog (may be <code>null</code>)
   * <LI><B>FKTABLE_SCHEM</B> String => foreign key table schema (may be <code>null</code>)
   * <LI><B>FKTABLE_NAME</B> String => foreign key table name
   * <LI><B>FKCOLUMN_NAME</B> String => foreign key column name
   * <LI><B>KEY_SEQ</B> short => sequence number within a foreign key( a value
   * of 1 represents the first column of the foreign key, a value of 2 would
   * represent the second column within the foreign key).
   * <LI><B>UPDATE_RULE</B> short => What happens to a
   * foreign key when the primary key is updated:
   * <UL>
   * <LI> importedNoAction - do not allow update of primary
   * key if it has been imported
   * <LI> importedKeyCascade - change imported key to agree
   * with primary key update
   * <LI> importedKeySetNull - change imported key to <code>NULL</code>
   * if its primary key has been updated
   * <LI> importedKeySetDefault - change imported key to default values
   * if its primary key has been updated
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * </UL>
   * <LI><B>DELETE_RULE</B> short => What happens to
   * the foreign key when primary is deleted.
   * <UL>
   * <LI> importedKeyNoAction - do not allow delete of primary
   * key if it has been imported
   * <LI> importedKeyCascade - delete rows that import a deleted key
   * <LI> importedKeySetNull - change imported key to NULL if
   * its primary key has been deleted
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * <LI> importedKeySetDefault - change imported key to default if
   * its primary key has been deleted
   * </UL>
   * <LI><B>FK_NAME</B> String => foreign key name (may be <code>null</code>)
   * <LI><B>PK_NAME</B> String => primary key name (may be <code>null</code>)
   * <LI><B>DEFERRABILITY</B> short => can the evaluation of foreign key
   * constraints be deferred until commit
   * <UL>
   * <LI> importedKeyInitiallyDeferred - see SQL92 for definition
   * <LI> importedKeyInitiallyImmediate - see SQL92 for definition
   * <LI> importedKeyNotDeferrable - see SQL92 for definition
   * </UL>
   * </OL>
   *
   * @param catalog a catalog name; must match the catalog name as it
   *                is stored in the database; "" retrieves those without a catalog;
   *                <code>null</code> means that the catalog name should not be used to narrow
   *                the search
   * @param schema  a schema name; must match the schema name
   *                as it is stored in the database; "" retrieves those without a schema;
   *                <code>null</code> means that the schema name should not be used to narrow
   *                the search
   * @param table   a table name; must match the table name as it is stored
   *                in the database
   * @return <code>ResultSet</code> - each row is a primary key column description
   * @throws SQLException if a database access error occurs
   * @see #getExportedKeys
   */
  ResultSet getImportedKeys(String catalog, String schema,
                            String table) throws SQLException;

  /**
   * For the column <code>UPDATE_RULE</code>,
   * indicates that
   * when the primary key is updated, the foreign key (imported key)
   * is changed to agree with it.
   * For the column <code>DELETE_RULE</code>,
   * it indicates that
   * when the primary key is deleted, rows that imported that key
   * are deleted.
   * <p/>
   * A possible value for the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code> in the
   * <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyCascade = 0;

  /**
   * For the column <code>UPDATE_RULE</code>, indicates that
   * a primary key may not be updated if it has been imported by
   * another table as a foreign key.
   * For the column <code>DELETE_RULE</code>, indicates that
   * a primary key may not be deleted if it has been imported by
   * another table as a foreign key.
   * <p/>
   * A possible value for the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code> in the
   * <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyRestrict = 1;

  /**
   * For the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code>, indicates that
   * when the primary key is updated or deleted, the foreign key (imported key)
   * is changed to <code>NULL</code>.
   * <p/>
   * A possible value for the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code> in the
   * <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeySetNull = 2;

  /**
   * For the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code>, indicates that
   * if the primary key has been imported, it cannot be updated or deleted.
   * <p/>
   * A possible value for the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code> in the
   * <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyNoAction = 3;

  /**
   * For the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code>, indicates that
   * if the primary key is updated or deleted, the foreign key (imported key)
   * is set to the default value.
   * <p/>
   * A possible value for the columns <code>UPDATE_RULE</code>
   * and <code>DELETE_RULE</code> in the
   * <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeySetDefault = 4;

  /**
   * Indicates deferrability.  See SQL-92 for a definition.
   * <p/>
   * A possible value for the column <code>DEFERRABILITY</code>
   * in the <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyInitiallyDeferred = 5;

  /**
   * Indicates deferrability.  See SQL-92 for a definition.
   * <p/>
   * A possible value for the column <code>DEFERRABILITY</code>
   * in the <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyInitiallyImmediate = 6;

  /**
   * Indicates deferrability.  See SQL-92 for a definition.
   * <p/>
   * A possible value for the column <code>DEFERRABILITY</code>
   * in the <code>ResultSet</code> objects returned by the methods
   * <code>getImportedKeys</code>,  <code>getExportedKeys</code>,
   * and <code>getCrossReference</code>.
   */
  int importedKeyNotDeferrable = 7;

  /**
   * Retrieves a description of the foreign key columns that reference the
   * given table's primary key columns (the foreign keys exported by a
   * table).  They are ordered by FKTABLE_CAT, FKTABLE_SCHEM,
   * FKTABLE_NAME, and KEY_SEQ.
   * <p/>
   * <P>Each foreign key column description has the following columns:
   * <OL>
   * <LI><B>PKTABLE_CAT</B> String => primary key table catalog (may be <code>null</code>)
   * <LI><B>PKTABLE_SCHEM</B> String => primary key table schema (may be <code>null</code>)
   * <LI><B>PKTABLE_NAME</B> String => primary key table name
   * <LI><B>PKCOLUMN_NAME</B> String => primary key column name
   * <LI><B>FKTABLE_CAT</B> String => foreign key table catalog (may be <code>null</code>)
   * being exported (may be <code>null</code>)
   * <LI><B>FKTABLE_SCHEM</B> String => foreign key table schema (may be <code>null</code>)
   * being exported (may be <code>null</code>)
   * <LI><B>FKTABLE_NAME</B> String => foreign key table name
   * being exported
   * <LI><B>FKCOLUMN_NAME</B> String => foreign key column name
   * being exported
   * <LI><B>KEY_SEQ</B> short => sequence number within foreign key( a value
   * of 1 represents the first column of the foreign key, a value of 2 would
   * represent the second column within the foreign key).
   * <LI><B>UPDATE_RULE</B> short => What happens to
   * foreign key when primary is updated:
   * <UL>
   * <LI> importedNoAction - do not allow update of primary
   * key if it has been imported
   * <LI> importedKeyCascade - change imported key to agree
   * with primary key update
   * <LI> importedKeySetNull - change imported key to <code>NULL</code> if
   * its primary key has been updated
   * <LI> importedKeySetDefault - change imported key to default values
   * if its primary key has been updated
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * </UL>
   * <LI><B>DELETE_RULE</B> short => What happens to
   * the foreign key when primary is deleted.
   * <UL>
   * <LI> importedKeyNoAction - do not allow delete of primary
   * key if it has been imported
   * <LI> importedKeyCascade - delete rows that import a deleted key
   * <LI> importedKeySetNull - change imported key to <code>NULL</code> if
   * its primary key has been deleted
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * <LI> importedKeySetDefault - change imported key to default if
   * its primary key has been deleted
   * </UL>
   * <LI><B>FK_NAME</B> String => foreign key name (may be <code>null</code>)
   * <LI><B>PK_NAME</B> String => primary key name (may be <code>null</code>)
   * <LI><B>DEFERRABILITY</B> short => can the evaluation of foreign key
   * constraints be deferred until commit
   * <UL>
   * <LI> importedKeyInitiallyDeferred - see SQL92 for definition
   * <LI> importedKeyInitiallyImmediate - see SQL92 for definition
   * <LI> importedKeyNotDeferrable - see SQL92 for definition
   * </UL>
   * </OL>
   *
   * @param catalog a catalog name; must match the catalog name as it
   *                is stored in this database; "" retrieves those without a catalog;
   *                <code>null</code> means that the catalog name should not be used to narrow
   *                the search
   * @param schema  a schema name; must match the schema name
   *                as it is stored in the database; "" retrieves those without a schema;
   *                <code>null</code> means that the schema name should not be used to narrow
   *                the search
   * @param table   a table name; must match the table name as it is stored
   *                in this database
   * @return a <code>ResultSet</code> object in which each row is a
   *         foreign key column description
   * @throws SQLException if a database access error occurs
   * @see #getImportedKeys
   */
  ResultSet getExportedKeys(String catalog, String schema,
                            String table) throws SQLException;

  /**
   * Retrieves a description of the foreign key columns in the given foreign key
   * table that reference the primary key or the columns representing a unique constraint of the  parent table (could be the same or a different table).
   * The number of columns returned from the parent table must match the number of
   * columns that make up the foreign key.  They
   * are ordered by FKTABLE_CAT, FKTABLE_SCHEM, FKTABLE_NAME, and
   * KEY_SEQ.
   * <p/>
   * <P>Each foreign key column description has the following columns:
   * <OL>
   * <LI><B>PKTABLE_CAT</B> String => parent key table catalog (may be <code>null</code>)
   * <LI><B>PKTABLE_SCHEM</B> String => parent key table schema (may be <code>null</code>)
   * <LI><B>PKTABLE_NAME</B> String => parent key table name
   * <LI><B>PKCOLUMN_NAME</B> String => parent key column name
   * <LI><B>FKTABLE_CAT</B> String => foreign key table catalog (may be <code>null</code>)
   * being exported (may be <code>null</code>)
   * <LI><B>FKTABLE_SCHEM</B> String => foreign key table schema (may be <code>null</code>)
   * being exported (may be <code>null</code>)
   * <LI><B>FKTABLE_NAME</B> String => foreign key table name
   * being exported
   * <LI><B>FKCOLUMN_NAME</B> String => foreign key column name
   * being exported
   * <LI><B>KEY_SEQ</B> short => sequence number within foreign key( a value
   * of 1 represents the first column of the foreign key, a value of 2 would
   * represent the second column within the foreign key).
   * <LI><B>UPDATE_RULE</B> short => What happens to
   * foreign key when parent key is updated:
   * <UL>
   * <LI> importedNoAction - do not allow update of parent
   * key if it has been imported
   * <LI> importedKeyCascade - change imported key to agree
   * with parent key update
   * <LI> importedKeySetNull - change imported key to <code>NULL</code> if
   * its parent key has been updated
   * <LI> importedKeySetDefault - change imported key to default values
   * if its parent key has been updated
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * </UL>
   * <LI><B>DELETE_RULE</B> short => What happens to
   * the foreign key when parent key is deleted.
   * <UL>
   * <LI> importedKeyNoAction - do not allow delete of parent
   * key if it has been imported
   * <LI> importedKeyCascade - delete rows that import a deleted key
   * <LI> importedKeySetNull - change imported key to <code>NULL</code> if
   * its primary key has been deleted
   * <LI> importedKeyRestrict - same as importedKeyNoAction
   * (for ODBC 2.x compatibility)
   * <LI> importedKeySetDefault - change imported key to default if
   * its parent key has been deleted
   * </UL>
   * <LI><B>FK_NAME</B> String => foreign key name (may be <code>null</code>)
   * <LI><B>PK_NAME</B> String => parent key name (may be <code>null</code>)
   * <LI><B>DEFERRABILITY</B> short => can the evaluation of foreign key
   * constraints be deferred until commit
   * <UL>
   * <LI> importedKeyInitiallyDeferred - see SQL92 for definition
   * <LI> importedKeyInitiallyImmediate - see SQL92 for definition
   * <LI> importedKeyNotDeferrable - see SQL92 for definition
   * </UL>
   * </OL>
   *
   * @param parentCatalog  a catalog name; must match the catalog name
   *                       as it is stored in the database; "" retrieves those without a
   *                       catalog; <code>null</code> means drop catalog name from the selection criteria
   * @param parentSchema   a schema name; must match the schema name as
   *                       it is stored in the database; "" retrieves those without a schema;
   *                       <code>null</code> means drop schema name from the selection criteria
   * @param parentTable    the name of the table that exports the key; must match
   *                       the table name as it is stored in the database
   * @param foreignCatalog a catalog name; must match the catalog name as
   *                       it is stored in the database; "" retrieves those without a
   *                       catalog; <code>null</code> means drop catalog name from the selection criteria
   * @param foreignSchema  a schema name; must match the schema name as it
   *                       is stored in the database; "" retrieves those without a schema;
   *                       <code>null</code> means drop schema name from the selection criteria
   * @param foreignTable   the name of the table that imports the key; must match
   *                       the table name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a foreign key column description
   * @throws SQLException if a database access error occurs
   * @see #getImportedKeys
   */
  ResultSet getCrossReference(
      String parentCatalog, String parentSchema, String parentTable,
      String foreignCatalog, String foreignSchema, String foreignTable
  ) throws SQLException;

  /**
   * Retrieves a description of all the data types supported by
   * this database. They are ordered by DATA_TYPE and then by how
   * closely the data type maps to the corresponding JDBC SQL type.
   * <p/>
   * <P>If the database supports SQL distinct types, then getTypeInfo() will return
   * a single row with a TYPE_NAME of DISTINCT and a DATA_TYPE of Types.DISTINCT.
   * If the database supports SQL structured types, then getTypeInfo() will return
   * a single row with a TYPE_NAME of STRUCT and a DATA_TYPE of Types.STRUCT.
   * <p/>
   * <P>If SQL distinct or structured types are supported, then information on the
   * individual types may be obtained from the getUDTs() method.
   * <p/>
   * <p/>
   * <p/>
   * <P>Each type description has the following columns:
   * <OL>
   * <LI><B>TYPE_NAME</B> String => Type name
   * <LI><B>DATA_TYPE</B> int => SQL data type from java.sql.Types
   * <LI><B>PRECISION</B> int => maximum precision
   * <LI><B>LITERAL_PREFIX</B> String => prefix used to quote a literal
   * (may be <code>null</code>)
   * <LI><B>LITERAL_SUFFIX</B> String => suffix used to quote a literal
   * (may be <code>null</code>)
   * <LI><B>CREATE_PARAMS</B> String => parameters used in creating
   * the type (may be <code>null</code>)
   * <LI><B>NULLABLE</B> short => can you use NULL for this type.
   * <UL>
   * <LI> typeNoNulls - does not allow NULL values
   * <LI> typeNullable - allows NULL values
   * <LI> typeNullableUnknown - nullability unknown
   * </UL>
   * <LI><B>CASE_SENSITIVE</B> boolean=> is it case sensitive.
   * <LI><B>SEARCHABLE</B> short => can you use "WHERE" based on this type:
   * <UL>
   * <LI> typePredNone - No support
   * <LI> typePredChar - Only supported with WHERE .. LIKE
   * <LI> typePredBasic - Supported except for WHERE .. LIKE
   * <LI> typeSearchable - Supported for all WHERE ..
   * </UL>
   * <LI><B>UNSIGNED_ATTRIBUTE</B> boolean => is it unsigned.
   * <LI><B>FIXED_PREC_SCALE</B> boolean => can it be a money value.
   * <LI><B>AUTO_INCREMENT</B> boolean => can it be used for an
   * auto-increment value.
   * <LI><B>LOCAL_TYPE_NAME</B> String => localized version of type name
   * (may be <code>null</code>)
   * <LI><B>MINIMUM_SCALE</B> short => minimum scale supported
   * <LI><B>MAXIMUM_SCALE</B> short => maximum scale supported
   * <LI><B>SQL_DATA_TYPE</B> int => unused
   * <LI><B>SQL_DATETIME_SUB</B> int => unused
   * <LI><B>NUM_PREC_RADIX</B> int => usually 2 or 10
   * </OL>
   * <p/>
   * <p>The PRECISION column represents the maximum column size that the server supports for the given datatype.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @return a <code>ResultSet</code> object in which each row is an SQL
   *         type description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getTypeInfo() throws SQLException;

  /**
   * Indicates that a <code>NULL</code> value is NOT allowed for this
   * data type.
   * <p/>
   * A possible value for column <code>NULLABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typeNoNulls = 0;

  /**
   * Indicates that a <code>NULL</code> value is allowed for this
   * data type.
   * <p/>
   * A possible value for column <code>NULLABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typeNullable = 1;

  /**
   * Indicates that it is not known whether a <code>NULL</code> value
   * is allowed for this data type.
   * <p/>
   * A possible value for column <code>NULLABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typeNullableUnknown = 2;

  /**
   * Indicates that <code>WHERE</code> search clauses are not supported
   * for this type.
   * <p/>
   * A possible value for column <code>SEARCHABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typePredNone = 0;

  /**
   * Indicates that the data type
   * can be only be used in <code>WHERE</code> search clauses
   * that  use <code>LIKE</code> predicates.
   * <p/>
   * A possible value for column <code>SEARCHABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typePredChar = 1;

  /**
   * Indicates that the data type can be only be used in <code>WHERE</code>
   * search clauses
   * that do not use <code>LIKE</code> predicates.
   * <p/>
   * A possible value for column <code>SEARCHABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typePredBasic = 2;

  /**
   * Indicates that all <code>WHERE</code> search clauses can be
   * based on this type.
   * <p/>
   * A possible value for column <code>SEARCHABLE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getTypeInfo</code>.
   */
  int typeSearchable = 3;

  /**
   * Retrieves a description of the given table's indices and statistics. They are
   * ordered by NON_UNIQUE, TYPE, INDEX_NAME, and ORDINAL_POSITION.
   * <p/>
   * <P>Each index column description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => table catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => table schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => table name
   * <LI><B>NON_UNIQUE</B> boolean => Can index values be non-unique.
   * false when TYPE is tableIndexStatistic
   * <LI><B>INDEX_QUALIFIER</B> String => index catalog (may be <code>null</code>);
   * <code>null</code> when TYPE is tableIndexStatistic
   * <LI><B>INDEX_NAME</B> String => index name; <code>null</code> when TYPE is
   * tableIndexStatistic
   * <LI><B>TYPE</B> short => index type:
   * <UL>
   * <LI> tableIndexStatistic - this identifies table statistics that are
   * returned in conjuction with a table's index descriptions
   * <LI> tableIndexClustered - this is a clustered index
   * <LI> tableIndexHashed - this is a hashed index
   * <LI> tableIndexOther - this is some other style of index
   * </UL>
   * <LI><B>ORDINAL_POSITION</B> short => column sequence number
   * within index; zero when TYPE is tableIndexStatistic
   * <LI><B>COLUMN_NAME</B> String => column name; <code>null</code> when TYPE is
   * tableIndexStatistic
   * <LI><B>ASC_OR_DESC</B> String => column sort sequence, "A" => ascending,
   * "D" => descending, may be <code>null</code> if sort sequence is not supported;
   * <code>null</code> when TYPE is tableIndexStatistic
   * <LI><B>CARDINALITY</B> int => When TYPE is tableIndexStatistic, then
   * this is the number of rows in the table; otherwise, it is the
   * number of unique values in the index.
   * <LI><B>PAGES</B> int => When TYPE is  tableIndexStatisic then
   * this is the number of pages used for the table, otherwise it
   * is the number of pages used for the current index.
   * <LI><B>FILTER_CONDITION</B> String => Filter condition, if any.
   * (may be <code>null</code>)
   * </OL>
   *
   * @param catalog     a catalog name; must match the catalog name as it
   *                    is stored in this database; "" retrieves those without a catalog;
   *                    <code>null</code> means that the catalog name should not be used to narrow
   *                    the search
   * @param schema      a schema name; must match the schema name
   *                    as it is stored in this database; "" retrieves those without a schema;
   *                    <code>null</code> means that the schema name should not be used to narrow
   *                    the search
   * @param table       a table name; must match the table name as it is stored
   *                    in this database
   * @param unique      when true, return only indices for unique values;
   *                    when false, return indices regardless of whether unique or not
   * @param approximate when true, result is allowed to reflect approximate
   *                    or out of data values; when false, results are requested to be
   *                    accurate
   * @return <code>ResultSet</code> - each row is an index column description
   * @throws SQLException if a database access error occurs
   */
  ResultSet getIndexInfo(String catalog, String schema, String table,
                         boolean unique, boolean approximate)
      throws SQLException;

  /**
   * Indicates that this column contains table statistics that
   * are returned in conjunction with a table's index descriptions.
   * <p/>
   * A possible value for column <code>TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getIndexInfo</code>.
   */
  short tableIndexStatistic = 0;

  /**
   * Indicates that this table index is a clustered index.
   * <p/>
   * A possible value for column <code>TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getIndexInfo</code>.
   */
  short tableIndexClustered = 1;

  /**
   * Indicates that this table index is a hashed index.
   * <p/>
   * A possible value for column <code>TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getIndexInfo</code>.
   */
  short tableIndexHashed = 2;

  /**
   * Indicates that this table index is not a clustered
   * index, a hashed index, or table statistics;
   * it is something other than these.
   * <p/>
   * A possible value for column <code>TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getIndexInfo</code>.
   */
  short tableIndexOther = 3;

  //--------------------------JDBC 2.0-----------------------------

  /**
   * Retrieves whether this database supports the given result set type.
   *
   * @param type defined in <code>java.sql.ResultSet</code>
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @see Connection
   * @since 1.2
   */
  boolean supportsResultSetType(int type) throws SQLException;

  /**
   * Retrieves whether this database supports the given concurrency type
   * in combination with the given result set type.
   *
   * @param type        defined in <code>java.sql.ResultSet</code>
   * @param concurrency type defined in <code>java.sql.ResultSet</code>
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @see Connection
   * @since 1.2
   */
  boolean supportsResultSetConcurrency(int type, int concurrency)
      throws SQLException;

  /**
   * Retrieves whether for the given type of <code>ResultSet</code> object,
   * the result set's own updates are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if updates are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean ownUpdatesAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether a result set's own deletes are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if deletes are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean ownDeletesAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether a result set's own inserts are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if inserts are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean ownInsertsAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether updates made by others are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if updates made by others
   *         are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean othersUpdatesAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether deletes made by others are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if deletes made by others
   *         are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean othersDeletesAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether inserts made by others are visible.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if inserts made by others
   *         are visible for the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean othersInsertsAreVisible(int type) throws SQLException;

  /**
   * Retrieves whether or not a visible row update can be detected by
   * calling the method <code>ResultSet.rowUpdated</code>.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if changes are detected by the result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean updatesAreDetected(int type) throws SQLException;

  /**
   * Retrieves whether or not a visible row delete can be detected by
   * calling the method <code>ResultSet.rowDeleted</code>.  If the method
   * <code>deletesAreDetected</code> returns <code>false</code>, it means that
   * deleted rows are removed from the result set.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if deletes are detected by the given result set type;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean deletesAreDetected(int type) throws SQLException;

  /**
   * Retrieves whether or not a visible row insert can be detected
   * by calling the method <code>ResultSet.rowInserted</code>.
   *
   * @param type the <code>ResultSet</code> type; one of
   *             <code>ResultSet.TYPE_FORWARD_ONLY</code>,
   *             <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
   *             <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
   * @return <code>true</code> if changes are detected by the specified result
   *         set type; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean insertsAreDetected(int type) throws SQLException;

  /**
   * Retrieves whether this database supports batch updates.
   *
   * @return <code>true</code> if this database supports batch upcates;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  boolean supportsBatchUpdates() throws SQLException;

  /**
   * Retrieves a description of the user-defined types (UDTs) defined
   * in a particular schema.  Schema-specific UDTs may have type
   * <code>JAVA_OBJECT</code>, <code>STRUCT</code>,
   * or <code>DISTINCT</code>.
   * <p/>
   * <P>Only types matching the catalog, schema, type name and type
   * criteria are returned.  They are ordered by <code>DATA_TYPE</code>,
   * <code>TYPE_CAT</code>, <code>TYPE_SCHEM</code>  and
   * <code>TYPE_NAME</code>.  The type name parameter may be a fully-qualified
   * name.  In this case, the catalog and schemaPattern parameters are
   * ignored.
   * <p/>
   * <P>Each type description has the following columns:
   * <OL>
   * <LI><B>TYPE_CAT</B> String => the type's catalog (may be <code>null</code>)
   * <LI><B>TYPE_SCHEM</B> String => type's schema (may be <code>null</code>)
   * <LI><B>TYPE_NAME</B> String => type name
   * <LI><B>CLASS_NAME</B> String => Java class name
   * <LI><B>DATA_TYPE</B> int => type value defined in java.sql.Types.
   * One of JAVA_OBJECT, STRUCT, or DISTINCT
   * <LI><B>REMARKS</B> String => explanatory comment on the type
   * <LI><B>BASE_TYPE</B> short => type code of the source type of a
   * DISTINCT type or the type that implements the user-generated
   * reference type of the SELF_REFERENCING_COLUMN of a structured
   * type as defined in java.sql.Types (<code>null</code> if DATA_TYPE is not
   * DISTINCT or not STRUCT with REFERENCE_GENERATION = USER_DEFINED)
   * </OL>
   * <p/>
   * <P><B>Note:</B> If the driver does not support UDTs, an empty
   * result set is returned.
   *
   * @param catalog         a catalog name; must match the catalog name as it
   *                        is stored in the database; "" retrieves those without a catalog;
   *                        <code>null</code> means that the catalog name should not be used to narrow
   *                        the search
   * @param schemaPattern   a schema pattern name; must match the schema name
   *                        as it is stored in the database; "" retrieves those without a schema;
   *                        <code>null</code> means that the schema name should not be used to narrow
   *                        the search
   * @param typeNamePattern a type name pattern; must match the type name
   *                        as it is stored in the database; may be a fully qualified name
   * @param types           a list of user-defined types (JAVA_OBJECT,
   *                        STRUCT, or DISTINCT) to include; <code>null</code> returns all types
   * @return <code>ResultSet</code> object in which each row describes a UDT
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.2
   */
  ResultSet getUDTs(String catalog, String schemaPattern,
                    String typeNamePattern, int[] types)
      throws SQLException;

  /**
   * Retrieves the connection that produced this metadata object.
   * <p/>
   *
   * @return the connection that produced this metadata object
   * @throws SQLException if a database access error occurs
   * @since 1.2
   */
  Connection getConnection() throws SQLException;

  // ------------------- JDBC 3.0 -------------------------

  /**
   * Retrieves whether this database supports savepoints.
   *
   * @return <code>true</code> if savepoints are supported;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  boolean supportsSavepoints() throws SQLException;

  /**
   * Retrieves whether this database supports named parameters to callable
   * statements.
   *
   * @return <code>true</code> if named parameters are supported;
   *         <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  boolean supportsNamedParameters() throws SQLException;

  /**
   * Retrieves whether it is possible to have multiple <code>ResultSet</code> objects
   * returned from a <code>CallableStatement</code> object
   * simultaneously.
   *
   * @return <code>true</code> if a <code>CallableStatement</code> object
   *         can return multiple <code>ResultSet</code> objects
   *         simultaneously; <code>false</code> otherwise
   * @throws SQLException if a datanase access error occurs
   * @since 1.4
   */
  boolean supportsMultipleOpenResults() throws SQLException;

  /**
   * Retrieves whether auto-generated keys can be retrieved after
   * a statement has been executed
   *
   * @return <code>true</code> if auto-generated keys can be retrieved
   *         after a statement has executed; <code>false</code> otherwise
   *         <p>If <code>true</code> is returned, the JDBC driver must support the
   *         returning of auto-generated keys for at least SQL INSERT statements
   *         <p/>
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  boolean supportsGetGeneratedKeys() throws SQLException;

  /**
   * Retrieves a description of the user-defined type (UDT) hierarchies defined in a
   * particular schema in this database. Only the immediate super type/
   * sub type relationship is modeled.
   * <p/>
   * Only supertype information for UDTs matching the catalog,
   * schema, and type name is returned. The type name parameter
   * may be a fully-qualified name. When the UDT name supplied is a
   * fully-qualified name, the catalog and schemaPattern parameters are
   * ignored.
   * <p/>
   * If a UDT does not have a direct super type, it is not listed here.
   * A row of the <code>ResultSet</code> object returned by this method
   * describes the designated UDT and a direct supertype. A row has the following
   * columns:
   * <OL>
   * <LI><B>TYPE_CAT</B> String => the UDT's catalog (may be <code>null</code>)
   * <LI><B>TYPE_SCHEM</B> String => UDT's schema (may be <code>null</code>)
   * <LI><B>TYPE_NAME</B> String => type name of the UDT
   * <LI><B>SUPERTYPE_CAT</B> String => the direct super type's catalog
   * (may be <code>null</code>)
   * <LI><B>SUPERTYPE_SCHEM</B> String => the direct super type's schema
   * (may be <code>null</code>)
   * <LI><B>SUPERTYPE_NAME</B> String => the direct super type's name
   * </OL>
   * <p/>
   * <P><B>Note:</B> If the driver does not support type hierarchies, an
   * empty result set is returned.
   *
   * @param catalog         a catalog name; "" retrieves those without a catalog;
   *                        <code>null</code> means drop catalog name from the selection criteria
   * @param schemaPattern   a schema name pattern; "" retrieves those
   *                        without a schema
   * @param typeNamePattern a UDT name pattern; may be a fully-qualified
   *                        name
   * @return a <code>ResultSet</code> object in which a row gives information
   *         about the designated UDT
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.4
   */
  ResultSet getSuperTypes(String catalog, String schemaPattern,
                          String typeNamePattern) throws SQLException;

  /**
   * Retrieves a description of the table hierarchies defined in a particular
   * schema in this database.
   * <p/>
   * <P>Only supertable information for tables matching the catalog, schema
   * and table name are returned. The table name parameter may be a fully-
   * qualified name, in which case, the catalog and schemaPattern parameters
   * are ignored. If a table does not have a super table, it is not listed here.
   * Supertables have to be defined in the same catalog and schema as the
   * sub tables. Therefore, the type description does not need to include
   * this information for the supertable.
   * <p/>
   * <P>Each type description has the following columns:
   * <OL>
   * <LI><B>TABLE_CAT</B> String => the type's catalog (may be <code>null</code>)
   * <LI><B>TABLE_SCHEM</B> String => type's schema (may be <code>null</code>)
   * <LI><B>TABLE_NAME</B> String => type name
   * <LI><B>SUPERTABLE_NAME</B> String => the direct super type's name
   * </OL>
   * <p/>
   * <P><B>Note:</B> If the driver does not support type hierarchies, an
   * empty result set is returned.
   *
   * @param catalog          a catalog name; "" retrieves those without a catalog;
   *                         <code>null</code> means drop catalog name from the selection criteria
   * @param schemaPattern    a schema name pattern; "" retrieves those
   *                         without a schema
   * @param tableNamePattern a table name pattern; may be a fully-qualified
   *                         name
   * @return a <code>ResultSet</code> object in which each row is a type description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.4
   */
  ResultSet getSuperTables(String catalog, String schemaPattern,
                           String tableNamePattern) throws SQLException;

  /**
   * Indicates that <code>NULL</code> values might not be allowed.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code> in the <code>ResultSet</code> object
   * returned by the method <code>getAttributes</code>.
   */
  short attributeNoNulls = 0;

  /**
   * Indicates that <code>NULL</code> values are definitely allowed.
   * <p/>
   * A possible value for the column <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getAttributes</code>.
   */
  short attributeNullable = 1;

  /**
   * Indicates that whether <code>NULL</code> values are allowed is not
   * known.
   * <p/>
   * A possible value for the column <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getAttributes</code>.
   */
  short attributeNullableUnknown = 2;

  /**
   * Retrieves a description of the given attribute of the given type
   * for a user-defined type (UDT) that is available in the given schema
   * and catalog.
   * <p/>
   * Descriptions are returned only for attributes of UDTs matching the
   * catalog, schema, type, and attribute name criteria. They are ordered by
   * <code>TYPE_CAT</code>, <code>TYPE_SCHEM</code>,
   * <code>TYPE_NAME</code> and <code>ORDINAL_POSITION</code>. This description
   * does not contain inherited attributes.
   * <p/>
   * The <code>ResultSet</code> object that is returned has the following
   * columns:
   * <OL>
   * <LI><B>TYPE_CAT</B> String => type catalog (may be <code>null</code>)
   * <LI><B>TYPE_SCHEM</B> String => type schema (may be <code>null</code>)
   * <LI><B>TYPE_NAME</B> String => type name
   * <LI><B>ATTR_NAME</B> String => attribute name
   * <LI><B>DATA_TYPE</B> int => attribute type SQL type from java.sql.Types
   * <LI><B>ATTR_TYPE_NAME</B> String => Data source dependent type name.
   * For a UDT, the type name is fully qualified. For a REF, the type name is
   * fully qualified and represents the target type of the reference type.
   * <LI><B>ATTR_SIZE</B> int => column size.  For char or date
   * types this is the maximum number of characters; for numeric or
   * decimal types this is precision.
   * <LI><B>DECIMAL_DIGITS</B> int => the number of fractional digits. Null is returned for data types where
   * DECIMAL_DIGITS is not applicable.
   * <LI><B>NUM_PREC_RADIX</B> int => Radix (typically either 10 or 2)
   * <LI><B>NULLABLE</B> int => whether NULL is allowed
   * <UL>
   * <LI> attributeNoNulls - might not allow NULL values
   * <LI> attributeNullable - definitely allows NULL values
   * <LI> attributeNullableUnknown - nullability unknown
   * </UL>
   * <LI><B>REMARKS</B> String => comment describing column (may be <code>null</code>)
   * <LI><B>ATTR_DEF</B> String => default value (may be <code>null</code>)
   * <LI><B>SQL_DATA_TYPE</B> int => unused
   * <LI><B>SQL_DATETIME_SUB</B> int => unused
   * <LI><B>CHAR_OCTET_LENGTH</B> int => for char types the
   * maximum number of bytes in the column
   * <LI><B>ORDINAL_POSITION</B> int	=> index of the attribute in the UDT
   * (starting at 1)
   * <LI><B>IS_NULLABLE</B> String  => ISO rules are used to determine
   * the nullability for a attribute.
   * <UL>
   * <LI> YES           --- if the attribute can include NULLs
   * <LI> NO            --- if the attribute cannot include NULLs
   * <LI> empty string  --- if the nullability for the
   * attribute is unknown
   * </UL>
   * <LI><B>SCOPE_CATALOG</B> String => catalog of table that is the
   * scope of a reference attribute (<code>null</code> if DATA_TYPE isn't REF)
   * <LI><B>SCOPE_SCHEMA</B> String => schema of table that is the
   * scope of a reference attribute (<code>null</code> if DATA_TYPE isn't REF)
   * <LI><B>SCOPE_TABLE</B> String => table name that is the scope of a
   * reference attribute (<code>null</code> if the DATA_TYPE isn't REF)
   * <LI><B>SOURCE_DATA_TYPE</B> short => source type of a distinct type or user-generated
   * Ref type,SQL type from java.sql.Types (<code>null</code> if DATA_TYPE
   * isn't DISTINCT or user-generated REF)
   * </OL>
   *
   * @param catalog              a catalog name; must match the catalog name as it
   *                             is stored in the database; "" retrieves those without a catalog;
   *                             <code>null</code> means that the catalog name should not be used to narrow
   *                             the search
   * @param schemaPattern        a schema name pattern; must match the schema name
   *                             as it is stored in the database; "" retrieves those without a schema;
   *                             <code>null</code> means that the schema name should not be used to narrow
   *                             the search
   * @param typeNamePattern      a type name pattern; must match the
   *                             type name as it is stored in the database
   * @param attributeNamePattern an attribute name pattern; must match the attribute
   *                             name as it is declared in the database
   * @return a <code>ResultSet</code> object in which each row is an
   *         attribute description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.4
   */
  ResultSet getAttributes(String catalog, String schemaPattern,
                          String typeNamePattern, String attributeNamePattern)
      throws SQLException;

  /**
   * Retrieves whether this database supports the given result set holdability.
   *
   * @param holdability one of the following constants:
   *                    <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
   *                    <code>ResultSet.CLOSE_CURSORS_AT_COMMIT<code>
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @see Connection
   * @since 1.4
   */
  boolean supportsResultSetHoldability(int holdability) throws SQLException;

  /**
   * Retrieves this database's default holdability for <code>ResultSet</code>
   * objects.
   *
   * @return the default holdability; either
   *         <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
   *         <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getResultSetHoldability() throws SQLException;

  /**
   * Retrieves the major version number of the underlying database.
   *
   * @return the underlying database's major version
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getDatabaseMajorVersion() throws SQLException;

  /**
   * Retrieves the minor version number of the underlying database.
   *
   * @return underlying database's minor version
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getDatabaseMinorVersion() throws SQLException;

  /**
   * Retrieves the major JDBC version number for this
   * driver.
   *
   * @return JDBC version major number
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getJDBCMajorVersion() throws SQLException;

  /**
   * Retrieves the minor JDBC version number for this
   * driver.
   *
   * @return JDBC version minor number
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getJDBCMinorVersion() throws SQLException;

  /**
   * A possible return value for the method
   * <code>DatabaseMetaData.getSQLStateType</code> which is used to indicate
   * whether the value returned by the method
   * <code>SQLException.getSQLState</code> is an
   * X/Open (now know as Open Group) SQL CLI SQLSTATE value.
   * <p/>
   *
   * @since 1.4
   */
  int sqlStateXOpen = 1;

  /**
   * A possible return value for the method
   * <code>DatabaseMetaData.getSQLStateType</code> which is used to indicate
   * whether the value returned by the method
   * <code>SQLException.getSQLState</code> is an SQLSTATE value.
   * <p/>
   *
   * @since 1.6
   */
  int sqlStateSQL = 2;

  /**
   * A possible return value for the method
   * <code>DatabaseMetaData.getSQLStateType</code> which is used to indicate
   * whether the value returned by the method
   * <code>SQLException.getSQLState</code> is an SQL99 SQLSTATE value.
   * <p/>
   * <b>Note:</b>This constant remains only for compatibility reasons. Developers
   * should use the constant <code>sqlStateSQL</code> instead.
   *
   * @since 1.4
   */
  int sqlStateSQL99 = sqlStateSQL;

  /**
   * Indicates whether the SQLSTATE returned by <code>SQLException.getSQLState</code>
   * is X/Open (now known as Open Group) SQL CLI or SQL:2003.
   *
   * @return the type of SQLSTATE; one of:
   *         sqlStateXOpen or
   *         sqlStateSQL
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  int getSQLStateType() throws SQLException;

  /**
   * Indicates whether updates made to a LOB are made on a copy or directly
   * to the LOB.
   *
   * @return <code>true</code> if updates are made to a copy of the LOB;
   *         <code>false</code> if updates are made directly to the LOB
   * @throws SQLException if a database access error occurs
   * @since 1.4
   */
  boolean locatorsUpdateCopy() throws SQLException;

  /**
   * Retrieves whether this database supports statement pooling.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLExcpetion if a database access error occurs
   * @since 1.4
   */
  boolean supportsStatementPooling() throws SQLException;

  //------------------------- JDBC 4.0 -----------------------------------

  /**
   * Indicates whether or not this data source supports the SQL <code>ROWID</code> type,
   * and if so  the lifetime for which a <code>RowId</code> object remains valid.
   * <p/>
   * The returned int values have the following relationship:
   * <pre>
   *     ROWID_UNSUPPORTED < ROWID_VALID_OTHER < ROWID_VALID_TRANSACTION
   *         < ROWID_VALID_SESSION < ROWID_VALID_FOREVER
   * </pre>
   * so conditional logic such as
   * <pre>
   *     if (metadata.getRowIdLifetime() > DatabaseMetaData.ROWID_VALID_TRANSACTION)
   * </pre>
   * can be used. Valid Forever means valid across all Sessions, and valid for
   * a Session means valid across all its contained Transactions.
   *
   * @return the status indicating the lifetime of a <code>RowId</code>
   * @throws SQLException if a database access error occurs
   * @since 1.6
   */
  RowIdLifetime getRowIdLifetime() throws SQLException;

  /**
   * Retrieves the schema names available in this database.  The results
   * are ordered by <code>TABLE_CATALOG</code> and
   * <code>TABLE_SCHEM</code>.
   * <p/>
   * <P>The schema columns are:
   * <OL>
   * <LI><B>TABLE_SCHEM</B> String => schema name
   * <LI><B>TABLE_CATALOG</B> String => catalog name (may be <code>null</code>)
   * </OL>
   *
   * @param catalog       a catalog name; must match the catalog name as it is stored
   *                      in the database;"" retrieves those without a catalog; null means catalog
   *                      name should not be used to narrow down the search.
   * @param schemaPattern a schema name; must match the schema name as it is
   *                      stored in the database; null means
   *                      schema name should not be used to narrow down the search.
   * @return a <code>ResultSet</code> object in which each row is a
   *         schema description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.6
   */
  ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException;

  /**
   * Retrieves whether this database supports invoking user-defined or vendor functions
   * using the stored procedure escape syntax.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.6
   */
  boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException;

  /**
   * Retrieves whether a <code>SQLException</code> while autoCommit is <code>true</code> inidcates
   * that all open ResultSets are closed, even ones that are holdable.  When a <code>SQLException</code> occurs while
   * autocommit is <code>true</code>, it is vendor specific whether the JDBC driver responds with a commit operation, a
   * rollback operation, or by doing neither a commit nor a rollback.  A potential result of this difference
   * is in whether or not holdable ResultSets are closed.
   *
   * @return <code>true</code> if so; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @since 1.6
   */
  boolean autoCommitFailureClosesAllResultSets() throws SQLException;

  /**
   * Retrieves a list of the client info properties
   * that the driver supports.  The result set contains the following columns
   * <p/>
   * <ol>
   * <li><b>NAME</b> String=> The name of the client info property<br>
   * <li><b>MAX_LEN</b> int=> The maximum length of the value for the property<br>
   * <li><b>DEFAULT_VALUE</b> String=> The default value of the property<br>
   * <li><b>DESCRIPTION</b> String=> A description of the property.  This will typically
   * contain information as to where this property is
   * stored in the database.
   * </ol>
   * <p/>
   * The <code>ResultSet</code> is sorted by the NAME column
   * <p/>
   *
   * @return A <code>ResultSet</code> object; each row is a supported client info
   *         property
   *         <p/>
   * @throws SQLException if a database access error occurs
   *                      <p/>
   * @since 1.6
   */
  ResultSet getClientInfoProperties()
      throws SQLException;

  /**
   * Retrieves a description of the  system and user functions available
   * in the given catalog.
   * <p/>
   * Only system and user function descriptions matching the schema and
   * function name criteria are returned.  They are ordered by
   * <code>FUNCTION_CAT</code>, <code>FUNCTION_SCHEM</code>,
   * <code>FUNCTION_NAME</code> and
   * <code>SPECIFIC_ NAME</code>.
   * <p/>
   * <P>Each function description has the the following columns:
   * <OL>
   * <LI><B>FUNCTION_CAT</B> String => function catalog (may be <code>null</code>)
   * <LI><B>FUNCTION_SCHEM</B> String => function schema (may be <code>null</code>)
   * <LI><B>FUNCTION_NAME</B> String => function name.  This is the name
   * used to invoke the function
   * <LI><B>REMARKS</B> String => explanatory comment on the function
   * <LI><B>FUNCTION_TYPE</B> short => kind of function:
   * <UL>
   * <LI>functionResultUnknown - Cannot determine if a return value
   * or table will be returned
   * <LI> functionNoTable- Does not return a table
   * <LI> functionReturnsTable - Returns a table
   * </UL>
   * <LI><B>SPECIFIC_NAME</B> String  => the name which uniquely identifies
   * this function within its schema.  This is a user specified, or DBMS
   * generated, name that may be different then the <code>FUNCTION_NAME</code>
   * for example with overload functions
   * </OL>
   * <p/>
   * A user may not have permission to execute any of the functions that are
   * returned by <code>getFunctions</code>
   *
   * @param catalog             a catalog name; must match the catalog name as it
   *                            is stored in the database; "" retrieves those without a catalog;
   *                            <code>null</code> means that the catalog name should not be used to narrow
   *                            the search
   * @param schemaPattern       a schema name pattern; must match the schema name
   *                            as it is stored in the database; "" retrieves those without a schema;
   *                            <code>null</code> means that the schema name should not be used to narrow
   *                            the search
   * @param functionNamePattern a function name pattern; must match the
   *                            function name as it is stored in the database
   * @return <code>ResultSet</code> - each row is a function description
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.6
   */
  ResultSet getFunctions(String catalog, String schemaPattern,
                         String functionNamePattern) throws SQLException;

  /**
   * Retrieves a description of the given catalog's system or user
   * function parameters and return type.
   * <p/>
   * <P>Only descriptions matching the schema,  function and
   * parameter name criteria are returned. They are ordered by
   * <code>FUNCTION_CAT</code>, <code>FUNCTION_SCHEM</code>,
   * <code>FUNCTION_NAME</code> and
   * <code>SPECIFIC_ NAME</code>. Within this, the return value,
   * if any, is first. Next are the parameter descriptions in call
   * order. The column descriptions follow in column number order.
   * <p/>
   * <P>Each row in the <code>ResultSet</code>
   * is a parameter description, column description or
   * return type description with the following fields:
   * <OL>
   * <LI><B>FUNCTION_CAT</B> String => function catalog (may be <code>null</code>)
   * <LI><B>FUNCTION_SCHEM</B> String => function schema (may be <code>null</code>)
   * <LI><B>FUNCTION_NAME</B> String => function name.  This is the name
   * used to invoke the function
   * <LI><B>COLUMN_NAME</B> String => column/parameter name
   * <LI><B>COLUMN_TYPE</B> Short => kind of column/parameter:
   * <UL>
   * <LI> functionColumnUnknown - nobody knows
   * <LI> functionColumnIn - IN parameter
   * <LI> functionColumnInOut - INOUT parameter
   * <LI> functionColumnOut - OUT parameter
   * <LI> functionColumnReturn - function return value
   * <LI> functionColumnResult - Indicates that the parameter or column
   * is a column in the <code>ResultSet</code>
   * </UL>
   * <LI><B>DATA_TYPE</B> int => SQL type from java.sql.Types
   * <LI><B>TYPE_NAME</B> String => SQL type name, for a UDT type the
   * type name is fully qualified
   * <LI><B>PRECISION</B> int => precision
   * <LI><B>LENGTH</B> int => length in bytes of data
   * <LI><B>SCALE</B> short => scale -  null is returned for data types where
   * SCALE is not applicable.
   * <LI><B>RADIX</B> short => radix
   * <LI><B>NULLABLE</B> short => can it contain NULL.
   * <UL>
   * <LI> functionNoNulls - does not allow NULL values
   * <LI> functionNullable - allows NULL values
   * <LI> functionNullableUnknown - nullability unknown
   * </UL>
   * <LI><B>REMARKS</B> String => comment describing column/parameter
   * <LI><B>CHAR_OCTET_LENGTH</B> int  => the maximum length of binary
   * and character based parameters or columns.  For any other datatype the returned value
   * is a NULL
   * <LI><B>ORDINAL_POSITION</B> int  => the ordinal position, starting
   * from 1, for the input and output parameters. A value of 0
   * is returned if this row describes the function's return value.
   * For result set columns, it is the
   * ordinal position of the column in the result set starting from 1.
   * <LI><B>IS_NULLABLE</B> String  => ISO rules are used to determine
   * the nullability for a parameter or column.
   * <UL>
   * <LI> YES           --- if the parameter or column can include NULLs
   * <LI> NO            --- if the parameter or column  cannot include NULLs
   * <LI> empty string  --- if the nullability for the
   * parameter  or column is unknown
   * </UL>
   * <LI><B>SPECIFIC_NAME</B> String  => the name which uniquely identifies
   * this function within its schema.  This is a user specified, or DBMS
   * generated, name that may be different then the <code>FUNCTION_NAME</code>
   * for example with overload functions
   * </OL>
   * <p/>
   * <p>The PRECISION column represents the specified column size for the given
   * parameter or column.
   * For numeric data, this is the maximum precision.  For character data, this is the length in characters.
   * For datetime datatypes, this is the length in characters of the String representation (assuming the
   * maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype,
   * this is the length in bytes. Null is returned for data types where the
   * column size is not applicable.
   *
   * @param catalog             a catalog name; must match the catalog name as it
   *                            is stored in the database; "" retrieves those without a catalog;
   *                            <code>null</code> means that the catalog name should not be used to narrow
   *                            the search
   * @param schemaPattern       a schema name pattern; must match the schema name
   *                            as it is stored in the database; "" retrieves those without a schema;
   *                            <code>null</code> means that the schema name should not be used to narrow
   *                            the search
   * @param functionNamePattern a procedure name pattern; must match the
   *                            function name as it is stored in the database
   * @param columnNamePattern   a parameter name pattern; must match the
   *                            parameter or column name as it is stored in the database
   * @return <code>ResultSet</code> - each row describes a
   *         user function parameter, column  or return type
   * @throws SQLException if a database access error occurs
   * @see #getSearchStringEscape
   * @since 1.6
   */
  ResultSet getFunctionColumns(String catalog,
                               String schemaPattern,
                               String functionNamePattern,
                               String columnNamePattern) throws SQLException;


  /**
   * Indicates that type of the parameter or column is unknown.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   */
  int functionColumnUnknown = 0;

  /**
   * Indicates that the parameter or column is an IN parameter.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionColumnIn = 1;

  /**
   * Indicates that the parameter or column is an INOUT parameter.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionColumnInOut = 2;

  /**
   * Indicates that the parameter or column is an OUT parameter.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionColumnOut = 3;
  /**
   * Indicates that the parameter or column is a return value.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionReturn = 4;

  /**
   * Indicates that the parameter or column is a column in a result set.
   * <p/>
   * A possible value for the column
   * <code>COLUMN_TYPE</code>
   * in the <code>ResultSet</code>
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionColumnResult = 5;


  /**
   * Indicates that <code>NULL</code> values are not allowed.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionNoNulls = 0;

  /**
   * Indicates that <code>NULL</code> values are allowed.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionNullable = 1;

  /**
   * Indicates that whether <code>NULL</code> values are allowed
   * is unknown.
   * <p/>
   * A possible value for the column
   * <code>NULLABLE</code>
   * in the <code>ResultSet</code> object
   * returned by the method <code>getFunctionColumns</code>.
   *
   * @since 1.6
   */
  int functionNullableUnknown = 2;

  /**
   * Indicates that it is not known whether the function returns
   * a result or a table.
   * <p/>
   * A possible value for column <code>FUNCTION_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getFunctions</code>.
   *
   * @since 1.6
   */
  int functionResultUnknown = 0;

  /**
   * Indicates that the function  does not return a table.
   * <p/>
   * A possible value for column <code>FUNCTION_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getFunctions</code>.
   *
   * @since 1.6
   */
  int functionNoTable = 1;

  /**
   * Indicates that the function  returns a table.
   * <p/>
   * A possible value for column <code>FUNCTION_TYPE</code> in the
   * <code>ResultSet</code> object returned by the method
   * <code>getFunctions</code>.
   *
   * @since 1.6
   */
  int functionReturnsTable = 2;

}


