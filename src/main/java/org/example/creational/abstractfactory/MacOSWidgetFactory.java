package org.example.creational.abstractfactory;

public class MacOSWidgetFactory implements AbstractWidgetFactory{
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MacOSScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        Button[] buttons = {
            new MacOSButton("close window"),
            new MacOSButton("expand window"),
            new MacOSButton("collapse window"),
            new MacOSButton("back"),
        };
        return buttons;
    }
}
