package model.type;

public class IntType implements IType{
    @Override
    public boolean equals(IType type) {
        return type instanceof IntType;
    }

    public String toString() {
        return "int";
    }
}
