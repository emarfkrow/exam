package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * NOマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4NoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4NoRegistForm.class);

    /** NOマスタ登録フォームのリスト */
    @Valid
    private List<Tb4NoRegistForm> tb4NoGrid;

    /**
     * @return NOマスタ登録フォームのリスト
     */
    public List<Tb4NoRegistForm> getTb4NoGrid() {
        return tb4NoGrid;
    }

    /**
     * @param p NOマスタ登録フォームのリスト
     */
    public void setTb4NoGrid(final List<Tb4NoRegistForm> p) {
        this.tb4NoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
