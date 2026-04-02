package com.infrastructuresickos.experience_comes_with_age;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExperienceComesWithAge.MOD_ID)
public class ExperienceComesWithAge {
    public static final String MOD_ID = "experience_comes_with_age";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public ExperienceComesWithAge() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("ExperienceComesWithAge initialized");
    }
}
