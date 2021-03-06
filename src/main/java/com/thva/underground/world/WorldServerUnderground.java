package com.thva.underground.world;

import net.minecraft.profiler.Profiler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

public class WorldServerUnderground extends WorldServer
{
	private TeleporterUnderground worldTeleporter;
	
	public WorldServerUnderground(MinecraftServer server, ISaveHandler saveHandlerIn, WorldInfo info, int dimensionId, Profiler profilerIn)
	{
		super(server, saveHandlerIn, info, dimensionId, profilerIn);
		worldTeleporter = new TeleporterUnderground(this);
	}
	
	@Override
    public Teleporter getDefaultTeleporter()
    {
        return this.worldTeleporter;
    }
}
