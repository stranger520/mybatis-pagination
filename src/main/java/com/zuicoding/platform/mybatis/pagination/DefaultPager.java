package com.zuicoding.platform.mybatis.pagination;

/**
 * Created by Stephen.lin on 2017/8/4.
 * <p>
 * Description :<p></p>
 */
public class DefaultPager implements Pagination {

    private int pageNum = 1;
    private int pageSize = 10;

    private int offset = 0;
    private int total = 0;
    private int pageTotal = 0;

    public DefaultPager() {
    }

    public DefaultPager(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public DefaultPager(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public int getOffset() {
        offset = (pageNum - 1) * pageSize;
        return offset;
    }

    @Override
    public int getLimit() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageTotal() {
        pageTotal = (total % pageSize ) == 0 ? total / pageSize : (total / pageSize) + 1;
        return pageTotal;
    }


}
