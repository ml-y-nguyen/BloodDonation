package com.project.ync.blooddonation.model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author YNC
 */
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(suppressConstructorProperties = true)
public class FindBlood {
    private User user;
    @SerializedName("post_name")
    private String postName;
    @SerializedName("post_content")
    private String postContent;
    @SerializedName("blood_type")
    private String bloodType;
    @SerializedName("address")
    private String address;

    public FindBlood(String postName, String postContent, String bloodType, String address) {
        this.postName = postName;
        this.postContent = postContent;
        this.bloodType = bloodType;
        this.address = address;
    }
}
