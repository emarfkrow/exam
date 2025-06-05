package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * IDマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4IdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4IdRegistForm.class);

    /** IDマスタ登録フォームのリスト */
    @Valid
    private List<Tb4IdRegistForm> tb4IdGrid;

    /**
     * @return IDマスタ登録フォームのリスト
     */
    public List<Tb4IdRegistForm> getTb4IdGrid() {
        return tb4IdGrid;
    }

    /**
     * @param p IDマスタ登録フォームのリスト
     */
    public void setTb4IdGrid(final List<Tb4IdRegistForm> p) {
        this.tb4IdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
