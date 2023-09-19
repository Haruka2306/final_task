package com.example.crudapi.entity;

import com.example.crudapi.dto.LocationSearchDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Location {

    private int id;
    private String corner;
    private String locationName;
    private String place;
    private String creator;

    public Location(String corner, String locationName, String place, String creator) {
        this.id = 0;
        this.corner = corner;
        this.locationName = locationName;
        this.place = place;
        this.creator = creator;
    }

    //entityからdtoへの変換
    public LocationSearchDto convertToLocationSearchDto() {
        LocationSearchDto locationSearchDto = new LocationSearchDto(corner, locationName, place);
        return locationSearchDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(corner, location.corner) && Objects.equals(locationName, location.locationName) && Objects.equals(place, location.place) && Objects.equals(creator, location.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corner, locationName, place, creator);
    }
}
