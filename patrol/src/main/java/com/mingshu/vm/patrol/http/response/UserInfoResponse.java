package com.mingshu.vm.patrol.http.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class UserInfoResponse implements Serializable {

    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;
    @SerializedName("data")
    private List<UserInfo> data;

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

    public List<UserInfo> getData() {
        return data;
    }

    public void setData(List<UserInfo> data) {
        this.data = data;
    }

    public static class UserInfo implements Serializable {
        @SerializedName("searchValue")
        private Object searchValue;
        @SerializedName("createBy")
        private String createBy;
        @SerializedName("createTime")
        private String createTime;
        @SerializedName("updateBy")
        private Object updateBy;
        @SerializedName("updateTime")
        private Object updateTime;
        @SerializedName("remark")
        private String remark;
        @SerializedName("params")
        private ParamsDTO params;
        @SerializedName("userId")
        private Integer userId;
        @SerializedName("userName")
        private String userName;
        @SerializedName("nickName")
        private String nickName;
        @SerializedName("email")
        private String email;
        @SerializedName("phonenumber")
        private String phonenumber;
        @SerializedName("sex")
        private String sex;
        @SerializedName("avatar")
        private String avatar;
        @SerializedName("salt")
        private Object salt;
        @SerializedName("status")
        private String status;
        @SerializedName("delFlag")
        private String delFlag;
        @SerializedName("loginIp")
        private String loginIp;
        @SerializedName("loginDate")
        private String loginDate;
        @SerializedName("videoUserName")
        private String videoUserName;
        @SerializedName("videoPassword")
        private String videoPassword;
        @SerializedName("roleIds")
        private Object roleIds;
        @SerializedName("cId")
        private Object cId;
        @SerializedName("admin")
        private Boolean admin;
        @SerializedName("cname")
        private Object cname;
        @SerializedName("roles")
        private List<RolesDTO> roles;

        public Object getSearchValue() {
            return searchValue;
        }

        public void setSearchValue(Object searchValue) {
            this.searchValue = searchValue;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(Object updateBy) {
            this.updateBy = updateBy;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public ParamsDTO getParams() {
            return params;
        }

        public void setParams(ParamsDTO params) {
            this.params = params;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Object getSalt() {
            return salt;
        }

        public void setSalt(Object salt) {
            this.salt = salt;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public String getLoginIp() {
            return loginIp;
        }

        public void setLoginIp(String loginIp) {
            this.loginIp = loginIp;
        }

        public String getLoginDate() {
            return loginDate;
        }

        public void setLoginDate(String loginDate) {
            this.loginDate = loginDate;
        }

        public String getVideoUserName() {
            return videoUserName;
        }

        public void setVideoUserName(String videoUserName) {
            this.videoUserName = videoUserName;
        }

        public String getVideoPassword() {
            return videoPassword;
        }

        public void setVideoPassword(String videoPassword) {
            this.videoPassword = videoPassword;
        }

        public Object getRoleIds() {
            return roleIds;
        }

        public void setRoleIds(Object roleIds) {
            this.roleIds = roleIds;
        }

        public Object getCId() {
            return cId;
        }

        public void setCId(Object cId) {
            this.cId = cId;
        }

        public Boolean isAdmin() {
            return admin;
        }

        public void setAdmin(Boolean admin) {
            this.admin = admin;
        }

        public Object getCname() {
            return cname;
        }

        public void setCname(Object cname) {
            this.cname = cname;
        }

        public List<RolesDTO> getRoles() {
            return roles;
        }

        public void setRoles(List<RolesDTO> roles) {
            this.roles = roles;
        }

        public static class ParamsDTO implements Serializable {
        }

        public static class RolesDTO implements Serializable {
            @SerializedName("searchValue")
            private Object searchValue;
            @SerializedName("createBy")
            private Object createBy;
            @SerializedName("createTime")
            private Object createTime;
            @SerializedName("updateBy")
            private Object updateBy;
            @SerializedName("updateTime")
            private Object updateTime;
            @SerializedName("remark")
            private Object remark;
            @SerializedName("params")
            private ParamsDTOX params;
            @SerializedName("roleId")
            private Integer roleId;
            @SerializedName("roleName")
            private String roleName;
            @SerializedName("roleKey")
            private String roleKey;
            @SerializedName("roleSort")
            private String roleSort;
            @SerializedName("dataScope")
            private String dataScope;
            @SerializedName("menuCheckStrictly")
            private Boolean menuCheckStrictly;
            @SerializedName("status")
            private String status;
            @SerializedName("delFlag")
            private Object delFlag;
            @SerializedName("flag")
            private Boolean flag;
            @SerializedName("menuIds")
            private Object menuIds;
            @SerializedName("admin")
            private Boolean admin;

            public Object getSearchValue() {
                return searchValue;
            }

            public void setSearchValue(Object searchValue) {
                this.searchValue = searchValue;
            }

            public Object getCreateBy() {
                return createBy;
            }

            public void setCreateBy(Object createBy) {
                this.createBy = createBy;
            }

            public Object getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Object createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(Object updateBy) {
                this.updateBy = updateBy;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public ParamsDTOX getParams() {
                return params;
            }

            public void setParams(ParamsDTOX params) {
                this.params = params;
            }

            public Integer getRoleId() {
                return roleId;
            }

            public void setRoleId(Integer roleId) {
                this.roleId = roleId;
            }

            public String getRoleName() {
                return roleName;
            }

            public void setRoleName(String roleName) {
                this.roleName = roleName;
            }

            public String getRoleKey() {
                return roleKey;
            }

            public void setRoleKey(String roleKey) {
                this.roleKey = roleKey;
            }

            public String getRoleSort() {
                return roleSort;
            }

            public void setRoleSort(String roleSort) {
                this.roleSort = roleSort;
            }

            public String getDataScope() {
                return dataScope;
            }

            public void setDataScope(String dataScope) {
                this.dataScope = dataScope;
            }

            public Boolean isMenuCheckStrictly() {
                return menuCheckStrictly;
            }

            public void setMenuCheckStrictly(Boolean menuCheckStrictly) {
                this.menuCheckStrictly = menuCheckStrictly;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(Object delFlag) {
                this.delFlag = delFlag;
            }

            public Boolean isFlag() {
                return flag;
            }

            public void setFlag(Boolean flag) {
                this.flag = flag;
            }

            public Object getMenuIds() {
                return menuIds;
            }

            public void setMenuIds(Object menuIds) {
                this.menuIds = menuIds;
            }

            public Boolean isAdmin() {
                return admin;
            }

            public void setAdmin(Boolean admin) {
                this.admin = admin;
            }

            public static class ParamsDTOX implements Serializable {
            }
        }
    }
}
