package cn.edu.guet;

/**
 * @Author liwei
 * @Date 2023/5/8 21:24
 * @Version 1.0
 */
public class Ticket {

    private String trainNumber;
    private String fromStation;
    private String toStation;
    private String departureTime;
    private String arrvialTime;
    private String duration;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrvialTime() {
        return arrvialTime;
    }

    public void setArrvialTime(String arrvialTime) {
        this.arrvialTime = arrvialTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "trainNumber='" + trainNumber + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrvialTime='" + arrvialTime + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
