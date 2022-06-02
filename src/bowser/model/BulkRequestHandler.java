package bowser.model;

import java.util.List;

import ox.Json;

public abstract class BulkRequestHandler extends Controller {

  public abstract void setup();

  public abstract void tearDown();

  public boolean process(List<Request> requests, Response response) {
    setup();
    for (Request request : requests) {
      // server.handle(request, response)
    }
    tearDown();
    return true;
  }

  public abstract void setup(Handler handler);

  public abstract void getRequests(Json[] unprocessedRequests);

}
