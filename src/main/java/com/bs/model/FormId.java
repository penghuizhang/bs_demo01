package com.bs.model;

import org.springframework.stereotype.Component;

/**
 * Created by kylin on 2018/6/17.
 */
@Component
public class FormId {
    private Integer id;

    private String formId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Override
    public String toString() {
        return "FormId{" +
                "id=" + id +
                ", formId='" + formId + '\'' +
                '}';
    }
}
