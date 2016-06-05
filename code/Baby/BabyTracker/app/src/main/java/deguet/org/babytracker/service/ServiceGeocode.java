package deguet.org.babytracker.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by joris on 16-05-03.
 */
public interface ServiceGeocode {

    String endPoint = "http://www.college-em.info/";

    @GET("/")
    Call<String> geocode();

    @GET("/sp/")
    Observable<String> test(@Query("s") String s);
}