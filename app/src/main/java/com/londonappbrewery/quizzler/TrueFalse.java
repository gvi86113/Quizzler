package com.londonappbrewery.quizzler;

/**
 * Created by Yukai on 2017/12/25.
 */

public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID,boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setQuestionID(int QuestionID) {
        this.mQuestionID = QuestionID;
    }

    public void setAnswer(boolean Answer) {
        this.mAnswer = Answer;
    }
}
