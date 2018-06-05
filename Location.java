package com.example.android.tourguide;

public class Location {


        private int mPlaceName;

        private int mPlaceAddress;

        private int mImageResourceId;


        public Location(int PlaceName, int PlaceAddress) {
            mPlaceName = PlaceName;
            mPlaceAddress = PlaceAddress;
        }

        public Location(int ImageResourceId, int PlaceName, int PlaceAddress) {
            mImageResourceId = ImageResourceId;
            mPlaceName = PlaceName;
            mPlaceAddress = PlaceAddress;
        }

        public int getName() {
            return mPlaceName;
        }

        public int getAddress() {
            return mPlaceAddress;
        }

        public int getImage() {
            return mImageResourceId;
        }


    }


