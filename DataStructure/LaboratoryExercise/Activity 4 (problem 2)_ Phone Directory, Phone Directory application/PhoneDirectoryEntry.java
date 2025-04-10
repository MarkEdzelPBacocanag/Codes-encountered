class PhoneDirectoryEntry {
    private String firstName;
    private String phoneNumber;

    public PhoneDirectoryEntry(String fname, String contact) {
        firstName = fname;
        phoneNumber = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + ": " + phoneNumber;
    }
}