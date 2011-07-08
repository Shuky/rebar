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

public interface RowId {
  /**
   * Compares this <code>RowId</code> to the specified object. The result is
   * <code>true</code> if and only if the argument is not null and is a RowId
   * object that represents the same ROWID as  this object.
   * <p/>
   * It is important
   * to consider both the origin and the valid lifetime of a <code>RowId</code>
   * when comparing it to another <code>RowId</code>. If both are valid, and
   * both are from the same table on the same data source, then if they are equal
   * they identify
   * the same row; if one or more is no longer guaranteed to be valid, or if
   * they originate from different data sources, or different tables on the
   * same data source, they  may be equal but still
   * not identify the same row.
   *
   * @param obj the <code>Object</code> to compare this <code>RowId</code> object
   *            against.
   * @return true if the <code>RowId</code>s are equal; false otherwise
   * @since 1.6
   */
  boolean equals(Object obj);

  /**
   * Returns an array of bytes representing the value of the SQL <code>ROWID</code>
   * designated by this <code>java.sql.RowId</code> object.
   *
   * @return an array of bytes, whose length is determined by the driver supplying
   *         the connection, representing the value of the ROWID designated by this
   *         java.sql.RowId object.
   */
  byte[] getBytes();

  /**
   * Returns a String representing the value of the SQL ROWID designated by this
   * <code>java.sql.RowId</code> object.
   * <p/>
   * Like <code>java.sql.Date.toString()</code>
   * returns the contents of its DATE as the <code>String</code> "2004-03-17"
   * rather than as  DATE literal in SQL (which would have been the <code>String</code>
   * DATE "2004-03-17"), toString()
   * returns the contents of its ROWID in a form specific to the driver supplying
   * the connection, and possibly not as a <code>ROWID</code> literal.
   *
   * @return a String whose format is determined by the driver supplying the
   *         connection, representing the value of the <code>ROWID</code> designated
   *         by this <code>java.sql.RowId</code>  object.
   */
  String toString();

  /**
   * Returns a hash code value of this <code>RowId</code> object.
   *
   * @return a hash code for the <code>RowId</code>
   */
  int hashCode();

}


