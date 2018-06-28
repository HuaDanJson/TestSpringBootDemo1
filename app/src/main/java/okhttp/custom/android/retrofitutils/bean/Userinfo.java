package okhttp.custom.android.retrofitutils.bean;

import com.google.gson.annotations.SerializedName;

public class Userinfo {

    /**
     * id : 39
     * username : Jason1
     * pwd : 123
     */

    @SerializedName("id") private int id;
    @SerializedName("username") private String username;
    @SerializedName("pwd") private String pwd;

    public int getId() { return id;}

    public void setId(int id) { this.id = id;}

    public String getUsername() { return username;}

    public void setUsername(String username) { this.username = username;}

    public String getPwd() { return pwd;}

    public void setPwd(String pwd) { this.pwd = pwd;}

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
