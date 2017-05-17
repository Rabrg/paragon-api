package me.rabrg.paragon.model.hero;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hero {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("attack")
    private String attack;
    @SerializedName("traits")
    private List<String> traits = null;
    @SerializedName("scale")
    private String scale;
    @SerializedName("releaseDate")
    private String releaseDate;
    @SerializedName("affinities")
    private List<String> affinities = null;
    @SerializedName("difficulty")
    private int difficulty;
    @SerializedName("stats")
    private Stats stats;
    @SerializedName("images")
    private Images images;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAttack() {
        return attack;
    }

    public List<String> getTraits() {
        return traits;
    }

    public String getScale() {
        return scale;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getAffinities() {
        return affinities;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public Stats getStats() {
        return stats;
    }

    public Images getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", attack='" + attack + '\'' +
                ", traits=" + traits +
                ", scale='" + scale + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", affinities=" + affinities +
                ", difficulty=" + difficulty +
                ", stats=" + stats +
                ", images=" + images +
                '}';
    }

    public class Stats {

        @SerializedName("Mobility")
        private int mobility;
        @SerializedName("BasicAttack")
        private int basicAttack;
        @SerializedName("Durability")
        private int durability;
        @SerializedName("AbilityAttack")
        private int abilityAttack;

        public int getMobility() {
            return mobility;
        }

        public int getBasicAttack() {
            return basicAttack;
        }

        public int getDurability() {
            return durability;
        }

        public int getAbilityAttack() {
            return abilityAttack;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "mobility=" + mobility +
                    ", basicAttack=" + basicAttack +
                    ", durability=" + durability +
                    ", abilityAttack=" + abilityAttack +
                    '}';
        }
    }

    public class Images {

        @SerializedName("icon")
        private String icon;

        public String getIcon() {
            return icon;
        }

        @Override
        public String toString() {
            return "Images{" +
                    "icon='" + icon + '\'' +
                    '}';
        }
    }

}
