package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 転生先
 * @author emarfkrow
 */
public class Tb5TenseiSaki implements IEntity {

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

    /** 転生先ID */
    private Integer tenseiSakiId;

    /** @return 転生先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_SAKI_ID")
    public Integer getTenseiSakiId() {
        return this.tenseiSakiId;
    }

    /** @param o 転生先ID */
    public void setTenseiSakiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenseiSakiId = Integer.valueOf(o.toString());
        } else {
            this.tenseiSakiId = null;
        }
    }

    /** 転生先情報 */
    private String tenseiSakiInfo;

    /** @return 転生先情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("TENSEI_SAKI_INFO")
    public String getTenseiSakiInfo() {
        return this.tenseiSakiInfo;
    }

    /** @param o 転生先情報 */
    public void setTenseiSakiInfo(final Object o) {
        if (o != null) {
            this.tenseiSakiInfo = o.toString();
        } else {
            this.tenseiSakiInfo = null;
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

    /** 削除フラグ */
    private String deleteF = "0";

    /** @return 削除フラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_F")
    public String getDeleteF() {
        return this.deleteF;
    }

    /** @param o 削除フラグ */
    public void setDeleteF(final Object o) {
        if (o != null) {
            this.deleteF = o.toString();
        } else {
            this.deleteF = null;
        }
    }

    /** ステータス区分 */
    private String statusKb;

    /** @return ステータス区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("STATUS_KB")
    public String getStatusKb() {
        return this.statusKb;
    }

    /** @param o ステータス区分 */
    public void setStatusKb(final Object o) {
        if (o != null) {
            this.statusKb = o.toString();
        } else {
            this.statusKb = null;
        }
    }

    /**
     * 転生先照会
     * @param param1 転生先ID
     * @return 転生先
     */
    public static Tb5TenseiSaki get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`TENSEI_SAKI_ID` \n";
        sql += "    , a.`TENSEI_SAKI_INFO` \n";
        sql += "    , a.`TENSEI_MOTO_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB5_TENSEI_SAKI a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_saki_id", param1);
        return Queries.get(sql, map, Tb5TenseiSaki.class);
    }

    /**
     * 転生先追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 転生先IDの採番処理
        numbering();

        // 転生先明細の登録
        if (this.tb5TenseiSakiDets != null) {
            for (Tb5TenseiSakiDet tb5TenseiSakiDet : this.tb5TenseiSakiDets) {
                if (tb5TenseiSakiDet != null) {
                    tb5TenseiSakiDet.setTenseiSakiId(this.getTenseiSakiId());
                }
                tb5TenseiSakiDet.insert(now, execId);
            }
        }

        // 転生先の登録
        String sql = "INSERT INTO TB5_TENSEI_SAKI(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`TENSEI_SAKI_ID` -- :tensei_saki_id");
        nameList.add("`TENSEI_SAKI_INFO` -- :tensei_saki_info");
        nameList.add("`TENSEI_MOTO_ID` -- :tensei_moto_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        nameList.add("`DELETE_F` -- :delete_f");
        nameList.add("`STATUS_KB` -- :status_kb");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tensei_saki_id");
        valueList.add(":tensei_saki_info");
        valueList.add(":tensei_moto_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 転生先IDの採番処理 */
    private void numbering() {
        if (this.tenseiSakiId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`TENSEI_SAKI_ID`) IS NULL THEN 0 ELSE MAX(e.`TENSEI_SAKI_ID`) * 1 END + 1 AS `TENSEI_SAKI_ID` FROM TB5_TENSEI_SAKI e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("TENSEI_SAKI_ID");
        this.setTenseiSakiId(o);
    }

    /**
     * 転生先更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 転生先明細の登録
        if (this.tb5TenseiSakiDets != null) {
            for (Tb5TenseiSakiDet tb5TenseiSakiDet : this.tb5TenseiSakiDets) {
                if (tb5TenseiSakiDet == null) {
                    continue;
                }
                tb5TenseiSakiDet.setTenseiSakiId(this.tenseiSakiId);
                try {
                    tb5TenseiSakiDet.insert(now, execId);
                } catch (Exception e) {
                    tb5TenseiSakiDet.update(now, execId);
                }
            }
        }

        // 転生先の登録
        String sql = "UPDATE TB5_TENSEI_SAKI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        setList.add("`TENSEI_SAKI_INFO` = :tensei_saki_info");
        setList.add("`TENSEI_MOTO_ID` = :tensei_moto_id");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 転生先削除
     * @return 削除件数
     */
    public int delete() {

        // 転生先明細の削除
        if (this.tb5TenseiSakiDets != null) {
            for (Tb5TenseiSakiDet tb5TenseiSakiDet : this.tb5TenseiSakiDets) {
                tb5TenseiSakiDet.delete();
            }
        }

        // 転生先の削除
        String sql = "DELETE FROM TB5_TENSEI_SAKI WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`TENSEI_SAKI_ID` = :tensei_saki_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_saki_id", this.tenseiSakiId);
        map.put("tensei_saki_info", this.tenseiSakiInfo);
        map.put("tensei_moto_id", this.tenseiMotoId);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 転生先明細のリスト */
    private List<Tb5TenseiSakiDet> tb5TenseiSakiDets;

    /** @return 転生先明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb5TenseiSakiDets")
    public List<Tb5TenseiSakiDet> getTb5TenseiSakiDets() {
        return this.tb5TenseiSakiDets;
    }

    /** @param list 転生先明細のリスト */
    public void setTb5TenseiSakiDets(final List<Tb5TenseiSakiDet> list) {
        this.tb5TenseiSakiDets = list;
    }

    /** @param tb5TenseiSakiDet */
    public void addTb5TenseiSakiDets(final Tb5TenseiSakiDet tb5TenseiSakiDet) {
        if (this.tb5TenseiSakiDets == null) {
            this.tb5TenseiSakiDets = new ArrayList<Tb5TenseiSakiDet>();
        }
        this.tb5TenseiSakiDets.add(tb5TenseiSakiDet);
    }

    /** @return 転生先明細のリスト */
    public List<Tb5TenseiSakiDet> referTb5TenseiSakiDets() {
        this.tb5TenseiSakiDets = Tb5TenseiSaki.referTb5TenseiSakiDets(this.tenseiSakiId);
        return this.tb5TenseiSakiDets;
    }

    /**
     * @param param1 tenseiSakiId
     * @return List<Tb5TenseiSakiDet>
     */
    public static List<Tb5TenseiSakiDet> referTb5TenseiSakiDets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TENSEI_SAKI_ID = :tensei_saki_id");
        String sql = "SELECT ";
        sql += "TENSEI_SAKI_ID";
        sql += ", TENSEI_SAKI_BN";
        sql += ", TENSEI_SAKI_DET_INFO";
        sql += ", INSERT_TS";
        sql += ", INSERT_USER_ID";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", UPDATE_TS";
        sql += ", UPDATE_USER_ID";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += ", DELETE_F";
        sql += ", STATUS_KB";
        sql += " FROM TB5_TENSEI_SAKI_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "TENSEI_SAKI_ID, TENSEI_SAKI_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tensei_saki_id", param1);
        return Queries.select(sql, map, Tb5TenseiSakiDet.class, null, null);
    }
}
