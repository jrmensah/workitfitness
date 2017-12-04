package me.jrmensah.workit.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String appointNum;
    @NotNull
    @Size(min = 3)
    private String preferDate;
    @NotNull
    @Size(min = 3)
    private String preferTime;
    @NotNull
    @Size(min = 3)
    private String preferLocation;
    @NotNull
    @Size(min = 3)
    private String preferTrainer;
    @NotNull
    @Size(min = 3)
    private String appointStatus;

    public Appointment() {
    }

    public Appointment(String appointNum, String preferDate, String preferTime, String preferLocation, String preferTrainer, String appointStatus) {
        this.appointNum = appointNum;
        this.preferDate = preferDate;
        this.preferDate = preferTime;
        this.preferLocation = preferLocation;
        this.preferTrainer = preferTrainer;
        this.appointStatus = appointStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAppointNum() {
        return appointNum;
    }

    public void setAppointNum(String appointNum) {
        this.appointNum = appointNum;
    }

    public String getPreferDate() {
        return preferDate;
    }

    public void setPreferDate(String preferDate) {
        this.preferDate = preferDate;
    }

    public String getPreferTime() {
        return preferTime;
    }

    public void setPreferTime(String preferTime) {
        this.preferTime = preferTime;
    }

    public String getPreferLocation() {
        return preferLocation;
    }

    public void setPreferLocation(String preferLocation) {
        this.preferLocation = preferLocation;
    }

    public String getPreferTrainer() {
        return preferTrainer;
    }

    public void setPreferTrainer(String preferTrainer) {
        this.preferTrainer = preferTrainer;
    }

    public String getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus(String appointStatus) {
        this.appointStatus = appointStatus;
    }
}