package com.zuicoding.platform.mybatis.pagination;

/**
 * Created by <a href="mailto:stephen.linicoding@gmail.com">Stephen.lin</a> on 2018/1/8.
 * <p>
 * <p>
 *     将分页对象抽象成一个接口，以便于其他形式的 分页查询
 *     <p>for Example:</p>
 *     <code>
 *         select * from table where id > offset limit  100
 *     </code>
 * </p>
 */
public interface Pagination {

    int getOffset();

    int getLimit();

    void setTotal(int total);

    int getTotal();
}
