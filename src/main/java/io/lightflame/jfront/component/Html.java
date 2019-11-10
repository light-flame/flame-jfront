package io.lightflame.jfront.component;

import io.lightflame.jfront.Transpilable;
import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Header;
import io.lightflame.jfront.style.Style;

import java.util.List;

public class Html implements Transpilable {

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

  @Override
  public String transpile() {
    return String.format("<!DOCTYPE html><html>%s%s</html>",
        header.transpile(),
        body.transpile()
    );
  }
}
