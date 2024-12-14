package net.mehvahdjukaar.every_compat.misc;

import net.mehvahdjukaar.moonlight.api.set.leaves.LeavesType;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

// ugly mess. Too coupled with wood types and too many hardcoded exceptions
public class HardcodedStuff {

    @Nullable
    public static Boolean isWoodBlockAlreadyRegistered(String name, WoodType woodType, String modId, String shortenedId) {
        String woodNamespace = woodType.getNamespace();
        String woodID = woodType.getId().toString();

        // Better Nether & Better End have stripped_bark as stripped_wood but bark from Bewitchment caused EC to skip
        if (woodNamespace.matches("betternether|betterend") && shortenedId.equals("bw")) return false;

        // Discarding Dynamic Trees and its addons
        if (woodNamespace.contains("dynamictrees") || woodNamespace.contains("dt")) return true;

        // Garden-Of-The-dead's whistle must be skipped for branches from Regions-Unexplored
        // Nether's Exoticism & Snifferent already has branches, branches from Regions-Unexplored is not needed
        if ((woodNamespace.matches("gardens_of_the_dead|snifferent") ||
                woodID.equals("nethers_exoticism:jabuticaba")) && name.contains("branch"))
            return true;

        // Quark & Woodworks have chest & trapped_chest.
        //is this needed? shouldnt it be covered by the next statements?
        if (woodNamespace.equals("quark") && shortenedId.equals("abnww") && name.contains("chest")) return true;

        // Create's windows will be skipped blc [Let's do] Blooming Nature & Meadow already has windows
        if ((woodNamespace.equals("bloomingnature") || woodNamespace.equals("meadow")) && name.contains("window")) return false;

        // ArchitectPalette's boards will be skipped blc Upgrade-Aqautic already has boards but have no recipes &
        // no item in CreativeMode
        if (woodNamespace.equals("upgrade_aquatic") && (name.equals("driftwood_boards") || name.equals("river_boards")))
            return false;

        // Similar to above, Architect's Palette - boards will be skipped due to the existing boards in Autumnity
        if (woodNamespace.equals("autumnity") && name.equals("maple_boards")) return false;

        // check if TerraFirmaCraft (tfc) mod exist, then won't discards wood types
        if (woodNamespace.equals("tfc")) return false;

        if (woodID.equals("ecologics:azalea")) {
            if (modId.equals("quark")) return false; //ecologics and quark azalea. tbh not sure why needed
        }
        if (woodID.equals("twilightforest:mangrove")) {
            return name.equals("mangrove_chest");//mangrove waaa so much pain
        }

        //whats all this code repetition?
        if (woodID.equals("architects_palette:twisted")) {
            return name.equals("vct:twisted_crafting_table");
        }
        if (woodID.equals("biomesoplenty:fir")) {
            return name.equals("vct:fir_crafting_table");
        }
        if (woodID.equals("biomesoplenty:jacaranda")) {
            return name.equals("vct:jacaranda_crafting_table");
        }
        if (woodID.equals("biomesoplenty:maple")) {
            return name.equals("vct:maple_crafting_table");
        }
        if (woodID.equals("ecologics:azalea")) {
            return name.equals("vct:azalea_crafting_table");
        }
        if (woodID.equals("ecologics:walnut")) {
            return name.equals("vct:walnut_crafting_table");
        }
        if (shortenedId.equals("af")) return false; //hardcoding
        // if (this.shortenedId().equals("ap")) return false; //hardcoding dont remember why i had this. Incase you want o
        if (shortenedId.equals("vs")) return false; //we always register everything for these
        if (shortenedId.equals("abnww") && woodNamespace.equals("architects_palette"))
            return false; //we always register everything for these

        return null;
    }

    @Nullable
    public static Boolean isLeavesBlockAlreadyRegistered(String name, LeavesType woodType, String modId, String shortenedId) {
        String woodFrom = woodType.getNamespace();

        // Macaw's Fences&Walls or MrCrayFish's Furniture - hedges will be skipped because Quark already has hedges
        if (woodFrom.equals("quark") && (shortenedId.equals("mcf") || shortenedId.equals("cfm"))) return false;

        return null;
    }

}
