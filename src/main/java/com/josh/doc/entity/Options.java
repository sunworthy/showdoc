package com.josh.doc.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Options implements Serializable {
    private Integer optionId;

    private String optionName;

    private String optionValue;

    private static final long serialVersionUID = 1L;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }
}