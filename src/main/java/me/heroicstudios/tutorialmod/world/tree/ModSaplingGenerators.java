package me.heroicstudios.tutorialmod.world.tree;

import me.heroicstudios.tutorialmod.TutorialMod;
import me.heroicstudios.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.entity.ai.brain.MemoryQuery;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator DRIFTWOOD = new SaplingGenerator(TutorialMod.MOD_ID + "driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DRIFTWOOD_KEY), Optional.empty());
}
