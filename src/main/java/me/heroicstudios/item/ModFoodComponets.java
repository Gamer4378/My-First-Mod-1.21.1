package me.heroicstudios.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponets {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200), 0.15F).build();


    }

