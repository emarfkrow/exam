package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止先２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5Tenseiyokushisaki2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5Tenseiyokushisaki2RegistForm.class);

    /** 転生抑止先２登録フォームのリスト */
    @Valid
    private List<Tb5Tenseiyokushisaki2RegistForm> tb5Tenseiyokushisaki2Grid;

    /**
     * @return 転生抑止先２登録フォームのリスト
     */
    public List<Tb5Tenseiyokushisaki2RegistForm> getTb5Tenseiyokushisaki2Grid() {
        return tb5Tenseiyokushisaki2Grid;
    }

    /**
     * @param p 転生抑止先２登録フォームのリスト
     */
    public void setTb5Tenseiyokushisaki2Grid(final List<Tb5Tenseiyokushisaki2RegistForm> p) {
        this.tb5Tenseiyokushisaki2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
