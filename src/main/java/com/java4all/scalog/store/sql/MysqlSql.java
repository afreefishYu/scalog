package com.java4all.scalog.store.sql;

import static com.java4all.scalog.configuration.Constants.LOG_TABLE;

/**
 * Mysql Sql
 *
 * @author wangzhongxiang
 */
public class MysqlSql {

    public static final String INSERT_LOG_SQL =
            "insert into " + LOG_TABLE +
                    "(`id`, `country_name`,`group_name`,`organization_name`,"
                    + "`company_name`, `project_name`, `module_name`, `function_name`, "
                    + "`class_name`, `method_name`, `method_type`, `url`, `request_params`,"
                    + "`result`, `remark`, `cost`, `ip`, `user_id`, "
                    + "`user_name`, `client_type`, `user_agent`, `log_type`,"
                    + "`gmt_start`, `gmt_end`,`gmt_create`, `gmt_modified`)"
                    + " values "
                    + "(?, ?, ?, ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?, ?, now(), now())";
}
