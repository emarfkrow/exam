package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * VIEW
 * @author emarfkrow
 */
public class Vb9Henkan implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", index = 1)
    public final Integer getId() {
        return id;
    }

    /** @param o id */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** table_name */
    private String tableName;

    /** @return table_name */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "table_name", index = 2)
    public String getTableName() {
        return this.tableName;
    }

    /** @param o table_name */
    public void setTableName(final Object o) {
        if (o != null) {
            this.tableName = o.toString();
        } else {
            this.tableName = null;
        }
    }

    /** 変換元ID */
    private Integer srcId;

    /** @return 変換元ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "src_id", index = 3)
    public Integer getSrcId() {
        return this.srcId;
    }

    /** @param o 変換元ID */
    public void setSrcId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.srcId = Integer.valueOf(o.toString());
        } else {
            this.srcId = null;
        }
    }

    /** 変換元情報 */
    private String destInfo;

    /** @return 変換元情報 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "dest_info", index = 4)
    public String getDestInfo() {
        return this.destInfo;
    }

    /** @param o 変換元情報 */
    public void setDestInfo(final Object o) {
        if (o != null) {
            this.destInfo = o.toString();
        } else {
            this.destInfo = null;
        }
    }

    /**
     * VIEW照会
     * @return VIEW
     */
    public static Vb9Henkan get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`table_name` = :table_name");
        whereList.add("`src_id` = :src_id");
        whereList.add("`dest_info` = :dest_info");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`table_name` \n";
        sql += "    , a.`src_id` \n";
        sql += "    , a.`dest_info` \n";
        sql += "FROM \n";
        sql += "    VB9_HENKAN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, Vb9Henkan.class);
    }

    /**
     * VIEW追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "INSERT INTO VB9_HENKAN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`table_name` -- :table_name");
        nameList.add("`src_id` -- :src_id");
        nameList.add("`dest_info` -- :dest_info");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":table_name");
        valueList.add(":src_id");
        valueList.add(":dest_info");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * VIEW更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "UPDATE VB9_HENKAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`table_name` = :table_name");
        setList.add("`src_id` = :src_id");
        setList.add("`dest_info` = :dest_info");
        return String.join("\r\n    , ", setList);
    }

    /**
     * VIEW削除
     * @return 削除件数
     */
    public int delete() {

        // VIEWの削除
        String sql = "DELETE FROM VB9_HENKAN WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("table_name", this.tableName);
        map.put("src_id", this.srcId);
        map.put("dest_info", this.destInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
