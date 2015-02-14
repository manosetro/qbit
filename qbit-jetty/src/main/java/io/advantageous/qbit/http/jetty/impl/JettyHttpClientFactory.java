package io.advantageous.qbit.http.jetty.impl;

import io.advantageous.qbit.http.HttpClient;
import io.advantageous.qbit.spi.HttpClientFactory;

/**
 * Created by rhightower on 2/13/15.
 */
public class JettyHttpClientFactory implements HttpClientFactory {

    @Override
    public HttpClient create(String host, int port, int requestBatchSize, int timeOutInMilliseconds,
                             int poolSize, boolean autoFlush, int flushRate,
                             boolean keepAlive, boolean pipeLine) {
        return null;
    }
}
