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
public class Vb9Etsuran implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
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

    /** 変換元ID */
    private Integer henkanMotoId;

    /** @return 変換元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("henkan_moto_id")
    public Integer getHenkanMotoId() {
        return this.henkanMotoId;
    }

    /** @param o 変換元ID */
    public void setHenkanMotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.henkanMotoId = Integer.valueOf(o.toString());
        } else {
            this.henkanMotoId = null;
        }
    }

    /** 変換元情報 */
    private String henkanMotoInfo;

    /** @return 変換元情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("henkan_moto_info")
    public String getHenkanMotoInfo() {
        return this.henkanMotoInfo;
    }

    /** @param o 変換元情報 */
    public void setHenkanMotoInfo(final Object o) {
        if (o != null) {
            this.henkanMotoInfo = o.toString();
        } else {
            this.henkanMotoInfo = null;
        }
    }

    /** 引継ぐ情報 */
    private String hikitsuidaInfo;

    /** @return 引継ぐ情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("hikitsuida_info")
    public String getHikitsuidaInfo() {
        return this.hikitsuidaInfo;
    }

    /** @param o 引継ぐ情報 */
    public void setHikitsuidaInfo(final Object o) {
        if (o != null) {
            this.hikitsuidaInfo = o.toString();
        } else {
            this.hikitsuidaInfo = null;
        }
    }

    /**
     * VIEW照会
     * @return VIEW
     */
    public static Vb9Etsuran get() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`henkan_moto_id` = :henkan_moto_id");
        whereList.add("`henkan_moto_info` = :henkan_moto_info");
        whereList.add("`hikitsuida_info` = :hikitsuida_info");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`henkan_moto_id` \n";
        sql += "    , a.`henkan_moto_info` \n";
        sql += "    , a.`hikitsuida_info` \n";
        sql += "FROM \n";
        sql += "    VB9_ETSURAN a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        return Queries.get(sql, map, Vb9Etsuran.class);
    }

    /**
     * VIEW追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // VIEWの登録
        String sql = "INSERT INTO VB9_ETSURAN(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`henkan_moto_id` -- :henkan_moto_id");
        nameList.add("`henkan_moto_info` -- :henkan_moto_info");
        nameList.add("`hikitsuida_info` -- :hikitsuida_info");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":henkan_moto_id");
        valueList.add(":henkan_moto_info");
        valueList.add(":hikitsuida_info");
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
        String sql = "UPDATE VB9_ETSURAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`henkan_moto_id` = :henkan_moto_id");
        setList.add("`henkan_moto_info` = :henkan_moto_info");
        setList.add("`hikitsuida_info` = :hikitsuida_info");
        return String.join("\r\n    , ", setList);
    }

    /**
     * VIEW削除
     * @return 削除件数
     */
    public int delete() {

        // VIEWの削除
        String sql = "DELETE FROM VB9_ETSURAN WHERE " + getWhere();
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
        map.put("henkan_moto_id", this.henkanMotoId);
        map.put("henkan_moto_info", this.henkanMotoInfo);
        map.put("hikitsuida_info", this.hikitsuidaInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
