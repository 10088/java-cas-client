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
package org.apereo.cas.client.authentication;

import org.apereo.cas.client.util.CommonUtils;

import java.io.Serializable;
import java.security.Principal;

/**
 * Simple security principal implementation.
 *
 * @author Marvin S. Addison
 * @version $Revision$
 * @since 3.1.11
 *
 */
public class SimplePrincipal implements Principal, Serializable {

    /** SimplePrincipal.java */
    private static final long serialVersionUID = -5645357206342793145L;

    /** The unique identifier for this principal. */
    private final String name;

    /**
     * Creates a new principal with the given name.
     * @param name Principal name.
     */
    public SimplePrincipal(final String name) {
        this.name = name;
        CommonUtils.assertNotNull(this.name, "name cannot be null.");
    }

    @Override
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return 37 * getName().hashCode();
    }

    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof SimplePrincipal)) {
            return false;
        } else {
            return getName().equals(((SimplePrincipal) o).getName());
        }
    }

    public String toString() {
        return getName();
    }
}
