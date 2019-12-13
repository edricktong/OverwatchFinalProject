package com.example.superherolistview;

import android.os.Parcel;
import android.os.Parcelable;

public class Hero implements Parcelable {
    private String image;
    private String category;
    private String description;
    private String name;
    private String ultimate;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRanking() {
        return category;
    }

    public void setRanking(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() { return ultimate; }
    public void setSuperPower(String ultimate) {
        this.ultimate = ultimate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.image);
        dest.writeString(this.category);
        dest.writeString(this.description);
        dest.writeString(this.name);
        dest.writeString(this.ultimate);
    }

    public Hero() {
    }

    protected Hero(Parcel in) {
        this.image = in.readString();
        this.category = in.readString();
        this.description = in.readString();
        this.name = in.readString();
        this.ultimate = in.readString();
    }

    public static final Creator<Hero> CREATOR = new Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel source) {
            return new Hero(source);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };
}
