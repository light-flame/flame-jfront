package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;

public class Text implements BodyComponent {

  private String text;

  public Text(String text) {
    this.text = text;
  }


  @Override
  public BodyComponent addEvent(Event event) {
    return null;
  }
}
