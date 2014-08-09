package com.tom.maplemod.block;

import com.tom.maplemod.creativetab.CreativeTabMapleMod;

/**
 * Created by theyes on 21/07/2014.
 */
public class BlockUKFlag extends BlockMyFirstMod {

    public BlockUKFlag(){
        super();
        this.setBlockName("ukflag");
        this.setBlockTextureName("ukflag");
        this.setCreativeTab(CreativeTabMapleMod.MyFirstMod_Tab);
        this.setLightLevel(1.0F);
    }

}
