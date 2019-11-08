import io.lightflame.jfront.*;
import io.lightflame.jfront.behavior.BehaviorShow;
import io.lightflame.jfront.component.Body;
import io.lightflame.jfront.component.Div;
import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.event.OnClick;
import org.junit.Test;

public class WebBuilderTest {

    @Test
    public void t1(){
        Event showDiv = new OnClick().addBehavior(new BehaviorShow(new Div("tudo sim")));
        ComponentBuilder cb = new ComponentBuilder();
        cb
            .addDiv(new Div("ola"))
            .addDiv(
                new Div(new Div("ola"))
            )
            .addDiv(new Div("td bem?")
                .addEvent(showDiv)
            );
        Body b = new Body();
    }
}
