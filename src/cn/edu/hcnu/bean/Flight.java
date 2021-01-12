package cn.edu.hcnu.bean;

//TODO 航班信息类
public class Flight {        //飞行详情类
    private String id;                   //主键UUID
    private String flightId;                   //主键UUID
    private String planeType;            // 飞机类型
    private int currentSeat;
    private String departureAirport;     // 出发机场
    private String destinationAirport;   // 目的机场
    private String departureTime;        // 起飞时间


    //TODO Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
