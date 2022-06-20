package com.resourcebundle.ResourceBundle.JavaMessage;

import java.util.ListResourceBundle;

public class message_fr extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return resources;
    }

    private final Object[][] resources = {

            { "Capital", "Paris" },
            { "Area", 49035 },
            { "Currency", "EUR" },
    };
}
