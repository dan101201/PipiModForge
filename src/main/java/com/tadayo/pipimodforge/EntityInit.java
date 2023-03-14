package com.tadayo.pipimodforge;
import com.tadayo.pipimodforge.PipiModForge;
import com.tadayo.pipimodforge.entities.Pipi;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import com.tadayo.pipimodforge.entities.Pipi;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PipiModForge.MODID);

    public static final RegistryObject<EntityType<Pipi>> PIPI = ENTITIES.register("pipi",
            () -> EntityType.Builder.of(Pipi::new, MobCategory.CREATURE).build(PipiModForge.MODID + ":pipi"));

}
