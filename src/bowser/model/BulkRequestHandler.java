package bowser.model;

import java.util.List;

import ox.Json;
import ox.x.XList;

public abstract class BulkRequestHandler extends Controller {

  public abstract void tearDown();

  public boolean process(Request request, Response response) {
    setup();
    List<Request> subrequests = requests(request.getJson().asJsonArray());
    for (Request subrequest : subrequests) {
      server.handle(subrequest, response);
    }
    tearDown();
    return true;
  }

  public abstract boolean setup();

  public abstract List<Request> requests(XList<Json> xList);

}
