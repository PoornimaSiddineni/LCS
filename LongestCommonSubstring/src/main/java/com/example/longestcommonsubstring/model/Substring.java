package com.example.longestcommonsubstring.model;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@RequiredArgsConstructor
@Document(collection = "new")
public class Substring {

    @Id
    private String id;
    public List<String> request;
    public Integer count;
    public List<String> response;

    public Substring(String id, List<String> request, Integer count, List<String> response) {
        this.id = id;
        this.request = request;
        this.count = count;
        this.response = response;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRequest() {
        return request;
    }

    public void setRequest(List<String> request) {
        this.request = request;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
