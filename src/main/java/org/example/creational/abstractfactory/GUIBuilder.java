package org.example.creational.abstractfactory;

import java.awt.*;

public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");
        widgetFactory.createScroll();
        widgetFactory.createNavigationButtons();
    }
}
