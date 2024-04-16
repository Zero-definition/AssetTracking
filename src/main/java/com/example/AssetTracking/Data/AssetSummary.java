package com.example.AssetTracking.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Create a summary for asset management.
 */
public class AssetSummary {
    private final BigDecimal cost;

    private final BigDecimal depreciationRate;

    private final LocalDate purchaseDate;

    private final String title;

    /**
     * Constructs an AssetSummary object.
     *
     * @param cost The cost of the asset.
     * @param depreciationRate The depreciation rate of the asset.
     * @param purchaseDate The purchase date of the asset.
     * @param title The title of the asset.
     */
    public AssetSummary(BigDecimal cost
            , BigDecimal depreciationRate
            , LocalDate purchaseDate
            , String title) {
        this.cost = cost;
        this.depreciationRate = depreciationRate;
        this.purchaseDate = purchaseDate;
        this.title = title;
    }

    /**
     * Get the cost of the asset.
     *
     * @return The cost of the asset.
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Get the depreciation rate of the asset.
     *
     * @return The depreciation rate of the asset.
     */
    public BigDecimal getDepreciationRate() {
        return depreciationRate;
    }

    /**
     * Get the purchase date of the asset.
     *
     * @return The purchase date of the asset.
     */
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Get the title of the asset.
     *
     * @return The title of the asset.
     */
    public String getTitle() {
        return title;
    }
}
