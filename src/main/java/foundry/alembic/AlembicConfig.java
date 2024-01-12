package foundry.alembic;

import net.minecraftforge.common.ForgeConfigSpec;

public class AlembicConfig {
    public static ForgeConfigSpec.BooleanValue modifyTooltips;
    public static ForgeConfigSpec.BooleanValue ownerAttributeProjectiles;
    public static ForgeConfigSpec.BooleanValue enableDebugPrints;
    public static ForgeConfigSpec.BooleanValue compatDamageEvent;
    public static ForgeConfigSpec.BooleanValue dumpStaticRegistries;


    public static ForgeConfigSpec makeConfig(ForgeConfigSpec.Builder builder) {
        modifyTooltips = builder.comment("Whether or not to modify tooltips to be vanilla friendly. (Turn off if using Apotheosis)").define("modify_tooltips", true);
        ownerAttributeProjectiles = builder.comment("Whether or not to apply the owner's damage attributes to projectiles. This disables entity-specific damage overrides for the projectile entities.").define("owner_attribute_projectiles", false);
        enableDebugPrints = builder.comment("Whether or not to enable debug prints. (Turn off if not debugging)").define("enable_debug_prints", false);
        compatDamageEvent = builder.comment("Whether or not to use the compat damage event. (Turn off only if 100% sure mods work with it.)").define("compat_damage_event", true);
        dumpStaticRegistries = builder.comment("When enabled will print the contents of static registries (attribute sets and particles) to the logger").define("dump_static_registries", false);
        return builder.build();
    }
}
