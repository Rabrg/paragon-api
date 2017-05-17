package me.rabrg.paragon.model.hero;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeroComplete extends Hero {

    @SerializedName("attributesByLevel")
    private List<AttributesByLevel> attributesByLevel = null;
    @SerializedName("abilities")
    private List<Ability> abilities = null;

    public List<AttributesByLevel> getAttributesByLevel() {
        return attributesByLevel;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "HeroComplete{" +
                "attributesByLevel=" + attributesByLevel +
                ", abilities=" + abilities +
                "} " + super.toString();
    }

    public class Ability {

        @SerializedName("name")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("shortDescription")
        private String shortDescription;
        @SerializedName("type")
        private String type;
        @SerializedName("binding")
        private String binding;
        @SerializedName("damageType")
        private String damageType;
        @SerializedName("maxLevel")
        private int maxLevel;
        @SerializedName("modifiersByLevel")
        private List<ModifiersByLevel> modifiersByLevel = null;
        @SerializedName("images")
        private Images images;

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public String getType() {
            return type;
        }

        public String getBinding() {
            return binding;
        }

        public String getDamageType() {
            return damageType;
        }

        public int getMaxLevel() {
            return maxLevel;
        }

        public List<ModifiersByLevel> getModifiersByLevel() {
            return modifiersByLevel;
        }

        public Images getImages() {
            return images;
        }

        @Override
        public String toString() {
            return "Ability{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", shortDescription='" + shortDescription + '\'' +
                    ", type='" + type + '\'' +
                    ", binding='" + binding + '\'' +
                    ", damageType='" + damageType + '\'' +
                    ", maxLevel=" + maxLevel +
                    ", modifiersByLevel=" + modifiersByLevel +
                    ", images=" + images +
                    '}';
        }

        public class ModifiersByLevel {

            @SerializedName("damage")
            private double damage;
            @SerializedName("attackratingcoefficient")
            private double attackratingcoefficient;
            @SerializedName("cooldown")
            private double cooldown;
            @SerializedName("maxhealthpercenthero")
            private int maxhealthpercenthero;
            @SerializedName("maxhealthpercent")
            private double maxhealthpercent;
            @SerializedName("energycost")
            private int energycost;
            @SerializedName("duration")
            private double duration;
            @SerializedName("movespeed")
            private double movespeed;
            @SerializedName("slowdur")
            private int slowdur;

            public double getDamage() {
                return damage;
            }

            public double getAttackratingcoefficient() {
                return attackratingcoefficient;
            }

            public double getCooldown() {
                return cooldown;
            }

            public int getMaxhealthpercenthero() {
                return maxhealthpercenthero;
            }

            public double getMaxhealthpercent() {
                return maxhealthpercent;
            }

            public int getEnergycost() {
                return energycost;
            }

            public double getDuration() {
                return duration;
            }

            public double getMovespeed() {
                return movespeed;
            }

            public int getSlowdur() {
                return slowdur;
            }

            @Override
            public String toString() {
                return "ModifiersByLevel{" +
                        "damage=" + damage +
                        ", attackratingcoefficient=" + attackratingcoefficient +
                        ", cooldown=" + cooldown +
                        ", maxhealthpercenthero=" + maxhealthpercenthero +
                        ", maxhealthpercent=" + maxhealthpercent +
                        ", energycost=" + energycost +
                        ", duration=" + duration +
                        ", movespeed=" + movespeed +
                        ", slowdur=" + slowdur +
                        '}';
            }
        }

    }

    public class AttributesByLevel {

        @SerializedName("MaxEnergy")
        private double maxEnergy;
        @SerializedName("BasicPenetrationRating")
        private int basicPenetrationRating;
        @SerializedName("BaseAttackTime")
        private double baseAttackTime;
        @SerializedName("AbilityPenetrationRating")
        private int abilityPenetrationRating;
        @SerializedName("HealthRegenRate")
        private double healthRegenRate;
        @SerializedName("AbilityResistanceRating")
        private double abilityResistanceRating;
        @SerializedName("MaxHealth")
        private double maxHealth;
        @SerializedName("BasicResistanceRating")
        private double basicResistanceRating;
        @SerializedName("CleaveRating")
        private double cleaveRating;
        @SerializedName("AttackSpeedRating")
        private double attackSpeedRating;
        @SerializedName("EnergyRegenRate")
        private double energyRegenRate;

        public double getMaxEnergy() {
            return maxEnergy;
        }

        public int getBasicPenetrationRating() {
            return basicPenetrationRating;
        }

        public double getBaseAttackTime() {
            return baseAttackTime;
        }

        public int getAbilityPenetrationRating() {
            return abilityPenetrationRating;
        }

        public double getHealthRegenRate() {
            return healthRegenRate;
        }

        public double getAbilityResistanceRating() {
            return abilityResistanceRating;
        }

        public double getMaxHealth() {
            return maxHealth;
        }

        public double getBasicResistanceRating() {
            return basicResistanceRating;
        }

        public double getCleaveRating() {
            return cleaveRating;
        }

        public double getAttackSpeedRating() {
            return attackSpeedRating;
        }

        public double getEnergyRegenRate() {
            return energyRegenRate;
        }

        @Override
        public String toString() {
            return "AttributesByLevel{" +
                    "maxEnergy=" + maxEnergy +
                    ", basicPenetrationRating=" + basicPenetrationRating +
                    ", baseAttackTime=" + baseAttackTime +
                    ", abilityPenetrationRating=" + abilityPenetrationRating +
                    ", healthRegenRate=" + healthRegenRate +
                    ", abilityResistanceRating=" + abilityResistanceRating +
                    ", maxHealth=" + maxHealth +
                    ", basicResistanceRating=" + basicResistanceRating +
                    ", cleaveRating=" + cleaveRating +
                    ", attackSpeedRating=" + attackSpeedRating +
                    ", energyRegenRate=" + energyRegenRate +
                    '}';
        }
    }

}
