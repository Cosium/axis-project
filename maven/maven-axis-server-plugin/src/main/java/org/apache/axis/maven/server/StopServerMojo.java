/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.axis.maven.server;

import org.apache.axis.transport.http.SimpleAxisServer;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Stop a {@link SimpleAxisServer} instance.
 * 
 * @goal stop-server
 * @phase post-integration-test
 */
public class StopServerMojo extends AbstractServerMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            getServerManager().stopServer(getPort());
        } catch (Exception ex) {
            throw new MojoFailureException("Failed to stop server", ex);
        }
    }
}