package com.momo.merchants.network.protocols;

import com.momo.merchants.MoMoFramework;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class PacketTest implements IMessage {

    int testVal;

    public PacketTest() {
    }


    public PacketTest(int testVal) {
        this.testVal = testVal;
    }

    @Override
    public void fromBytes(ByteBuf buf) {

        testVal = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(testVal);
        // these methods may also be of use for your code:
        // for Itemstacks - ByteBufUtils.writeItemStack()
        // for NBT tags ByteBufUtils.writeTag();
        // for Strings: ByteBufUtils.writeUTF8String();

    }

    public static class Handler implements IMessageHandler<PacketTest, IMessage> {
        public IMessage onMessage(final PacketTest msg, final MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;

            player.getServerWorld().addScheduledTask(() -> {
                MoMoFramework.Log("Packet:%d", msg.testVal);

                EnumHand hand = EnumHand.values()[msg.testVal];

                ItemStack item = player.getHeldItem(hand);
                if(item.isEmpty())
                {
                    MoMoFramework.LogWarning("Trying to cast an empty item");
                }

            });
            return null;
        }
    }
}
