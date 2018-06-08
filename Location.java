package com.example.android.tourguide;


public class Location {


    private String placeName;

    private String placeAddress;

    private int image;




    public Location(String placeName, String placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }
    public Location(String placeName, String placeAddress, int image) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.image = image;
    }


    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName){
        this.placeName = placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress (String placeAddress){
        this.placeAddress = placeAddress;
    }

    public int getImage (){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


