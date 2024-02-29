package com.srikar.oauth.response;

public class UserRest {

    private String userFirstName;
    private String userLastName;
    private String userId;

    public UserRest(String userFirstName, String userLastName, String userId) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userId = userId;
    }

    /**
     * get field
     *
     * @return userFirstName
     */
    public String getUserFirstName() {
        return this.userFirstName;
    }

    /**
     * set field
     *
     * @param userFirstName
     */
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    /**
     * get field
     *
     * @return userLastName
     */
    public String getUserLastName() {
        return this.userLastName;
    }

    /**
     * set field
     *
     * @param userLastName
     */
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    /**
     * get field
     *
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * set field
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
