package io.lightflame.jfront.transpiler;

import io.lightflame.jfront.ComponentBuilder;

public interface Transpiler<E> {
  E process(ComponentBuilder webBuilder);
}
