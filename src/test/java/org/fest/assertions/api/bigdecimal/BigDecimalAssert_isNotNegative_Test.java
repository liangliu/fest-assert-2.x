/*
 * Created on Feb 28, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2011-2012 the original author or authors.
 */
package org.fest.assertions.api.bigdecimal;

import static org.mockito.Mockito.verify;

import org.fest.assertions.api.BigDecimalAssert;
import org.fest.assertions.api.BigDecimalAssertBaseTest;

/**
 * Tests for <code>{@link BigDecimalAssert#isNotNegative()}</code>.
 * 
 * @author Nicolas François
 */
public class BigDecimalAssert_isNotNegative_Test extends BigDecimalAssertBaseTest {

  @Override
  protected BigDecimalAssert invoke_api_method() {
    return assertions.isNotNegative();
  }

  @Override
  protected void verify_internal_effects() {
    verify(bigDecimals).assertIsNotNegative(getInfo(assertions), getActual(assertions));
  }
}
