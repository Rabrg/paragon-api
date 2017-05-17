package me.rabrg.paragon.model.account;

import com.google.gson.annotations.SerializedName;

public class AccountStats {

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
        return "AccountStats{" +
                "total=" + total +
                ", pvp=" + pvp +
                '}';
    }

    public class Total {

        @SerializedName("match_tip_picked_up_amber")
        private int matchTipPickedUpAmber;
        @SerializedName("match_tip_no_key")
        private int matchTipNoKey;
        @SerializedName("match_tip_near_blue_camp")
        private int matchTipNearBlueCamp;
        @SerializedName("kills_minions")
        private int killsMinions;
        @SerializedName("surrender_votes_abstained")
        private int surrenderVotesAbstained;
        @SerializedName("games_not_participating")
        private int gamesNotParticipating;
        @SerializedName("match_tip_3cp")
        private int matchTip3cp;
        @SerializedName("match_tip_level_ability")
        private int matchTipLevelAbility;
        @SerializedName("match_tip_ally_has_op")
        private int matchTipAllyHasOp;
        @SerializedName("deaths_towers")
        private int deathsTowers;
        @SerializedName("match_tip_level_ult")
        private int matchTipLevelUlt;
        @SerializedName("match_tip_last_hitting_tip")
        private int matchTipLastHittingTip;
        @SerializedName("assists_rigs")
        private int assistsRigs;
        @SerializedName("rep")
        private int rep;
        @SerializedName("kills_rigs")
        private int killsRigs;
        @SerializedName("match_tip_enemy_has_op")
        private int matchTipEnemyHasOp;
        @SerializedName("games_left")
        private int gamesLeft;
        @SerializedName("deaths_minions")
        private int deathsMinions;
        @SerializedName("games_won")
        private int gamesWon;
        @SerializedName("match_tip_on_death")
        private int matchTipOnDeath;
        @SerializedName("damage_done_minons")
        private int damageDoneMinons;
        @SerializedName("match_tip_near_xp_camp")
        private int matchTipNearXpCamp;
        @SerializedName("games_reconnected")
        private int gamesReconnected;
        @SerializedName("kills_hero")
        private int killsHero;
        @SerializedName("assists_core")
        private int assistsCore;
        @SerializedName("games_played")
        private int gamesPlayed;
        @SerializedName("match_tip_score_board")
        private int matchTipScoreBoard;
        @SerializedName("surrender_votes_participated")
        private int surrenderVotesParticipated;
        @SerializedName("match_tip_tower_call_for_help")
        private int matchTipTowerCallForHelp;
        @SerializedName("surrender_voted_no")
        private int surrenderVotedNo;
        @SerializedName("match_tip_spend_cp")
        private int matchTipSpendCp;
        @SerializedName("match_tip_key_no_charges")
        private int matchTipKeyNoCharges;
        @SerializedName("match_tip_ally_well")
        private int matchTipAllyWell;
        @SerializedName("kills_core")
        private int killsCore;
        @SerializedName("damage_done_structures")
        private int damageDoneStructures;
        @SerializedName("match_tip_shadow_plane")
        private int matchTipShadowPlane;
        @SerializedName("deaths_hero")
        private int deathsHero;
        @SerializedName("account_level_up")
        private int accountLevelUp;
        @SerializedName("assists_hero")
        private int assistsHero;
        @SerializedName("placed_rigs")
        private int placedRigs;
        @SerializedName("surrender_votes_started")
        private int surrenderVotesStarted;
        @SerializedName("deaths_misc")
        private int deathsMisc;
        @SerializedName("assists_inhibitor")
        private int assistsInhibitor;
        @SerializedName("match_tip_use_health_potion")
        private int matchTipUseHealthPotion;
        @SerializedName("kills_wards")
        private int killsWards;
        @SerializedName("surrender_voted_yes")
        private int surrenderVotedYes;
        @SerializedName("match_tip_picked_up_op")
        private int matchTipPickedUpOp;
        @SerializedName("match_tip_recharge_health_potion")
        private int matchTipRechargeHealthPotion;
        @SerializedName("match_tip_near_black_camp")
        private int matchTipNearBlackCamp;
        @SerializedName("assists_towers")
        private int assistsTowers;
        @SerializedName("match_tip_near_prime_guardian")
        private int matchTipNearPrimeGuardian;
        @SerializedName("used_custom_deck")
        private int usedCustomDeck;
        @SerializedName("assists_minions")
        private int assistsMinions;
        @SerializedName("time_played")
        private int timePlayed;
        @SerializedName("damage_done_hero")
        private int damageDoneHero;
        @SerializedName("deaths_inhibitor")
        private int deathsInhibitor;
        @SerializedName("kills_towers")
        private int killsTowers;
        @SerializedName("kills_inhibitors")
        private int killsInhibitors;
        @SerializedName("match_tip_enemy_well")
        private int matchTipEnemyWell;
        @SerializedName("match_tip_open_shop")
        private int matchTipOpenShop;
        @SerializedName("xp")
        private int xp;
        @SerializedName("match_tip_near_red_camp")
        private int matchTipNearRedCamp;
        @SerializedName("match_tip_empty_well")
        private int matchTipEmptyWell;

        public int getMatchTipPickedUpAmber() {
            return matchTipPickedUpAmber;
        }

        public int getMatchTipNoKey() {
            return matchTipNoKey;
        }

        public int getMatchTipNearBlueCamp() {
            return matchTipNearBlueCamp;
        }

        public int getKillsMinions() {
            return killsMinions;
        }

        public int getSurrenderVotesAbstained() {
            return surrenderVotesAbstained;
        }

        public int getGamesNotParticipating() {
            return gamesNotParticipating;
        }

        public int getMatchTip3cp() {
            return matchTip3cp;
        }

        public int getMatchTipLevelAbility() {
            return matchTipLevelAbility;
        }

        public int getMatchTipAllyHasOp() {
            return matchTipAllyHasOp;
        }

        public int getDeathsTowers() {
            return deathsTowers;
        }

        public int getMatchTipLevelUlt() {
            return matchTipLevelUlt;
        }

        public int getMatchTipLastHittingTip() {
            return matchTipLastHittingTip;
        }

        public int getAssistsRigs() {
            return assistsRigs;
        }

        public int getRep() {
            return rep;
        }

        public int getKillsRigs() {
            return killsRigs;
        }

        public int getMatchTipEnemyHasOp() {
            return matchTipEnemyHasOp;
        }

        public int getGamesLeft() {
            return gamesLeft;
        }

        public int getDeathsMinions() {
            return deathsMinions;
        }

        public int getGamesWon() {
            return gamesWon;
        }

        public int getMatchTipOnDeath() {
            return matchTipOnDeath;
        }

        public int getDamageDoneMinons() {
            return damageDoneMinons;
        }

        public int getMatchTipNearXpCamp() {
            return matchTipNearXpCamp;
        }

        public int getGamesReconnected() {
            return gamesReconnected;
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

        public int getMatchTipScoreBoard() {
            return matchTipScoreBoard;
        }

        public int getSurrenderVotesParticipated() {
            return surrenderVotesParticipated;
        }

        public int getMatchTipTowerCallForHelp() {
            return matchTipTowerCallForHelp;
        }

        public int getSurrenderVotedNo() {
            return surrenderVotedNo;
        }

        public int getMatchTipSpendCp() {
            return matchTipSpendCp;
        }

        public int getMatchTipKeyNoCharges() {
            return matchTipKeyNoCharges;
        }

        public int getMatchTipAllyWell() {
            return matchTipAllyWell;
        }

        public int getKillsCore() {
            return killsCore;
        }

        public int getDamageDoneStructures() {
            return damageDoneStructures;
        }

        public int getMatchTipShadowPlane() {
            return matchTipShadowPlane;
        }

        public int getDeathsHero() {
            return deathsHero;
        }

        public int getAccountLevelUp() {
            return accountLevelUp;
        }

        public int getAssistsHero() {
            return assistsHero;
        }

        public int getPlacedRigs() {
            return placedRigs;
        }

        public int getSurrenderVotesStarted() {
            return surrenderVotesStarted;
        }

        public int getDeathsMisc() {
            return deathsMisc;
        }

        public int getAssistsInhibitor() {
            return assistsInhibitor;
        }

        public int getMatchTipUseHealthPotion() {
            return matchTipUseHealthPotion;
        }

        public int getKillsWards() {
            return killsWards;
        }

        public int getSurrenderVotedYes() {
            return surrenderVotedYes;
        }

        public int getMatchTipPickedUpOp() {
            return matchTipPickedUpOp;
        }

        public int getMatchTipRechargeHealthPotion() {
            return matchTipRechargeHealthPotion;
        }

        public int getMatchTipNearBlackCamp() {
            return matchTipNearBlackCamp;
        }

        public int getAssistsTowers() {
            return assistsTowers;
        }

        public int getMatchTipNearPrimeGuardian() {
            return matchTipNearPrimeGuardian;
        }

        public int getUsedCustomDeck() {
            return usedCustomDeck;
        }

        public int getAssistsMinions() {
            return assistsMinions;
        }

        public int getTimePlayed() {
            return timePlayed;
        }

        public int getDamageDoneHero() {
            return damageDoneHero;
        }

        public int getDeathsInhibitor() {
            return deathsInhibitor;
        }

        public int getKillsTowers() {
            return killsTowers;
        }

        public int getKillsInhibitors() {
            return killsInhibitors;
        }

        public int getMatchTipEnemyWell() {
            return matchTipEnemyWell;
        }

        public int getMatchTipOpenShop() {
            return matchTipOpenShop;
        }

        public int getXp() {
            return xp;
        }

        public int getMatchTipNearRedCamp() {
            return matchTipNearRedCamp;
        }

        public int getMatchTipEmptyWell() {
            return matchTipEmptyWell;
        }

        @Override
        public String toString() {
            return "Total{" +
                    "matchTipPickedUpAmber=" + matchTipPickedUpAmber +
                    ", matchTipNoKey=" + matchTipNoKey +
                    ", matchTipNearBlueCamp=" + matchTipNearBlueCamp +
                    ", killsMinions=" + killsMinions +
                    ", surrenderVotesAbstained=" + surrenderVotesAbstained +
                    ", gamesNotParticipating=" + gamesNotParticipating +
                    ", matchTip3cp=" + matchTip3cp +
                    ", matchTipLevelAbility=" + matchTipLevelAbility +
                    ", matchTipAllyHasOp=" + matchTipAllyHasOp +
                    ", deathsTowers=" + deathsTowers +
                    ", matchTipLevelUlt=" + matchTipLevelUlt +
                    ", matchTipLastHittingTip=" + matchTipLastHittingTip +
                    ", assistsRigs=" + assistsRigs +
                    ", rep=" + rep +
                    ", killsRigs=" + killsRigs +
                    ", matchTipEnemyHasOp=" + matchTipEnemyHasOp +
                    ", gamesLeft=" + gamesLeft +
                    ", deathsMinions=" + deathsMinions +
                    ", gamesWon=" + gamesWon +
                    ", matchTipOnDeath=" + matchTipOnDeath +
                    ", damageDoneMinons=" + damageDoneMinons +
                    ", matchTipNearXpCamp=" + matchTipNearXpCamp +
                    ", gamesReconnected=" + gamesReconnected +
                    ", killsHero=" + killsHero +
                    ", assistsCore=" + assistsCore +
                    ", gamesPlayed=" + gamesPlayed +
                    ", matchTipScoreBoard=" + matchTipScoreBoard +
                    ", surrenderVotesParticipated=" + surrenderVotesParticipated +
                    ", matchTipTowerCallForHelp=" + matchTipTowerCallForHelp +
                    ", surrenderVotedNo=" + surrenderVotedNo +
                    ", matchTipSpendCp=" + matchTipSpendCp +
                    ", matchTipKeyNoCharges=" + matchTipKeyNoCharges +
                    ", matchTipAllyWell=" + matchTipAllyWell +
                    ", killsCore=" + killsCore +
                    ", damageDoneStructures=" + damageDoneStructures +
                    ", matchTipShadowPlane=" + matchTipShadowPlane +
                    ", deathsHero=" + deathsHero +
                    ", accountLevelUp=" + accountLevelUp +
                    ", assistsHero=" + assistsHero +
                    ", placedRigs=" + placedRigs +
                    ", surrenderVotesStarted=" + surrenderVotesStarted +
                    ", deathsMisc=" + deathsMisc +
                    ", assistsInhibitor=" + assistsInhibitor +
                    ", matchTipUseHealthPotion=" + matchTipUseHealthPotion +
                    ", killsWards=" + killsWards +
                    ", surrenderVotedYes=" + surrenderVotedYes +
                    ", matchTipPickedUpOp=" + matchTipPickedUpOp +
                    ", matchTipRechargeHealthPotion=" + matchTipRechargeHealthPotion +
                    ", matchTipNearBlackCamp=" + matchTipNearBlackCamp +
                    ", assistsTowers=" + assistsTowers +
                    ", matchTipNearPrimeGuardian=" + matchTipNearPrimeGuardian +
                    ", usedCustomDeck=" + usedCustomDeck +
                    ", assistsMinions=" + assistsMinions +
                    ", timePlayed=" + timePlayed +
                    ", damageDoneHero=" + damageDoneHero +
                    ", deathsInhibitor=" + deathsInhibitor +
                    ", killsTowers=" + killsTowers +
                    ", killsInhibitors=" + killsInhibitors +
                    ", matchTipEnemyWell=" + matchTipEnemyWell +
                    ", matchTipOpenShop=" + matchTipOpenShop +
                    ", xp=" + xp +
                    ", matchTipNearRedCamp=" + matchTipNearRedCamp +
                    ", matchTipEmptyWell=" + matchTipEmptyWell +
                    '}';
        }
    }

    public class Pvp {

        @SerializedName("kills_core")
        private int killsCore;
        @SerializedName("damage_done_structures")
        private int damageDoneStructures;
        @SerializedName("kills_minions")
        private int killsMinions;
        @SerializedName("deaths_hero")
        private int deathsHero;
        @SerializedName("surrender_votes_abstained")
        private int surrenderVotesAbstained;
        @SerializedName("assists_hero")
        private int assistsHero;
        @SerializedName("placed_rigs")
        private int placedRigs;
        @SerializedName("surrender_votes_started")
        private int surrenderVotesStarted;
        @SerializedName("assists_inhibitor")
        private int assistsInhibitor;
        @SerializedName("deaths_towers")
        private int deathsTowers;
        @SerializedName("kills_wards")
        private int killsWards;
        @SerializedName("assists_rigs")
        private int assistsRigs;
        @SerializedName("surrender_voted_yes")
        private int surrenderVotedYes;
        @SerializedName("kills_rigs")
        private int killsRigs;
        @SerializedName("games_left")
        private int gamesLeft;
        @SerializedName("deaths_minions")
        private int deathsMinions;
        @SerializedName("assists_towers")
        private int assistsTowers;
        @SerializedName("games_won")
        private int gamesWon;
        @SerializedName("damage_done_minons")
        private int damageDoneMinons;
        @SerializedName("games_reconnected")
        private int gamesReconnected;
        @SerializedName("kills_hero")
        private int killsHero;
        @SerializedName("assists_core")
        private int assistsCore;
        @SerializedName("games_played")
        private int gamesPlayed;
        @SerializedName("assists_minions")
        private int assistsMinions;
        @SerializedName("time_played")
        private int timePlayed;
        @SerializedName("surrender_votes_participated")
        private int surrenderVotesParticipated;
        @SerializedName("damage_done_hero")
        private int damageDoneHero;
        @SerializedName("deaths_inhibitor")
        private int deathsInhibitor;
        @SerializedName("kills_towers")
        private int killsTowers;
        @SerializedName("kills_inhibitors")
        private int killsInhibitors;
        @SerializedName("surrender_voted_no")
        private int surrenderVotedNo;

        public int getKillsCore() {
            return killsCore;
        }

        public int getDamageDoneStructures() {
            return damageDoneStructures;
        }

        public int getKillsMinions() {
            return killsMinions;
        }

        public int getDeathsHero() {
            return deathsHero;
        }

        public int getSurrenderVotesAbstained() {
            return surrenderVotesAbstained;
        }

        public int getAssistsHero() {
            return assistsHero;
        }

        public int getPlacedRigs() {
            return placedRigs;
        }

        public int getSurrenderVotesStarted() {
            return surrenderVotesStarted;
        }

        public int getAssistsInhibitor() {
            return assistsInhibitor;
        }

        public int getDeathsTowers() {
            return deathsTowers;
        }

        public int getKillsWards() {
            return killsWards;
        }

        public int getAssistsRigs() {
            return assistsRigs;
        }

        public int getSurrenderVotedYes() {
            return surrenderVotedYes;
        }

        public int getKillsRigs() {
            return killsRigs;
        }

        public int getGamesLeft() {
            return gamesLeft;
        }

        public int getDeathsMinions() {
            return deathsMinions;
        }

        public int getAssistsTowers() {
            return assistsTowers;
        }

        public int getGamesWon() {
            return gamesWon;
        }

        public int getDamageDoneMinons() {
            return damageDoneMinons;
        }

        public int getGamesReconnected() {
            return gamesReconnected;
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

        public int getTimePlayed() {
            return timePlayed;
        }

        public int getSurrenderVotesParticipated() {
            return surrenderVotesParticipated;
        }

        public int getDamageDoneHero() {
            return damageDoneHero;
        }

        public int getDeathsInhibitor() {
            return deathsInhibitor;
        }

        public int getKillsTowers() {
            return killsTowers;
        }

        public int getKillsInhibitors() {
            return killsInhibitors;
        }

        public int getSurrenderVotedNo() {
            return surrenderVotedNo;
        }

        @Override
        public String toString() {
            return "Pvp{" +
                    "killsCore=" + killsCore +
                    ", damageDoneStructures=" + damageDoneStructures +
                    ", killsMinions=" + killsMinions +
                    ", deathsHero=" + deathsHero +
                    ", surrenderVotesAbstained=" + surrenderVotesAbstained +
                    ", assistsHero=" + assistsHero +
                    ", placedRigs=" + placedRigs +
                    ", surrenderVotesStarted=" + surrenderVotesStarted +
                    ", assistsInhibitor=" + assistsInhibitor +
                    ", deathsTowers=" + deathsTowers +
                    ", killsWards=" + killsWards +
                    ", assistsRigs=" + assistsRigs +
                    ", surrenderVotedYes=" + surrenderVotedYes +
                    ", killsRigs=" + killsRigs +
                    ", gamesLeft=" + gamesLeft +
                    ", deathsMinions=" + deathsMinions +
                    ", assistsTowers=" + assistsTowers +
                    ", gamesWon=" + gamesWon +
                    ", damageDoneMinons=" + damageDoneMinons +
                    ", gamesReconnected=" + gamesReconnected +
                    ", killsHero=" + killsHero +
                    ", assistsCore=" + assistsCore +
                    ", gamesPlayed=" + gamesPlayed +
                    ", assistsMinions=" + assistsMinions +
                    ", timePlayed=" + timePlayed +
                    ", surrenderVotesParticipated=" + surrenderVotesParticipated +
                    ", damageDoneHero=" + damageDoneHero +
                    ", deathsInhibitor=" + deathsInhibitor +
                    ", killsTowers=" + killsTowers +
                    ", killsInhibitors=" + killsInhibitors +
                    ", surrenderVotedNo=" + surrenderVotedNo +
                    '}';
        }
    }
}
