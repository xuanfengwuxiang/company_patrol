package com.mingshu.vm.patrol.http.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * 区域/设备 规范出参
 */
public class AreaDeviceStandard implements Serializable {

    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;
    @SerializedName("data")
    private List<Standard> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Standard> getData() {
        return data;
    }

    public void setData(List<Standard> data) {
        this.data = data;
    }

    public static class Standard implements Serializable {
        @SerializedName("id")
        private Integer id;
        @SerializedName("onlyid")
        private Integer onlyid;
        @SerializedName("type")
        private String type;
        @SerializedName("content")
        private String content;
        @SerializedName("createtime")
        private String createtime;
        @SerializedName("updatetime")
        private String updatetime;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getOnlyid() {
            return onlyid;
        }

        public void setOnlyid(Integer onlyid) {
            this.onlyid = onlyid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }
    }
}
