package me.rabrg.paragon.model.account;

import com.google.gson.annotations.SerializedName;

public class AccountHeroStats {

    @SerializedName("total")
    private Total total;
    @SerializedName("pvp")
    private Pvp pvp;

    public Total getTotal() {
        return total;
    }

    public Pvp getPvp() {
        return pvp;
    }

    @Override
    public String toString() {
        return "AccountHeroStats{" +
                "total=" + total +
                ", pvp=" + pvp +
                '}';
    }

    public class Total {

        @SerializedName("assists_towers")
        private int assistsTowers;
        @SerializedName("kills_core")
        private int killsCore;
        @SerializedName("games_won")
        private int gamesWon;
        @SerializedName("damage_done_minons")
        private int damageDoneMinons;
        @SerializedName("damage_done_structures")
        private int damageDoneStructures;
        @SerializedName("kills_hero")
        private int killsHero;
        @SerializedName("assists_core")
        private int assistsCore;
        @SerializedName("games_played")
        private int gamesPlayed;
        @SerializedName("assists_minions")
        private int assistsMinions;
        @SerializedName("kills_minions")
        private int killsMinions;
        @SerializedName("hero_level_up")
        private int heroLevelUp;
        @SerializedName("time_played")
        private int timePlayed;
        @SerializedName("damage_done_hero")
        private int damageDoneHero;
        @SerializedName("kills_towers")
        private int killsTowers;
        @SerializedName("kills_inhibitors")
        private int killsInhibitors;
        @SerializedName("assists_hero")
        private int assistsHero;
        @SerializedName("assists_inhibitor")
        private int assistsInhibitor;
        @SerializedName("kills_wards")
        private int killsWards;
        @SerializedName("assists_rigs")
        private int assistsRigs;
        @SerializedName("kills_rigs")
        private int killsRigs;

        public int getAssistsTowers() {
            return assistsTowers;
        }

        public int getKillsCore() {
            return killsCore;
        }

        public int getGamesWon() {
            return gamesWon;
        }

        public int getDamageDoneMinons() {
            return damageDoneMinons;
        }

        public int getDamageDoneStructures() {
            return damageDoneStructures;
        }

        public int getKillsHero() {
            return killsHero;
        }

        public int getAssistsCore() {
            return assistsCore;
        }

        public int getGamesPlayed() {
            return gamesPlayed;
        }

        public int getAssistsMinions() {
            return assistsMinions;
        }

        public int getKillsMinions() {
            return killsMinions;
        }

        public int getHeroLevelUp() {
            return heroLevelUp;
        }

        public int getTimePlayed() {
            return timePlayed;
        }

        public int getDamageDoneHero() {
            return damageDoneHero;
        }

        public int getKillsTowers() {
            return killsTowers;
        }

        public int getKillsInhibitors() {
            return killsInhibitors;
        }

        public int getAssistsHero() {
            return assistsHero;
        }

        public int getAssistsInhibitor() {
            return assistsInhibitor;
        }

        public int getKillsWards() {
            return killsWards;
        }

        public int getAssistsRigs() {
            return assistsRigs;
        }

        public int getKillsRigs() {
            return killsRigs;
        }

        @Override
        public String toString() {
            return "Total{" +
                    "assistsTowers=" + assistsTowers +
                    ", killsCore=" + killsCore +
                    ", gamesWon=" + gamesWon +
                    ", damageDoneMinons=" + damageDoneMinons +
                    ", damageDoneStructures=" + damageDoneStructures +
                    ", killsHero=" + killsHero +
                    ", assistsCore=" + assistsCore +
                    ", gamesPlayed=" + gamesPlayed +
                    ", assistsMinions=" + assistsMinions +
                    ", killsMinions=" + killsMinions +
                    ", heroLevelUp=" + heroLevelUp +
                    ", timePlayed=" + timePlayed +
                    ", damageDoneHero=" + damageDoneHero +
                    ", killsTowers=" + killsTowers +
                    ", killsInhibitors=" + killsInhibitors +
                    ", assistsHero=" + assistsHero +
                    ", assistsInhibitor=" + assistsInhibitor +
                    ", killsWards=" + killsWards +
                    ", assistsRigs=" + assistsRigs +
                    ", killsRigs=" + killsRigs +
                    '}';
        }
    }

