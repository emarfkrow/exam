package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 制約マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb8SeiyakuSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb8SeiyakuRegistForm.class);

    /** 制約マスタ登録フォームのリスト */
    @Valid
    private List<Mb8SeiyakuRegistForm> mb8SeiyakuGrid;

    /**
     * @return 制約マスタ登録フォームのリスト
     */
    public List<Mb8SeiyakuRegistForm> getMb8SeiyakuGrid() {
        return mb8SeiyakuGrid;
    }

    /**
     * @param p 制約マスタ登録フォームのリスト
     */
    public void setMb8SeiyakuGrid(final List<Mb8SeiyakuRegistForm> p) {
        this.mb8SeiyakuGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
