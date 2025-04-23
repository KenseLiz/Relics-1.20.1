package net.kense.relics.item;

import net.kense.relics.Relics;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Relics.MOD_ID);

    public static final RegistryObject<Item> A_VONTADE_DA_CRIACAO = ITEMS.register("a_vontade_da_criacao",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TECHNO_FERRAMENTA_FUTURISTICA = ITEMS.register("techno_ferramenta_futuristica",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> A_ENGRENAGEM_DO_MUNDO = ITEMS.register("a_engrenagem_do_mundo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUCLEO_DA_AUTOMACAO = ITEMS.register("nucleo_da_automacao",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ESSENCIA_DIVINA = ITEMS.register("essencia_divina",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNA_DO_OCULTISMO = ITEMS.register("runa_do_ocultismo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COROA_DO_CREPUSCULO = ITEMS.register("coroa_do_crepusculo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FORCA_DA_FLORA = ITEMS.register("forca_da_flora",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
