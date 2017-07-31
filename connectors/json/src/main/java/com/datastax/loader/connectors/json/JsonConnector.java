/*
 * Copyright (C) 2017 DataStax Inc.
 *
 * This software can be used solely with DataStax Enterprise. Please consult the license at
 * http://www.datastax.com/terms/datastax-dse-driver-license-terms
 */
package com.datastax.loader.connectors.json;

import com.datastax.loader.connectors.api.Connector;
import com.datastax.loader.connectors.api.Record;
import com.typesafe.config.Config;
import org.reactivestreams.Publisher;

/** */
public class JsonConnector implements Connector {

  @Override
  public Publisher<Record> read() {
    // TODO
    return null;
  }

  @Override
  public Config configure(Config settings) {
    return settings;
  }
}
