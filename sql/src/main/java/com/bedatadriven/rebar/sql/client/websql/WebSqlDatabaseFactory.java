package com.bedatadriven.rebar.sql.client.websql;

import com.bedatadriven.rebar.sql.client.SqlDatabaseFactory;
import com.bedatadriven.rebar.sql.client.SqlDatabase;

public class WebSqlDatabaseFactory implements SqlDatabaseFactory {

  @Override
  public SqlDatabase open(String databaseName) {
    return new SqlDatabaseImpl( databaseName );
  }
}
