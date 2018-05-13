package android.lifeistech.com.foode;


import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by kawamuradaisuke on 2018/05/11.
 */

public class Responce {

    private static final String TAG = Responce.class.getSimpleName();
    private final Responce self = this;

    @SerializedName("results")
    private List<Result> results;

    public Responce(List<Result> results){
        this.results = results;
    }

    public List<Result> getResults(){
        return results;
    }

    public void setResults(List<Result> results){
        this.results = results;
    }

}