package me.rabrg.paragon.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardComplete extends Card {

    @SerializedName("rarity")
    private String rarity;
    @SerializedName("affinities")
    private List<String> affinities = null;
    @SerializedName("cost")
    private int cost;
    @SerializedName("upgradeSlots")
    private int upgradeSlots;
    @SerializedName("effects")
    private List<Effect> effects = null;
    @SerializedName("maxedEffects")
    private List<Effect> maxedEffects = null;

    public String getRarity() {
        return rarity;
    }

    public List<String> getAffinities() {
        return affinities;
    }

    public int getCost() {
        return cost;
    }

    public int getUpgradeSlots() {
        return upgradeSlots;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public List<Effect> getMaxedEffects() {
        return maxedEffects;
    }

    @Override
    public String toString() {
        return "CardComplete{" +
                "rarity='" + rarity + '\'' +
                ", affinities=" + affinities +
                ", cost=" + cost +
                ", upgradeSlots=" + upgradeSlots +
                ", effects=" + effects +
                ", maxedEffects=" + maxedEffects +
                "} " + super.toString();
    }

    public class Effect {

        @SerializedName("stat")
        private String stat;
        @SerializedName("value")
        private double value;
        @SerializedName("description")
        private String description;
        @SerializedName("cooldown")
        private int cooldown;
        @SerializedName("passive")
        private boolean passive;
        @SerializedName("unique")
        private boolean unique;

        public String getStat() {
            return stat;
        }

        public double getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        public int getCooldown() {
            return cooldown;
        }

        public boolean isPassive() {
            return passive;
        }

        public boolean isUnique() {
            return unique;
        }

        @Override
        public String toString() {
            return "Effect{" +
                    "stat='" + stat + '\'' +
                    ", value=" + value +
                    ", description='" + description + '\'' +
                    ", cooldown=" + cooldown +
                    ", passive=" + passive +
                    ", unique=" + unique +
                    '}';
        }
    }

}
