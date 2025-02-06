package tech.nicecraftz.notthatexpensive;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class NotThatExpensive implements ModInitializer {
    public static final Logger LOGGER = Logger.getLogger("NotThatExpensive");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
