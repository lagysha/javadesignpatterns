package org.example.creational.abstractfactory;

public class DemoApp {
    public static void main(final String[] args) {
        GUIBuilder builder = new GUIBuilder();

        AbstractWidgetFactory widgetFactory = null;

        // check what platform we're on
        String platform = "MACOSX";
        if (platform.equals("MACOSX")) {
            widgetFactory = new MacOSWidgetFactory();
        } else {
            widgetFactory = new MsWindowsWidgetFactory();
        }

        builder.buildWindow(widgetFactory);
    }
}
