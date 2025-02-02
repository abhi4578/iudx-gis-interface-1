package iudx.gis.server.database;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

@VertxGen
@ProxyGen
public interface DatabaseService {
  @GenIgnore
  static DatabaseService createProxy(Vertx vertx, String address) {
    return new DatabaseServiceVertxEBProxy(vertx, address);
  }

  @Fluent
  DatabaseService searchQuery(JsonObject request, Handler<AsyncResult<JsonObject>> handler);

  @Fluent
  DatabaseService insertIntoDb(JsonObject request, Handler<AsyncResult<JsonObject>> handler);

  @Fluent
  DatabaseService insertAdminDetails(JsonObject request, Handler<AsyncResult<JsonObject>> handler);

  @Fluent
  DatabaseService updateAdminDetails(JsonObject request, Handler<AsyncResult<JsonObject>> handler);

  @Fluent
  DatabaseService deleteAdminDetails(String resourceId, Handler<AsyncResult<JsonObject>> handler);
}
