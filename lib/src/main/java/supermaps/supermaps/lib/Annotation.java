package supermaps.supermaps.lib;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by maximilianalexander on 5/7/16.
 */
public interface Annotation {

    void setLatLng(LatLng latLng);
    LatLng getLatLng();

}
