package com.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title;
    private String hashTag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
