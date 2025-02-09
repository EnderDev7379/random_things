package net.enderdev.random_things.item;

import net.enderdev.random_things.RandomThings;
import net.enderdev.random_things.tag.ModBlockTags;
import net.enderdev.random_things.tag.ModItemTags;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomThings.MOD_ID);

    public static final ToolMaterial EMERALD_MATERIAL = new ToolMaterial(ModBlockTags.INCORRECT_FOR_EMERALD_TOOL, 3000, 12.0F, 0.0F, 30, ModItemTags.EMERALD_TOOL_MATERIALS);

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(
            EMERALD_MATERIAL, 16, 6, new Item.Properties().setId(ITEMS.key("emerald_sword"))
    ));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(
            EMERALD_MATERIAL, 8, 3, new Item.Properties().setId(ITEMS.key("emerald_pickaxe"))
    ));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(
            EMERALD_MATERIAL, 20, 0.8F, new Item.Properties().setId(ITEMS.key("emerald_axe"))
    ));
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new Chisel(new Item.Properties().setId(ITEMS.key("chisel"))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
