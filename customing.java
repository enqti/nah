package net.enqti.customing;

import net.enqti.customing.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class customing {
    @Mod("customing")
    public static final String MODID = "customing";
     public customing() {
         IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
         ItemInit.ITEMS.register(bus);
     }
}
