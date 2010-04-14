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

package com.bedatadriven.rebar.persistence.client.domain;

import com.bedatadriven.rebar.persistence.client.ClientSideGeneratedValue;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alex Bertram
 */
@Entity
public class AutoIdEntity implements Serializable {

  private int id;
  private String name;

  public AutoIdEntity() {
  }

  public AutoIdEntity(String name) {
    this.name= name;
  }

  @Id
  @ClientSideGeneratedValue(strategy = GenerationType.AUTO)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}