package br.com.reebrando.undergoundapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


/**
 * Created by logonrm on 26/06/2017.
 */

public class ResponseLine {


    @SerializedName("line")
    private List<Line> lines;

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

}
