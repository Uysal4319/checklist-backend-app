package com.eutest.eutest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "words")
public class WordItem {

    @Id
    String _id;

    String mainWord ;
    String banned1;
    String banned2;
    String banned3;
    String banned4;
    String banned5;
    String sender;


    public WordItem(String mainWord, String banned1, String banned2, String banned3, String banned4, String banned5, String sender) {
        this.mainWord = mainWord;
        this.banned1 = banned1;
        this.banned2 = banned2;
        this.banned3 = banned3;
        this.banned4 = banned4;
        this.banned5 = banned5;
        this.sender = sender;
    }

    public String getMainWord() {
        return mainWord;
    }

    public void setMainWord(String mainWord) {
        this.mainWord = mainWord;
    }

    public String getBanned1() {
        return banned1;
    }

    public void setBanned1(String banned1) {
        this.banned1 = banned1;
    }

    public String getBanned2() {
        return banned2;
    }

    public void setBanned2(String banned2) {
        this.banned2 = banned2;
    }

    public String getBanned3() {
        return banned3;
    }

    public void setBanned3(String banned3) {
        this.banned3 = banned3;
    }

    public String getBanned4() {
        return banned4;
    }

    public void setBanned4(String banned4) {
        this.banned4 = banned4;
    }

    public String getBanned5() {
        return banned5;
    }

    public void setBanned5(String banned5) {
        this.banned5 = banned5;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
