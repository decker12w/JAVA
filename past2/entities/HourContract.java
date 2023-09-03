package past2.entities;

import java.util.Date;

public class HourContract {
    private Date date = new Date();
    private Double valuePerHour;
    private Integer hours;

    public Double totalValue() {
        return this.valuePerHour * this.hours;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
