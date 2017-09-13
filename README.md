#### mybatis 分页插件
	
	基于 exectur 拦截 查询请求
#### For Example

* 1.java 代码示例：
```java
PageHelper.pageStart(pager);
//mapper方法 以 ByPager 结尾，这是可配置的
List<Object> list =  testerMapper.selectListByPager(post);
PageHelper.pageEnd();
```
* 2.在mybatis -config.xml 中的配置
```xml
<plugins>
        <plugin interceptor="com.zuicoding.platform.mybatis.pagination.PaginationHandler">
            <property name="dialect" value="mysql"/>
	</plugin>
</plugins>
```
* 3.sql 方言 dialect 是可配置的，目前提供的有mysql(默认，直接写 mysql 就可以)的方言。
   当然如果 你可以自定义 sql dialect ，只需要实现 IDialect 接口就可以了，然后在 `<property name="dialect" value="xxx.xxx.xxx"/>`配置你的实现类引用就可以了。
