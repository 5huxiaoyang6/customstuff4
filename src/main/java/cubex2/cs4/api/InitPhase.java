package cubex2.cs4.api;

public enum InitPhase
{
    PRE_INIT("preInit"),
    INIT("init"),
    POST_INIT("postInit"),
    REGISTER_BLOCKS("registerBlocks"),
    REGISTER_ITEMS("registerItems"),
    REGISTER_MODELS("registerModels");

    public final String name;

    InitPhase(String name) {this.name = name;}
}
