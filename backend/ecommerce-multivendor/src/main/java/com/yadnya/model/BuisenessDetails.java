package com.yadnya.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuisenessDetails {
    private String businessName;
    private String businessEmail; // Business Email Address
    private String businessMobile; // Business Phone Number
    private String businessAddress; // Business Address
    private String logo; // Business Logo (URL or Base64 encoded string)
    private String banner;
    // private String businessType; // e.g., Sole Proprietorship, Partnership, Corporation, etc.
    // private String gstNumber; // GSTIN
    // private String panNumber; // PAN
    // private String tanNumber; // TAN
    
    
    
    // private String websiteUrl; // Website URL (if any)
    // private String businessDescription; // Business Description

}
