/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.crypto.springboot;

import org.apache.camel.component.crypto.DigitalSignatureConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The crypto component is used for signing and verifying exchanges using the
 * Signature Service of the Java Cryptographic Extension (JCE).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.crypto")
public class DigitalSignatureComponentConfiguration {

    /**
     * To use the shared DigitalSignatureConfiguration as configuration
     */
    private DigitalSignatureConfiguration configuration;

    public DigitalSignatureConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(DigitalSignatureConfiguration configuration) {
        this.configuration = configuration;
    }
}