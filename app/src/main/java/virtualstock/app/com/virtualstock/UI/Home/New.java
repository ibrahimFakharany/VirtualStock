package virtualstock.app.com.virtualstock.UI.Home;

/**
 * Created by 450 G1 on 12/04/2018.
 */

public class New {
    String imageUrl;
    String header;
    String content;

    public New(String imageUrl, String header, String content) {
        this.imageUrl = imageUrl;
        this.header = header;
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
