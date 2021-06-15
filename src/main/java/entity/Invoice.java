package entity;

public class Invoice {
    private Integer numberofrides;
    private Double totalfare;
    private Double averagefareperride;

    public Invoice(Integer numberofrides, Double totalfare, Double averagefareperride) {
        this.numberofrides = numberofrides;
        this.totalfare = totalfare;
        this.averagefareperride = averagefareperride;
    }

    public Integer getNumberofrides() {
        return numberofrides;
    }

    public void setNumberofrides(Integer numberofrides) {
        this.numberofrides = numberofrides;
    }

    public Double getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(Double totalfare) {
        this.totalfare = totalfare;
    }

    public Double getAveragefareperride() {
        return averagefareperride;
    }

    public void setAveragefareperride(Double averagefareperride) {
        this.averagefareperride = averagefareperride;
    }
}
