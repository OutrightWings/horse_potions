package com.outrightwings.horse_potions.item;

import com.outrightwings.horse_potions.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final RegistryObject<StatPotion> INCREASE_JUMP_POTION = ITEMS.register("increase_jump_potion",() -> new StatPotion(new Item.Properties(),true,true));
    public static final RegistryObject<StatPotion> DECREASE_JUMP_POTION = ITEMS.register("decrease_jump_potion",() -> new StatPotion(new Item.Properties(),false,true));
    public static final RegistryObject<StatPotion> INCREASE_SPEED_POTION = ITEMS.register("increase_speed_potion",() -> new StatPotion(new Item.Properties(),true,false));
    public static final RegistryObject<StatPotion> DECREASE_SPEED_POTION = ITEMS.register("decrease_speed_potion",() -> new StatPotion(new Item.Properties(),false,false));

    public static final RegistryObject<HorseStick> HORSE_STICK = ITEMS.register("horse_stick",()->new HorseStick(new Item.Properties()));

    public static final RegistryObject<CreativeModeTab> HORSEPOTIONTAB = CREATIVE_MODE_TABS.register("horse_potions", () -> CreativeModeTab.builder()
            .icon(() -> INCREASE_JUMP_POTION.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.horse_potions"))
            .displayItems((parameters, output) -> {
                output.accept(INCREASE_JUMP_POTION.get());
                output.accept(DECREASE_JUMP_POTION.get());
                output.accept(INCREASE_SPEED_POTION.get());
                output.accept(DECREASE_SPEED_POTION.get());
                output.accept(HORSE_STICK.get());
            }).build());
}
