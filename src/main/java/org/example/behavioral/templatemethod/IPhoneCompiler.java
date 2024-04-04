package org.example.behavioral.templatemethod;

public class IPhoneCompiler extends CrossCompiler{
    @Override
    protected void collectSources() {
        System.out.println("Collect IPhone specific sources");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("IPhone compilation");
    }
}
