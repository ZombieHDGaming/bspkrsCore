package bspkrs.network;

import net.minecraft.network.PacketBuffer;

public interface BSPacket
{
    void readBytes(PacketBuffer bytes);

    void writeBytes(PacketBuffer bytes);
}
