package co.com.bancolombia.factory.adapters;

import co.com.bancolombia.exceptions.InvalidTaskOptionException;
import co.com.bancolombia.factory.ModuleFactory;

public class ModuleFactoryDrivenAdapter {

  public static ModuleFactory getDrivenAdapterFactory(DrivenAdapterType type)
      throws InvalidTaskOptionException {
    switch (type) {
      case JPA:
        return new DrivenAdapterJPA();
      case MONGODB:
        return new DrivenAdapterMongoDB();
      case ASYNCEVENTBUS:
        return new DrivenAdapterAsyncEventBus();
      case GENERIC:
        return new DrivenAdapterGeneric();
      case RESTCONSUMER:
        return new DrivenAdapterRestConsumer();
      case REDIS:
        return new DrivenAdapterRedis();
      case RSOCKET:
        return new DrivenAdapterRsocketRequester();
      case R2DBC:
        return new DrivenAdapterR2dbcPostgreSQL();
      case KMS:
        return new DrivenAdapterKms();
      case SECRETS:
        return new DrivenAdapterSecrets();
      default:
        throw new InvalidTaskOptionException("Driven Adapter type invalid");
    }
  }

  public enum DrivenAdapterType {
    JPA,
    MONGODB,
    ASYNCEVENTBUS,
    GENERIC,
    RESTCONSUMER,
    REDIS,
    RSOCKET,
    R2DBC,
    KMS,
    SECRETS
  }
}
