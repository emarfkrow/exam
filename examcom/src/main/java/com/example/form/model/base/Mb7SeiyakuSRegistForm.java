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
public class Mb7SeiyakuSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb7SeiyakuRegistForm.class);

    /** 制約マスタ登録フォームのリスト */
    @Valid
    private List<Mb7SeiyakuRegistForm> mb7SeiyakuGrid;

    /**
     * @return 制約マスタ登録フォームのリスト
     */
    public List<Mb7SeiyakuRegistForm> getMb7SeiyakuGrid() {
        return mb7SeiyakuGrid;
    }

    /**
     * @param p 制約マスタ登録フォームのリスト
     */
    public void setMb7SeiyakuGrid(final List<Mb7SeiyakuRegistForm> p) {
        this.mb7SeiyakuGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
