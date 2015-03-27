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

package org.wildfly.plugin.deployment;

import org.apache.maven.plugins.annotations.Mojo;
import org.wildfly.plugin.deployment.Deployment.Type;

/**
 * Redeploys only the application to the WildFly Application Server without first invoking the
 * the execution of the lifecycle phase 'package' prior to executing itself.
 */
@Mojo(name = "redeploy-only", threadSafe = true)
public final class RedeployOnlyMojo extends AbstractAppDeployment {

    @Override
    public String goal() {
        return "redeploy";
    }

    @Override
    public Type getType() {
        return Type.REDEPLOY;
    }

}