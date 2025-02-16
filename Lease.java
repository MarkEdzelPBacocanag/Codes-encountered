class Lease {

    private String tenant;
    private int apartmentNumber;
    private double monthlyRent;
    private int term;

    public Lease() {

        tenant = "XXX";
        apartmentNumber = 0;
        monthlyRent = 1000;
        term = 12;

    }

    // Setter for the tenant, apartment number, monthly rent, and lease term
    public void setData(String tenantName, int ANumber, double MRent, int LeaseTerm) {

        tenant = tenantName;
        apartmentNumber = ANumber;
        monthlyRent = MRent;
        term = LeaseTerm;

    }

    public String getTenantN() {
        return tenant;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public int getTerm() {
        return term;
    }

    public void addPetFee() {
        monthlyRent += 10;
        explainPetPolicy();
    }

    public void explainPetPolicy() {
        System.out.println("");
    }
}
