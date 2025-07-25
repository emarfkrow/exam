package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 子
 * @author emarfkrow
 */
public class Tb1Ko implements IEntity {

    /** SlickGridのDataView用ID */
    @jp.co.golorp.emarf.validation.GridViewRowId
    private Integer id;

    /** @return id */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", index = 1)
    public final Integer getId() {
        return id;
    }

    /** @param o id */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 親ID */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private Integer oyaId;

    /** @return 親ID */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "OYA_ID", index = 2)
    public Integer getOyaId() {
        return this.oyaId;
    }

    /** @param o 親ID */
    public void setOyaId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.oyaId = Integer.valueOf(o.toString());
        } else {
            this.oyaId = null;
        }
    }

    /** 子枝番 */
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private Integer koBn;

    /** @return 子枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "KO_BN", index = 3)
    public Integer getKoBn() {
        return this.koBn;
    }

    /** @param o 子枝番 */
    public void setKoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.koBn = Integer.valueOf(o.toString());
        } else {
            this.koBn = null;
        }
    }

    /** 子情報 */
    private String koInfo;

    /** @return 子情報 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "KO_INFO", index = 4)
    public String getKoInfo() {
        return this.koInfo;
    }

    /** @param o 子情報 */
    public void setKoInfo(final Object o) {
        if (o != null) {
            this.koInfo = o.toString();
        } else {
            this.koInfo = null;
        }
    }

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_TS", index = 5)
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
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_ID", index = 6)
    public Integer getInsertUserId() {
        return this.insertUserId;
    }

    /** @param o 作成者 */
    public void setInsertUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.insertUserId = Integer.valueOf(o.toString());
        } else {
            this.insertUserId = null;
        }
    }

    /** 作成者参照 */
    @jp.co.golorp.emarf.validation.ReferMei
    private String insertUserSei;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "INSERT_USER_SEI", index = 7)
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_TS", index = 8)
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
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_ID", index = 9)
    public Integer getUpdateUserId() {
        return this.updateUserId;
    }

    /** @param o 更新者 */
    public void setUpdateUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(o)) {
            this.updateUserId = Integer.valueOf(o.toString());
        } else {
            this.updateUserId = null;
        }
    }

    /** 更新者参照 */
    @jp.co.golorp.emarf.validation.ReferMei
    private String updateUserSei;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UPDATE_USER_SEI", index = 10)
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
     * 子照会
     * @param param1 親ID
     * @param param2 子枝番
     * @return 子
     */
    public static Tb1Ko get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        whereList.add("`KO_BN` = :ko_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`OYA_ID` \n";
        sql += "    , a.`KO_BN` \n";
        sql += "    , a.`KO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB1_KO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        map.put("ko_bn", param2);
        return Queries.get(sql, map, Tb1Ko.class);
    }

    /**
     * 子追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 子枝番の採番処理
        numbering();

        // 孫の登録
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                if (tb1Mago != null) {
                    tb1Mago.setOyaId(this.getOyaId());
                    tb1Mago.setKoBn(this.getKoBn());
                }
                tb1Mago.insert(now, execId);
            }
        }

        // 子なしの登録
        if (this.tb1KoDinks != null) {
            this.tb1KoDinks.setOyaId(this.getOyaId());
            this.tb1KoDinks.setKoBn(this.getKoBn());
            this.tb1KoDinks.insert(now, execId);
        }

        // 孤児の登録
        if (this.tb1KoOrphans != null) {
            this.tb1KoOrphans.setOyaId(this.getOyaId());
            this.tb1KoOrphans.setKoBn(this.getKoBn());
            this.tb1KoOrphans.insert(now, execId);
        }

        // 子の登録
        String sql = "INSERT INTO TB1_KO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`OYA_ID` -- :oya_id");
        nameList.add("`KO_BN` -- :ko_bn");
        nameList.add("`KO_INFO` -- :ko_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":oya_id");
        valueList.add(":ko_bn");
        valueList.add(":ko_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 子枝番の採番処理 */
    private void numbering() {
        if (this.koBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`KO_BN`) IS NULL THEN 0 ELSE MAX(e.`KO_BN`) * 1 END + 1 AS `KO_BN` FROM TB1_KO e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`OYA_ID` = :oya_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("oya_id", this.oyaId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KO_BN");
        this.setKoBn(o);
    }

    /**
     * 子更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 孫の登録
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                if (tb1Mago == null) {
                    continue;
                }
                tb1Mago.setOyaId(this.oyaId);
                tb1Mago.setKoBn(this.koBn);
                try {
                    tb1Mago.insert(now, execId);
                } catch (Exception e) {
                    tb1Mago.update(now, execId);
                }
            }
        }

        // 子なしの登録
        if (this.tb1KoDinks != null) {
            tb1KoDinks.setOyaId(this.getOyaId());
            tb1KoDinks.setKoBn(this.getKoBn());
            try {
                tb1KoDinks.insert(now, execId);
            } catch (Exception e) {
                tb1KoDinks.update(now, execId);
            }
        }

        // 孤児の登録
        if (this.tb1KoOrphans != null) {
            tb1KoOrphans.setOyaId(this.getOyaId());
            tb1KoOrphans.setKoBn(this.getKoBn());
            try {
                tb1KoOrphans.insert(now, execId);
            } catch (Exception e) {
                tb1KoOrphans.update(now, execId);
            }
        }

        // 子の登録
        String sql = "UPDATE TB1_KO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`OYA_ID` = :oya_id");
        setList.add("`KO_BN` = :ko_bn");
        setList.add("`KO_INFO` = :ko_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 子削除
     * @return 削除件数
     */
    public int delete() {

        // 孫の削除
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                tb1Mago.delete();
            }
        }

        // 子なしの削除
        if (this.tb1KoDinks != null) {
            this.tb1KoDinks.delete();
        }

        // 孤児の削除
        if (this.tb1KoOrphans != null) {
            this.tb1KoOrphans.delete();
        }

        // 子の削除
        String sql = "DELETE FROM TB1_KO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        whereList.add("`KO_BN` = :ko_bn");
        whereList.add("`update_ts` = '" + this.updateTs + "'");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", this.oyaId);
        map.put("ko_bn", this.koBn);
        map.put("ko_info", this.koInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 子なし */
    private Tb1KoDinks tb1KoDinks;

    /** @return 子なし */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb1KoDinks", index = 11)
    public Tb1KoDinks getTb1KoDinks() {
        return this.tb1KoDinks;
    }

    /** @param p 子なし */
    public void setTb1KoDinks(final Tb1KoDinks p) {
        this.tb1KoDinks = p;
    }

    /** @return 子なし */
    public Tb1KoDinks referTb1KoDinks() {
        if (this.tb1KoDinks == null) {
            try {
                this.tb1KoDinks = Tb1KoDinks.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1KoDinks;
    }

    /** 孤児 */
    private Tb1KoOrphans tb1KoOrphans;

    /** @return 孤児 */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb1KoOrphans", index = 12)
    public Tb1KoOrphans getTb1KoOrphans() {
        return this.tb1KoOrphans;
    }

    /** @param p 孤児 */
    public void setTb1KoOrphans(final Tb1KoOrphans p) {
        this.tb1KoOrphans = p;
    }

    /** @return 孤児 */
    public Tb1KoOrphans referTb1KoOrphans() {
        if (this.tb1KoOrphans == null) {
            try {
                this.tb1KoOrphans = Tb1KoOrphans.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1KoOrphans;
    }

    /*
     * 子モデル：孫
     */

    /** 孫のリスト */
    private List<Tb1Mago> tb1Magos;

    /** @return 孫のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Tb1Magos", index = 13)
    public List<Tb1Mago> getTb1Magos() {
        return this.tb1Magos;
    }

    /** @param list 孫のリスト */
    public void setTb1Magos(final List<Tb1Mago> list) {
        this.tb1Magos = list;
    }

    /** @param tb1Mago */
    public void addTb1Magos(final Tb1Mago tb1Mago) {
        if (this.tb1Magos == null) {
            this.tb1Magos = new ArrayList<Tb1Mago>();
        }
        this.tb1Magos.add(tb1Mago);
    }

    /** @return 孫のリスト */
    public List<Tb1Mago> referTb1Magos() {
        this.tb1Magos = Tb1Ko.referTb1Magos(this.oyaId, this.koBn);
        return this.tb1Magos;
    }

    /**
     * @param param1 oyaId
     * @param param2 koBn
     * @return List<Tb1Mago>
     */
    public static List<Tb1Mago> referTb1Magos(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("OYA_ID = :oya_id");
        whereList.add("KO_BN = :ko_bn");
        String sql = "SELECT ";
        sql += "`OYA_ID`";
        sql += ", `KO_BN`";
        sql += ", `MAGO_BN`";
        sql += ", `MAGO_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB1_MAGO a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "OYA_ID, KO_BN, MAGO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        map.put("ko_bn", param2);
        return Queries.select(sql, map, Tb1Mago.class, null, null);
    }
}
