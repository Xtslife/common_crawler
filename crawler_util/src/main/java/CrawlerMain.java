import us.codecraft.webmagic.Spider;

/**
 * @创建人：关涛
 * @创建时间: 2020/6/17
 * @描述：
 */
public class CrawlerMain {

    public static void main(String[] args) {
        Spider.create(new BaiDuProcessor())
                .addUrl("https://baidu.com")
                .run();
    }
}
