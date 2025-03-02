package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生元
 * @author emarfkrow
 */
public class Tb5TenseiMoto implements IEntity {

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

    /** 転生元ID */
    private Integer tenseiMotoId;

    /** @return 転生元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_MOTO_ID")
    public Integer getTenseiMotoId() {
        return this.tenseiMotoId;
    }

    /** @param o 転生元ID */
    public void setTenseiMotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseiMotoId = Integer.valueOf(o.toString());
        } else {
            this.tenseiMotoId = null;
        }
    }

    /** 転生元情報 */
    private String tenseiMotoInfo;

    /** @return 転生元情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_MOTO_INFO")
    public String getTenseiMotoInfo() {
        return this.tenseiMotoInfo;
    }

    /** @param o 転生元情報 */
    public void setTenseiMotoInfo(final Object o) {
        if (o != null) {
            this.tenseiMotoInfo = o.toString();
        } else {
            this.tenseiMotoInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_TS")
    public java.time.LocalDateTime getInsertTs() {
        return this.insertTs;
    }

    /** @param o 作成タイムスタンプ */
    public void setInsertTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_ID")
    public Integer getInsertUserId() {
        return this.insertUserId;
    }

    /** @param o 作成者 */
    public void setInsertUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertUserId = Integer.valueOf(o.toString());
        } else {
            this.insertUserId = null;
        }
    }

    /** 作成者参照 */
    private String insertUserSei;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_SEI")
    public String getInsertUserSei() {
        return this.insertUserSei;
    }

    /** @param o 作成者参照 */
    public void setInsertUserSei(final Object o) {
        if (o != null) {
            this.insertUserSei = o.toString();
        } else {
            this.insertUserSei = null;
        }
    }

    /** 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateTs;

    /** @return 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_TS")
    public java.time.LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /** @param o 更新タイムスタンプ */
    public void setUpdateTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_ID")
    public Integer getUpdateUserId() {
        return this.updateUserId;
    }

    /** @param o 更新者 */
    public void setUpdateUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateUserId = Integer.valueOf(o.toString());
        } else {
            this.updateUserId = null;
        }
    }

    /** 更新者参照 */
    private String updateUserSei;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_SEI")
    public String getUpdateUserSei() {
        return this.updateUserSei;
    }

    /** @param o 更新者参照 */
    public void setUpdateUserSei(final Object o) {
        if (o != null) {
            this.updateUserSei = o.toString();
        } else {
            this.updateUserSei = null;
        }
    }

    /**
     * 転生元照会
     * @param param1 転生元ID
     * @return 転生元
     */
    public static Tb5TenseiMoto get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_MOTO_ID` = ::tensei_moto_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEI_MOTO_ID` \n";
        sql += "    , a.`TENSEI_MOTO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEI_MOTO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_moto_id", param1);
        return Queries.get(sql, map, Tb5TenseiMoto.class);
    }

    /**
     * 転生元追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生元IDの採番処理
        numbering();

        // 転生元明細の登録
        if (this.tb5TenseiMotoDets != null) {
            for (Tb5TenseiMotoDet tb5TenseiMotoDet : this.tb5TenseiMotoDets) {
                if (tb5TenseiMotoDet != null) {
                    tb5TenseiMotoDet.setTenseiMotoId(this.getTenseiMotoId());
                }
                tb5TenseiMotoDet.insert(now, execId);
            }
        }

        // 転生元の登録
        String sql = "INSERT INTO TB5_TENSEI_MOTO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEI_MOTO_ID` -- :tensei_moto_id");
        nameList.add("`TENSEI_MOTO_INFO` -- :tensei_moto_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tensei_moto_id");
        valueList.add(":tensei_moto_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生元IDの採番処理 */
    private void numbering() {
        if (this.tenseiMotoId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEI_MOTO_ID`) IS NULL THEN 0 ELSE MAX(e.`TENSEI_MOTO_ID`) * 1 END + 1 AS `TENSEI_MOTO_ID` FROM TB5_TENSEI_MOTO e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEI_MOTO_ID");
        this.setTenseiMotoId(o);
    }

    /**
     * 転生元更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生元明細の登録
        if (this.tb5TenseiMotoDets != null) {
            for (Tb5TenseiMotoDet tb5TenseiMotoDet : this.tb5TenseiMotoDets) {
                if (tb5TenseiMotoDet == null) {
                    continue;
                }
                tb5TenseiMotoDet.setTenseiMotoId(this.tenseiMotoId);
                try {
                    tb5TenseiMotoDet.insert(now, execId);
                } catch (Exception e) {
                    tb5TenseiMotoDet.update(now, execId);
                }
            }
        }

        // 転生元の登録
        String sql = "UPDATE TB5_TENSEI_MOTO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEI_MOTO_ID` = :tensei_moto_id");
        setList.add("`TENSEI_MOTO_INFO` = :tensei_moto_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生元削除
     * @return 削除件数
     */
    public int delete() {

        // 転生元明細の削除
        if (this.tb5TenseiMotoDets != null) {
            for (Tb5TenseiMotoDet tb5TenseiMotoDet : this.tb5TenseiMotoDets) {
                tb5TenseiMotoDet.delete();
            }
        }

        // 転生元の削除
        String sql = "DELETE FROM TB5_TENSEI_MOTO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_MOTO_ID` = ::tensei_moto_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_moto_id", this.tenseiMotoId);
        map.put("tensei_moto_info", this.tenseiMotoInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 転生元明細のリスト */
    private List<Tb5TenseiMotoDet> tb5TenseiMotoDets;

    /** @return 転生元明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb5TenseiMotoDets")
    public List<Tb5TenseiMotoDet> getTb5TenseiMotoDets() {
        return this.tb5TenseiMotoDets;
    }

    /** @param list 転生元明細のリスト */
    public void setTb5TenseiMotoDets(final List<Tb5TenseiMotoDet> list) {
        this.tb5TenseiMotoDets = list;
    }

    /** @param tb5TenseiMotoDet */
    public void addTb5TenseiMotoDets(final Tb5TenseiMotoDet tb5TenseiMotoDet) {
        if (this.tb5TenseiMotoDets == null) {
            this.tb5TenseiMotoDets = new ArrayList<Tb5TenseiMotoDet>();
        }
        this.tb5TenseiMotoDets.add(tb5TenseiMotoDet);
    }

    /** @return 転生元明細のリスト */
    public List<Tb5TenseiMotoDet> referTb5TenseiMotoDets() {
        this.tb5TenseiMotoDets = Tb5TenseiMoto.referTb5TenseiMotoDets(this.tenseiMotoId);
        return this.tb5TenseiMotoDets;
    }

    /**
     * @param param1 tenseiMotoId
     * @return List<Tb5TenseiMotoDet>
     */
    public static List<Tb5TenseiMotoDet> referTb5TenseiMotoDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TENSEI_MOTO_ID = :tensei_moto_id");
        String sql = "SELECT ";
        sql += "`TENSEI_MOTO_ID`";
        sql += ", `TENSEI_MOTO_BN`";
        sql += ", `TENSEI_MOTO_DET_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB5_TENSEI_MOTO_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "TENSEI_MOTO_ID, TENSEI_MOTO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_moto_id", param1);
        return Queries.select(sql, map, Tb5TenseiMotoDet.class, null, null);
    }
}