    public class Pvp {

        @SerializedName("assists_towers")
        private int assistsTowers;
        @SerializedName("kills_core")
        private int killsCore;
        @SerializedName("games_won")
        private int gamesWon;
        @SerializedName("damage_done_minons")
        private int damageDoneMinons;
        @SerializedName("damage_done_structures")
        private int damageDoneStructures;
        @SerializedName("kills_hero")
        private int killsHero;
        @SerializedName("assists_core")
        private int assistsCore;
        @SerializedName("games_played")
        private int gamesPlayed;
        @SerializedName("assists_minions")
        private int assistsMinions;
        @SerializedName("kills_minions")
        private int killsMinions;
        @SerializedName("time_played")
        private int timePlayed;
        @SerializedName("damage_done_hero")
        private int damageDoneHero;
        @SerializedName("kills_towers")
        private int killsTowers;
        @SerializedName("assists_hero")
        private int assistsHero;
        @SerializedName("kills_inhibitors")
        private int killsInhibitors;
        @SerializedName("assists_inhibitor")
        private int assistsInhibitor;
        @SerializedName("kills_wards")
        private int killsWards;
        @SerializedName("assists_rigs")
        private int assistsRigs;
        @SerializedName("kills_rigs")
        private int killsRigs;

        public int getAssistsTowers() {
            return assistsTowers;
        }

        public int getKillsCore() {
            return killsCore;
        }

        public int getGamesWon() {
            return gamesWon;
        }

        public int getDamageDoneMinons() {
            return damageDoneMinons;
        }

        public int getDamageDoneStructures() {
            return damageDoneStructures;
        }

        public int getKillsHero() {
            return killsHero;
        }

        public int getAssistsCore() {
            return assistsCore;
        }

        public int getGamesPlayed() {
            return gamesPlayed;
        }

        public int getAssistsMinions() {
            return assistsMinions;
        }

        public int getKillsMinions() {
            return killsMinions;
        }

        public int getTimePlayed() {
            return timePlayed;
        }

        public int getDamageDoneHero() {
            return damageDoneHero;
        }

        public int getKillsTowers() {
            return killsTowers;
        }

        public int getAssistsHero() {
            return assistsHero;
        }

        public int getKillsInhibitors() {
            return killsInhibitors;
        }

        public int getAssistsInhibitor() {
            return assistsInhibitor;
        }

        public int getKillsWards() {
            return killsWards;
        }

        public int getAssistsRigs() {
            return assistsRigs;
        }

        public int getKillsRigs() {
            return killsRigs;
        }

        @Override
        public String toString() {
            return "Pvp{" +
                    "assistsTowers=" + assistsTowers +
                    ", killsCore=" + killsCore +
                    ", gamesWon=" + gamesWon +
                    ", damageDoneMinons=" + damageDoneMinons +
                    ", damageDoneStructures=" + damageDoneStructures +
                    ", killsHero=" + killsHero +
                    ", assistsCore=" + assistsCore +
                    ", gamesPlayed=" + gamesPlayed +
                    ", assistsMinions=" + assistsMinions +
                    ", killsMinions=" + killsMinions +
                    ", timePlayed=" + timePlayed +
                    ", damageDoneHero=" + damageDoneHero +
                    ", killsTowers=" + killsTowers +
                    ", assistsHero=" + assistsHero +
                    ", killsInhibitors=" + killsInhibitors +
                    ", assistsInhibitor=" + assistsInhibitor +
                    ", killsWards=" + killsWards +
                    ", assistsRigs=" + assistsRigs +
                    ", killsRigs=" + killsRigs +
                    '}';
        }
    }

}
