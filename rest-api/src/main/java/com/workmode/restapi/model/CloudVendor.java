package com.workmode.restapi.model;

public class CloudVendor {
    
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhn;

    

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhn) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhn = vendorPhn;
    }
    public CloudVendor(){
    }

   

    public String getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return this.vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhn() {
        return this.vendorPhn;
    }

    public void setVendorPhn(String vendorPhn) {
        this.vendorPhn = vendorPhn;
    }


}
