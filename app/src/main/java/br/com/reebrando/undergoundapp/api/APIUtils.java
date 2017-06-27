package br.com.reebrando.undergoundapp.api;

/**
 * Created by logonrm on 26/06/2017.
 */

public class APIUtils {

    public static final String BASE_URL = "http://10.3.1.1:3000";

    public static LinesAPI getLinesAPIVersion(){
        return RetrofitClient.getClient(BASE_URL).create(LinesAPI.class);
    }

}