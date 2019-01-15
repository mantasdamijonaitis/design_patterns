package com.company.visitor;

public class Computer implements ComputerPart {

   private final ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
