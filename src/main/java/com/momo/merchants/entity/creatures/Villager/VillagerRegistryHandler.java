package com.momo.merchants.entity.creatures.Villager;

import com.momo.merchants.MoMoFramework;
import com.momo.merchants.init.ModMerchantRecipes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class VillagerRegistryHandler {
    //seed_merchant
    public static final VillagerRegistry.VillagerProfession SEED_MERCHANT =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "seed_merchant",
                    MoMoFramework.MODID + ":textures/entity/villager/seed_merchant.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_seed_merchant.png" );

    public static final VillagerRegistry.VillagerCareer SEED_MERCHANT_CAREER =
            new VillagerRegistry.VillagerCareer(SEED_MERCHANT, MoMoFramework.MODID + ".SeedMerchant");

    //butcher
    public static final VillagerRegistry.VillagerProfession BUTCHER =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "butcher",
                    MoMoFramework.MODID + ":textures/entity/villager/butcher.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_butcher.png" );

    public static final VillagerRegistry.VillagerCareer BUTCHER_CAREER =
            new VillagerRegistry.VillagerCareer(BUTCHER, MoMoFramework.MODID + ".Butcher");

    //wizard
    public static final VillagerRegistry.VillagerProfession WIZARD =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "wizard",
                    MoMoFramework.MODID + ":textures/entity/villager/wizard.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_wizard.png" );

    public static final VillagerRegistry.VillagerCareer WIZARD_CAREER =
            new VillagerRegistry.VillagerCareer(WIZARD, MoMoFramework.MODID + ".Wizard");

    //miner
    public static final VillagerRegistry.VillagerProfession MINER =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "miner",
                    MoMoFramework.MODID + ":textures/entity/villager/miner.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_miner.png" );

    public static final VillagerRegistry.VillagerCareer MINER_CAREER =
            new VillagerRegistry.VillagerCareer(MINER, MoMoFramework.MODID + ".Miner");

    //sculptor
    public static final VillagerRegistry.VillagerProfession SCULPTOR =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "sculptor",
                    MoMoFramework.MODID + ":textures/entity/villager/sculptor.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_sculptor.png" );

    public static final VillagerRegistry.VillagerCareer SCULPTOR_CAREER =
            new VillagerRegistry.VillagerCareer(SCULPTOR, MoMoFramework.MODID + ".Sculptor");

    //Botanist
    public static final VillagerRegistry.VillagerProfession BOTANIST =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "botanist",
                    MoMoFramework.MODID + ":textures/entity/villager/botanist.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_botanist.png" );

    public static final VillagerRegistry.VillagerCareer BOTANIST_CAREER =
            new VillagerRegistry.VillagerCareer(BOTANIST, MoMoFramework.MODID + ".Botanist");

    //Engineer
    public static final VillagerRegistry.VillagerProfession ENGINEER =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "engineer",
                    MoMoFramework.MODID + ":textures/entity/villager/engineer.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_engineer.png" );

    public static final VillagerRegistry.VillagerCareer ENGINEER_CAREER =
            new VillagerRegistry.VillagerCareer(ENGINEER, MoMoFramework.MODID + ".Engineer");

    //HorseTrainer
    public static final VillagerRegistry.VillagerProfession HORSE_TRAINER =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "horse_trainer",
                    MoMoFramework.MODID + ":textures/entity/villager/horse_trainer.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_horse_trainer.png" );

    public static final VillagerRegistry.VillagerCareer HORSE_TRAINER_CAREER =
            new VillagerRegistry.VillagerCareer(HORSE_TRAINER, MoMoFramework.MODID + ".HorseTrainer");

    //Florist
    public static final VillagerRegistry.VillagerProfession FLORIST =
            new VillagerRegistry.VillagerProfession(MoMoFramework.MODID + "florist",
                    MoMoFramework.MODID + ":textures/entity/villager/florist.png",
                    MoMoFramework.MODID + ":textures/entity/zombie_villager/zombie_florist.png" );

    public static final VillagerRegistry.VillagerCareer FLORIST_CAREER =
            new VillagerRegistry.VillagerCareer(FLORIST, MoMoFramework.MODID + ".Florist");


    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<VillagerRegistry.VillagerProfession>event){
        IForgeRegistry<VillagerRegistry.VillagerProfession>registry = event.getRegistry();

        //seed_merchant add trade
        SEED_MERCHANT_CAREER.addTrade(1,
                new EntityVillager.EmeraldForItems(Items.WHEAT_SEEDS,
                        new EntityVillager.PriceInfo(18,22))
        );
        SEED_MERCHANT_CAREER.addTrade(2,
                new EntityVillager.EmeraldForItems(Items.BEETROOT_SEEDS,
                        new EntityVillager.PriceInfo(15,19))
        );
        SEED_MERCHANT_CAREER.addTrade(3,
                new EntityVillager.EmeraldForItems(Items.MELON_SEEDS,
                        new EntityVillager.PriceInfo(10,15)),
                new EntityVillager.EmeraldForItems(Items.PUMPKIN_SEEDS,
                        new EntityVillager.PriceInfo(10,15))
                );
        SEED_MERCHANT_CAREER.addTrade(4,
                new ModMerchantRecipes.EmeraldForItem(Items.DYE, 3, new EntityVillager.PriceInfo(23,28))
        );
        registry.register(SEED_MERCHANT);

        //butcher add trade
        BUTCHER_CAREER.addTrade(1,
                new EntityVillager.EmeraldForItems(Items.FEATHER,
                        new EntityVillager.PriceInfo(9,12))
        );
        BUTCHER_CAREER.addTrade(2,
                new EntityVillager.EmeraldForItems(Items.BEEF,
                        new EntityVillager.PriceInfo(14,18))
        );
        BUTCHER_CAREER.addTrade(3,
                new EntityVillager.EmeraldForItems(Items.MUTTON,
                        new EntityVillager.PriceInfo(14,18)),
                new EntityVillager.EmeraldForItems(Items.RABBIT,
                        new EntityVillager.PriceInfo(9,12))
        );
        BUTCHER_CAREER.addTrade(4,
                new EntityVillager.EmeraldForItems(Items.RABBIT_HIDE,
                        new EntityVillager.PriceInfo(9,12))
        );
        registry.register(BUTCHER);

        //wizard add trade
        WIZARD_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.SPIDER_EYE,
                        new EntityVillager.PriceInfo(12,15))
        );
        WIZARD_CAREER.addTrade(2,
                new ModMerchantRecipes.EmeraldForItem(Items.BONE,
                        new EntityVillager.PriceInfo(30,36)),
                new EntityVillager.EmeraldForItems(Items.GUNPOWDER,
                        new EntityVillager.PriceInfo(32,35))
        );
        WIZARD_CAREER.addTrade(3,
                new ModMerchantRecipes.EmeraldForItem(Items.RABBIT_FOOT,
                        new EntityVillager.PriceInfo(6,11)),
                new ModMerchantRecipes.ItemForEmerald(Items.SLIME_BALL,
                        new EntityVillager.PriceInfo(4,7))
        );
        WIZARD_CAREER.addTrade(4,
                new ModMerchantRecipes.EmeraldForItem(Items.ENDER_PEARL,
                        new EntityVillager.PriceInfo(11,14)),
                new ModMerchantRecipes.ItemForEmerald(Items.BLAZE_POWDER,
                        new EntityVillager.PriceInfo(4,7))
        );
        registry.register(WIZARD);

        //miner add trade
        MINER_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.COAL,
                        new EntityVillager.PriceInfo(16,24))
        );
        MINER_CAREER.addTrade(2,
                new ModMerchantRecipes.EmeraldForItem(Items.IRON_INGOT,
                        new EntityVillager.PriceInfo(7,9)),
                new ModMerchantRecipes.ItemAForItemB(Items.EMERALD, new EntityVillager.PriceInfo(1,1),
                        Items.FLINT, new EntityVillager.PriceInfo(3,5))
        );
        MINER_CAREER.addTrade(3,
                new ModMerchantRecipes.EmeraldForItem(Items.GOLD_INGOT,
                        new EntityVillager.PriceInfo(8,10))
        );
        MINER_CAREER.addTrade(4,
                new EntityVillager.ListItemForEmeralds(Items.DIAMOND,
                        new EntityVillager.PriceInfo(6,8))
        );
        registry.register(MINER);

        //sculptor add trade
        SCULPTOR_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.STONE),
                        new EntityVillager.PriceInfo(20,26))
        );
        SCULPTOR_CAREER.addTrade(2,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.STONE), 3,
                        new EntityVillager.PriceInfo(16,21)),
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.STONE), 2,
                        new EntityVillager.PriceInfo(16,21)),
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.STONE), 1,
                        new EntityVillager.PriceInfo(16,21))

        );
        SCULPTOR_CAREER.addTrade(3,
                new ModMerchantRecipes.ItemAForItemB(Items.EMERALD, new EntityVillager.PriceInfo(1,1),
                        Items.CLAY_BALL, new EntityVillager.PriceInfo(8,10)),
                new ModMerchantRecipes.ItemAEmeraldForItemB(
                        Item.getItemFromBlock(Blocks.COBBLESTONE), new EntityVillager.PriceInfo(10,10),
                            new EntityVillager.PriceInfo(1,1),
                                Item.getItemFromBlock(Blocks.GRAVEL), new EntityVillager.PriceInfo(6,10))
        );
        SCULPTOR_CAREER.addTrade(4,
                new ModMerchantRecipes.ItemForEmerald(Items.QUARTZ,
                        new EntityVillager.PriceInfo(1,3))
        );
        registry.register(SCULPTOR);

        //botanist add trade
        BOTANIST_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.BEETROOT,
                        new EntityVillager.PriceInfo(18,22)),
                new ModMerchantRecipes.EmeraldForItem(Items.POISONOUS_POTATO,
                        new EntityVillager.PriceInfo(1,2))
        );
        BOTANIST_CAREER.addTrade(2,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.RED_MUSHROOM),
                        new EntityVillager.PriceInfo(16, 21)),
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.BROWN_MUSHROOM),
                        new EntityVillager.PriceInfo(16, 21))
        );
        BOTANIST_CAREER.addTrade(3,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.CACTUS),
                        new EntityVillager.PriceInfo(24,36)),
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.VINE),
                        new EntityVillager.PriceInfo(24,36))
        );
        BOTANIST_CAREER.addTrade(4,
                new ModMerchantRecipes.EmeraldForItem(Items.CHORUS_FRUIT,
                        new EntityVillager.PriceInfo(36,54)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.CHORUS_FLOWER),
                        new EntityVillager.PriceInfo(5,10))
        );
        registry.register(BOTANIST);

        //engineer add trade
        ENGINEER_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.REDSTONE,
                        new EntityVillager.PriceInfo(53,64))
        );
        ENGINEER_CAREER.addTrade(2,
                new ModMerchantRecipes.ItemForEmerald(Items.REPEATER,
                        new EntityVillager.PriceInfo(1, 3)),
                new ModMerchantRecipes.ItemForEmerald(Items.COMPARATOR,
                        new EntityVillager.PriceInfo(2, 4))
        );
        ENGINEER_CAREER.addTrade(3,
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DAYLIGHT_DETECTOR),
                        new EntityVillager.PriceInfo(4,7)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.OBSERVER),
                        new EntityVillager.PriceInfo(2,4))
        );
        ENGINEER_CAREER.addTrade(4,
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.PISTON),
                        new EntityVillager.PriceInfo(3,6)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.STICKY_PISTON),
                        new EntityVillager.PriceInfo(5,8))
        );
        registry.register(ENGINEER);

        //horse_trainer add trade
        HORSE_TRAINER_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.GOLDEN_CARROT,
                        new EntityVillager.PriceInfo(7,9))
        );
        HORSE_TRAINER_CAREER.addTrade(2,
                new ModMerchantRecipes.ItemAEmeraldForItemB(
                        Items.LEATHER, new EntityVillager.PriceInfo(5,7),
                            new EntityVillager.PriceInfo(5,10),
                                Items.SADDLE, new EntityVillager.PriceInfo(1,1)),
                new ModMerchantRecipes.ItemForEmerald(Items.LEAD,
                        new EntityVillager.PriceInfo(8, 9))
        );
        HORSE_TRAINER_CAREER.addTrade(3,
                new ModMerchantRecipes.ItemAEmeraldForItemB(
                        Items.IRON_INGOT, new EntityVillager.PriceInfo(6,8),
                            new EntityVillager.PriceInfo(5,10),
                                Items.IRON_HORSE_ARMOR, new EntityVillager.PriceInfo(1,1))
        );
        HORSE_TRAINER_CAREER.addTrade(4,
                new ModMerchantRecipes.ItemAEmeraldForItemB(
                        Items.GOLD_INGOT, new EntityVillager.PriceInfo(6,8),
                            new EntityVillager.PriceInfo(5,10),
                                Items.GOLDEN_HORSE_ARMOR, new EntityVillager.PriceInfo(1,1))
        );
        HORSE_TRAINER_CAREER.addTrade(5,
                new ModMerchantRecipes.ItemAEmeraldForItemB(
                        Items.DIAMOND, new EntityVillager.PriceInfo(6,8),
                            new EntityVillager.PriceInfo(5,10),
                                Items.DIAMOND_HORSE_ARMOR, new EntityVillager.PriceInfo(1,1))
        );
        registry.register(HORSE_TRAINER);

        //florist add trade
        FLORIST_CAREER.addTrade(1,
                new ModMerchantRecipes.EmeraldForItem(Items.DYE,15,
                        new EntityVillager.PriceInfo(16,22))
        );
        FLORIST_CAREER.addTrade(2,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.TALLGRASS),1,
                        new EntityVillager.PriceInfo(42,54)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.TALLGRASS),2,
                        new EntityVillager.PriceInfo(1, 2))
        );
        FLORIST_CAREER.addTrade(3,
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.RED_FLOWER),
                        new EntityVillager.PriceInfo(8,13)),
                new ModMerchantRecipes.EmeraldForItem(Item.getItemFromBlock(Blocks.YELLOW_FLOWER),
                        new EntityVillager.PriceInfo(8,13))
        );
        FLORIST_CAREER.addTrade(4,
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DOUBLE_PLANT),0,
                        new EntityVillager.PriceInfo(2, 4)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DOUBLE_PLANT),1,
                        new EntityVillager.PriceInfo(2, 4)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DOUBLE_PLANT),4,
                        new EntityVillager.PriceInfo(2, 4)),
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DOUBLE_PLANT),5,
                        new EntityVillager.PriceInfo(2, 4))
        );
        FLORIST_CAREER.addTrade(5,
                new ModMerchantRecipes.ItemForEmerald(Item.getItemFromBlock(Blocks.DEADBUSH),
                        new EntityVillager.PriceInfo(2, 3))
        );
        registry.register(FLORIST);
    }
}
