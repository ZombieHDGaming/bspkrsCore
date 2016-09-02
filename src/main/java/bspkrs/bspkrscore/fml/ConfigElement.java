package bspkrs.bspkrscore.fml;

import net.minecraftforge.common.config.Property;

import static net.minecraftforge.common.config.Property.Type.BOOLEAN;
import static net.minecraftforge.common.config.Property.Type.INTEGER;

public enum ConfigElement
{
    ALLOW_DEBUG_OUTPUT("allowDebugOutput", "bspkrs.configgui.allowDebugOutput", "", BOOLEAN),
    UPDATE_TIMEOUT_MILLISECONDS("updateTimeoutMilliseconds", "bspkrs.configgui.updateTimeoutMilliseconds",
            "The timeout in milliseconds for the version update check.", INTEGER),
    GENERATE_UNIQUE_NAMES_FILE("generateUniqueNamesFile", "bspkrs.configgui.generateUniqueNamesFile",
            "When true a file called UniqueNames.txt will be generated in the config folder for convenience. " +
                    "The names found in the file are the string representation of blocks and items in Minecraft. " +
                    "Mods such as Treecapitator and StartingInventory use them in their config files since IDs are gone.", BOOLEAN);

    private final String        key;
    private final String        langKey;
    private final String        desc;
    private final Property.Type propertyType;
    private final String[]      validStrings;

    private ConfigElement(String key, String langKey, String desc, Property.Type propertyType, String[] validStrings)
    {
        this.key = key;
        this.langKey = langKey;
        this.desc = desc;
        this.propertyType = propertyType;
        this.validStrings = validStrings;
    }

    private ConfigElement(String key, String langKey, String desc, Property.Type propertyType)
    {
        this(key, langKey, desc, propertyType, new String[0]);
    }

    public String key()
    {
        return key;
    }

    public String languageKey()
    {
        return langKey;
    }

    public String desc()
    {
        return desc;
    }

    public Property.Type propertyType()
    {
        return propertyType;
    }

    public String[] validStrings()
    {
        return validStrings;
    }
}