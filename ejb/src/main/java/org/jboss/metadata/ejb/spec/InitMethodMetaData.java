/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.metadata.ejb.spec;

import org.jboss.metadata.javaee.support.IdMetaDataImpl;

/**
 * InitMethodMetaData.
 *
 * @author <a href="adrian@jboss.com">Adrian Brock</a>
 * @version $Revision: 1.1 $
 */
public class InitMethodMetaData extends IdMetaDataImpl {
    /**
     * The serialVersionUID
     */
    private static final long serialVersionUID = 1830841714074832930L;

    /**
     * The create method
     */
    private NamedMethodMetaData createMethod;

    /**
     * The bean method
     */
    private NamedMethodMetaData beanMethod;

    /**
     * Create a new InitMethodMetaData.
     */
    public InitMethodMetaData() {
        // For serialization
    }

    /**
     * Get the createMethod.
     *
     * @return the createMethod.
     */
    public NamedMethodMetaData getCreateMethod() {
        return createMethod;
    }

    /**
     * Set the createMethod.
     *
     * @param createMethod the createMethod.
     * @throws IllegalArgumentException for a null createMethod
     */
    public void setCreateMethod(NamedMethodMetaData createMethod) {
        if (createMethod == null)
            throw new IllegalArgumentException("Null createMethod");
        this.createMethod = createMethod;
    }

    /**
     * Get the beanMethod.
     *
     * @return the beanMethod.
     */
    public NamedMethodMetaData getBeanMethod() {
        return beanMethod;
    }

    /**
     * Set the beanMethod.
     *
     * @param beanMethod the beanMethod.
     * @throws IllegalArgumentException for a null beanMethod
     */
    public void setBeanMethod(NamedMethodMetaData beanMethod) {
        if (beanMethod == null)
            throw new IllegalArgumentException("Null beanMethod");
        this.beanMethod = beanMethod;
    }
}
