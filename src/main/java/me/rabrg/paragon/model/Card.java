package me.rabrg.paragon.model;

import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("slotType")
    private String slotType;
    @SerializedName("images")
    private Images images;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlotType() {
        return slotType;
    }

    public Images getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slotType='" + slotType + '\'' +
                ", images=" + images +
                '}';
    }

    public class Images {

        @SerializedName("medium_stats")
        private String mediumStats;
        @SerializedName("large")
        private String large;
        @SerializedName("large_stats")
        private String largeStats;
        @SerializedName("icon")
        private String icon;
        @SerializedName("medium")
        private String medium;

        public String getMediumStats() {
            return mediumStats;
        }

        public String getLarge() {
            return large;
        }

        public String getLargeStats() {
            return largeStats;
        }

        public String getIcon() {
            return icon;
        }

        public String getMedium() {
            return medium;
        }

        @Override
        public String toString() {
            return "Images{" +
                    "mediumStats='" + mediumStats + '\'' +
                    ", large='" + large + '\'' +
                    ", largeStats='" + largeStats + '\'' +
                    ", icon='" + icon + '\'' +
                    ", medium='" + medium + '\'' +
                    '}';
        }
    }

}
