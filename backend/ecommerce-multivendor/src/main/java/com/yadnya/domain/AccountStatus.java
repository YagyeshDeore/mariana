package com.yadnya.domain;

public enum AccountStatus {
    PENDING_VERIFICATTION,  // Account is pending verification (e.g., email verification, KYC, etc.)
    ACTIVE, // Account is active and in good standing
    SUSPENDED,  // Account is suspended due to some issues (e.g., policy violations, etc.)
    DEACTIVATED, // Account is deactivated by the user or admin 
    BANNED, // Account is banned due to severe violations or illegal activities
    CLOSED // Account is closed by the user or admin
}