package me.dratii.data.tracking.inPost;



public record InPostInfo(String status, Tracking_Details[] tracking_details, String desc) {
    public record Tracking_Details(String datetime/*,String location,String status ,String agency,String origin_status*/) {

    }
}