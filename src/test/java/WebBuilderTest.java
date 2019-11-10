import io.lightflame.jfront.*;
import io.lightflame.jfront.behavior.Behavior;
import io.lightflame.jfront.behavior.ShowBehavior;
import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Div;
import io.lightflame.jfront.component.Header;
import io.lightflame.jfront.component.Html;
import io.lightflame.jfront.style.BackgroundColor;
import io.lightflame.jfront.style.Display;
import io.lightflame.jfront.style.Style;
import io.lightflame.jfront.output.ToFile;
import org.junit.Test;

import java.util.Arrays;

public class WebBuilderTest {

    @Test
    public void t1(){

        Style hideStyle = new Style(
            new Display(Display.Kind.NONE),
            new BackgroundColor("red")
        );

        Behavior showBehavior = new ShowBehavior(2000);

        Div olaDiv = new Div("ola");

        Body body = new Body(
            olaDiv,
            olaDiv,
            new Div(
                new Div("Isso esta escondido")
            ).selectors(hideStyle, showBehavior),
            new Div("clicar para exibir")
        );

        Header header = new Header();
        Html html = new Html(header, body);
        ToFile.make("index.html", html.transpile());
    }
}
