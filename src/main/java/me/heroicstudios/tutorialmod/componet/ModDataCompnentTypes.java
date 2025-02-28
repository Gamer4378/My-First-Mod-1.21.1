package me.heroicstudios.tutorialmod.componet;

import me.heroicstudios.tutorialmod.TutorialMod;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.function.UnaryOperator;

public class ModDataCompnentTypes {

    public static final ComponentType<BlockPos> COORDINATES =
            register("coordinates", builder-> builder.codec(BlockPos.CODEC));



    public static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(TutorialMod.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }
    public static void registerComponetTypes() {
        TutorialMod.LOGGER.info("Registering Componet Types for " + TutorialMod.MOD_ID);
    }
}
