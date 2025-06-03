package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1KoOrphansSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1KoOrphansRegistForm.class);

    /** 孤児登録フォームのリスト */
    @Valid
    private List<Tb1KoOrphansRegistForm> tb1KoOrphansGrid;

    /**
     * @return 孤児登録フォームのリスト
     */
    public List<Tb1KoOrphansRegistForm> getTb1KoOrphansGrid() {
        return tb1KoOrphansGrid;
    }

    /**
     * @param p 孤児登録フォームのリスト
     */
    public void setTb1KoOrphansGrid(final List<Tb1KoOrphansRegistForm> p) {
        this.tb1KoOrphansGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
