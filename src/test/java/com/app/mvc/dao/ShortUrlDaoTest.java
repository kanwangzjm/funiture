package com.app.mvc.dao;

import com.app.mvc.shortUrl.ShortUrl;
import com.app.mvc.shortUrl.ShortUrlDao;
import org.junit.Test;

import java.util.Date;
import javax.annotation.Resource;

/**
 * Created by jimin on 16/4/7.
 */
public class ShortUrlDaoTest extends BaseJunitTest {

    @Resource
    private ShortUrlDao shortUrlDao;

    @Test
    public void testSave() {
        String now = new Date().toString();
        ShortUrl shortUrl = ShortUrl.builder().origin("test" + now).current("test" + now).status(1).build();
        shortUrlDao.save(shortUrl);
    }
}
