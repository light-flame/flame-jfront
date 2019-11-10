import io.lightflame.jfront.component.*;
import io.lightflame.jfront.js.JQueryBuilder;
import io.lightflame.jfront.js.JSFunction;
import io.lightflame.jfront.js.JqueryEvent;
import io.lightflame.jfront.output.ToFile;
import org.junit.Test;

public class SelectNextTest {

//    <button id="showr">Show</button>
//<button id="hidr">Hide</button>
//<div>Hello 3,</div>
//<div>how</div>
//<div>are</div>
//<div>you?</div>


    // https://api.jquery.com/show/
    @Test
    public void selectNext(){

        Div div1 = new Div();
        Button btnShow = new Button();

        JSFunction showNext = new JSFunction();
        JqueryEvent onClick = new JQueryBuilder().select(btnShow).click(new JSFunction().add(
            new JQueryBuilder().select(new Div()).first().show("fast", showNext.getName()),
            showNext.add(
                new JQueryBuilder().select(new Div()).next().show("fast", showNext.getName())
            )
        ));

        Body body = new Body(
            btnShow,
            div1,
            new Script(
                showNext,
                onClick
            )
        );

        Header header = new Header();
        Html html = new Html(header, body);
        ToFile.make("index.html", html.transpile());

    }
}
