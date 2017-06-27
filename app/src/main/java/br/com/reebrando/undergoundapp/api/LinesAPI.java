package br.com.reebrando.undergoundapp.api;

import java.util.List;

import br.com.reebrando.undergoundapp.model.Line;
import br.com.reebrando.undergoundapp.model.ResponseLine;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 26/06/2017.
 */

public interface LinesAPI {

    @GET("/linhas")
    Call<List<Line>> getVersions();
}
