/*
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
package org.apache.camel.kafkaconnector.braintree;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelBraintreeSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_BRAINTREE_PATH_API_NAME_CONF = "camel.sink.path.apiName";
    public static final String CAMEL_SINK_BRAINTREE_PATH_API_NAME_DOC = "What kind of operation to perform One of: [ADDON] [ADDRESS] [CLIENTTOKEN] [CREDITCARDVERIFICATION] [CUSTOMER] [DISCOUNT] [DISPUTE] [DOCUMENTUPLOAD] [MERCHANTACCOUNT] [PAYMENTMETHOD] [PAYMENTMETHODNONCE] [PLAN] [REPORT] [SETTLEMENTBATCHSUMMARY] [SUBSCRIPTION] [TRANSACTION] [WEBHOOKNOTIFICATION]";
    public static final String CAMEL_SINK_BRAINTREE_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_CONF = "camel.sink.path.methodName";
    public static final String CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_CONF = "camel.sink.endpoint.environment";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_DOC = "The environment Either SANDBOX or PRODUCTION";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_CONF = "camel.sink.endpoint.inBody";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_CONF = "camel.sink.endpoint.merchantId";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_DOC = "The merchant id provided by Braintree.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_CONF = "camel.sink.endpoint.httpReadTimeout";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_DOC = "Set read timeout for http calls.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_CONF = "camel.sink.endpoint.httpLogLevel";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_DOC = "Set logging level for http calls, see java.util.logging.Level";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_CONF = "camel.sink.endpoint.httpLogName";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_DOC = "Set log category to use to log http calls.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_DEFAULT = "Braintree";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_CONF = "camel.sink.endpoint.logHandlerEnabled";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_DOC = "Sets whether to enable the BraintreeLogHandler. It may be desirable to set this to 'false' where an existing JUL - SLF4J logger bridge is on the classpath. This option can also be configured globally on the BraintreeComponent.";
    public static final Boolean CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_DOC = "The proxy host";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_DOC = "The proxy port";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_DOC = "The access token granted by a merchant to another in order to process transactions on their behalf. Used in place of environment, merchant id, public key and private key fields.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_CONF = "camel.sink.endpoint.privateKey";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_DOC = "The private key provided by Braintree.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_CONF = "camel.sink.endpoint.publicKey";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_DOC = "The public key provided by Braintree.";
    public static final String CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.braintree.lazyStartProducer";
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.braintree.basicPropertyBinding";
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_CONF = "camel.component.braintree.configuration";
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelBraintreeSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelBraintreeSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_BRAINTREE_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_BRAINTREE_PATH_API_NAME_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_ENVIRONMENT_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_MERCHANT_ID_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_LEVEL_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_HTTP_LOG_NAME_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_LOG_HANDLER_ENABLED_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_ENDPOINT_PUBLIC_KEY_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BRAINTREE_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}