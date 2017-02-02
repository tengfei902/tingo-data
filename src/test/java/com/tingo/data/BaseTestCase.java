package com.tingo.data;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * Created by tengfei on 2017/1/22.
 */
@ContextConfiguration("classpath:META-INF/spring/app-bootstrap.xml")
public class BaseTestCase extends AbstractTransactionalTestNGSpringContextTests {
}
