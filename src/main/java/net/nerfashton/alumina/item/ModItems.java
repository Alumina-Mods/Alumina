package net.nerfashton.alumina.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nerfashton.alumina.Alumina;
import net.nerfashton.alumina.core.item.TankItem;
import net.nerfashton.alumina.item.material.DustEnum;
import net.nerfashton.alumina.item.material.MetallicEnum;

import java.util.ArrayList;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Alumina.MOD_ID);
    public static final ArrayList<DeferredItem<Item>> REGISTERED_ELEMENTS = new ArrayList<>();

    public static void createIngots() {
        ArrayList<String> metals = MetallicEnum.getMetals();
        for (String name : metals) {
            ModItems.registerIngredient(name + "_ingot");
        }
    }
    public static void createDusts() {
        ArrayList<String> dusts = DustEnum.getDusts();
        for (String name : dusts) {
            ModItems.registerIngredient(name + "_dust");
        }
    }

    private static void registerIngredient(String name) {
        DeferredItem<Item> NEW_ITEM = ITEMS.register(name, () -> new Item(new Item.Properties()));
        REGISTERED_ELEMENTS.add(NEW_ITEM);
    }

    public static final DeferredItem<Item> GAS_TANK = ITEMS.register("gas_tank", () -> new TankItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        createIngots();
        createDusts();
        registerIngredient("arsenic");
        registerIngredient("boron");
        registerIngredient("tellurium");
        registerIngredient("silicon");
        ITEMS.register(eventBus);
    }
}
    