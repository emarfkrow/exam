package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 添付ファイル一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1TenpuFileSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1TenpuFileRegistForm.class);

    /** 添付ファイル登録フォームのリスト */
    @Valid
    private List<Tb1TenpuFileRegistForm> tb1TenpuFileGrid;

    /**
     * @return 添付ファイル登録フォームのリスト
     */
    public List<Tb1TenpuFileRegistForm> getTb1TenpuFileGrid() {
        return tb1TenpuFileGrid;
    }

    /**
     * @param p 添付ファイル登録フォームのリスト
     */
    public void setTb1TenpuFileGrid(final List<Tb1TenpuFileRegistForm> p) {
        this.tb1TenpuFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
