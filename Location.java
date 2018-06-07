package com.example.android.tourguide;


public class Location {


    private String mPlaceName;

    private String mPlaceAddress;




    public Location(String PlaceName, String PlaceAddress) {
        mPlaceName = PlaceName;
        mPlaceAddress = PlaceAddress;
    }

    public String getName() {
        return mPlaceName;
    }


    public String setName() {
        return mPlaceName;
    }

    public String getAddress() {
        return mPlaceAddress;
    }

    public String setAddress(){
        return mPlaceAddress;
    }


}


