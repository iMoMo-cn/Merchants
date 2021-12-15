package com.momo.merchants.blocks.blockBasic;

import com.momo.merchants.blocks.BlockBase;
import com.momo.merchants.blocks.tileEntity.orbs.TileEntityNullifyOrb;
import com.momo.merchants.blocks.tileEntity.orbs.TileEntityNullifyOrbMor;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class BlockNullifyOrb extends BlockBase implements ITileEntityProvider {

	public boolean isMoroonProof = false;
	public BlockNullifyOrb(String name, Material material) {
		super(name, material);
		this.hasTileEntity = true;
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setLightOpacity(1);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	public BlockNullifyOrb setAdvanced(boolean val)
	{
		isMoroonProof = val;
		return this;
	}


	//optional
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return super.getItemDropped(state, rand, fortune);
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return super.quantityDropped(rand);
	}

	/**
	 * Returns a new instance of a blockBush's tile entity class. Called on placing the blockBush.
	 */
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		if (isMoroonProof)
		{
			return new TileEntityNullifyOrbMor();
		}else {
			return new TileEntityNullifyOrb();
		}
	}


}