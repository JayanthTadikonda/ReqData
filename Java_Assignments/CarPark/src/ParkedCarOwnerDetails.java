public class ParkedCarOwnerDetails {

    private String ownerName;
    private String carModel;
    private int carNo;
    private long mobileNo;
    private String ownerAddress;

    public ParkedCarOwnerDetails() {
    }

    public ParkedCarOwnerDetails(String ownerName, String carModel, int carNo, long mobileNo, String ownerAddress) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNo = mobileNo;
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    @Override
    public String toString() {
        return "ParkedCarOwnerDetails{" +
                "ownerName='" + ownerName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNo=" + carNo +
                ", mobileNo=" + mobileNo +
                ", ownerAddress='" + ownerAddress + '\'' +
                '}';
    }
}
