package com.example.dominik.todofragments;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Dominik on 22/11/2017.
 */

public class Todo {
    private UUID mId;
    private String mTitle, mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public void setIsComplete(boolean todoIsComplete) {
        mIsComplete = todoIsComplete;
    }

    public boolean isIsComplete() {
        return mIsComplete;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public Date getDate() {
        return mDate;
    }

    public void setId(UUID todoId) {
        mId = todoId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }

    public void setDate(Date todoDate) {
        mDate = todoDate;
    }
}
