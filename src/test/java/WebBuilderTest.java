import io.lightflame.jfront.*;
import io.lightflame.jfront.behavior.BehaviorShow;
import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Div;
import io.lightflame.jfront.component.Header;
import io.lightflame.jfront.component.Html;
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
        Selector selector1 = new Selector();
        Div olaDiv = new Div("ola");
        ComponentBuilder cb = new ComponentBuilder(
            olaDiv,
            olaDiv,
            new Div(
                new Div("Isso esta escondido")
            ).selectors(selector1),
            new Div("clicar para exibir").events(new OnClick(new BehaviorShow(selector1)))
        );

        Style hideStyle = new Style(selector1)
            .display(Display.NONE);
        Body body = new Body(cb);
        Header header = new Header(Arrays.asList(hideStyle));
        Html html = new Html(header, body);

        TranspilerV1 transpilerV1 = new TranspilerV1();
        String k = transpilerV1.process(html);
        ToFile.make("index.html", k);
    }
}
