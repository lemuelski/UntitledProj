
package com.mygdx.final_values;

public class AssetList {

    public enum Assets {

        ATLAS_GAMESCREEN("atlas/gamescreen.pack"),

        ASSET_FIGHTER("fighter"),
        ASSET_WHITEMAGE("whitemage"),
        ASSET_REDMAGE("redmage"),
        ASSET_VIKING("viking"),
        ASSET_WARRIOR("warrior"),
        ASSET_BG_FIELD("battleback");

        private String filepath;

        private Assets(String filepath) {
            this.filepath = filepath;
        }

        public String getPath() {
            return this.filepath;
        }

    }

}
