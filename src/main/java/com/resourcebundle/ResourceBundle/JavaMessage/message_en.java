package com.resourcebundle.ResourceBundle.JavaMessage;

import java.util.ListResourceBundle;

public class message_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return resources;
    }

    private final Object[][] resources = {

            { "Capital", "Washington, D.C." },
            { "Area", 58390 },
            { "Currency", "USD" },
    };

}
