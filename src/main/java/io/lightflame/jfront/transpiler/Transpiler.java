package io.lightflame.jfront.transpiler;

import io.lightflame.jfront.ComponentBuilder;
import io.lightflame.jfront.component.Html;

public interface Transpiler {
  String process(ComponentBuilder webBuilder);
  String process(Html html);
}
