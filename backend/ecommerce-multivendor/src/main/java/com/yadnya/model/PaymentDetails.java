package com.yadnya.model;

import com.yadnya.domain.PaymentStatus;

import lombok.Data;

@Data
public class PaymentDetails {

    
    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentId;
    private PaymentStatus Status;
}
