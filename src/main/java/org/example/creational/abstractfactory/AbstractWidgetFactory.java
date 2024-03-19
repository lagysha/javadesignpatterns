package org.example.creational.abstractfactory;

import java.awt.*;

public interface AbstractWidgetFactory {
    public Window createWindow();
    public Scroll createScroll();
    public Button[] createNavigationButtons();
}
