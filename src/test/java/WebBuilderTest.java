import io.lightflame.jfront.*;
import io.lightflame.jfront.behavior.BehaviorShow;
import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Div;
import io.lightflame.jfront.component.Header;
import io.lightflame.jfront.main.Html;
import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.event.OnClick;
import io.lightflame.jfront.style.Display;
import io.lightflame.jfront.style.Style;
import io.lightflame.jfront.output.ToFile;
import io.lightflame.jfront.selector.Selector;
import io.lightflame.jfront.transpiler.TranspilerV1;
import org.junit.Test;

import java.util.Arrays;

public class WebBuilderTest {

    @Test
    public void t1(){
        Selector s1 = new Selector();
        ComponentBuilder cb = new ComponentBuilder(
            new Div("ola"),
            new Div(
                new Div("Isso esta escondido")
            ).addSelector(s1),
            new Div("clicar para exibir").addEvent(new OnClick(new BehaviorShow(s1)))
        );

        Style style1 = Style.ofSelector(s1).display(Display.NONE);
        Body body = new Body(cb);
        Header header = new Header(Arrays.asList(style1));
        Html html = new Html(header, body);

        TranspilerV1 transpilerV1 = new TranspilerV1();
        String k = transpilerV1.process(html);
        ToFile.make("index.html", k);
    }
}
