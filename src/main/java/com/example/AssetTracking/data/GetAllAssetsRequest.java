package com.example.AssetTracking.data;

import common.PaginatedRequest;

import java.math.BigDecimal;
import java.util.Date;

public class GetAllAssetsRequest extends PaginatedRequest {
    private static final long serialVersionUID = 1L;

    private String title;
    private BigDecimal cost;
    private BigDecimal depreciatedValue;
    private Date purchaseDate;
}
