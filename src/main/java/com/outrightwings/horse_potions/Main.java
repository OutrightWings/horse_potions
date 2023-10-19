package com.outrightwings.horse_potions;

import com.outrightwings.horse_potions.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "horse_potions";

    public Main()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        Items.ITEMS.register(modEventBus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER,Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
