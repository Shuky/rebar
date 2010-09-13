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

package javax.persistence;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface Query
{

   public List getResultList();

   public Object getSingleResult();

   public int executeUpdate();

   public Query setMaxResults(int maxResult);

   public Query setFirstResult(int startPosition);

   public Query setHint(String hintName, Object value);

   public Query setParameter(String name, Object value);

   public Query setParameter(String name, Date value, TemporalType temporalType);

   public Query setParameter(String name, Calendar value, TemporalType temporalType);

   public Query setParameter(int position, Object value);

   public Query setParameter(int position, Date value, TemporalType temporalType);

   public Query setParameter(int position, Calendar value, TemporalType temporalType);

   public Query setFlushMode(FlushModeType flushMode);

}