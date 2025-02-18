### UPDATED:
- **Quark** (FORGE):
  - Fixed the  _post_ & _stripped_post_'s recipes wtih some woodTypes from other mods are using OAK as an ingredient - [#810](https://github.com/MehVahdJukaar/WoodGood/issues/810)
    - <span style="color:red;">WARNING: Backup your world</span>
    - <span style="color:yellow;">REASON:</span> The required children for recipe is _wood_, so some WoodType not having that will be removed from the world
  - Fixed the blocks with **Caverns & Chasms** not being generated due to the woodType, AZALEA - [#810](https://github.com/MehVahdJukaar/WoodGood/issues/810)
- **Decorative Blocks** (COMMON): 
  - Fixed _beam_'s recipes with other woodTypes has OAK as an ingredient (similar to Quark's recipe issue) - [#810](https://github.com/MehVahdJukaar/WoodGood/issues/810)
    - <span style="color:red;">WARNING: Backup your world</span>
  - The _seat_'s recipes now requires _fence_ & _slab_ 
  - Outdated Creative Tab ResourceKey - [#815](https://github.com/MehVahdJukaar/WoodGood/issues/815) 
- **Macaw's Roofs** (FABRIC): Added _UPPER_STEEP_ROOF_ to creative inventory - [#816](https://github.com/MehVahdJukaar/WoodGood/issues/817)
- **TEXTURES** (COMMON): Fixed **Biomes O' Plenty**'s snowblossom_leaves' & **Rainbows Oak Renewed**'s rainbow_leaves' missing texture - [#816](https://github.com/MehVahdJukaar/WoodGood/issues/816) 
- **Chipped** (COMMON): Another tweak of textures for _slanted_, _herringbone_, _double_herringbone_ - REASON: the previous code caused the loading time to be stuck with large modpack, 200+ mods
- **LANG**: zn_ch - @ChuijkYahus

### ADDED:
- **EveryCompat** (FORGE): 
  - An exception for new Compat Mod: **Macaw's Modding Legacy**
  - An exception for **Terraqueous**' CHERRY (Due to Minecraft's CHERRY

### EXCLUDED:
- **QUark** (FORGE): _stripped_flowering_azalea_post_ with **Ecologics** - related to [#808](https://github.com/MehVahdJukaar/WoodGood/issues/808)
- **Woodworks** (FORGE): _boards_ with **Upgrade Aquatic** & **Autumnity** - related to [#809](https://github.com/MehVahdJukaar/WoodGood/issues/809)

### OTHER:
- **Moonlight Lib**: Updated the Id of _log_ and _stripped_log_ from **My Nether's Delight** - Fixed in v2.13.63 - [#810](https://github.com/MehVahdJukaar/WoodGood/issues/810)

---

### NEW:
- N/A

---

**LEGEND**:
- (COMMON) = FORGE & FABRIC