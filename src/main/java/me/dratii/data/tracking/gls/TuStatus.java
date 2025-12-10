package me.dratii.data.tracking.gls;

import java.util.ArrayList;

public class TuStatus{
    public String postalCode;
    public boolean emailNotificationCard;
    public ArrayList<Info> infos;
    public ArrayList<History> history;
    public ArrayList<Reference> references;
    public ProgressBar progressBar;
    public String tuNo;
    public String deliveryOwnerCode;
    public ArrayList<Owner> owners;
    public boolean changeDeliveryPossible;
    public ArrivalTime arrivalTime;
}
