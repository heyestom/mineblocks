package com.tom.myfirstmod.block;

import com.tom.myfirstmod.creativetab.CreativeTabMyFirstMod;

/**
 * Created by theyes on 21/07/2014.
 */
public class BlockUKFlag extends BlockMyFirstMod {

    public BlockUKFlag(){
        super();
        this.setBlockName("ukflag");
        this.setBlockTextureName("ukflag");
        this.setCreativeTab(CreativeTabMyFirstMod.MyFirstMod_Tab);
        this.setLightLevel(1.0F);
    }

}
