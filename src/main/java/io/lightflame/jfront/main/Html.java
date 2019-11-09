package io.lightflame.jfront.main;

import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Header;
import io.lightflame.jfront.style.Style;

import java.util.List;

public class Html {

  private Header header;
  private Body body;

  public Html(Header header, Body body) {
    this.header = header;
    this.body = body;
  }

  public Body getBody() {
    return body;
  }

  public Header getHeader() {
    return header;
  }

}
