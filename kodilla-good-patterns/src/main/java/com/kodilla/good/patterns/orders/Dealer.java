package com.kodilla.good.patterns.orders;

public class Dealer {
    private final String dealerName;
    private final long dealerId;
    private final String dealerContact;

    public Dealer(final String dealerName, final long dealerId, final String dealerContact) {
        this.dealerName = dealerName;
        this.dealerId = dealerId;
        this.dealerContact = dealerContact;
    }

    public String getDealerName() {
        return dealerName;
    }

    public long getDealerId() {
        return dealerId;
    }

    public String getDealerContact() {
        return dealerContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dealer dealer = (Dealer) o;

        if (dealerId != dealer.dealerId) return false;
        if (dealerName != null ? !dealerName.equals(dealer.dealerName) : dealer.dealerName != null) return false;
        return dealerContact != null ? dealerContact.equals(dealer.dealerContact) : dealer.dealerContact == null;
    }

    @Override
    public int hashCode() {
        int result = dealerName != null ? dealerName.hashCode() : 0;
        result = 31 * result + (int) (dealerId ^ (dealerId >>> 32));
        result = 31 * result + (dealerContact != null ? dealerContact.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerName='" + dealerName + '\'' +
                ", dealerId=" + dealerId +
                ", dealerContact='" + dealerContact + '\'' +
                '}';
    }
}
