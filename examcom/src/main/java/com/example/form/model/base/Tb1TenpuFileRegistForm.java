package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 添付ファイル登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1TenpuFileRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1TenpuFileRegistForm.class);

    /** 祖先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 親枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaBn;

    /**
     * @return 親枝番
     */
    public String getOyaBn() {
        return oyaBn;
    }

    /**
     * @param p 親枝番
     */
    public void setOyaBn(final String p) {
        this.oyaBn = p;
    }

    /** エンティティ枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entityBn;

    /**
     * @return エンティティ枝番
     */
    public String getEntityBn() {
        return entityBn;
    }

    /**
     * @param p エンティティ枝番
     */
    public void setEntityBn(final String p) {
        this.entityBn = p;
    }

    /** 添付ファイル枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String tenpuFileBn;

    /**
     * @return 添付ファイル枝番
     */
    public String getTenpuFileBn() {
        return tenpuFileBn;
    }

    /**
     * @param p 添付ファイル枝番
     */
    public void setTenpuFileBn(final String p) {
        this.tenpuFileBn = p;
    }

    /** 添付ファイル名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String tenpuFileMei;

    /**
     * @return 添付ファイル名
     */
    public String getTenpuFileMei() {
        return tenpuFileMei;
    }

    /**
     * @param p 添付ファイル名
     */
    public void setTenpuFileMei(final String p) {
        this.tenpuFileMei = p;
    }

    /** 添付ファイルパス */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 256)
    private String tenpuFilePath;

    /**
     * @return 添付ファイルパス
     */
    public String getTenpuFilePath() {
        return tenpuFilePath;
    }

    /**
     * @param p 添付ファイルパス
     */
    public void setTenpuFilePath(final String p) {
        this.tenpuFilePath = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
