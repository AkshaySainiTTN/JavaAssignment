
public class BankingSystem {

    // Base class: Bank
    static class Bank {
        private String name;
        private String headOfficeAddress;
        private String chairmanName;
        private int branchCount;
        private double fdInterestRate;
        private double personalLoanInterestRate;
        private double homeLoanInterestRate;

        // Getters
        public String getName() { return name; }
        public String getHeadOfficeAddress() { return headOfficeAddress; }
        public String getChairmanName() { return chairmanName; }
        public int getBranchCount() { return branchCount; }
        public double getFdInterestRate() { return fdInterestRate; }
        public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
        public double getHomeLoanInterestRate() { return homeLoanInterestRate; }

        // Setters
        public void setName(String name) { this.name = name; }
        public void setHeadOfficeAddress(String address) { this.headOfficeAddress = address; }
        public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }
        public void setBranchCount(int branchCount) { this.branchCount = branchCount; }
        public void setFdInterestRate(double rate) { this.fdInterestRate = rate; }
        public void setPersonalLoanInterestRate(double rate) { this.personalLoanInterestRate = rate; }
        public void setHomeLoanInterestRate(double rate) { this.homeLoanInterestRate = rate; }

        // Override toString
        @Override
        public String toString() {
            return "Bank Name: " + name + "\n" +
                    "Head Office: " + headOfficeAddress + "\n" +
                    "Chairman: " + chairmanName + "\n" +
                    "Branch Count: " + branchCount + "\n" +
                    "FD Interest Rate: " + fdInterestRate + "%\n" +
                    "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                    "Home Loan Interest Rate: " + homeLoanInterestRate + "%";
        }
    }

    // SBI subclass
    static class SBI extends Bank {
        public SBI() {
            setName("SBI");
            setHeadOfficeAddress("Mumbai, India");
            setChairmanName("Dinesh Kumar Khara");
            setBranchCount(22000);
            setFdInterestRate(6.5);
            setPersonalLoanInterestRate(10.5);
            setHomeLoanInterestRate(8.5);
        }
    }

    // BOI subclass
    static class BOI extends Bank {
        public BOI() {
            setName("BOI");
            setHeadOfficeAddress("Mumbai, India");
            setChairmanName("Rajneesh Karnatak");
            setBranchCount(5000);
            setFdInterestRate(6.75);
            setPersonalLoanInterestRate(11.0);
            setHomeLoanInterestRate(8.7);
        }
    }

    // ICICI subclass
    static class ICICI extends Bank {
        public ICICI() {
            setName("ICICI");
            setHeadOfficeAddress("Mumbai, India");
            setChairmanName("Sandeep Bakhshi");
            setBranchCount(5500);
            setFdInterestRate(7.0);
            setPersonalLoanInterestRate(11.5);
            setHomeLoanInterestRate(8.9);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        System.out.println("----- SBI Details -----");
        System.out.println(sbi);

        System.out.println("\n----- BOI Details -----");
        System.out.println(boi);

        System.out.println("\n----- ICICI Details -----");
        System.out.println(icici);
    }
}
