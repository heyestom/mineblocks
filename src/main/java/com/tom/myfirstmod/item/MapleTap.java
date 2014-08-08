package com.tom.myfirstmod.item;

import com.tom.myfirstmod.block.MapleLog;
import com.tom.myfirstmod.creativetab.CreativeTabMyFirstMod;
import com.tom.myfirstmod.init.ModBlocks;
import com.tom.myfirstmod.init.ModItems;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.Random;

/**
 * Created by theyes on 02/08/2014.
 */
public class MapleTap extends ItemMyFirstMod {

    public MapleTap() {
        super();
        this.setUnlocalizedName("mapleTap");
        this.setCreativeTab(CreativeTabMyFirstMod.MyFirstMod_Tab);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack toolStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if (!entityPlayer.canPlayerEdit(x, y, z, p_77648_7_, toolStack)) {
            return false;
        } else {
            UseHoeEvent event = new UseHoeEvent(entityPlayer, toolStack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Event.Result.ALLOW) {
                toolStack.damageItem(1, entityPlayer);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (p_77648_7_ != 0 && (block == ModBlocks.mapleLog)) {
                Block block1 = ModBlocks.mapleTappedLog;
                world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);


                Random rand = new Random();
                int numberOfResinToSpwan = rand.nextInt(3) + 1;


                if (world.isRemote) {
                    world.setBlock(x, y, z, block1);


                    // read about data watchers
//                    for (int i = 0; i < numberOfResinToSpwan; i++)
//                        spawnResin(world, x, y, z);
//
                    toolStack.damageItem(1, entityPlayer);

                    return true;
                } else {
                    world.setBlock(x, y, z, block1);

                    for (int i = 0; i < numberOfResinToSpwan; i++)
                        spawnResin(world, x, y, z);

                    toolStack.damageItem(1, entityPlayer);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    private void spawnResin(World world, int x, int y, int z) {
        Random rand = new Random();

        float dX = rand.nextFloat() * 0.8F + 0.1F;
        float dY = rand.nextFloat() * 0.8F + 0.1F;
        float dZ = rand.nextFloat() * 0.8F + 0.1F;

        ItemStack itemStack = new ItemStack(ModItems.mapleResin, 1);

        EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, itemStack.copy());

        world.spawnEntityInWorld(entityItem);
    }


}
