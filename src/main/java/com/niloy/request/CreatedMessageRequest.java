package com.niloy.request;

import lombok.Data;

@Data
public class CreatedMessageRequest {
    private Long senderId;
    private String content;
    private Long projectId;
}
