package io.lightflame.jfront.transpiler;

import io.lightflame.jfront.ComponentBuilder;
import io.lightflame.jfront.component.*;
import io.lightflame.jfront.main.Html;
import io.lightflame.jfront.style.Style;

import java.util.List;

public class TranspilerV1 implements Transpiler {


  @Override
  public String process(ComponentBuilder componentBuilder) {
    return transpile(componentBuilder.getBodyComponents());
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
    return String.format("<head>%s%s</head>", jquery, style);
  }

  private String tStyles(List<Style> styles){
    String result = "";
    for (Style style : styles){
      result += String.format(".%s{%s}", style.getSelector().getGenStr(), transpile(style));
    }
    return result;
  }

  private String transpile(Style style){
    String display = style.getDisplay() == null ? "" :
        String.format("display: %s;", style.getDisplay().toString().toLowerCase());
    return String.format("%s", display);
  }

  private String transpile(Body body){
    return String.format("<body>%s</body>",transpile(body.getBodyComponents()));
  }

  private String transpile(List<BodyComponent> bcs){
    String result = "";
    for (BodyComponent bc : bcs){
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
    String selector = div.getSelector() == null ? "" : String.format(" class=\"%s\"", div.getSelector().getGenStr());
    String nameId = String.format("%s%s%s", id, name, selector);
    String tpl = String.format("<div%s>%s</div>", nameId, transpile(div.getContent()));
    return tpl;
  }

  private String transpile(Text txt){
    return txt.getText();
  }
}
