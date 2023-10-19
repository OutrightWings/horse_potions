package com.outrightwings.horse_potions.item;

import com.outrightwings.horse_potions.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<StatPotion> INCREASE_JUMP_POTION = ITEMS.register("increase_jump_potion",() -> new StatPotion(new Item.Properties(),true,true));
    public static final RegistryObject<StatPotion> DECREASE_JUMP_POTION = ITEMS.register("decrease_jump_potion",() -> new StatPotion(new Item.Properties(),false,true));
    public static final RegistryObject<StatPotion> INCREASE_SPEED_POTION = ITEMS.register("increase_speed_potion",() -> new StatPotion(new Item.Properties(),true,false));
    public static final RegistryObject<StatPotion> DECREASE_SPEED_POTION = ITEMS.register("decrease_speed_potion",() -> new StatPotion(new Item.Properties(),false,false));

    public static final RegistryObject<HorseStick> HORSE_STICK = ITEMS.register("horse_stick",()->new HorseStick(new Item.Properties()));
}
