package past13.services;

import java.security.InvalidParameterException;

public interface InterestService {
    public double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be higher than 0");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months);
    }
}
