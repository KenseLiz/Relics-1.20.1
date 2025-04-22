package net.kense.relics.item;

import net.kense.relics.Relics;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Relics.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Relics_tab = CREATIVE_MODE_TABS.register("relics",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.A_VONTADE_DA_CRIACAO.get()))
                    .title(Component.translatable("creativetab.relics_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.A_VONTADE_DA_CRIACAO.get());
                        pOutput.accept(ModItems.TECHNO_FERRAMENTA_FUTURISTICA.get());
                        pOutput.accept(ModItems.A_ENGRENAGEM_DO_MUNDO.get());
                        pOutput.accept(ModItems.NUCLEO_DA_AUTOMACAO.get());
                        pOutput.accept(ModItems.ESSENCIA_DIVINA.get());
                        pOutput.accept(ModItems.RUNA_DO_OCULTISMO.get());
                        pOutput.accept(ModItems.COROA_DO_CREPUSCULO.get());
                    })
                    .build());

    public static void Register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
