
package me.dratii.data.tracking.postNL;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data__1 {

    @SerializedName("items")
    @Expose
    private List<Item> items;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data__1() {
    }

    public Data__1(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Data__1 withItems(List<Item> items) {
        this.items = items;
        return this;
    }

}
