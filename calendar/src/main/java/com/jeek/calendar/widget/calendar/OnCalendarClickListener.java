package com.jeek.calendar.widget.calendar;

/**
 * Created by Jimmy on 2016/10/7 0007.
 */
public interface OnCalendarClickListener {
    void onClickDate(int year, int month, int day, boolean isDraw);
    void onPageChange(int year, int month, int day);
}
