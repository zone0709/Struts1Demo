/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phat.registration;

/**
 *
 * @author zone
 */
public class RegistrationInsertError {
    private String usernameLengErr;
    private String passwordLengErr;
    private String fullnameLengErr;
    private String confirmnotMatched;
    private String usernameIsExisted;

    public RegistrationInsertError() {
    }

    public RegistrationInsertError(String usernameLengErr, String passwordLengErr, String fullnameLengErr, String confirmLengErr, String usernameIsExisted) {
        this.usernameLengErr = usernameLengErr;
        this.passwordLengErr = passwordLengErr;
        this.fullnameLengErr = fullnameLengErr;
        this.confirmnotMatched = confirmnotMatched;
        this.usernameIsExisted = usernameIsExisted;
    }

    public String getConfirmnotMatched() {
        return confirmnotMatched;
    }

    public void setConfirmnotMatched(String confirmnotMatched) {
        this.confirmnotMatched = confirmnotMatched;
    }

    public String getUsernameLengErr() {
        return usernameLengErr;
    }

    public void setUsernameLengErr(String usernameLengErr) {
        this.usernameLengErr = usernameLengErr;
    }

    public String getPasswordLengErr() {
        return passwordLengErr;
    }

    public void setPasswordLengErr(String passwordLengErr) {
        this.passwordLengErr = passwordLengErr;
    }

    public String getFullnameLengErr() {
        return fullnameLengErr;
    }

    public void setFullnameLengErr(String fullnameLengErr) {
        this.fullnameLengErr = fullnameLengErr;
    }


    public String getUsernameIsExisted() {
        return usernameIsExisted;
    }

    public void setUsernameIsExisted(String usernameIsExisted) {
        this.usernameIsExisted = usernameIsExisted;
    }
    
}
