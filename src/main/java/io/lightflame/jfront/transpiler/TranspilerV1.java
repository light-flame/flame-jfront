package io.lightflame.jfront.transpiler;

import io.lightflame.jfront.ComponentBuilder;
import io.lightflame.jfront.behavior.AlertBehavior;
import io.lightflame.jfront.behavior.Behavior;
import io.lightflame.jfront.component.*;
import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.component.Html;
import io.lightflame.jfront.event.OnClick;
import io.lightflame.jfront.selector.Selector;
import io.lightflame.jfront.style.Style;

import java.util.List;

public class TranspilerV1 implements Transpiler {


  @Override
  public String process(ComponentBuilder componentBuilder) {
    return tBodyComponent(componentBuilder.getBodyComponents());
  }

  @Override
  public String process(Html html) {
    return String.format("<!DOCTYPE html><html>%s%s</html>",
        transpile(html.getHeader()),
        transpile(html.getBody())
    );
  }

  private String transpile(Header header){
    String jquery = String.format("<script src=\"%s\"></script>", header.getJquery());
    String style = String.format("<style>%s</style>", tStyles(header.getStyles()));
    String events = String.format("<script>$(document).ready(function(){%s});</script>", tEvents(header.getEvents()));
    return String.format("<head>%s%s%s</head>", jquery, style, events);
  }

  private String tStyles(List<Style> styles){
    String result = "";
    for (Style style : styles){
      result += String.format(".%s{%s}", style.select().getGenStr(), transpile(style));
    }
    return result;
  }

  private String transpile(Style style){
    String display = style.getDisplay() == null ? "" :
        String.format("display: %s;", style.getDisplay().toString().toLowerCase());
    return String.format("%s", display);
  }

  private String transpile(Body body){
    return String.format("<body>%s</body>",tBodyComponent(body.getBodyComponents()));
  }

  private String tBodyComponent(List<BodyElement> bcs){
    String result = "";
    for (BodyElement bc : bcs){
      if (bc instanceof Div){
        result += transpile((Div)bc);
      }
      if (bc instanceof Text){
        result += transpile((Text)bc);
      }
    }
    return result;
  }

  private String transpile(Div div){
    String id = div.getId() == null ? "" : String.format(" id=\"%s\" ", div.getId());
    String name = div.getName() == null ? "" : String.format(" name=\"%s\"", div.getName());
    String selector =  transpile(div.getSelectors());
    String nameId = String.format("%s%s%s", id, name, selector);
    String tpl = String.format("<div%s>%s</div>", nameId, tBodyComponent(div.getContent()));
    return tpl;
  }

  private String tEvents(List<Event> events){
    String result = "";
    for (Event event : events){
      if (event instanceof OnClick){
        result += transpile((OnClick)event);
      }
    }
    return result;
  }

  private String transpile(List<Selector> selectors){
    if (selectors.size() == 0){
      return "";
    }
    String result = "";
    for (Selector selector : selectors){
      result += selector.getGenStr() + " ";
    }
    return String.format(" class=\"%s\"", result.trim());
  }

  private String transpile(OnClick event){
    return String.format("$('.%s').click(function(){%s});", event.select().getGenStr(), tBehavior(event.getBehaviors()));
  }

  private String tBehavior(List<Behavior> behaviors){
    String result = "";
    for (Behavior behavior : behaviors){
      if (behavior instanceof AlertBehavior){
        result += transpile((AlertBehavior)behavior);
      }
    }
    return result;
  }

  private String transpile(AlertBehavior alertBehavior){
    return String.format("alert('%s');", alertBehavior.mensagem());
  }

  private String transpile(Text txt){
    return txt.getText();
  }
}
