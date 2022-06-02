package bowser.model;

import java.util.List;

public abstract class BulkRequestHandler extends Controller {

  public abstract void setup();

  public abstract void tearDown();

  public abstract List<Request> requests();

  public boolean process(List<Request> requests, Response response) {
    setup();
    for (Request request : requests) {
      // server.handle(request, response)
    }
    tearDown();
    return true;
  }

}
