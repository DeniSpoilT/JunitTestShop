package org.example.shop;

import java.time.LocalTime;

public class WorkingHours {
    LocalTime beginningOfWorkingDay;
    LocalTime endOfWorkingDay;
    LocalTime beginningOfLunchBreak;
    LocalTime endOfLunchBreak;


    public WorkingHours(LocalTime beginningOfWorkingDay, LocalTime endOfWorkingDay,
                        LocalTime beginningOfLunchBreak, LocalTime endOfLunchBreak){
    setBeginningOfWorkingDay(beginningOfWorkingDay);
    setEndOfWorkingDay(endOfWorkingDay);
    setBeginningOfLunchBreak(beginningOfLunchBreak);
    setEndOfLunchBreak(endOfLunchBreak);
    }

    public LocalTime getBeginningOfWorkingDay() {
        return beginningOfWorkingDay;
    }

    public void setBeginningOfWorkingDay(LocalTime beginningOfWorkingDay) {
        this.beginningOfWorkingDay = beginningOfWorkingDay;
    }

    public LocalTime getEndOfWorkingDay() {
        return endOfWorkingDay;
    }

    public void setEndOfWorkingDay(LocalTime endOfWorkingDay) {
        this.endOfWorkingDay = endOfWorkingDay;
    }

    public LocalTime getBeginningOfLunchBreak() {
        return beginningOfLunchBreak;
    }

    public void setBeginningOfLunchBreak(LocalTime beginningOfLunchBreak) {
        this.beginningOfLunchBreak = beginningOfLunchBreak;
    }

    public LocalTime getEndOfLunchBreak() {
        return endOfLunchBreak;
    }

    public void setEndOfLunchBreak(LocalTime endOfLunchBreak) {
        this.endOfLunchBreak = endOfLunchBreak;
    }
}
