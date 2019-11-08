package io.lightflame.jfront.component;

public class Html {
  private String template = "<!DOCTYPE html><html></html>";
  private Body body;

  public Html setBody(Body body){
    this.body = body;
    return this;
  }

}
