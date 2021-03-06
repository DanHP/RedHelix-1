/*
 * Copyright 2015 JBlade LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License
 */
package org.redhelix.core.computer.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 *
 *
 *
 * @since RedHelix Version 0.1
 * @author Hank Bruning
 *
 */
final class ComputerSystemIterator<RedHxChassis> implements Iterator<RedHxChassis> {

  private final List<RedHxChassis> list;

  ComputerSystemIterator(final List<RedHxChassis> list) {
    this.list = new ArrayList<>();
    this.list.addAll(list);
  }

  private ComputerSystemIterator() {
    list = null;
  }

  @Override
  public boolean hasNext() {
    return !list.isEmpty();
  }

  @Override
  public RedHxChassis next() {
    if (list.isEmpty()) {
      throw new NoSuchElementException();
    } else {
      RedHxChassis chassis = list.remove(0);

      return chassis;
    }
  }
}
