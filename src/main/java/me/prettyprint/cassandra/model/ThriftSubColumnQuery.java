package me.prettyprint.cassandra.model;

import me.prettyprint.hector.api.query.SubColumnQuery;

/**
 * Thrift implementation of SubColumnQuery
 * @author Ran Tavory
 *
 * @param <SN> supercolumn name type
 * @param <N> column name type
 * @param <V> column value type
 */
public final class ThriftSubColumnQuery<K, SN,N,V> extends AbstractSubColumnQuery<K, SN, N, V>
    implements SubColumnQuery<K, SN, N, V> {

  /*package*/ public ThriftSubColumnQuery(KeyspaceOperator keyspaceOperator,
      Serializer<K> keySerializer,
      Serializer<SN> sNameSerializer,
      Serializer<N> nameSerializer,
      Serializer<V> valueSerializer) {
    super(keyspaceOperator, keySerializer, sNameSerializer, nameSerializer, valueSerializer);
  }

}