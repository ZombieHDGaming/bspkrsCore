package bspkrs.bspkrscore.fml;

import com.google.common.base.Throwables;
import net.minecraftforge.common.config.Configuration;

import java.io.InputStream;
import java.util.Properties;

public class Reference
{
    public static final String  MODID           = "@MOD_ID@";
    public static final String  NAME            = "@MOD_NAME@";
    public static final String  VERSION         = "@MOD_VERSION@";
    public static final String  PROXY_COMMON    = "bspkrs.bspkrscore.fml.CommonProxy";
    public static final String  PROXY_CLIENT    = "bspkrs.bspkrscore.fml.ClientProxy";
    public static final String  GUI_FACTORY     = "bspkrs.bspkrscore.fml.gui.ModGuiFactoryHandler";

    public static final String  FORGE_JSON_URL   = "@JSON_URL@";

    public static Configuration config          = null;
}