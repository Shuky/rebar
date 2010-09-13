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

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

public interface SQLInput {


  //================================================================
  // Methods for reading attributes from the stream of SQL data.
  // These methods correspond to the column-accessor methods of
  // java.sql.ResultSet.
  //================================================================

  /**
   * Reads the next attribute in the stream and returns it as a <code>String</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  String readString() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>boolean</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>false</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  boolean readBoolean() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>byte</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  byte readByte() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>short</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  short readShort() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as an <code>int</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  int readInt() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>long</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  long readLong() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>float</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  float readFloat() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>double</code>
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>0</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  double readDouble() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>java.math.BigDecimal</code>
   * object in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  BigDecimal readBigDecimal() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as an array of bytes
   * in the Java programming language.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  byte[] readBytes() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>java.sql.Date</code> object.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Date readDate() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>java.sql.Time</code> object.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Time readTime() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>java.sql.Timestamp</code> object.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Timestamp readTimestamp() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a stream of Unicode characters.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Reader readCharacterStream() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a stream of ASCII characters.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  InputStream readAsciiStream() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a stream of uninterpreted
   * bytes.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  InputStream readBinaryStream() throws SQLException;

  //================================================================
  // Methods for reading items of SQL user-defined types from the stream.
  //================================================================

  /**
   * Reads the datum at the head of the stream and returns it as an
   * <code>Object</code> in the Java programming language.  The
   * actual type of the object returned is determined by the default type
   * mapping, and any customizations present in this stream's type map.
   * <p/>
   * <P>A type map is registered with the stream by the JDBC driver before the
   * stream is passed to the application.
   * <p/>
   * <P>When the datum at the head of the stream is an SQL <code>NULL</code>,
   * the method returns <code>null</code>.  If the datum is an SQL structured or distinct
   * type, it determines the SQL type of the datum at the head of the stream.
   * If the stream's type map has an entry for that SQL type, the driver
   * constructs an object of the appropriate class and calls the method
   * <code>SQLData.readSQL</code> on that object, which reads additional data from the
   * stream, using the protocol described for that method.
   *
   * @return the datum at the head of the stream as an <code>Object</code> in the
   *         Java programming language;<code>null</code> if the datum is SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Object readObject() throws SQLException;

  /**
   * Reads an SQL <code>REF</code> value from the stream and returns it as a
   * <code>Ref</code> object in the Java programming language.
   *
   * @return a <code>Ref</code> object representing the SQL <code>REF</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Ref readRef() throws SQLException;

  /**
   * Reads an SQL <code>BLOB</code> value from the stream and returns it as a
   * <code>Blob</code> object in the Java programming language.
   *
   * @return a <code>Blob</code> object representing data of the SQL <code>BLOB</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Blob readBlob() throws SQLException;

  /**
   * Reads an SQL <code>CLOB</code> value from the stream and returns it as a
   * <code>Clob</code> object in the Java programming language.
   *
   * @return a <code>Clob</code> object representing data of the SQL <code>CLOB</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Clob readClob() throws SQLException;

  /**
   * Reads an SQL <code>ARRAY</code> value from the stream and returns it as an
   * <code>Array</code> object in the Java programming language.
   *
   * @return an <code>Array</code> object representing data of the SQL
   *         <code>ARRAY</code> value at the head of the stream; <code>null</code>
   *         if the value read is SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  Array readArray() throws SQLException;

  /**
   * Retrieves whether the last value read was SQL <code>NULL</code>.
   *
   * @return <code>true</code> if the most recently read SQL value was SQL
   *         <code>NULL</code>; <code>false</code> otherwise
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.2
   */
  boolean wasNull() throws SQLException;

  //---------------------------- JDBC 3.0 -------------------------

  /**
   * Reads an SQL <code>DATALINK</code> value from the stream and returns it as a
   * <code>java.net.URL</code> object in the Java programming language.
   *
   * @return a <code>java.net.URL</code> object.
   * @throws SQLException if a database access error occurs,
   *                      or if a URL is malformed
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.4
   */
  URL readURL() throws SQLException;

  //---------------------------- JDBC 4.0 -------------------------

  /**
   * Reads an SQL <code>NCLOB</code> value from the stream and returns it as a
   * <code>NClob</code> object in the Java programming language.
   *
   * @return a <code>NClob</code> object representing data of the SQL <code>NCLOB</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.6
   */
  NClob readNClob() throws SQLException;

  /**
   * Reads the next attribute in the stream and returns it as a <code>String</code>
   * in the Java programming language. It is intended for use when
   * accessing  <code>NCHAR</code>,<code>NVARCHAR</code>
   * and <code>LONGNVARCHAR</code> columns.
   *
   * @return the attribute; if the value is SQL <code>NULL</code>, returns <code>null</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.6
   */
  String readNString() throws SQLException;

  /**
   * Reads an SQL <code>XML</code> value from the stream and returns it as a
   * <code>SQLXML</code> object in the Java programming language.
   *
   * @return a <code>SQLXML</code> object representing data of the SQL <code>XML</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.6
   */
  SQLXML readSQLXML() throws SQLException;

  /**
   * Reads an SQL <code>ROWID</code> value from the stream and returns it as a
   * <code>RowId</code> object in the Java programming language.
   *
   * @return a <code>RowId</code> object representing data of the SQL <code>ROWID</code> value
   *         at the head of the stream; <code>null</code> if the value read is
   *         SQL <code>NULL</code>
   * @throws SQLException if a database access error occurs
   * @throws SQLFeatureNotSupportedException
   *                      if the JDBC driver does not support
   *                      this method
   * @since 1.6
   */
  RowId readRowId() throws SQLException;

}
