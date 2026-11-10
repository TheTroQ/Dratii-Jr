package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class TrackInfo {

    @SerializedName("WaybillNumber")
    @Expose
    private String waybillNumber;
    @SerializedName("TrackingNumber")
    @Expose
    private String trackingNumber;
    @SerializedName("CustomerOrderNumber")
    @Expose
    private String customerOrderNumber;
    @SerializedName("ChannelCodeIn")
    @Expose
    private String channelCodeIn;
    @SerializedName("ChannelEnNameIn")
    @Expose
    private String channelEnNameIn;
    @SerializedName("AdditionalNotes")
    @Expose
    private String additionalNotes;
    @SerializedName("DestinationCountryCode")
    @Expose
    private String destinationCountryCode;
    @SerializedName("OriginCountryCode")
    @Expose
    private String originCountryCode;
    @SerializedName("Weight")
    @Expose
    private Double weight;
    @SerializedName("TrackingStatus")
    @Expose
    private Integer trackingStatus;
    @SerializedName("IntervalDays")
    @Expose
    private Double intervalDays;
    @SerializedName("IntervalWorkdays")
    @Expose
    private Double intervalWorkdays;
    @SerializedName("LastTrackEvent")
    @Expose
    private LastTrackEvent lastTrackEvent;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("TrackEventDetails")
    @Expose
    private List<TrackEventDetail> trackEventDetails;
    @SerializedName("IsServerPickup")
    @Expose
    private Boolean isServerPickup;
    @SerializedName("B2bType")
    @Expose
    private Integer b2bType;
    @SerializedName("B2bTypeDesc")
    @Expose
    private String b2bTypeDesc;
    @SerializedName("BusinessModelType")
    @Expose
    private Integer businessModelType;
    @SerializedName("Cbm")
    @Expose
    private String cbm;
    @SerializedName("ChileOrderNumbers")
    @Expose
    private Object chileOrderNumbers;
    @SerializedName("ContainerNo")
    @Expose
    private String containerNo;
    @SerializedName("CreatedOnTimezone")
    @Expose
    private String createdOnTimezone;
    @SerializedName("DepAirport")
    @Expose
    private String depAirport;
    @SerializedName("DepAirportName")
    @Expose
    private String depAirportName;
    @SerializedName("DestAirport")
    @Expose
    private String destAirport;
    @SerializedName("DestAirportName")
    @Expose
    private String destAirportName;
    @SerializedName("DestinationCountryName")
    @Expose
    private String destinationCountryName;
    @SerializedName("DestinationPort")
    @Expose
    private String destinationPort;
    @SerializedName("DistinctZone")
    @Expose
    private Object distinctZone;
    @SerializedName("EarliestEndTime")
    @Expose
    private Object earliestEndTime;
    @SerializedName("EarliestEndTimeZone")
    @Expose
    private String earliestEndTimeZone;
    @SerializedName("EndServiceCode")
    @Expose
    private String endServiceCode;
    @SerializedName("EstimatedArrivalDate")
    @Expose
    private Object estimatedArrivalDate;
    @SerializedName("EstimatedArrivalDateZone")
    @Expose
    private String estimatedArrivalDateZone;
    @SerializedName("EstimatedCabinetTime")
    @Expose
    private Object estimatedCabinetTime;
    @SerializedName("EstimatedCabinetTimeZone")
    @Expose
    private String estimatedCabinetTimeZone;
    @SerializedName("EstimatedDeliveryFromDate")
    @Expose
    private Object estimatedDeliveryFromDate;
    @SerializedName("EstimatedDeliveryFromDateZone")
    @Expose
    private String estimatedDeliveryFromDateZone;
    @SerializedName("EstimatedDeliveryToDate")
    @Expose
    private Object estimatedDeliveryToDate;
    @SerializedName("EstimatedDeliveryToDateZone")
    @Expose
    private String estimatedDeliveryToDateZone;
    @SerializedName("EstimatedPickupTime")
    @Expose
    private Object estimatedPickupTime;
    @SerializedName("EstimatedPickupTimeZone")
    @Expose
    private String estimatedPickupTimeZone;
    @SerializedName("EstimatedShipmentTime")
    @Expose
    private Object estimatedShipmentTime;
    @SerializedName("EstimatedShipmentTimeZone")
    @Expose
    private String estimatedShipmentTimeZone;
    @SerializedName("etdFormDate")
    @Expose
    private Object etdFormDate;
    @SerializedName("etdToDate")
    @Expose
    private Object etdToDate;
    @SerializedName("IsPod")
    @Expose
    private Boolean isPod;
    @SerializedName("IsSignature")
    @Expose
    private Boolean isSignature;
    @SerializedName("ltsDigest")
    @Expose
    private String ltsDigest;
    @SerializedName("LtsPickUpTimeZone")
    @Expose
    private String ltsPickUpTimeZone;
    @SerializedName("OriginCountryName")
    @Expose
    private String originCountryName;
    @SerializedName("OriginPort")
    @Expose
    private String originPort;
    @SerializedName("originTrackDataDTO")
    @Expose
    private Object originTrackDataDTO;
    @SerializedName("ParentWaybillNumber")
    @Expose
    private String parentWaybillNumber;
    @SerializedName("PickUpPoint")
    @Expose
    private Object pickUpPoint;
    @SerializedName("RstimatedDepartureDate")
    @Expose
    private Object rstimatedDepartureDate;
    @SerializedName("RstimatedDepartureDateZone")
    @Expose
    private String rstimatedDepartureDateZone;
    @SerializedName("ShipName")
    @Expose
    private String shipName;
    @SerializedName("ShowNodeInfos")
    @Expose
    private Object showNodeInfos;
    @SerializedName("TrackingType")
    @Expose
    private String trackingType;
    @SerializedName("TransitTime")
    @Expose
    private Integer transitTime;
    @SerializedName("TransportStage")
    @Expose
    private String transportStage;
    @SerializedName("VoyageNumber")
    @Expose
    private String voyageNumber;

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCustomerOrderNumber() {
        return customerOrderNumber;
    }

    public void setCustomerOrderNumber(String customerOrderNumber) {
        this.customerOrderNumber = customerOrderNumber;
    }

    public String getChannelCodeIn() {
        return channelCodeIn;
    }

    public void setChannelCodeIn(String channelCodeIn) {
        this.channelCodeIn = channelCodeIn;
    }

    public String getChannelEnNameIn() {
        return channelEnNameIn;
    }

    public void setChannelEnNameIn(String channelEnNameIn) {
        this.channelEnNameIn = channelEnNameIn;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public String getOriginCountryCode() {
        return originCountryCode;
    }

    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getTrackingStatus() {
        return trackingStatus;
    }

    public void setTrackingStatus(Integer trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    public Double getIntervalDays() {
        return intervalDays;
    }

    public void setIntervalDays(Double intervalDays) {
        this.intervalDays = intervalDays;
    }

    public Double getIntervalWorkdays() {
        return intervalWorkdays;
    }

    public void setIntervalWorkdays(Double intervalWorkdays) {
        this.intervalWorkdays = intervalWorkdays;
    }

    public LastTrackEvent getLastTrackEvent() {
        return lastTrackEvent;
    }

    public void setLastTrackEvent(LastTrackEvent lastTrackEvent) {
        this.lastTrackEvent = lastTrackEvent;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public List<TrackEventDetail> getTrackEventDetails() {
        return trackEventDetails;
    }

    public void setTrackEventDetails(List<TrackEventDetail> trackEventDetails) {
        this.trackEventDetails = trackEventDetails;
    }

    public Boolean getIsServerPickup() {
        return isServerPickup;
    }

    public void setIsServerPickup(Boolean isServerPickup) {
        this.isServerPickup = isServerPickup;
    }

    public Integer getB2bType() {
        return b2bType;
    }

    public void setB2bType(Integer b2bType) {
        this.b2bType = b2bType;
    }

    public String getB2bTypeDesc() {
        return b2bTypeDesc;
    }

    public void setB2bTypeDesc(String b2bTypeDesc) {
        this.b2bTypeDesc = b2bTypeDesc;
    }

    public Integer getBusinessModelType() {
        return businessModelType;
    }

    public void setBusinessModelType(Integer businessModelType) {
        this.businessModelType = businessModelType;
    }

    public String getCbm() {
        return cbm;
    }

    public void setCbm(String cbm) {
        this.cbm = cbm;
    }

    public Object getChileOrderNumbers() {
        return chileOrderNumbers;
    }

    public void setChileOrderNumbers(Object chileOrderNumbers) {
        this.chileOrderNumbers = chileOrderNumbers;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getCreatedOnTimezone() {
        return createdOnTimezone;
    }

    public void setCreatedOnTimezone(String createdOnTimezone) {
        this.createdOnTimezone = createdOnTimezone;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepAirportName() {
        return depAirportName;
    }

    public void setDepAirportName(String depAirportName) {
        this.depAirportName = depAirportName;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }

    public String getDestAirportName() {
        return destAirportName;
    }

    public void setDestAirportName(String destAirportName) {
        this.destAirportName = destAirportName;
    }

    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public Object getDistinctZone() {
        return distinctZone;
    }

    public void setDistinctZone(Object distinctZone) {
        this.distinctZone = distinctZone;
    }

    public Object getEarliestEndTime() {
        return earliestEndTime;
    }

    public void setEarliestEndTime(Object earliestEndTime) {
        this.earliestEndTime = earliestEndTime;
    }

    public String getEarliestEndTimeZone() {
        return earliestEndTimeZone;
    }

    public void setEarliestEndTimeZone(String earliestEndTimeZone) {
        this.earliestEndTimeZone = earliestEndTimeZone;
    }

    public String getEndServiceCode() {
        return endServiceCode;
    }

    public void setEndServiceCode(String endServiceCode) {
        this.endServiceCode = endServiceCode;
    }

    public Object getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(Object estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getEstimatedArrivalDateZone() {
        return estimatedArrivalDateZone;
    }

    public void setEstimatedArrivalDateZone(String estimatedArrivalDateZone) {
        this.estimatedArrivalDateZone = estimatedArrivalDateZone;
    }

    public Object getEstimatedCabinetTime() {
        return estimatedCabinetTime;
    }

    public void setEstimatedCabinetTime(Object estimatedCabinetTime) {
        this.estimatedCabinetTime = estimatedCabinetTime;
    }

    public String getEstimatedCabinetTimeZone() {
        return estimatedCabinetTimeZone;
    }

    public void setEstimatedCabinetTimeZone(String estimatedCabinetTimeZone) {
        this.estimatedCabinetTimeZone = estimatedCabinetTimeZone;
    }

    public Object getEstimatedDeliveryFromDate() {
        return estimatedDeliveryFromDate;
    }

    public void setEstimatedDeliveryFromDate(Object estimatedDeliveryFromDate) {
        this.estimatedDeliveryFromDate = estimatedDeliveryFromDate;
    }

    public String getEstimatedDeliveryFromDateZone() {
        return estimatedDeliveryFromDateZone;
    }

    public void setEstimatedDeliveryFromDateZone(String estimatedDeliveryFromDateZone) {
        this.estimatedDeliveryFromDateZone = estimatedDeliveryFromDateZone;
    }

    public Object getEstimatedDeliveryToDate() {
        return estimatedDeliveryToDate;
    }

    public void setEstimatedDeliveryToDate(Object estimatedDeliveryToDate) {
        this.estimatedDeliveryToDate = estimatedDeliveryToDate;
    }

    public String getEstimatedDeliveryToDateZone() {
        return estimatedDeliveryToDateZone;
    }

    public void setEstimatedDeliveryToDateZone(String estimatedDeliveryToDateZone) {
        this.estimatedDeliveryToDateZone = estimatedDeliveryToDateZone;
    }

    public Object getEstimatedPickupTime() {
        return estimatedPickupTime;
    }

    public void setEstimatedPickupTime(Object estimatedPickupTime) {
        this.estimatedPickupTime = estimatedPickupTime;
    }

    public String getEstimatedPickupTimeZone() {
        return estimatedPickupTimeZone;
    }

    public void setEstimatedPickupTimeZone(String estimatedPickupTimeZone) {
        this.estimatedPickupTimeZone = estimatedPickupTimeZone;
    }

    public Object getEstimatedShipmentTime() {
        return estimatedShipmentTime;
    }

    public void setEstimatedShipmentTime(Object estimatedShipmentTime) {
        this.estimatedShipmentTime = estimatedShipmentTime;
    }

    public String getEstimatedShipmentTimeZone() {
        return estimatedShipmentTimeZone;
    }

    public void setEstimatedShipmentTimeZone(String estimatedShipmentTimeZone) {
        this.estimatedShipmentTimeZone = estimatedShipmentTimeZone;
    }

    public Object getEtdFormDate() {
        return etdFormDate;
    }

    public void setEtdFormDate(Object etdFormDate) {
        this.etdFormDate = etdFormDate;
    }

    public Object getEtdToDate() {
        return etdToDate;
    }

    public void setEtdToDate(Object etdToDate) {
        this.etdToDate = etdToDate;
    }

    public Boolean getIsPod() {
        return isPod;
    }

    public void setIsPod(Boolean isPod) {
        this.isPod = isPod;
    }

    public Boolean getIsSignature() {
        return isSignature;
    }

    public void setIsSignature(Boolean isSignature) {
        this.isSignature = isSignature;
    }

    public String getLtsDigest() {
        return ltsDigest;
    }

    public void setLtsDigest(String ltsDigest) {
        this.ltsDigest = ltsDigest;
    }

    public String getLtsPickUpTimeZone() {
        return ltsPickUpTimeZone;
    }

    public void setLtsPickUpTimeZone(String ltsPickUpTimeZone) {
        this.ltsPickUpTimeZone = ltsPickUpTimeZone;
    }

    public String getOriginCountryName() {
        return originCountryName;
    }

    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    public String getOriginPort() {
        return originPort;
    }

    public void setOriginPort(String originPort) {
        this.originPort = originPort;
    }

    public Object getOriginTrackDataDTO() {
        return originTrackDataDTO;
    }

    public void setOriginTrackDataDTO(Object originTrackDataDTO) {
        this.originTrackDataDTO = originTrackDataDTO;
    }

    public String getParentWaybillNumber() {
        return parentWaybillNumber;
    }

    public void setParentWaybillNumber(String parentWaybillNumber) {
        this.parentWaybillNumber = parentWaybillNumber;
    }

    public Object getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(Object pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public Object getRstimatedDepartureDate() {
        return rstimatedDepartureDate;
    }

    public void setRstimatedDepartureDate(Object rstimatedDepartureDate) {
        this.rstimatedDepartureDate = rstimatedDepartureDate;
    }

    public String getRstimatedDepartureDateZone() {
        return rstimatedDepartureDateZone;
    }

    public void setRstimatedDepartureDateZone(String rstimatedDepartureDateZone) {
        this.rstimatedDepartureDateZone = rstimatedDepartureDateZone;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public Object getShowNodeInfos() {
        return showNodeInfos;
    }

    public void setShowNodeInfos(Object showNodeInfos) {
        this.showNodeInfos = showNodeInfos;
    }

    public String getTrackingType() {
        return trackingType;
    }

    public void setTrackingType(String trackingType) {
        this.trackingType = trackingType;
    }

    public Integer getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(Integer transitTime) {
        this.transitTime = transitTime;
    }

    public String getTransportStage() {
        return transportStage;
    }

    public void setTransportStage(String transportStage) {
        this.transportStage = transportStage;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

}
