package com.zuicoding.platform.mybatis.dialect;

/**
 * Created by Stephen.liln on 2017/8/31.
 * <p>
 * Description :<p></p>
 */
public interface IDialect {

    String buildPaginationSql(String sql, int offset, int limit);

    String buildCountSql(String sql);

    /**
     * default implement
     */
    public static enum DefaultDialect implements IDialect{

        MYSQL{
            @Override
            public String buildPaginationSql(String sql, int offset, int limit) {
                StringBuilder limitSql = new StringBuilder(sql);
                limitSql.append("   LIMIT   ").append(offset).append(",").append(limit);
                return limitSql.toString();
            }

            @Override
            public String buildCountSql(String sql) {

                return String.format("SELECT COUNT(1) AS TOTAL FROM(%s) AS TEMP", sql);
            }
        },
        ORACLE {
            @Override
            public String buildPaginationSql(String sql, int offset, int limit) {
                return null;
            }

            @Override
            public String buildCountSql(String sql) {
                return null;
            }
        },
        SQLSERVER{
            @Override
            public String buildPaginationSql(String sql, int offset, int limit) {
                return null;
            }

            @Override
            public String buildCountSql(String sql) {
                return null;
            }
        };
    }
}
