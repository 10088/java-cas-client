/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
  $Id$

  Copyright (C) 2008-2009 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package org.apereo.cas.client.ssl;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Unit test for {@link WhitelistHostnameVerifier} class.
 *
 * @author Middleware
 * @version $Revision$
 *
 */
public class WhitelistHostnameVerifierTests extends TestCase {
    /**
     * Test method for {@link WhitelistHostnameVerifier#verify(String, javax.net.ssl.SSLSession)}.
     */
    public void testVerify() {
        final WhitelistHostnameVerifier verifier = new WhitelistHostnameVerifier("red.vt.edu, green.vt.edu,blue.vt.edu");
        Assert.assertTrue(verifier.verify("red.vt.edu", null));
        Assert.assertTrue(verifier.verify("green.vt.edu", null));
        Assert.assertTrue(verifier.verify("blue.vt.edu", null));
        Assert.assertFalse(verifier.verify("purple.vt.edu", null));
    }

}
