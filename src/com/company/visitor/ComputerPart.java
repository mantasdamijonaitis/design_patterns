package com.company.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
