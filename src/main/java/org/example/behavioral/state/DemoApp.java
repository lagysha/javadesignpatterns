package org.example.behavioral.state;

import static org.example.behavioral.state.InModerationState.ADMIN_ROLE;
import static org.example.behavioral.state.InModerationState.CONTENTCREATOR_ROLE;

public class DemoApp {
    public static void main(String[] args) {
        var document = new Document();
        User adminUser = new User(ADMIN_ROLE, "andrii_p");
        User contentCreatorUser = new User(CONTENTCREATOR_ROLE, "evgeniy_m");

        document.printStatus();

        document.publish(contentCreatorUser);
        document.printStatus();

        document.publish(contentCreatorUser);
        document.printStatus();

        document.publish(adminUser);
        document.printStatus();

        document.publish(adminUser);

    }
}
