package model.expressions;

import model.value.IValue;
import model.state.PrgState;

public interface IExpression {
    IValue evaluate(PrgState state);
}
